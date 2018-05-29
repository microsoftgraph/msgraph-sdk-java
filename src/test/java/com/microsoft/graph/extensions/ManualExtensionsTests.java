package com.microsoft.graph.extensions;

import org.junit.Assert;
import org.junit.Test;

public class ManualExtensionsTests {

	@Test
	public void testChunkedUploadRequestPreserved() {
        final String className = "com.microsoft.graph.requests.extensions.ChunkedUploadRequest";
        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            Assert.fail("Extension [" + className + "] not found.");
        }
    }

	@Test
    public void testChunkedUploadResultPreserved() {
        final String className = "com.microsoft.graph.requests.extensions.ChunkedUploadResult";
        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            Assert.fail("Extension [" + className + "] not found.");
        }
    }
}
