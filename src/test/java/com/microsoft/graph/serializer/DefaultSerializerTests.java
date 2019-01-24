package com.microsoft.graph.serializer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.http.MockConnection;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.models.extensions.Attachment;
import com.microsoft.graph.models.extensions.DateOnly;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.FileAttachment;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.RecurrenceRange;
import com.microsoft.graph.models.generated.RecurrenceRangeType;

public class DefaultSerializerTests {

	/**
     * Make sure that deserializing a Drive also returns members from BaseDrive
     *
     * @throws Exception If there is an exception during the test
     */
	@Test
    public void testDriveDeserialization() throws Exception {
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
        String source = "{\"@odata.context\":\"https://graph.microsoft.com/v1.0/$metadata#drives/$entity\",\"id\":\"8bf6ae90006c4a4c\",\"driveType\":\"personal\",\"owner\":{\"user\":{\"displayName\":\"Peter\",\"id\":\"8bf6ae90006c4a4c\"}},\"quota\":{\"deleted\":1485718314,\"remaining\":983887466461,\"state\":\"normal\",\"total\":1142461300736,\"used\":158573834275}}";
        Drive result = serializer.deserializeObject(source, Drive.class);
        assertNotNull(result);
        assertEquals("personal", result.driveType);
        assertEquals(Long.valueOf(983887466461L), result.quota.remaining);
        assertEquals("8bf6ae90006c4a4c", result.id);

    }

	@Test
    public void testRecurrenceRangeDeserialization() throws Exception {
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
        String source = "{\n" +
                "    \"type\": \"noEnd\",\n" +
                "    \"startDate\": \"2016-04-27\",\n" +
                "    \"endDate\": \"0001-01-01\",\n" +
                "    \"recurrenceTimeZone\": \"China Standard Time\",\n" +
                "    \"numberOfOccurrences\": 0\n" +
                "}";
        RecurrenceRange baseRecurrenceRange = serializer.deserializeObject(source, RecurrenceRange.class);
        assertNotNull(source);
        assertEquals(RecurrenceRangeType.NO_END, baseRecurrenceRange.type);
        assertEquals("2016-04-27", baseRecurrenceRange.startDate.toString());
        assertEquals("0001-01-01", baseRecurrenceRange.endDate.toString());
        assertEquals("China Standard Time", baseRecurrenceRange.recurrenceTimeZone);
        assertEquals(Integer.valueOf(0), baseRecurrenceRange.numberOfOccurrences);
    }

	@Test
    public void testRecurrenceRangeSerialization() throws Exception {
        final String expected = "{\"type\":\"endDate\",\"startDate\":\"2016-04-25\",\"endDate\":\"2016-05-25\",\"recurrenceTimeZone\":\"PST\",\"numberOfOccurrences\":4}";
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
        RecurrenceRange brr = new RecurrenceRange();
        brr.type = RecurrenceRangeType.END_DATE;
        brr.startDate = new DateOnly(2016, 4, 25);
        brr.endDate = new DateOnly(2016, 5, 25);
        brr.recurrenceTimeZone = "PST";
        brr.numberOfOccurrences = 4;
        String jsonOut = serializer.serializeObject(brr);
        assertNotNull(jsonOut);
        assertEquals(expected, jsonOut);
    }
	
	@Test
	public void testResponseHeaders() throws Exception {
		MockConnection connection = new MockConnection(null);
		final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
		User user = serializer.deserializeObject("{\"id\":\"1\"}", User.class, connection.getResponseHeaders());
		
		JsonElement responseHeaders = user.additionalDataManager().get("graphResponseHeaders");
		assertNotNull(responseHeaders);
		
		JsonElement responseHeader = responseHeaders.getAsJsonObject().get("header1");
		assertNotNull(responseHeader);
		
		assertEquals("value1", responseHeader.getAsJsonArray().get(0).getAsString());
	}

    @Test
	public void testDeserializeDerivedType() throws Exception {
		final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
		String source = "{\"@odata.context\": \"/attachments/$entity\",\"@odata.type\": \"#microsoft.graph.fileAttachment\",\"id\": \"AAMkAGQ0MjBmNWVkLTYxZjUtNDRmYi05Y2NiLTBlYjIwNzJjNmM1NgBGAAAAAAC6ff7latYeQqu_gLrhSAIhBwCF7iGjpaOmRqVwbZc-xXzwAAAAAAEMAACF7iGjpaOmRqVwbZc-xXzwAABQStA0AAABEgAQAFbGmeisbjtLnQdp7kC_9Fk=\",\"lastModifiedDateTime\": \"2018-01-23T21:50:22Z\",\"name\": \"Test Book.xlsx\",\"contentType\": \"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet\",\"size\": 8457,\"isInline\": false,\"contentId\": null,\"contentLocation\": null,\"contentBytes\": \"bytedata\"}";
		Attachment result = serializer.deserializeObject(source, Attachment.class);
		
		assert(result instanceof FileAttachment);
		
		FileAttachment fileAttachment = (FileAttachment) result;
		assertNotNull(fileAttachment.contentBytes);
		JsonObject o = fileAttachment.getRawObject();
		assertNotNull(o);
		assertEquals("#microsoft.graph.fileAttachment", o. get("@odata.type").getAsString());
	}
  
    @Test
    public void testSerializerCanSerializeVoidWithoutEmittingWarning() {
        // Unfortunately does not assert for existence of Java 9 illegal access warnings
        // which seem to written to the console without use of System.err/System.out (so cannot be captured AFAIK). 
        // @davidmoten
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
        HasVoidMember t = new HasVoidMember();
        String json = serializer.serializeObject(t);
        // this line will emit a warning from Java 9 about illegal access to the constructor of Void 
        // if gson TypeAdapterFactory is not handling Void properly
        HasVoidMember t2 = serializer.deserializeObject(json, HasVoidMember.class);
        assertEquals(t.x, t2.x);
        assertEquals(t.y, t2.y);
    }
  
  public static final class HasVoidMember {
      @SerializedName("x")
      @Expose
      int x = 1;
      
      @SerializedName("y")
      @Expose
      Void y;
  }
}
