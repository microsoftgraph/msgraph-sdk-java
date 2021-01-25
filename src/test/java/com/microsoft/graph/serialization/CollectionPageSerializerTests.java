package com.microsoft.graph.serialization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.models.Attachment;
import com.microsoft.graph.models.Attendee;
import com.microsoft.graph.models.Contact;
import com.microsoft.graph.models.DateTimeTimeZone;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.models.EmailAddress;
import com.microsoft.graph.models.Event;
import com.microsoft.graph.models.FileAttachment;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.ItemAttachment;
import com.microsoft.graph.models.ServicePrincipal;
import com.microsoft.graph.models.User;
import com.microsoft.graph.requests.EventCollectionResponse;
import com.microsoft.graph.requests.UserDeltaCollectionPage;
import com.microsoft.graph.requests.UserDeltaCollectionResponse;
import com.microsoft.graph.serializer.ByteArraySerializer;
import com.microsoft.graph.serializer.CollectionPageSerializer;
import com.microsoft.graph.serializer.DefaultSerializer;
import com.microsoft.graph.requests.AttachmentCollectionResponse;
import com.microsoft.graph.requests.AttachmentCollectionPage;

public class CollectionPageSerializerTests {
	private ILogger logger;
	@Before
	public void setUp() {
		logger = mock(ILogger.class);
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
    @Test 
    public void deltaLinkEndtoEndTest() throws Exception {
        final String jsonString = "{\"@odata.context\":\"https://graph.microsoft.com/v1.0/$metadata#users\",\"@odata.deltaLink\":\"https://graph.microsoft.com/v1.0/users/delta?$deltatoken=iW6HI4gRQf_CNwkN_2YR_wZsbUvU92el3RLdsbOM_4ZSC9GlnuDQvR2Xy0DDbLeJHde01ChMf5TmFQhCNFFwoil_n6kD8qDh5afldOw_CAj71jPUSP5Fwi3_PqeWMhN3LdX6oFBE5T-RyeUJaXsP9b4DLxYnmOrlb9EyOd4LP-kffRADZDN30aTt402EhIx-s0UWAEkKuSEVw2C2QyzqWQFO_PrC5wRXXVi6DiQf715QDXkxDmpNkgcS_jzINs2u9HbZzIpj170ZOx52vE_3eaI150SAd8qXOg9DEFPc5KUwAeOyEruCnqGuN07TuOc7L8eXa96_R-snlCNjB4R7qOWXQcbhRejm0izYC8w7g3uu1l3cPdhZURDsioOlO1xQGTa_upsvqMiVZBaNgMzZlRvy3GZmNTW-zQA1PFfKgwaVpWB8DcvG2CagEXE_Run7zFav00LHlKc8mEpQnfzYrbNct_sgpBGdK7-alRFg_-x0gHqMuzIznmYn6mQ_Nh_e-s57wtHDNgTYAKKMjlJlOoHig2G3aTHc4zdg0zQ_LFTi1EiIxh5a1tZQuGhxp2-ky4_kfnl0qekJvkchqHquWMRm0iQ4Dja3VEFI7AIBxhNG4VBDibOm_HZd7Jtm9nxT_bCI5ji5aaaFMvy16Ei11sAWf9390ly9-HscR2zr2RHu1hReVxkVt-nUA-lhXmxWBrM64NJUae0JbF5s68QWCEBhWvGBYYclMjMvQfHG5R7yJ7Kosp_Afxg4Vna1cvCXuHLBe0RiCCMg88dnQreMiFC6rWRmltuJ8Ryk7u_ZFU_g0mPc904dhnJ5SfUJRnjQAkL-4I5LSDgGOR3Xk-j4ZTa5sE33bbrD5b4U2iNk7W38X3uXMs4EDvm74bL9fWZ-uQTIrJv5gsboLQK3kwH-UHdUFU6s2TBqyT6cWN37I6m58-t393Ed3sPK3Q3adGZihvx2y0tmvXoqjUILEf4Ewzh40ZJzvQMJhwcetHnpGmOppwF1VnDquXjezN9UcLM3paAHys9zgBcyxqsimQtehMsA6HlngaVhzJ2BBarCdGO4At8_F1DHbu6VOVukvi01xjLaw2xKH6n42TbngHDLBw-IeexackM9q2oZIP-PM2LhoG16cdQgg-0z1sTfHygcEiJMvd_AE58m54wJOFV2DkgpH2mLwaZqPaGq8cy7rOpvx3kt3k7MrIe7RX3ordZlLj_JKZLHmN0hpM7VldUO_DblWTVWYv94MXEh1aI4seq_PkS2WHPZKcCkyOttgKLdjEyGcnTJ2hhOH2Ppe5DpVnsPHUrSFlg4sNDb4ZOgAGclmbDSMgzNSl1UEscuM7l9tQd8gVQUEEacxz2wk5_-FMKV7SwQhtTgF313vvjbFF4hCwfziXL8ACAUTQGQrHAi5BHA6kYJX1iphjEpBqisAr7CvgyZmS3tgnSxSn6f4qvewl_zm4x34aMF-vWx_-0V4XOO46WwlaV33QVu3QiS27Pdec5ty13yu6kNhcF1F9ybJ4ogLVXUToxcNobcF4RiuyFULSNZJILKu0wh90E-HoeZMVJvZH7GvqHecV1CZ4fd3-92yMKqV-_yC1RIiUcfVIGnW6uo4T7Lf7yBrD4eyWzgZTNAXn8sIkwi7ssN6TR1YBSPn-3kG6VT5F8aI839qWbUhqrb7Wc2uG3op1lPVZIOyvWji6gS2oAfhnV0pKW7Py14OZcJyH92mYFIW6ytqRPTEEeaDWUkT_-fZtXVr_i-0MtguhKEa75JEkKVspwIvmC30r4yV89QMidE018Dva-GjDP7okW3VfIfGhrTOeL26YpwLM6cLXMW9H3CF-D3TKNwb6pfFHOHtoTRJnQ5DE9wnmFuRs5HLUmCGA2TA8zEZxQ3POC_uvQQAuNC1SddTN83QMab2nNkERCpa-ZuE92J1VvCMr7tVXTFuZQB3J6e95twDAWuW-vPoS8pWooaWfEuo1tiHUkbO88kra4qpWLmPM1IQxfku-ZzI8-1xA9I23qEaOyjqnyvjlIIkUlcgsQ8K9l6VbPjbJVsjQeGev7nIB7hE7d16uYWCunkfHDgsu880aSHx8IVbYxif29vAHYUipT2ZDfMfa7SEQNrKcWxORZt1C2q9RHiNTRPQiuypt1vy99OYwJfj1RN58NQy4HCMcgfC0FoCaZofvfvQ5pWlV3qVjwMpyweUt76gBnLozl9l2sM5SEbGlTbM8FuH4FoDEHV27fBZAdMAAwP3ruItHR1TQTfyeHYroZsThMxCBbqM0N3SaLbIbDqA4vhzE2m-VNdeEfgnIn8KQaaU3oseYY17K8d1h5912hLXlzL-AadFxyCAlJbN45t8ngRcb4WZ6L2XNFpFj8dH3Hs9p4QEEinaa0LwcesHRglrUGlRJQsb3JukeihpYGIXYSEmPqvl8FqN8FYVcSJN91evspZt3HtX3yZG7pasmptP9V_8uOojq56MpccWcsf2cm_LNYL7QJcnZNt0wf9Z3h42xLwM4hsKK6_2vEVTPL8v0Uklp9i-YM-mhbzfbV-XasSWIA2rx8di-dQ0UNPOILPJE4UHicTc5AP-Z_pk1oKmnTw3Y4BYMH-3rTgem5ijVONIsWywat82CXl5bZLdzNlybt8Ia1FJORVe-SeFGlqStmh62URSW0XpdZd8HPXYZn3LDlFvbx7DeQye_1tN0n-hG2htNwwb3mAmJISPPMDkDLtiN8Bu5IvTtatOMLtsplhw8q2WNBXuF800NKPQujJ1T6mMcfCaAY_19trmzulKLFglaOEyF42iQ8o7XvoCZSIRRbVMVPWWr8ccM7rjObUbIH7B09ObHMtw_qbSgedFqWJXIurzMCQb0d62uIKPqRTIjnOr_jf1gQn4phtrEMsGrd05n2mRk_aYknzR3Fziq827KQonQicTmUI2i9NI34QYh9zBPgVovvpdZmmS58BpEEN3aKmEUHLrS5nGJ0zYuSfLxHo3CrANoamLglSOA3uX5j5s9t71tu-aDhspkcnRePxeFGbX080kh31fgR4k4etgtwsFP_Vhjem5Cum9xzAjq_NXkabHBU56GpHf0G8RpnRTabIqXx-bCgfLlF9wwpuupu7hINPNmdBJI1ZyqiWqeWG7KD47k7OBtPQ7Yuq.ElDr4hD2Tb9PoZex2ONMAModMdlpfXqklPlnRuLo5QA\",\"value\":[]}";
        final DefaultSerializer defaultSerializer = new DefaultSerializer(logger);
        final UserDeltaCollectionResponse response = defaultSerializer.deserializeObject(jsonString, UserDeltaCollectionResponse.class);
        final UserDeltaCollectionPage page = new UserDeltaCollectionPage(response, null);
        assertNotNull(page.deltaLink);
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
