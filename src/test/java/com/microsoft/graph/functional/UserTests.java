package com.microsoft.graph.functional;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import okhttp3.Request;

import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.IGraphServiceClient;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IContactCollectionPage;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionPage;
import com.microsoft.graph.requests.extensions.IMailFolderCollectionPage;
import com.microsoft.graph.requests.extensions.IMessageCollectionPage;
import com.microsoft.graph.requests.extensions.IOrganizationCollectionPage;
import com.microsoft.graph.requests.extensions.IUsedInsightCollectionPage;
import com.microsoft.graph.requests.extensions.IUserCollectionPage;
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
		IDriveItemCollectionPage driveItemCollectionPage = graphServiceClient.me().drive().root().children().buildRequest().get();
		assertNotNull(driveItemCollectionPage);
	}

	@Test
	public void userKeyTest() {
		//GET users('<<key>>')
		IUserCollectionPage userCollectionPage = graphServiceClient.users().buildRequest().get();
		assertNotNull(userCollectionPage);
		List<User> list = userCollectionPage.getCurrentPage();
		if(list.size() > 0) {
			User user = graphServiceClient.users(list.get(0).id).buildRequest().get();
			assertNotNull(user);
		}
	}

	@Test
	public void meDriveRoot() {
		//GET me/drive/root
		DriveItem driveItem = graphServiceClient.me().drive().root().buildRequest().get();
		assertNotNull(driveItem);
	}

	@Test
	public void meDrive() {
		//GET me/drive
		Drive drive = graphServiceClient.me().drive().buildRequest().get();
		assertNotNull(drive);
	}

	@Test
	public void meDriveItems() {
		//GET me/drive/items('<key>')
		IDriveItemCollectionPage driveItemCollectionPage = graphServiceClient.me().drive().items().buildRequest().get();
		assertNotNull(driveItemCollectionPage);
		if(driveItemCollectionPage.getCurrentPage().size() > 0) {
			DriveItem item = graphServiceClient.me().drive().items(driveItemCollectionPage.getCurrentPage().get(0).id).buildRequest().get();
			assertNotNull(item);
		}
	}

	@Test
	public void meMessagesTest() {
		//GET me/messages
		IMessageCollectionPage messageCollectionPage = graphServiceClient.me().messages().buildRequest().get();
		assertNotNull(messageCollectionPage);
	}

	@Test
	public void meContactsTest() {
		//GET me/contacts
		IContactCollectionPage contactCollectionPage = graphServiceClient.me().contacts().buildRequest().get();
		assertNotNull(contactCollectionPage);
	}

	@Test
	public void usersKeyPhotoValueTest() {
		//GET users('<<key>>')/photo/$value
		IUserCollectionPage userCollectionPage = graphServiceClient.users().buildRequest().get();
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
		IOrganizationCollectionPage organizationCollectionPage = graphServiceClient.organization().buildRequest().get();
		assertNotNull(organizationCollectionPage);
	}

	@Test
	public void meInsightsUsed() {
		//GET me/insights/used
		IUsedInsightCollectionPage usedInsightCollectionPage = graphServiceClient.me().insights().used().buildRequest().get();
		assertNotNull(usedInsightCollectionPage);
	}
	
	@Test
	public void mailFoldertest() {
		//GET me/mailFolders
		IMailFolderCollectionPage mailFolderCollectionPage = graphServiceClient.me().mailFolders().buildRequest().get();
		assertNotNull(mailFolderCollectionPage);
		if(mailFolderCollectionPage.getCurrentPage().size() > 0) {
			String mailFolderId = mailFolderCollectionPage.getCurrentPage().get(0).id;
			IMessageCollectionPage messageCollectionPage = graphServiceClient.me().mailFolders(mailFolderId).messages().buildRequest().get();
			assertNotNull(messageCollectionPage);
		}
	}
	
	@Test
	public void meMemberof() {
		IDirectoryObjectCollectionWithReferencesPage page = graphServiceClient.me().memberOf().buildRequest().get();
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
						final IUserCollectionPage users = graphServiceClient.users().buildRequest().get();
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

}
