// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.serializer;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.CaseFormat;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.microsoft.graph.logger.ILogger;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * The default serializer implementation for the SDK
 */
public class DefaultSerializer implements ISerializer {

    /**
     * The instance of the internal serializer
     */
    private final Gson gson;

    /**
     * The logger
     */
    private final ILogger logger;

    /**
     * Creates a DefaultSerializer
     *
     * @param logger the logger
     */
    public DefaultSerializer(final ILogger logger) {
        this.logger = logger;
        this.gson = GsonFactory.getGsonInstance(logger);
    }

    /**
     * Deserializes an object from the input string
     *
     * @param inputString the string that stores the representation of the item
     * @param clazz       the class of the item to be deserialized
     * @param <T>         the type of the item to be deserialized
     * @return            the deserialized item from the input string
     */
    @Override
    public <T> T deserializeObject(final String inputString, final Class<T> clazz) {
    	return deserializeObject(inputString, clazz, null);
    }
    private static final String graphResponseHeadersKey = "graphResponseHeaders";
    @SuppressWarnings("unchecked")
    @Override
    public <T> T deserializeObject(final String inputString, final Class<T> clazz, Map<String, java.util.List<String>> responseHeaders) {
        final T jsonObject = gson.fromJson(inputString, clazz);

        // Populate the JSON-backed fields for any annotations that are not in the object model
        if (jsonObject instanceof IJsonBackedObject) {
            logger.logDebug("Deserializing type " + clazz.getSimpleName());
            final JsonObject rawObject = gson.fromJson(inputString, JsonObject.class);

            // If there is a derived class, try to get it and deserialize to it
            Class<?> derivedClass = this.getDerivedClass(rawObject, clazz);
            final T jo;
            if (derivedClass != null) {
                jo = (T) gson.fromJson(inputString, derivedClass);
            } else {
                jo = jsonObject;
            }

            final IJsonBackedObject jsonBackedObject = (IJsonBackedObject) jo;
            jsonBackedObject.setRawObject(this, rawObject);

            if (responseHeaders != null) {
	            JsonElement convertedHeaders = gson.toJsonTree(responseHeaders);
	            jsonBackedObject.additionalDataManager().put(graphResponseHeadersKey, convertedHeaders);
            }
            
            jsonBackedObject.additionalDataManager().setAdditionalData(rawObject);
            setChildAdditionalData(jsonBackedObject,rawObject);
            return jo;
        } else {
            logger.logDebug("Deserializing a non-IJsonBackedObject type " + clazz.getSimpleName());
            return jsonObject;
        }
    }

