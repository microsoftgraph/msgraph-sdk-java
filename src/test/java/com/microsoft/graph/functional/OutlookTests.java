package com.microsoft.graph.functional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.microsoft.graph.concurrency.ChunkedUploadProvider;
import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.Attachment;
import com.microsoft.graph.models.extensions.AttachmentItem;
import com.microsoft.graph.models.extensions.Attendee;
import com.microsoft.graph.models.extensions.AttendeeBase;
import com.microsoft.graph.models.extensions.Contact;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.EmailAddress;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.FileAttachment;
import com.microsoft.graph.models.extensions.ItemAttachment;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.MeetingTimeSuggestionsResult;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.models.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.UploadSession;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.generated.AttachmentType;
import com.microsoft.graph.models.generated.BodyType;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionResponse;
import com.microsoft.graph.requests.extensions.AttachmentCollectionResponse;
import com.microsoft.graph.requests.extensions.AttachmentCollectionPage;
import com.microsoft.graph.requests.extensions.MessageCollectionPage;
import com.microsoft.graph.requests.extensions.EventCollectionPage;
import com.microsoft.graph.requests.extensions.UserCollectionPage;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionPage;

@Ignore
public class OutlookTests {

    @Test
    public void testSendMail() {
        TestBase testBase = new TestBase();
        User me = testBase.graphClient.me().buildRequest().get();
        Recipient r = new Recipient();
        EmailAddress address = new EmailAddress();
        address.address = me.mail;
        r.emailAddress = address;
        Message message = new Message();
        message.subject = "Test E-Mail";
        message.from = r;
        ArrayList<Recipient> recipients = new ArrayList<Recipient>();
        recipients.add(r);
        message.toRecipients = recipients;
        testBase.graphClient.me().sendMail(message, true).buildRequest().post();
    }

    @Test
    public void testGetFindMeetingTimes() {
        TestBase testBase = new TestBase();

        // Get the first user in the tenant
        User me = testBase.graphClient.me().buildRequest().get();
        UserCollectionPage users = testBase.graphClient.users().buildRequest().get();
        User tenantUser = users.getCurrentPage().get(0);

        //Ensure that the user grabbed is not the logged-in user
        if (tenantUser.mail.equals(me.mail)) {
            tenantUser = users.getCurrentPage().get(1);
        }

        ArrayList<AttendeeBase> attendees = new ArrayList<AttendeeBase>();
        AttendeeBase attendeeBase = new AttendeeBase();
        EmailAddress email = new EmailAddress();
        email.address = tenantUser.mail;
        attendeeBase.emailAddress = email;
        attendees.add(attendeeBase);
        try {
        	DatatypeFactory.newInstance().newDuration("PT30M");
            Duration duration = DatatypeFactory.newInstance().newDuration("PT30M");
            MeetingTimeSuggestionsResult result = testBase.graphClient.me().findMeetingTimes(attendees, null, null, duration, 10, true, false, 10.0).buildRequest().post();
            assertNotNull(result);
        } catch (Exception e) {
            Assert.fail("Duration could not be created from String");
        }

    }
    
    @Test
    public void testSendDraft() {
    	TestBase testBase = new TestBase();
    	
    	//Attempt to identify the sent message via randomly generated subject
    	String draftSubject = "Draft Test Message " + Double.toString(Math.random()*1000);
    	Message newMessage = createDraftMessage(testBase, draftSubject);
        
    	//Send the drafted message
    	testBase.graphClient.me().mailFolders("Drafts").messages(newMessage.id).send().buildRequest().post();
    	
    	//Check that the sent message exists on the server
    	MessageCollectionPage mcp = testBase.graphClient.me().messages().buildRequest().filter("subject eq '" + draftSubject + "'").get();
    	assertFalse(mcp.getCurrentPage().isEmpty());
    }
    private Message createDraftMessage(TestBase testBase, String draftSubject) {
		User me = testBase.graphClient.me().buildRequest().get();
        Recipient r = new Recipient();
        EmailAddress address = new EmailAddress();
        address.address = me.mail;
        r.emailAddress = address;
        Message message = new Message();
        message.subject = draftSubject;
        ArrayList<Recipient> recipients = new ArrayList<Recipient>();
        recipients.add(r);
        message.toRecipients = recipients;
        message.isDraft = true;
        
        //Save the message as a draft
        return testBase.graphClient.me().messages().buildRequest().post(message);
	}
    @Test
    public void sendEmailWithAttachment() throws Exception{
    	TestBase testBase = new TestBase();
    	Message message = getMessage();
    	message.hasAttachments = true;
    	AttachmentCollectionResponse response = new AttachmentCollectionResponse();
    	response.value = Arrays.asList(getFileAttachment(),getItemAttachmentWithEvent(),getItemAttachmentWithContact());
		message.attachments = new AttachmentCollectionPage(response, null);
		testBase.graphClient.me().sendMail(message, true).buildRequest().post();
    }

    @Test
    public void uploadEmailAsDraftWithAttachmentThenSend() {
    	TestBase testBase = new TestBase();
    	Message message = getMessage();
    	Message m = testBase.graphClient.me().messages().buildRequest().post(message);
    	assertNotNull(m);
		testBase.graphClient.me().messages(m.id).send().buildRequest().post();
    }

    @Test
    public void sendEventWithAttachment() throws Exception{
    	TestBase testBase = new TestBase();
    	Event event = getEvent();
		event.body = getItemBody();
		event.hasAttachments = true;
		AttachmentCollectionResponse response = new AttachmentCollectionResponse();
		response.value = Arrays.asList(getFileAttachment(),getItemAttachmentWithContact());
		event.attachments = new AttachmentCollectionPage(response, null); 
		Event eventResponse = testBase.graphClient.me().events().buildRequest().post(event);
		assertNotNull(eventResponse);
    }

