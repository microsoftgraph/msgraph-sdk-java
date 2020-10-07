package com.microsoft.graph.extensions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Method;

import org.junit.Test;

import com.microsoft.graph.requests.extensions.ThumbnailRequestBuilder;
import com.microsoft.graph.requests.extensions.ThumbnailSetRequestBuilder;

public class IThumbnailSetRequestBuilderTests {

	@Test
	public void testGetThumbnailSize() throws Exception {
        final Method getThumbnailSize = ThumbnailSetRequestBuilder.class.getDeclaredMethod("getThumbnailSize", String.class);
        assertNotNull(getThumbnailSize);
        assertEquals(ThumbnailRequestBuilder.class, getThumbnailSize.getReturnType());
    }
	
}