    /**
     * Recursively sets additional data for each child object
     *
     * @param serializedObject   the parent object whose children will be iterated to set additional data
     * @param rawJson            the raw json
     */
    private void setChildAdditionalData(final IJsonBackedObject serializedObject, final JsonObject rawJson) {
        // Use reflection to iterate through fields for eligible Graph children
        if(rawJson != null) {
            for (java.lang.reflect.Field field : serializedObject.getClass().getFields()) {
                try {
                    if(field != null) {
                        final Object fieldObject = field.get(serializedObject);
                        if (fieldObject instanceof HashMap) {
                            // If the object is a HashMap, iterate through its children
                            @SuppressWarnings("unchecked")
                            final HashMap<String, Object> serializableChildren = (HashMap<String, Object>) fieldObject;
                            final Iterator<Entry<String, Object>> it = serializableChildren.entrySet().iterator();

                            while (it.hasNext()) {
                                final Map.Entry<String, Object> pair = (Map.Entry<String, Object>)it.next();
                                final Object child = pair.getValue();

                                // If the item is a valid Graph object, set its additional data
                                if (child instanceof IJsonBackedObject) {
                                    final AdditionalDataManager childAdditionalDataManager = ((IJsonBackedObject) child).additionalDataManager();
                                    final JsonElement fieldElement = rawJson.get(field.getName());
                                    if(fieldElement != null && fieldElement.isJsonObject() 
                                            && fieldElement.getAsJsonObject().get(pair.getKey()) != null
                                            && fieldElement.getAsJsonObject().get(pair.getKey()).isJsonObject()) {
                                        childAdditionalDataManager.setAdditionalData(fieldElement.getAsJsonObject().get(pair.getKey()).getAsJsonObject());
                                        setChildAdditionalData((IJsonBackedObject) child,fieldElement.getAsJsonObject().get(pair.getKey()).getAsJsonObject());
                                    }
                                }
                            }
                        }
                        // If the object is a list of Graph objects, iterate through elements
                        else if (fieldObject instanceof List) {
                            final JsonElement collectionJson = rawJson.get(field.getName());
                            final List<?> fieldObjectList = (List<?>) fieldObject;
                            if (collectionJson != null && collectionJson.isJsonArray()) {
                                final JsonArray rawJsonArray = (JsonArray) collectionJson;
                                final Integer fieldObjectListSize = fieldObjectList.size();
                                final Integer rawJsonArraySize = rawJsonArray.size();
                                for (int i = 0; i < fieldObjectListSize && i < rawJsonArraySize; i++) {
                                    final Object element = fieldObjectList.get(i);
                                    if (element instanceof IJsonBackedObject) {
                                        final JsonElement elementRawJson = rawJsonArray.get(i);
                                        if(elementRawJson != null) {
                                            setChildAdditionalData((IJsonBackedObject) element, elementRawJson.getAsJsonObject());
                                        }
                                    }
                                }
                                if (rawJsonArraySize != fieldObjectListSize) 
                                    logger.logDebug("rawJsonArray has a size of " + rawJsonArraySize + " and fieldObjectList of " + fieldObjectListSize);
                            }
                        }
                        // If the object is a valid Graph object, set its additional data
                        else if (fieldObject instanceof IJsonBackedObject) {
                            final IJsonBackedObject serializedChild = (IJsonBackedObject) fieldObject;
                            final AdditionalDataManager childAdditionalDataManager = serializedChild.additionalDataManager();
                            final JsonElement fieldElement = rawJson.get(field.getName());
                            if(fieldElement != null && fieldElement.isJsonObject()) {
                                childAdditionalDataManager.setAdditionalData(fieldElement.getAsJsonObject());
                                setChildAdditionalData((IJsonBackedObject) fieldObject,fieldElement.getAsJsonObject());
                            }
                        }
                    }
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    //Not throwing the IllegalArgumentException as the Serialized Object would still be usable even if the additional data is not set.
                    logger.logError("Unable to set child fields of " + serializedObject.getClass().getSimpleName(), e);
                    logger.logDebug(rawJson.getAsString());
                }
            }
        }
    }
    
    /**
     * Serializes an object into a string
     *
     * @param serializableObject the object to convert into a string
     * @param <T>                the type of the item to be serialized
     * @return 					 the string representation of that item
     */
    @Override
    public <T> String serializeObject(final T serializableObject) {
        logger.logDebug("Serializing type " + serializableObject.getClass().getSimpleName());
        JsonElement outJsonTree = gson.toJsonTree(serializableObject);

        if (serializableObject instanceof IJsonBackedObject) {
        	outJsonTree = getDataFromAdditionalDataManager(outJsonTree, serializableObject);
        } else if (outJsonTree.isJsonObject()) {
            final Field[] fields = serializableObject.getClass().getDeclaredFields();
            JsonObject outJson = outJsonTree.getAsJsonObject();
            for(Field field : fields) {
                if(outJson.has(field.getName())) {
                    final Type[] interfaces = field.getType().getGenericInterfaces();
                    for(Type interfaceType : interfaces) {
                        if(interfaceType == IJsonBackedObject.class && outJson.get(field.getName()).isJsonObject()) {
                            try {
                                final JsonElement outdatedValue = outJson.remove(field.getName());
                                outJson.add(field.getName(), getDataFromAdditionalDataManager(outdatedValue.getAsJsonObject(), field.get(serializableObject)));
                            } catch (IllegalAccessException ex ) {
                                logger.logDebug("Couldn't access prop" + field.getName());
                            }
                            break;
                        }
                    }
                }
            }
        }

        return outJsonTree.toString();
    }
    private <T> JsonElement getDataFromAdditionalDataManager(JsonElement outJsonTree, final T serializableObject) {
        IJsonBackedObject serializableJsonObject = (IJsonBackedObject) serializableObject;
        	
        AdditionalDataManager additionalData = serializableJsonObject.additionalDataManager();
        
        // If the item is a valid Graph object, add its additional data
        if (outJsonTree.isJsonObject()) {
            JsonObject outJson = outJsonTree.getAsJsonObject();
            
            addAdditionalDataToJson(additionalData, outJson);
            outJson = getChildAdditionalData(serializableJsonObject, outJson);
            
            return outJson;
        } else {
            return outJsonTree;
        }
    }
    
