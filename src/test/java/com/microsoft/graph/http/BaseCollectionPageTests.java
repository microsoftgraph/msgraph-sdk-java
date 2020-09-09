package com.microsoft.graph.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonObject;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.MockBaseClient;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.MockSerializer;

/**
 * Test cases for {@see BaseCollectionPage}
 */
public class BaseCollectionPageTests {

    private IRequestBuilder mRequestBuilder;
    private static ArrayList<String> list;
    private BaseCollectionPage<String, IRequestBuilder> baseCollectionPage;
    private String requestUrl = "https://a.b.c/";

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<String>();
        list.add("Object1");
        list.add("Object2");
        list.add("Object3");
        IBaseClient mBaseClient = new MockBaseClient();
        mRequestBuilder = new MockRequestBuilder(mBaseClient,requestUrl);
        baseCollectionPage = new BaseCollectionPage<String, IRequestBuilder>(list,mRequestBuilder) {};
    }

    @Test
    public void testNotNull() {
        assertNotNull(baseCollectionPage);
    }

    @Test
    public void testCurrentPage() {
        assertEquals(3,baseCollectionPage.getCurrentPage().size());
        assertEquals("Object2", baseCollectionPage.getCurrentPage().get(1));
        Boolean success = false;
        try{
            baseCollectionPage.getCurrentPage().remove(1);
        }catch (UnsupportedOperationException uEx){
            success = true;
        }
        assertTrue(success);
    }

    @Test
    public void testNextPage() {
        assertEquals(mRequestBuilder, baseCollectionPage.getNextPage());
    }

    @Test
    public void testRawObject() {
        ISerializer serializer = new MockSerializer(null, null);
        JsonObject jsonObject = new JsonObject();
        assertNull(baseCollectionPage.getRawObject());
        assertNull(baseCollectionPage.getSerializer());
        baseCollectionPage.setRawObject(serializer,jsonObject);
        assertNotNull(baseCollectionPage.getRawObject());
        assertNotNull(baseCollectionPage.getSerializer());
        assertEquals(serializer, baseCollectionPage.getSerializer());
        assertEquals(jsonObject, baseCollectionPage.getRawObject());
    }

}
