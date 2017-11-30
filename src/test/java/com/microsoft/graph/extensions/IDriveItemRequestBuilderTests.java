package com.microsoft.graph.extensions;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Test;

import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;

public class IDriveItemRequestBuilderTests {

	@Test
	public void testitemWithPath() throws Exception {
        final Method itemWithPath = IDriveItemRequestBuilder.class.getDeclaredMethod("itemWithPath", String.class);
        assertNotNull(itemWithPath);
        assertEquals(IDriveItemRequestBuilder.class, itemWithPath.getReturnType());
    }

}