    /**
     * Recursively populates additional data for each child object
     * 
     * @param serializableObject the child to get additional data for
     * @param outJson            the serialized output JSON to add to
     * @return                   the serialized output JSON including the additional child data
     */
    @SuppressWarnings("unchecked")
	private JsonObject getChildAdditionalData(IJsonBackedObject serializableObject, JsonObject outJson) {
    	// Use reflection to iterate through fields for eligible Graph children
        for (java.lang.reflect.Field field : serializableObject.getClass().getFields()) {
    		try {
				Object fieldObject = field.get(serializableObject);
				
				// If the object is a HashMap, iterate through its children
				if (fieldObject instanceof HashMap) {
                    HashMap<String, Object> serializableChildren = (HashMap<String, Object>) fieldObject;
					Iterator<Entry<String, Object>> it = serializableChildren.entrySet().iterator();
					
					while (it.hasNext()) {
						Map.Entry<String, Object> pair = (Map.Entry<String, Object>)it.next();
						Object child = pair.getValue();

						// If the item is a valid Graph object, add its additional data
						if (child instanceof IJsonBackedObject) {
							AdditionalDataManager childAdditionalData = ((IJsonBackedObject) child).additionalDataManager();

							addAdditionalDataToJson(
									childAdditionalData, 
									outJson.getAsJsonObject(
											field.getName())
												.getAsJsonObject()
												.get(pair.getKey()
														.toString())
												.getAsJsonObject());

							// Serialize its children
		            		outJson = getChildAdditionalData((IJsonBackedObject)child, outJson);
						}
					}
				}
				// If the object is a valid Graph object, add its additional data
				else if (fieldObject != null && fieldObject instanceof IJsonBackedObject) {
					IJsonBackedObject serializableChild = (IJsonBackedObject) fieldObject;
					AdditionalDataManager childAdditionalData = serializableChild.additionalDataManager();
					if(outJson != null && field != null && outJson.get(field.getName()) != null && outJson.get(field.getName()).isJsonObject()) {
						addAdditionalDataToJson(childAdditionalData, outJson.get(field.getName()).getAsJsonObject());
					}
            		
            		// Serialize its children
            		outJson = getChildAdditionalData(serializableChild, outJson);
				} 
			} catch (IllegalArgumentException | IllegalAccessException e) {
				logger.logError("Unable to access child fields of " + serializableObject.getClass().getSimpleName(), e);
			}
    	}
        
		return outJson;
    }
    
    /**
     * Add each non-transient additional data property to the given JSON node
     * 
     * @param additionalDataManager the additional data bag to iterate through
     * @param jsonNode              the JSON node to add the additional data properties to
     */
    private void addAdditionalDataToJson(AdditionalDataManager additionalDataManager, JsonObject jsonNode) {
    	for (Map.Entry<String, JsonElement> entry : additionalDataManager.entrySet()) {
            if(!entry.getKey().equals(graphResponseHeadersKey)) {
                jsonNode.add(entry.getKey(), entry.getValue());
            }
        }
    }
    
    /**
     * Get the derived class for the given JSON object
     * This covers scenarios in which the service may return one of several derived types
     * of a base object, which it defines using the odata.type parameter
     * 
     * @param jsonObject  the raw JSON object of the response
     * @param parentClass the parent class the derived class should inherit from
     * @return            the derived class if found, or null if not applicable
     */
    private final static String ODATA_TYPE_KEY = "@odata.type";
    public Class<?> getDerivedClass(JsonObject jsonObject, Class<?> parentClass) {
        //Identify the odata.type information if provided
        if (jsonObject.get(ODATA_TYPE_KEY) != null) {
			/** #microsoft.graph.user or #microsoft.graph.callrecords.callrecord */
			final String odataType = jsonObject.get(ODATA_TYPE_KEY).getAsString();
			final Integer lastDotIndex = odataType.lastIndexOf(".");
			final String derivedType = (odataType.substring(0, lastDotIndex) + 
											".models.extensions." + 
											CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, 
																		odataType.substring(lastDotIndex + 1)))
										.replace("#", "com.");
        	try {
        		Class<?> derivedClass = Class.forName(derivedType);
        		//Check that the derived class inherits from the given parent class
        		if (parentClass.isAssignableFrom(derivedClass)) {
        			return derivedClass;
        		}
        		return null;
        	} catch (ClassNotFoundException e) {
        		logger.logDebug("Unable to find a corresponding class for derived type " + derivedType + ". Falling back to parent class.");
        		//If we cannot determine the derived type to cast to, return null
        		//This may happen if the API and the SDK are out of sync
        		return null;
        	}
        }
        //If there is no defined OData type, return null
        return null;
    }

    @VisibleForTesting
    public ILogger getLogger() {
        return logger;
    }
}
