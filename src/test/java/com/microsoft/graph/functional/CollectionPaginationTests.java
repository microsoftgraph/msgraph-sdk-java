package com.microsoft.graph.functional;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.microsoft.graph.extensions.IDriveItemCollectionPage;
import com.microsoft.graph.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.extensions.IGraphServiceClient;

public class CollectionPaginationTests {

	@Test
    public void testNextPage() {
        TestBase testBase = new TestBase();
        IGraphServiceClient graphServiceClient = testBase.graphClient;
        IDriveItemCollectionPage page1 = graphServiceClient.getMe().getDrive().getRoot().getChildren().buildRequest().top(2).get();
        IDriveItemCollectionRequestBuilder page2 = page1.getNextPage();
        String nextLink = page1.getRawObject().get("@odata.nextLink").getAsString();
        String compareLink = page2.getRequestUrl();
        assertEquals(nextLink, compareLink);
    }

}
