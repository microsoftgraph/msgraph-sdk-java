package com.microsoft.graph.serializer;

import static org.junit.Assert.assertEquals;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.microsoft.graph.logger.MockLogger;
import com.microsoft.graph.models.extensions.Attachment;
import com.microsoft.graph.models.extensions.Attendee;
import com.microsoft.graph.models.extensions.Contact;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.EmailAddress;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.FileAttachment;
import com.microsoft.graph.models.extensions.ItemAttachment;
import com.microsoft.graph.requests.extensions.AttachmentCollectionPage;
import com.microsoft.graph.requests.extensions.AttachmentCollectionResponse;

public class AttachmentCollectionPageSerializerTests {
	private MockLogger logger;
	@Before
	public void setUp() {
		logger = new MockLogger();
	}

	@Test
	public void testAttachmentCollectionPageSerialization() throws Exception {
        String expectedString = "[{\"contentBytes\":\"ZGF0YQ==\",\"name\":\"document.pdf\",\"@odata.type\":\"#microsoft.graph.fileAttachment\",\"id\":\"54321\"},{\"item\":{\"end\":{\"dateTime\":\"2018-11-18T07:30:26.544Z\",\"timeZone\":\"UTC\"},\"start\":{\"dateTime\":\"2018-10-16T06:15:26.544Z\",\"timeZone\":\"UTC\"},\"subject\":\"Test Event Subject\",\"@odata.type\":\"microsoft.graph.event\",\"id\":\"1234\"},\"name\":\"Holiday event\",\"@odata.type\":\"#microsoft.graph.itemAttachment\"},{\"item\":{\"displayName\":\"displayname\",\"mobilePhone\":\"123456890\",\"@odata.type\":\"microsoft.graph.contact\"},\"name\":\"Attachment name\",\"@odata.type\":\"#microsoft.graph.itemAttachment\"}]";
        AttachmentCollectionResponse response = new AttachmentCollectionResponse();
        response.value = Arrays.asList(getFileAttachment(),getItemAttachmentWithEvent(),getItemAttachmentWithContact());
        AttachmentCollectionPage attachmentCollectionPage = new AttachmentCollectionPage(response, null);
        JsonElement serializedJson = AttachmentCollectionPageSerializer.serialize(attachmentCollectionPage, logger);
        logger.logDebug(serializedJson.toString());
        assertEquals(expectedString,serializedJson.toString());
    }

	@Test
    public void testAttachmentCollectionPageDeserialization() throws Exception {
		String jsonString = "[{\"contentBytes\":\"ZGF0YQ==\",\"name\":\"document.pdf\",\"@odata.type\":\"#microsoft.graph.fileAttachment\",\"id\":\"54321\"},{\"@odata.type\":\"#microsoft.graph.itemAttachment\",\"name\":\"Holiday event\",\"id\":null,\"isInline\":null,\"size\":null,\"item\":{\"subject\":\"Test Event Subject\",\"start\":{\"dateTime\":\"2018-10-16T06:15:26.544Z\",\"timeZone\":\"UTC\"},\"end\":{\"dateTime\":\"2018-11-18T07:30:26.544Z\",\"timeZone\":\"UTC\"},\"@odata.type\":\"microsoft.graph.event\",\"id\":\"1234\"}},{\"@odata.type\":\"#microsoft.graph.itemAttachment\",\"name\":\"Attachment name\",\"id\":null,\"isInline\":null,\"size\":null,\"item\":{\"displayName\":\"displayname\",\"mobilePhone\":\"123456890\",\"@odata.type\":\"microsoft.graph.contact\"}}]";
		JsonElement jsonElement = JsonParser.parseString(jsonString);
		AttachmentCollectionPage attachmentCollectionPage = AttachmentCollectionPageSerializer.deserialize(jsonElement, logger);
		for(Attachment attachment: attachmentCollectionPage.getCurrentPage()) {
			if(attachment instanceof FileAttachment) {
				FileAttachment fileAttachment = (FileAttachment)attachment;
				assertEquals(fileAttachment.name, getFileAttachment().name);
				String actual = ByteArraySerializer.serialize(fileAttachment.contentBytes);
				String expected = ByteArraySerializer.serialize(getFileAttachment().contentBytes);
				assertEquals(expected,actual);
			}
			else if(attachment instanceof ItemAttachment) {
				ItemAttachment itemAttachment = (ItemAttachment)attachment;
				if(itemAttachment.item instanceof Event) {
					Event event = (Event)itemAttachment.item;
					assertEquals(getEvent().subject, event.subject);
				}
				else if(itemAttachment.item instanceof Contact) {
					Contact actual = (Contact)itemAttachment.item;
					Contact expected = (Contact) getItemAttachmentWithContact().item;
					assertEquals(expected.mobilePhone, actual.mobilePhone);
				}
			}
		}
	}

	private FileAttachment getFileAttachment() throws Exception{
		FileAttachment fileAttachment = new FileAttachment();
		fileAttachment.name = "document.pdf";
		fileAttachment.contentBytes = "data".getBytes(StandardCharsets.UTF_8);
		fileAttachment.oDataType = "#microsoft.graph.fileAttachment";
		fileAttachment.id="54321";
		return fileAttachment;
	}

	private ItemAttachment getItemAttachmentWithEvent() {
		ItemAttachment itemAttachmentEvent = new ItemAttachment();
		itemAttachmentEvent.oDataType = "#microsoft.graph.itemAttachment";
		itemAttachmentEvent.name = "Holiday event";
		itemAttachmentEvent.item = getEvent();
		itemAttachmentEvent.item.oDataType = "microsoft.graph.event";
        return itemAttachmentEvent;
	}

	private ItemAttachment getItemAttachmentWithContact() {
		Contact contact = new Contact();
        contact.displayName = "displayname";
        contact.mobilePhone="123456890";
		ItemAttachment itemAttachmentContact = new ItemAttachment();
        itemAttachmentContact.oDataType = "#microsoft.graph.itemAttachment";
        itemAttachmentContact.name = "Attachment name";
        itemAttachmentContact.item = contact;
        itemAttachmentContact.item.oDataType = "microsoft.graph.contact";
        return itemAttachmentContact;
	}

	private Event getEvent() {
		Event event = new Event();
		java.util.List<String> emails = Arrays.asList("test_email@test_domain.com");
		java.util.List<Attendee> attendees = new ArrayList<>();
		for(String email : emails) {
			EmailAddress emailAddress = new EmailAddress();
			emailAddress.address = email;
			Attendee attendee = new Attendee();
			attendee.emailAddress = emailAddress;
			attendees.add(attendee);
		}
		DateTimeTimeZone start = new DateTimeTimeZone();
		start.timeZone = "UTC";
		start.dateTime = "2018-10-16T06:15:26.544Z";
		DateTimeTimeZone end = new DateTimeTimeZone();
		end.timeZone = "UTC";
		end.dateTime = "2018-11-18T07:30:26.544Z";
		event.start = start;
		event.end = end;
		event.subject = "Test Event Subject";
		event.id = "1234";
		return event;
	}
}