    private ItemBody getItemBody() {
    	ItemBody itemBody = new ItemBody();
		itemBody.content = "<html><head></head><body> test body </body></html>";
		itemBody.contentType = BodyType.HTML;
		return itemBody;
    }

    public Message getMessage() {
		Message message = new Message();
		java.util.List<String> emails = Arrays.asList("test_email@test_domain.com");
		java.util.List<Recipient> listReceipient = new ArrayList<>();
		for(String email : emails) {
			EmailAddress emailAddress = new EmailAddress();
			emailAddress.address = email;
			Recipient recipient = new Recipient();
			recipient.emailAddress = emailAddress;
			listReceipient.add(recipient);
		}
		message.body = getItemBody();
		message.toRecipients = listReceipient;
		message.subject = "Test Message";
		message.id = "1234";
		return message;
	}

    private FileAttachment getFileAttachment() throws Exception{
		FileAttachment fileAttachment = new FileAttachment();
		fileAttachment.name = "document.pdf";
		File pdfFile = new File("src/test/resources/document.pdf");
		InputStream fileStream = new FileInputStream(pdfFile);
		fileAttachment.contentBytes = OutlookTests.getByteArray(fileStream);
		fileAttachment.oDataType = "#microsoft.graph.fileAttachment";
		fileAttachment.id="54321";
		return fileAttachment;
	}

	private ItemAttachment getItemAttachmentWithEvent() {
		ItemAttachment itemAttachmentEvent = new ItemAttachment();
		itemAttachmentEvent.oDataType = "#microsoft.graph.itemAttachment";
		itemAttachmentEvent.name = "event name";
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

	public static byte[] getByteArray(InputStream in) {
		try {
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[16384];
			while ((nRead = in.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
			}
			buffer.flush();
			return buffer.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	IProgressCallback<AttachmentItem> callback = new IProgressCallback<AttachmentItem> () {
		@Override
		public void progress(final long current, final long max) {
			//Check progress
		}
		@Override
		public void success(final AttachmentItem result) {
			//Handle the successful response
			Assert.assertNotNull(result);
		}
		
		@Override
		public void failure(final ClientException ex) {
			//Handle the failed upload
			Assert.fail("Upload session failed");
		}
	};
	@Test
    public void testSendDraftWithLargeAttachements() throws FileNotFoundException, IOException {
    	TestBase testBase = new TestBase();
    	
    	//Attempt to identify the sent message via randomly generated subject
    	String draftSubject = "Draft Test Message " + Double.toString(Math.random()*1000);
    	Message newMessage = createDraftMessage(testBase, draftSubject);

		File file = new File("src/test/resources/largefile10M.blob");

		AttachmentItem attachmentItem = new AttachmentItem();
		attachmentItem.attachmentType = AttachmentType.FILE;
		attachmentItem.name = file.getName();
		attachmentItem.size = file.length();
		attachmentItem.contentType = "application/octet-stream";

		InputStream fileStream = OutlookTests.class.getClassLoader().getResourceAsStream("largefile10M.blob");

		long streamSize = attachmentItem.size;

		UploadSession uploadSession = testBase.graphClient.me()
									.messages(newMessage.id)
									.attachments()
									.createUploadSession(attachmentItem)
									.buildRequest()
									.post();

		ChunkedUploadProvider<AttachmentItem> chunkedUploadProvider = new ChunkedUploadProvider<>(uploadSession, testBase.graphClient, fileStream,
				streamSize, AttachmentItem.class);
		
		// Do the upload
		chunkedUploadProvider.upload(callback);

    	//Send the drafted message
    	testBase.graphClient.me().mailFolders("Drafts").messages(newMessage.id).send().buildRequest().post();
	}
	@Test
	public void testSingleValuesExtendedProperties() {
    	final TestBase testBase = new TestBase();
		final EventCollectionPage arrangePage = testBase.graphClient.me().events().buildRequest().top(1).get();
		final String eventId = arrangePage.getCurrentPage().get(0).id;
		final Event updatedEvent = new Event();
		final String uuid = UUID.randomUUID().toString();
		final SingleValueLegacyExtendedProperty prop =  new SingleValueLegacyExtendedProperty();
		prop.id = "String {"+uuid+"} Name fun";
		prop.value = "some value";
		final SingleValueLegacyExtendedPropertyCollectionResponse response = new SingleValueLegacyExtendedPropertyCollectionResponse();
		response.value = new ArrayList<SingleValueLegacyExtendedProperty>();
		response.value.add(prop);
		updatedEvent.singleValueExtendedProperties = new SingleValueLegacyExtendedPropertyCollectionPage(response, new SingleValueLegacyExtendedPropertyCollectionRequestBuilder(null, null, null));

		testBase.graphClient.me().events(eventId).buildRequest().patch(updatedEvent);
		final EventCollectionPage page = testBase.graphClient.me()
										.events()
										.buildRequest()
										.expand("singleValueExtendedProperties")
										.top(1)
										// .filter("singleValueExtendedProperties/Any(ep: ep/id eq '"+prop.id+"' and ep/value eq '"+prop.value+"')")
										.get();
		assertNotNull(page);
		final List<Event> events = page.getCurrentPage();
		assertTrue(events.size() == 1);
		assertNotNull(events.get(0).singleValueExtendedProperties);
	}
}