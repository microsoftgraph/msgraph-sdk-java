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
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.models.extensions.Attachment;
import com.microsoft.graph.models.extensions.Contact;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.FileAttachment;
import com.microsoft.graph.models.extensions.ItemAttachment;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.ReferenceAttachment;
import com.microsoft.graph.requests.extensions.AttachmentCollectionPage;
import com.microsoft.graph.requests.generated.BaseAttachmentCollectionResponse;

public class AttachmentCollectionPageSerializer {

	private static JsonParser parser;
	private static DefaultSerializer serializer;

	/**
	 * Not available for instantiation
	 */
	private AttachmentCollectionPageSerializer() {
	}

	/**
     * Serializes an AttachmentCollectionPage
     * 
     * @param src the AttachmentCollectionPage variable for serialization
     * @param logger the logger
     * @return       JsonElement of AttachmentCollectionPage
     */
	public static JsonElement serialize(final AttachmentCollectionPage src, final ILogger logger) {
		if(src == null) {
			return null;
		}
		JsonArray jsonArray = new JsonArray();
		List<Attachment> attachments = src.getCurrentPage();
		serializer = new DefaultSerializer(logger);
		String json;
		JsonObject jsonObject;
		parser = new JsonParser();

		for(Attachment attachment : attachments) {
			jsonObject = new JsonObject();
			if(attachment instanceof FileAttachment) {
				FileAttachment fileAttachment = (FileAttachment)attachment;
				json = serializer.serializeObject(fileAttachment);
				jsonObject = (JsonObject)parser.parse(json);
			}
			else if(attachment instanceof ItemAttachment) {
				ItemAttachment itemAttachment = (ItemAttachment)attachment;
				jsonObject.addProperty("@odata.type",itemAttachment.oDataType);
				jsonObject.addProperty("name", itemAttachment.name);
				jsonObject.addProperty("id",itemAttachment.id);
				jsonObject.addProperty("isInline",itemAttachment.isInline);
				jsonObject.addProperty("name",itemAttachment.name);
				jsonObject.addProperty("size",itemAttachment.size);
				
				if(itemAttachment.lastModifiedDateTime != null) {
					jsonObject.add("lastModifiedDateTime", parser.parse(CalendarSerializer.serialize((Calendar)itemAttachment.lastModifiedDateTime)));
				}
				if(itemAttachment.item instanceof Event) {
					Event event = (Event)itemAttachment.item;
					jsonObject.add("item", parser.parse(serializer.serializeObject(event)));
				}
				else if(itemAttachment.item instanceof Message) {
					Message message = (Message)itemAttachment.item;
					jsonObject.add("item", parser.parse(serializer.serializeObject(message)));
				}
				else if(itemAttachment.item instanceof Contact) {
					Contact contact = (Contact)itemAttachment.item;
					jsonObject.add("item", parser.parse(serializer.serializeObject(contact)));
				}
			}
			else if(attachment instanceof ReferenceAttachment){
				ReferenceAttachment referenceAttachment = (ReferenceAttachment)attachment;
				json = serializer.serializeObject(referenceAttachment);
				jsonObject = (JsonObject)parser.parse(json);
			}
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	/**
     * Deserializes the JsonElement
     *
     * @param json the source AttachmentCollectionPage's Json
     * @param logger the logger
     * @throws JsonParseException the parse exception
     * @return    the deserized AttachmentCollectionPage
     */
	public static AttachmentCollectionPage deserialize(final JsonElement json, final ILogger logger) throws JsonParseException {
		if (json == null) {
			return null;
		}
		final BaseAttachmentCollectionResponse response = new BaseAttachmentCollectionResponse();
		serializer = new DefaultSerializer(logger);
		JsonObject[] sourceArray = serializer.deserializeObject(json.toString(), JsonObject[].class);
		Attachment[] array = new Attachment[sourceArray.length];
		for (int i = 0; i < sourceArray.length; i++) {
			array[i] = serializer.deserializeObject(sourceArray[i].toString(), Attachment.class);
			array[i].setRawObject(serializer, sourceArray[i]);
		}
		response.value = Arrays.asList(array);
		return new AttachmentCollectionPage(response, null);
	}
}