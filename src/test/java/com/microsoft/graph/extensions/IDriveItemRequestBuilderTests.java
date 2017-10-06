package com.microsoft.graph.extensions;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Test;

public class IDriveItemRequestBuilderTests {

	@Test
	public void testGetItemWithPath() throws Exception {
        final Method getItemWithPath = IDriveItemRequestBuilder.class.getDeclaredMethod("getItemWithPath", String.class);
        assertNotNull(getItemWithPath);
        assertEquals(IDriveItemRequestBuilder.class, getItemWithPath.getReturnType());
    }

}
