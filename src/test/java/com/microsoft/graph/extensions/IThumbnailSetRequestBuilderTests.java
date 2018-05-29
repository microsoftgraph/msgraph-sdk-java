package com.microsoft.graph.extensions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Method;

import org.junit.Test;

import com.microsoft.graph.requests.extensions.IThumbnailRequestBuilder;
import com.microsoft.graph.requests.extensions.IThumbnailSetRequestBuilder;

public class IThumbnailSetRequestBuilderTests {

	@Test
	public void testGetThumbnailSize() throws Exception {
        final Method getThumbnailSize = IThumbnailSetRequestBuilder.class.getDeclaredMethod("getThumbnailSize", String.class);
        assertNotNull(getThumbnailSize);
        assertEquals(IThumbnailRequestBuilder.class, getThumbnailSize.getReturnType());
    }
	
}
