package com.microsoft.graph.functional;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.GraphServiceClient;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionPage;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.models.extensions.IGraphServiceClient;
import com.microsoft.graph.requests.extensions.IUserCollectionPage;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.generated.BaseGraphServiceClient;
import com.microsoft.graph.models.generated.IBaseGraphServiceClient;

@Ignore
public class CollectionPaginationTests {

	@Test
    public void testNextPage() {
		TestBase testBase = new TestBase();
		testBase.graphClient.devices().buildRequest().get();
//        TestBase testBase = new TestBase();
//        IGraphServiceClient graphServiceClient = testBase.graphClient;
//        //IDriveItemCollectionPage page1 = graphServiceClient.getMe().getDrive().getRoot().getChildren().buildRequest().top(2).get();
//        IDriveItemCollectionRequestBuilder page2 = page1.getNextPage();
//        String nextLink = page1.getRawObject().get("@odata.nextLink").getAsString();
//        String compareLink = page2.getRequestUrl();
//        User user = new User();
//        user.aboutMe = "I am fun";
//        assertEquals(nextLink, compareLink);
    }

	
	@Test
	public void testSyntax() {
		try {
			TestBase testBase = new TestBase();
			IGraphServiceClient client = testBase.graphClient;
			
			User me = client.me().buildRequest().get();
			Drive drive = client.me().drive().buildRequest().get();
			
			User user = client.users("uid").buildRequest().get();
			IUserCollectionPage users = client.users().buildRequest().get();
			
			users.getCurrentPage().get(1);
			
			//Drive drive = client.me
			//BaseGraphServiceClient client2 = new BaseGraphServiceClient();
			//User me = client2.me.buildRequest().get();
			String name = me.displayName;
	
			//testBase.graphClient.me.drive.buildRequest().get();
		} catch (Exception e) {
			String s = e.getMessage();
		}
	}
}
