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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.common.reflect.TypeToken;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.logger.ILogger;

// keep these imports: even though they are not used, it's a good way to call
// for maintainer's attention en the event code generation naming conventions
// change. If the name change, these import will build at build time rather than
// reflection building at run time.
import com.microsoft.graph.models.extensions.Attachment;
import com.microsoft.graph.requests.extensions.AttachmentCollectionPage;
import com.microsoft.graph.requests.extensions.AttachmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionRequestBuilder;

public class CollectionPageSerializer {

	private static DefaultSerializer serializer;
	/** length of the word "page" */
	private final static Integer pageLength = 4;
	/** length of the word "collection" */
	private final static Integer collectionLength = 10;
	/** length of the work "response" */
	private final static Integer responseLength = 8;
	/** the extensions segment in the package name of target classes */
	private final static String extensionsPath = "extensions.";

	/**
	 * Not available for instantiation
	 */
	private CollectionPageSerializer() {
	}

	/**
     * Serializes an CollectionPage
     * 
     * @param src the CollectionPage variable for serialization
     * @param logger the logger
     * @return       JsonElement of CollectionPage
     */
	public static <T1, T2 extends IRequestBuilder> JsonElement serialize(final BaseCollectionPage<T1, T2> src, final ILogger logger) {
		if(src == null) {
			return null;
		}
		JsonArray jsonArray = new JsonArray();
		List<T1> items = src.getCurrentPage();
		serializer = new DefaultSerializer(logger);
		for(T1 item : items) {
			final String json = serializer.serializeObject(item);
			final JsonElement element = JsonParser.parseString(json);
			if(element != null && element.isJsonObject()) {
				final JsonObject jsonObject = element.getAsJsonObject();
				jsonArray.add(jsonObject);
			}
		}
		return jsonArray;
	}

	/**
     * Deserializes the JsonElement
     *
     * @param json the source CollectionPage's Json
   	 * @param typeOfT The type of the CollectionPage to deserialize to
     * @param logger the logger
     * @throws JsonParseException the parse exception
     * @return    the deserialized CollectionPage
     */
	@SuppressWarnings("unchecked")
	public static <T1, T2 extends IRequestBuilder> BaseCollectionPage<T1, T2> deserialize(final JsonElement json, Type typeOfT, final ILogger logger) throws JsonParseException {
		if (json == null) {
			return null;
		}
		serializer = new DefaultSerializer(logger);
		final JsonObject[] sourceArray = serializer.deserializeObject(json.toString(), JsonObject[].class);
		final ArrayList<T1> list = new ArrayList<T1>(sourceArray.length);
		/** eg: com.microsoft.graph.requests.extensions.AttachmentCollectionPage */
		final String collectionPageClassCanonicalName = typeOfT.getTypeName();
		/** eg: com.microsoft.graph.models.extensions.Attachment */
		final String baseEntityClassCanonicalName = collectionPageClassCanonicalName
					.substring(0, collectionPageClassCanonicalName.length() - pageLength - collectionLength)
					.replace("requests", "models");
		try {
			final Class<?> baseEntityClass = Class.forName(baseEntityClassCanonicalName);
			for (JsonObject sourceObject : sourceArray) {
				Class<?> entityClass = serializer.getDerivedClass(sourceObject, baseEntityClass);
				if(entityClass == null)
					entityClass = baseEntityClass;
				final T1 targetObject = (T1)serializer.deserializeObject(sourceObject.toString(), entityClass);
				((IJsonBackedObject)targetObject).setRawObject(serializer, sourceObject);
				list.add(targetObject);
			}
			/** eg: com.microsoft.graph.requests.extensions.AttachmentCollectionResponse */
			final String responseClassCanonicalName = collectionPageClassCanonicalName
						.substring(0, collectionPageClassCanonicalName.length() - pageLength) + "Response";
			final Class<?> responseClass = Class.forName(responseClassCanonicalName);
			final Object response = responseClass.getConstructor().newInstance();
			responseClass.getField("value").set(response, list);
			final Class<?> collectionPageClass = Class.forName(collectionPageClassCanonicalName);
			/** eg: com.microsoft.graph.requests.extensions.IAttachmentCollectionRequestBuilder */
			final String responseBuilderInterfaceCanonicalName = responseClassCanonicalName
						.substring(0, responseClassCanonicalName.length() - responseLength)
						.replace(extensionsPath, extensionsPath + "I") + "RequestBuilder";
			final Class<?> responseBuilderInterfaceClass = Class.forName(responseBuilderInterfaceCanonicalName);
			return (BaseCollectionPage<T1, T2>)collectionPageClass.getConstructor(responseClass, responseBuilderInterfaceClass).newInstance(response, null);
		} catch(ClassNotFoundException ex) {
			logger.logError("Could not find class during deserialization", ex);
		} catch(NoSuchMethodException | InstantiationException | InvocationTargetException ex) {
			logger.logError("Could not instanciate type during deserialization", ex);
		} catch(NoSuchFieldException | IllegalAccessException ex) {
			logger.logError("Unable to set field value during deserialization", ex);
		}
		return null;
	}
}