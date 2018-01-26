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

import com.google.common.base.CaseFormat;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.microsoft.graph.logger.ILogger;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * The default serializer implementation for the SDK.
 */
public class DefaultSerializer implements ISerializer {

    /**
     * The instance of the internal serializer.
     */
    private final Gson gson;

    /**
     * The logger.
     */
    private final ILogger logger;

    /**
     * Creates a DefaultSerializer.
     *
     * @param logger The logger.
     */
    public DefaultSerializer(final ILogger logger) {
        this.logger = logger;
        this.gson = GsonFactory.getGsonInstance(logger);
    }

    /**
     * Deserializes an object from the input string.
     *
     * @param inputString The string that stores the representation of the item.
     * @param clazz       The class of the item to be deserialized.
     * @param <T>         The type of the item to be deserialized.
     * @return The deserialized item from the input string.
     */
    @Override
    public <T> T deserializeObject(final String inputString, final Class<T> clazz) {
        T jsonObject = gson.fromJson(inputString, clazz);

        // Populate the JSON-backed fields for any annotations that are not in the object model
        if (jsonObject instanceof IJsonBackedObject) {
            logger.logDebug("Deserializing type " + clazz.getSimpleName());
            final IJsonBackedObject jsonBackedObject = (IJsonBackedObject) jsonObject;
            final JsonObject rawObject = gson.fromJson(inputString, JsonObject.class);
            
        	// If there is a derived class, try to get it and deserialize to it
			Class derivedClass = this.getDerivedClass(rawObject, clazz);
			if (derivedClass != null) {
				jsonObject = (T) gson.fromJson(inputString, derivedClass);
			}
			
            jsonBackedObject.setRawObject(this, rawObject);
            jsonBackedObject.additionalDataManager().setAdditionalData(rawObject);
        } else {
            logger.logDebug("Deserializing a non-IJsonBackedObject type " + clazz.getSimpleName());
        }

        return jsonObject;
    }

    /**
     * Serializes an object into a string.
     *
     * @param serializableObject The object to convert into a string.
     * @param <T>                The type of the item to be serialized.
     * @return The string representation of that item.
     */
    @Override
    public <T> String serializeObject(final T serializableObject) {
        logger.logDebug("Serializing type " + serializableObject.getClass().getSimpleName());
        JsonElement outJsonTree = gson.toJsonTree(serializableObject);

        if (serializableObject instanceof IJsonBackedObject) {
        	IJsonBackedObject serializableJsonObject = (IJsonBackedObject) serializableObject;
        	
            AdditionalDataManager additionalData = serializableJsonObject.additionalDataManager();
            
            // If the item is a valid Graph object, add its additional data
            if (outJsonTree.isJsonObject()) {
                JsonObject outJson = outJsonTree.getAsJsonObject();
                
                addAdditionalDataToJson(additionalData, outJson);
                outJson = getChildAdditionalData(serializableJsonObject, outJson);
                
                outJsonTree = outJson;
            }
        }

        return outJsonTree.toString();
    }
    
    /**
     * Recursively populates additional data for each child object
     * 
     * @param serializableObject The child to get additional data for
     * @param outJson            The serialized output JSON to add to
     * @return The serialized output JSON including the additional child data
     */
    private JsonObject getChildAdditionalData(IJsonBackedObject serializableObject, JsonObject outJson) {
    	// Use reflection to iterate through fields for eligible Graph children
        for (java.lang.reflect.Field field : serializableObject.getClass().getFields()) {
    		try {
				Object fieldObject = field.get(serializableObject);
				
				// If the object is a HashMap, iterate through its children
				if (fieldObject instanceof HashMap) {
					HashMap<String, Object> serializableChildren = (HashMap<String, Object>) fieldObject;
					Iterator it = serializableChildren.entrySet().iterator();
					
					while (it.hasNext()) {
						HashMap.Entry<String, Object> pair = (HashMap.Entry<String, Object>)it.next();
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

					addAdditionalDataToJson(childAdditionalData, outJson.get(field.getName()).getAsJsonObject());
            		
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
     * @param additionalDataManager The additional data bag to iterate through
     * @param jsonNode The JSON node to add the additional data properties to
     */
    private void addAdditionalDataToJson(AdditionalDataManager additionalDataManager, JsonObject jsonNode) {
    	for (Map.Entry<String, JsonElement> entry : additionalDataManager.entrySet()) {
            if (!fieldIsOdataTransient(entry)) {
                jsonNode.add(
                        entry.getKey(),
                        entry.getValue()
                );
            }
        }
    }

    private boolean fieldIsOdataTransient(Map.Entry<String, JsonElement> entry) {
        return (entry.getKey().startsWith("@") && entry.getKey() != "@odata.type");
    }
    
    /**
     * Get the derived class for the given JSON object
     * This covers scenarios in which the service may return one of several derived types
     * of a base object, which it defines using the odata.type parameter
     * @param jsonObject The raw JSON object of the response
     * @param parentClass The parent class the derived class should inherit from
     * @return The derived class if found, or null if not applicable
     */
    private Class getDerivedClass(JsonObject jsonObject, Class parentClass) {
    	//Identify the odata.type information if provided
        if (jsonObject.get("@odata.type") != null) {
        	String odataType = jsonObject.get("@odata.type").getAsString();
        	String derivedType = odataType.substring(odataType.lastIndexOf('.') + 1); //Remove microsoft.graph prefix
        	derivedType = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, derivedType);
        	derivedType = "com.microsoft.graph.models.extensions." + derivedType; //Add full package path
        	
        	try {
        		Class derivedClass = Class.forName(derivedType);
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
}
