package com.microsoft.graph.functional;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.microsoft.graph.extensions.Drive;
import com.microsoft.graph.extensions.GraphServiceClient;
import com.microsoft.graph.extensions.IDriveItemCollectionPage;
import com.microsoft.graph.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.extensions.IGraphServiceClient;
import com.microsoft.graph.extensions.IUserCollectionPage;
import com.microsoft.graph.extensions.User;
import com.microsoft.graph.generated.BaseGraphServiceClient;
import com.microsoft.graph.generated.IBaseGraphServiceClient;

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
