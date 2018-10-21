package com.microsoft.graph.serializer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.microsoft.graph.logger.MockLogger;
import com.microsoft.graph.requests.extensions.AttachmentCollectionPage;

public class AttachmentCollectionPageSerializerTests {
	
	@Test
	public void testAttachmentCollectionPageSerialization() throws Exception {
        String expectedString = "abcd";
        MockLogger logger = new MockLogger();
        //AttachmentCollectionPage attachmentCollectionPage = new AttachmentCollectionPage(response, builder);
        //String serializeString = AttachmentCollectionPageSerializer.serialize(attachmentCollectionPage, logger).getAsString();
        //assertEquals(expectedString, serializeString);
    }

	@Test
    public void testStringDeserialization() throws Exception {
        byte[] deserializeBytes = ByteArraySerializer.deserialize("abcd");
        assertEquals(3, deserializeBytes.length);
    }

}
