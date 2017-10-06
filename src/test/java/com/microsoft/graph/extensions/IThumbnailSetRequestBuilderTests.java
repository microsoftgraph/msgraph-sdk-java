package com.microsoft.graph.extensions;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

public class IThumbnailSetRequestBuilderTests {

	@Test
	public void testGetThumbnailSize() throws Exception {
        final Method getThumbnailSize = IThumbnailSetRequestBuilder.class.getDeclaredMethod("getThumbnailSize", String.class);
        assertNotNull(getThumbnailSize);
        assertEquals(IThumbnailRequestBuilder.class, getThumbnailSize.getReturnType());
    }
	
}
