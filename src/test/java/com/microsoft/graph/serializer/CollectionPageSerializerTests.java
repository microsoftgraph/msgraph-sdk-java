package com.microsoft.graph.serializer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.logger.MockLogger;
import com.microsoft.graph.models.extensions.Attachment;
import com.microsoft.graph.models.extensions.Attendee;
import com.microsoft.graph.models.extensions.Contact;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.EmailAddress;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.FileAttachment;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.ItemAttachment;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.requests.extensions.AttachmentCollectionPage;
import com.microsoft.graph.requests.extensions.EventCollectionResponse;
import com.microsoft.graph.requests.extensions.AttachmentCollectionResponse;

public class CollectionPageSerializerTests {
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
        JsonElement serializedJson = CollectionPageSerializer.serialize(attachmentCollectionPage, logger);
        logger.logDebug(serializedJson.toString());
        assertEquals(expectedString,serializedJson.toString());
    }

	@Test
    public void testAttachmentCollectionPageDeserialization() throws Exception {
		String jsonString = "[{\"contentBytes\":\"ZGF0YQ==\",\"name\":\"document.pdf\",\"@odata.type\":\"#microsoft.graph.fileAttachment\",\"id\":\"54321\"},{\"@odata.type\":\"#microsoft.graph.itemAttachment\",\"name\":\"Holiday event\",\"id\":null,\"isInline\":null,\"size\":null,\"item\":{\"subject\":\"Test Event Subject\",\"start\":{\"dateTime\":\"2018-10-16T06:15:26.544Z\",\"timeZone\":\"UTC\"},\"end\":{\"dateTime\":\"2018-11-18T07:30:26.544Z\",\"timeZone\":\"UTC\"},\"@odata.type\":\"microsoft.graph.event\",\"id\":\"1234\"}},{\"@odata.type\":\"#microsoft.graph.itemAttachment\",\"name\":\"Attachment name\",\"id\":null,\"isInline\":null,\"size\":null,\"item\":{\"displayName\":\"displayname\",\"mobilePhone\":\"123456890\",\"@odata.type\":\"microsoft.graph.contact\"}}]";
		JsonElement jsonElement = JsonParser.parseString(jsonString);
		BaseCollectionPage<Attachment,?> attachmentCollectionPage = CollectionPageSerializer.deserialize(jsonElement, AttachmentCollectionPage.class, logger);
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

	@Test
	public void testEntityWithCollectionOnDefaultDeserializer() throws Exception {
		final String jsonString = "{\"createdBy\":{\"application\":{\"displayName\":\"UmtPlus\",\"id\":\"4458250c\"},\"user\":{\"id\":\"c1fba35378bf924c\"}},\"createdDateTime\":\"2020-09-16T14:53:53.61Z\",\"cTag\":\"aYzpDMUZCQTM1Mzc4QkY5MjRDITIzNDkyNS4yNTc\",\"eTag\":\"aQzFGQkEzNTM3OEJGOTI0QyEyMzQ5MjUuMTE\",\"id\":\"C1FBA35378BF924C!234925\",\"lastModifiedBy\":{\"application\":{\"displayName\":\"UmtPlus\",\"id\":\"4458250c\"},\"user\":{\"id\":\"c1fba35378bf924c\"}},\"lastModifiedDateTime\":\"2020-09-16T17:42:17.847Z\",\"name\":\"Change Flat Tire.sco\",\"parentReference\":{\"driveId\":\"c1fba35378bf924c\",\"driveType\":\"personal\",\"id\":\"C1FBA35378BF924C!234867\",\"name\":\"UmtPlus\",\"path\":\"/drive/root:/UmtPlus\"},\"size\":59228,\"webUrl\":\"https://1drv.ms/u/s!AEySv3hTo_vBjqst\",\"items\":[],\"file\":{\"hashes\":{\"quickXorHash\":\"RjqF6zG7yzMKxLlRmXkKr0tK7oQ=\",\"sha1Hash\":\"A7A1DB7C7355A372E6097C5BD7DF6CF702AFA897\",\"sha256Hash\":\"97EF73D523368EE939D084F87DE22E28BD9236CC55D6A67EE69183FFC456CA08\"},\"mimeType\":\"application/octet-stream\"},\"fileSystemInfo\":{\"createdDateTime\":\"2020-09-16T14:53:53.61Z\",\"lastModifiedDateTime\":\"2020-09-16T17:42:17.846Z\"},\"reactions\":{\"commentCount\":0},\"tags\":[],\"lenses\":[],\"thumbnails\":[{\"id\":\"0\",\"large\":{\"height\":800,\"url\":\"https://oxo45g.bl.files.1drv.com/y4pi3j1XhJr0-LmucbMAY7erAc5yeeX8yXaxUqk7p5O1mYVUMnRmzIeFC8LgpZLXCNFkFfVzt_PlChpIBL2VwTp9bdXVToVWsHRKC5MmEiO4Zv3eR9_JCc2ih4jstMbx6AusvkIpCW7FEpWWSeyFQEJR0jbaNNZSs_n6Ryrio2xYl9LhINf19-xYBxVCR4kV188?width=800&height=800&cropmode=none\",\"width\":800},\"medium\":{\"height\":176,\"url\":\"https://oxo45g.bl.files.1drv.com/y4pi3j1XhJr0-LmucbMAY7erAc5yeeX8yXaxUqk7p5O1mYVUMnRmzIeFC8LgpZLXCNFkFfVzt_PlChpIBL2VwTp9bdXVToVWsHRKC5MmEiO4Zv3eR9_JCc2ih4jstMbx6AusvkIpCW7FEpWWSeyFQEJR0jbaNNZSs_n6Ryrio2xYl9LhINf19-xYBxVCR4kV188?width=176&height=176&cropmode=none\",\"width\":176},\"small\":{\"height\":96,\"url\":\"https://oxo45g.bl.files.1drv.com/y4pi3j1XhJr0-LmucbMAY7erAc5yeeX8yXaxUqk7p5O1mYVUMnRmzIeFC8LgpZLXCNFkFfVzt_PlChpIBL2VwTp9bdXVToVWsHRKC5MmEiO4Zv3eR9_JCc2ih4jstMbx6AusvkIpCW7FEpWWSeyFQEJR0jbaNNZSs_n6Ryrio2xYl9LhINf19-xYBxVCR4kV188?width=96&height=96&cropmode=none\",\"width\":96}}]}";
		final DefaultSerializer defaultSerializer = new DefaultSerializer(logger);
		final DriveItem driveItem = defaultSerializer.deserializeObject(jsonString, DriveItem.class);
		assertNotNull(driveItem);
		assertNotNull(driveItem.thumbnails);
		assertTrue(driveItem.thumbnails.getCurrentPage().size() > 0);
	}

	@Test
	public void testEntityWithCollectionOfMultipleTypes() throws Exception {
		final String jsonString = "{\"@odata.context\": \"https://graph.microsoft.com/v1.0/$metadata#groups/$entity\",\"id\": \"01b4b70e-2ea6-432f-a3d7-eefd826c2a8e\",\"deletedDateTime\": null,\"classification\": null,\"createdDateTime\": \"2019-11-23T15:48:33Z\",\"creationOptions\": [],\"description\": \"wovinewovinewvoinwev\",\"displayName\": \"Toronto Basketball Raptors\",\"expirationDateTime\": null,\"groupTypes\": [\"Unified\"],\"isAssignableToRole\": null,\"mail\": \"TBR@contoso.onmicrosoft.com\",\"mailEnabled\": true,\"mailNickname\": \"TBR\",\"membershipRule\": null,\"membershipRuleProcessingState\": null,\"onPremisesDomainName\": null,\"onPremisesLastSyncDateTime\": null,\"onPremisesNetBiosName\": null,\"onPremisesSamAccountName\": null,\"onPremisesSecurityIdentifier\": null,\"onPremisesSyncEnabled\": null,\"preferredDataLocation\": null,\"preferredLanguage\": null,\"proxyAddresses\": [\"SPO:SPO_c0b1d860-d3d3-444c-98ee-c34365caa414@SPO_bd4c6c31-c49c-4ab6-a0aa-742e07c20232\",\"SMTP:TBR@contoso.onmicrosoft.com\"],\"renewedDateTime\": \"2019-11-23T15:48:33Z\",\"resourceBehaviorOptions\": [],\"resourceProvisioningOptions\": [\"Team\"],\"securityEnabled\": false,\"securityIdentifier\": \"S-1-12-1-28620558-1127165606-4260288419-2385144962\",\"theme\": null,\"visibility\": \"Private\",\"onPremisesProvisioningErrors\": [],\"members\": [{\"@odata.type\": \"#microsoft.graph.user\",\"id\": \"c2e8df37-c6a7-4d88-89b1-feb4f1fda7c5\",\"businessPhones\": [\"4388888888\"],\"displayName\": \"Vincent Biret\",\"givenName\": \"Vincent\",\"jobTitle\": null,\"mail\": \"vincent@contoso.onmicrosoft.com\",\"mobilePhone\": \"+1 4388888888\",\"officeLocation\": \"Quebec\",\"preferredLanguage\": \"en-US\",\"surname\": \"Biret\",\"userPrincipalName\": \"vincent@contoso.onmicrosoft.com\"},{\"@odata.type\": \"#microsoft.graph.servicePrincipal\",\"id\": \"004ea702-a572-4f1b-8bb0-74598985e0c0\",\"deletedDateTime\": null,\"accountEnabled\": true,\"alternativeNames\": [],\"appDisplayName\": \"OCPS Checkin Service\",\"appDescription\": null,\"appId\": \"23c898c1-f7e8-41da-9501-f16571f8d097\",\"applicationTemplateId\": null,\"appOwnerOrganizationId\": \"f8cdef31-a31e-4b4a-93e4-5f571e91255a\",\"appRoleAssignmentRequired\": false,\"createdDateTime\": \"2018-11-13T02:28:32Z\",\"description\": null,\"displayName\": \"OCPS Checkin Service\",\"homepage\": null,\"loginUrl\": null,\"logoutUrl\": null,\"notes\": null,\"notificationEmailAddresses\": [],\"preferredSingleSignOnMode\": null,\"preferredTokenSigningKeyThumbprint\": null,\"replyUrls\": [\"https://ocps.manage.microsoft.com\"],\"resourceSpecificApplicationPermissions\": [],\"samlSingleSignOnSettings\": null,\"servicePrincipalNames\": [\"23c898c1-f7e8-41da-9501-f16571f8d097\",\"https://ocps.manage.microsoft.com\"],\"servicePrincipalType\": \"Application\",\"tags\": [],\"tokenEncryptionKeyId\": null,\"verifiedPublisher\": {\"displayName\": null,\"verifiedPublisherId\": null,\"addedDateTime\": null},\"addIns\": [],\"appRoles\": [],\"info\": {\"logoUrl\": null,\"marketingUrl\": null,\"privacyStatementUrl\": null,\"supportUrl\": null,\"termsOfServiceUrl\": null},\"keyCredentials\": [],\"oauth2PermissionScopes\": [],\"passwordCredentials\": []}]}";
		final DefaultSerializer defaultSerializer = new DefaultSerializer(logger);
		final Group group = defaultSerializer.deserializeObject(jsonString, Group.class);
		assertNotNull(group);
		assertNotNull(group.members);
		final List<DirectoryObject> page = group.members.getCurrentPage();
		assertTrue(page.size() == 2);
		assertTrue(page.get(0) instanceof User);
		assertTrue(page.get(1) instanceof ServicePrincipal);
	}
	@Test
	public void testEntityCollectionWithSingleValueExtendedProperties() throws Exception {
		final String jsonString = "{\"@odata.context\": \"https://graph.microsoft.com/v1.0/$metadata#users('c2e8df37-c6a7-4d88-89b1-feb4f1fda7c5')/events\",\"@odata.nextLink\": \"https://graph.microsoft.com/v1.0/me/events?$skip=10\",\"value\": [{\"@odata.context\": \"https://graph.microsoft.com/v1.0/$metadata#Me/messages/$entity\",\"@odata.id\": \"https://graph.microsoft.com/v1.0/users('ddfcd489-628b-40d7-b48b-57002df800e5@1717622f-1d94-4d0c-9d74-709fad664b77')/messages('AAMkAGE1M2_bs88AACHsLqWAAA=')\",\"@odata.etag\": \"W/\\\"CQAAABYAAACY4MQpaFz9SbqUDe4+bs88AACbyS4H\\\"\",\"id\": \"AAMkAGE1M2_bs88AACHsLqWAAA=\",\"subject\": \"RE: Talk about emergency prep\",\"sender\": {\"emailAddress\": {\"name\": \"Christine Irwin\",\"address\": \"christine@contoso.com\"}},\"from\": null,\"toRecipients\": [{\"emailAddress\": {\"name\": \"Christine Irwin\",\"address\": \"christine@contoso.com\"}}],\"singleValueExtendedProperties@odata.context\": \"https://graph.microsoft.com/v1.0/$metadata#Me/messages('AAMkAGE1M2_bs88AACHsLqWAAA%3D')/singleValueExtendedProperties\",\"singleValueExtendedProperties\": [{\"id\": \"String {66f5a359-4659-4830-9070-00047ec6ac6e} Name Color\",\"value\": \"Green\"}]}]}";
		final DefaultSerializer defaultSerializer = new DefaultSerializer(logger);
		final EventCollectionResponse events = defaultSerializer.deserializeObject(jsonString, EventCollectionResponse.class);
		assertNotNull(events);
		assertTrue(events.value.get(0).singleValueExtendedProperties.getCurrentPage().size() > 0);
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