package com.microsoft.graph.functional;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import okhttp3.Request;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.Contact;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.Organization;
import com.microsoft.graph.core.IGraphServiceClient;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import com.microsoft.graph.models.extensions.UsedInsight;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ContactCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.DriveItemCollectionPage;
import com.microsoft.graph.requests.extensions.GroupCollectionPage;
import com.microsoft.graph.requests.extensions.MailFolderCollectionPage;
import com.microsoft.graph.requests.extensions.MessageCollectionPage;
import com.microsoft.graph.requests.extensions.OrganizationCollectionPage;
import com.microsoft.graph.requests.extensions.UsedInsightCollectionPage;
import com.microsoft.graph.requests.extensions.UserCollectionPage;
@Ignore
public class UserTests {
	IGraphServiceClient graphServiceClient = null;

	@Before
	public void setUp() {
		TestBase testBase = new TestBase();
		graphServiceClient = testBase.graphClient;
	}

    @Test
	public  void getMeTest() {
		//GET me
		User user = graphServiceClient.me().buildRequest().get();
		assertNotNull(user);
		assertNotNull(user.displayName);
	}

    @Test
	public void getMePhoto() {
		//GET me/photo/$value
		User user = graphServiceClient.me().buildRequest().get();
		assertNotNull(user);
		if(user.photo != null) {
			InputStream stream = graphServiceClient.me().photo().content().buildRequest().get();
			assertNotNull(stream);
		}
	}

    @Test
	public void meDriveTest() {
		//GET me/drive/root/children
		final DriveItemCollectionPage driveItemCollectionPage = graphServiceClient.me().drive().root().children().buildRequest().get();
		assertNotNull(driveItemCollectionPage);
	}

    @Test
	public void userKeyTest() {
		//GET users('<<key>>')
		final UserCollectionPage userCollectionPage = graphServiceClient.users().buildRequest().get();
		assertNotNull(userCollectionPage);
		assertNotNull(userCollectionPage.additionalDataManager().get("graphResponseHeaders"));
		final List<User> list = userCollectionPage.getCurrentPage();
		if(list.size() > 0) {
			final User user = graphServiceClient.users(list.get(0).id).buildRequest().get();
			assertNotNull(user);
		}
	}

    @Test
	public void meDriveRoot() {
		//GET me/drive/root
		final DriveItem driveItem = graphServiceClient.me().drive().root().buildRequest().get();
		assertNotNull(driveItem);
	}

    @Test
	public void meDrive() {
		//GET me/drive
		final Drive drive = graphServiceClient.me().drive().buildRequest().get();
		assertNotNull(drive);
	}

    @Test
	public void meDriveItems() {
		//GET me/drive/items('<key>')
		final DriveItemCollectionPage driveItemCollectionPage = graphServiceClient.me().drive().items().buildRequest().get();
		assertNotNull(driveItemCollectionPage);
		if(driveItemCollectionPage.getCurrentPage().size() > 0) {
			DriveItem item = graphServiceClient.me().drive().items(driveItemCollectionPage.getCurrentPage().get(0).id).buildRequest().get();
			assertNotNull(item);
		}
	}

    @Test
	public void meMessagesTest() {
		//GET me/messages
		final MessageCollectionPage messageCollectionPage = graphServiceClient.me().messages().buildRequest().get();
		assertNotNull(messageCollectionPage);
	}

    @Test
	public void meContactsTest() {
		//GET me/contacts
		final ContactCollectionPage contactCollectionPage = graphServiceClient.me().contacts().buildRequest().get();
		assertNotNull(contactCollectionPage);
	}

    @Test
	public void usersKeyPhotoValueTest() {
		//GET users('<<key>>')/photo/$value
		final UserCollectionPage userCollectionPage = graphServiceClient.users().buildRequest().get();
		for(User user:userCollectionPage.getCurrentPage()) {
			if(user.photo!=null) {
				InputStream stream = graphServiceClient.users(userCollectionPage.getCurrentPage().get(0).id).photo().content().buildRequest().get();
				assertNotNull(stream);
				break;
			}
		}
	}

    @Test
	public void updateUserPhotoValueTest() throws Exception {
		final File photo = new File("src/test/resources/hamilton.jpg");
		final InputStream fileStream = new FileInputStream(photo);
		graphServiceClient.me().photo().content().buildRequest().put(OutlookTests.getByteArray(fileStream));
	}

    @Test
	public void getOrganization() {
		//GET organization
		final OrganizationCollectionPage organizationCollectionPage = graphServiceClient.organization().buildRequest().get();
		assertNotNull(organizationCollectionPage);
	}

    @Test
	public void meInsightsUsed() {
		//GET me/insights/used
		final UsedInsightCollectionPage usedInsightCollectionPage = graphServiceClient.me().insights().used().buildRequest().get();
		assertNotNull(usedInsightCollectionPage);
	}

	@Test
	public void mailFoldertest() {
		//GET me/mailFolders
		final MailFolderCollectionPage mailFolderCollectionPage = graphServiceClient.me().mailFolders().buildRequest().get();
		assertNotNull(mailFolderCollectionPage);
		if(mailFolderCollectionPage.getCurrentPage().size() > 0) {
			String mailFolderId = mailFolderCollectionPage.getCurrentPage().get(0).id;
			final MessageCollectionPage messageCollectionPage = graphServiceClient.me().mailFolders(mailFolderId).messages().buildRequest().get();
			assertNotNull(messageCollectionPage);
		}
	}

	@Test
	public void meMemberof() {
		final DirectoryObjectCollectionWithReferencesPage page = graphServiceClient.me().memberOf().buildRequest().get();
		assertNotNull(page);
	}
    @Test
	public void getMeAndRetryOnThrottling() throws Exception {
		ExecutorService exec = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);
		try {
			for(Integer i = 0; i < 2000; i++) {
				exec.submit(new Runnable() {
					@Override
					public void run() {
						final UserCollectionPage users = graphServiceClient.users().buildRequest().get();
						assertNotNull(users);
						final List<User> currentPage = users.getCurrentPage();
						assertNotNull(currentPage);
						assertNotEquals(0, currentPage.size());
					}
				});
			}
			exec.awaitTermination(5L, TimeUnit.MINUTES);
		} finally {
			exec.shutdown();
		}
	}

    @Test
	public void emptyPostContentType() {
		final String contentTypeValue = "application/json";
		final HeaderOption ctype = new HeaderOption("Content-Type", contentTypeValue);
        final ArrayList<Option> options = new ArrayList<>();
        options.add(ctype);
        final Request request = graphServiceClient.me()
                                            .revokeSignInSessions()
                                            .buildRequest(options)
                                            .withHttpMethod(HttpMethod.POST)
                                            .getHttpRequest();
		assertEquals(contentTypeValue, request.body().contentType().toString());
	}
    @Test
	public void castTest() {
		final GroupCollectionPage groups = graphServiceClient.groups().buildRequest().top(1).get();
		final Group group = groups.getCurrentPage().get(0);
		final UserCollectionPage usersPage = graphServiceClient
		.groups(group.id)
		.membersAsUser()
		.buildRequest()
		.get();
		assertNotNull(usersPage);

		final DirectoryObjectCollectionWithReferencesPage testUserCollection = graphServiceClient
							.groups(group.id)
							.members()
							.buildRequest()
							.top(1)
							.get();
		final DirectoryObject testUser = testUserCollection.getCurrentPage().get(0);

		final User user = graphServiceClient
		.groups(group.id)
		.membersAsUser(testUser.id)
		.buildRequest()
		.get();
		assertNotNull(user);
	}
    @Test
	public void getMeTransitiveReferences() {
		DirectoryObjectCollectionWithReferencesPage page = graphServiceClient.me().transitiveMemberOf().references().buildRequest().get();
        assertNotNull(page);
    }
    @Test
	public void setMyBoss() {
		final User me = graphServiceClient.me().buildRequest().select("id").get();
		UserCollectionPage potentialManagers = graphServiceClient.users().buildRequest().top(1).get();
		User manager = potentialManagers.getCurrentPage().get(0);
		while(manager.id.equals(me.id) && potentialManagers.getNextPage() != null) {
			potentialManagers = potentialManagers.getNextPage().buildRequest().get();
			manager = potentialManagers.getCurrentPage().get(0);
		}
		if(!manager.id.equals(me.id)) {
			graphServiceClient.me().manager().reference().buildRequest().put(manager);
			assertEquals(true, true);
		} else { // we don't have enough users on the tenant to run the test
			assertEquals(true, false);
		}
	}
    @Test
    public void getUsersRawCount() {
        final List<Option> consistencyLevelOptions = Arrays.asList(new HeaderOption("ConsistencyLevel", "eventual"));
        final Long usersCount = graphServiceClient.users().count().buildRequest(consistencyLevelOptions).get();
        Assert.assertNotNull(usersCount);
    }
    @Test
    public void getUsersWithCount() {
        final List<Option> consistencyLevelOptions = Arrays.asList(new HeaderOption("ConsistencyLevel", "eventual"));
        final UserCollectionPage usersWithCount = graphServiceClient.users().buildRequest(consistencyLevelOptions).count().get();
        Assert.assertNotNull(usersWithCount);
        Assert.assertNotNull(usersWithCount.getCount());
    }
}
