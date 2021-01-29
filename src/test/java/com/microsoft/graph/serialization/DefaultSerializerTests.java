package com.microsoft.graph.serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.util.EnumSet;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.callrecords.models.MediaStream;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.models.Attachment;
import com.microsoft.graph.core.DateOnly;
import com.microsoft.graph.models.Drive;
import com.microsoft.graph.models.FileAttachment;
import com.microsoft.graph.models.RecurrenceRange;
import com.microsoft.graph.models.User;
import com.microsoft.graph.models.UserGetMailTipsParameterSet;
import com.microsoft.graph.models.MailTipsType;
import com.microsoft.graph.models.RecurrenceRangeType;
import com.microsoft.graph.requests.DriveItemDeltaCollectionResponse;
import com.microsoft.graph.serializer.AdditionalDataManager;
import com.microsoft.graph.serializer.DefaultSerializer;
import com.microsoft.graph.models.UploadSession;

import org.junit.jupiter.api.Test;

import okhttp3.Request;
import okio.Buffer;

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

    /**
     * Make sure that deserializing a DriveItems also deserializes child additionalData
     *
     * @throws Exception If there is an exception during the test
     */
    @Test
    public void testDriveItemChildAdditionalDataDeserialization() throws Exception {
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
        String source = "{\n"
                + "    \"@odata.context\": \"https://graph.microsoft.com/v1.0/$metadata#users('02008492-3fec-4ce4-bb54-980ad856856f')/drive/root/children\",\n"
                + "    \"value\": [\n"
                + "        {\n"
                + "            \"createdBy\": {\n"
                + "                \"user\": {\n"
                + "                    \"email\": \"the@email.com\",\n"
                + "                    \"id\": \"02008492-3fec-4ce4-bb54-980ad856856f\",\n"
                + "                    \"displayName\": \"John Doe\"\n"
                + "                }\n"
                + "            }\n"
                + "        }\n"
                + "    ]\n"
                + "}";

        DriveItemDeltaCollectionResponse result = serializer
                .deserializeObject(source, DriveItemDeltaCollectionResponse.class);
        assertNotNull(result);
        assertNotNull(result.value);
        assertEquals(1, result.value.size());
        assertNotNull(result.value.get(0));
        assertNotNull(result.value.get(0).createdBy);
        assertNotNull(result.value.get(0).createdBy.user);
        assertNotNull(result.value.get(0).createdBy.user.additionalDataManager());
        assertNotNull(result.value.get(0).createdBy.user.additionalDataManager().get("email"));
        assertEquals("the@email.com",
                result.value.get(0).createdBy.user.additionalDataManager().get("email").getAsString());
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
        final String expected = "{\"endDate\":\"2016-05-25\",\"numberOfOccurrences\":4,\"recurrenceTimeZone\":\"PST\",\"startDate\":\"2016-04-25\",\"type\":\"endDate\"}";
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

    public static Map<String, List<String>> getResponseHeaders() {
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		ArrayList<String> headerValues = new ArrayList<String>();
		headerValues.add("value1");
		headers.put("header1", headerValues);

		return headers;
	}

	@Test
	public void testResponseHeaders() throws Exception {
		final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
		User user = serializer.deserializeObject("{\"id\":\"1\"}", User.class, getResponseHeaders());

		JsonElement responseHeaders = user.additionalDataManager().get("graphResponseHeaders");
		assertNotNull(responseHeaders);

		JsonElement responseHeader = responseHeaders.getAsJsonObject().get("header1");
		assertNotNull(responseHeader);

		assertEquals("value1", responseHeader.getAsJsonArray().get(0).getAsString());
	}

    @Test
	public void testDeserializeDerivedType() throws Exception {
		final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
		final String source = "{\"@odata.context\": \"/attachments/$entity\",\"@odata.type\": \"#microsoft.graph.fileAttachment\",\"id\": \"AAMkAGQ0MjBmNWVkLTYxZjUtNDRmYi05Y2NiLTBlYjIwNzJjNmM1NgBGAAAAAAC6ff7latYeQqu_gLrhSAIhBwCF7iGjpaOmRqVwbZc-xXzwAAAAAAEMAACF7iGjpaOmRqVwbZc-xXzwAABQStA0AAABEgAQAFbGmeisbjtLnQdp7kC_9Fk=\",\"lastModifiedDateTime\": \"2018-01-23T21:50:22Z\",\"name\": \"Test Book.xlsx\",\"contentType\": \"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet\",\"size\": 8457,\"isInline\": false,\"contentId\": null,\"contentLocation\": null,\"contentBytes\": \"bytedata\"}";
		final Attachment result = serializer.deserializeObject(source, Attachment.class);

		assert(result instanceof FileAttachment);

		final FileAttachment fileAttachment = (FileAttachment) result;
		assertNotNull(fileAttachment.contentBytes);
		assertEquals("#microsoft.graph.fileAttachment", fileAttachment.oDataType);
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
    @Test
    public void testDeserializerWhenCasingRespondedByServiceIsWrong() {
		final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
        final String source = "{\"@odata.context\": \"https://outlook.office.com/api/v2.0/$metadata#Users('e45f52f5-f2dd-4359-abc5-e74f2960b831')/Messages/AAMkAGQ0MjBmNWVkLTYxZjUtNDRmYi05Y2NiLTBlYjIwNzJjNmM1NgBGAAAAAAC6ff7latYeQqu_gLrhSAIhBwCF7iGjpaOmRqVwbZc-xXzwAAAAAAEMAACF7iGjpaOmRqVwbZc-xXzwAABQStA0AAABEgAQAFbGmeisbjtLnQdp7kC_9Fk=/AttachmentSessions/$entity\",\"ExpirationDateTime\": \"2020-10-06T14:23:42.1027521Z\",\"NextExpectedRanges\": [\"5242880\"]}";
        final UploadSession result = serializer.deserializeObject(source, UploadSession.class);
        assertNotNull(result);
        assertNotNull(result.nextExpectedRanges);
        assertTrue(result.nextExpectedRanges.size() > 0);
    }
    @Test
    public void testDoubleDeserialization() {
		final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
        final String source = " [{\"streamId\": \"12976\",\"startDateTime\": null,\"endDateTime\": null,\"streamDirection\": \"callerToCallee\",\"averageAudioDegradation\": null,\"averageJitter\": null,\"maxJitter\": null,\"averagePacketLossRate\": null,\"maxPacketLossRate\": null,\"averageRatioOfConcealedSamples\": null,\"maxRatioOfConcealedSamples\": null,\"averageRoundTripTime\": null,\"maxRoundTripTime\": null,\"packetUtilization\": 0,\"averageBandwidthEstimate\": null,\"wasMediaBypassed\": null,\"postForwardErrorCorrectionPacketLossRate\": null,\"averageVideoFrameLossPercentage\": null,\"averageReceivedFrameRate\": null,\"lowFrameRateRatio\": null,\"averageVideoPacketLossRate\": null,\"averageVideoFrameRate\": null,\"lowVideoProcessingCapabilityRatio\": null,\"averageAudioNetworkJitter\": null,\"maxAudioNetworkJitter\": null},{\"streamId\": \"3303\",\"startDateTime\": null,\"endDateTime\": null,\"streamDirection\": \"calleeToCaller\",\"averageAudioDegradation\": null,\"averageJitter\": \"PT0S\",\"maxJitter\": \"PT0S\",\"averagePacketLossRate\": 0,\"maxPacketLossRate\": 0,\"averageRatioOfConcealedSamples\": null,\"maxRatioOfConcealedSamples\": null,\"averageRoundTripTime\": \"PT0.02S\",\"maxRoundTripTime\": \"PT0.02S\",\"packetUtilization\": 1184,\"averageBandwidthEstimate\": null,\"wasMediaBypassed\": null,\"postForwardErrorCorrectionPacketLossRate\": 0,\"averageVideoFrameLossPercentage\": 0,\"averageReceivedFrameRate\": null,\"lowFrameRateRatio\": 0,\"averageVideoPacketLossRate\": null,\"averageVideoFrameRate\": 25.6,\"lowVideoProcessingCapabilityRatio\": null,\"averageAudioNetworkJitter\": null,\"maxAudioNetworkJitter\": null}]";
        final MediaStream[] result = serializer.deserializeObject(source, MediaStream[].class);
        assertNotNull(result);
        assertNotNull(result[0]);
        assertNotNull(result[1]);
        assertNull(result[0].averagePacketLossRate);
        assertEquals(0f, result[1].averagePacketLossRate, 0f);
    }
    @Test
    public void testDurationDeserialization() {
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
        final String source = "{\"streamId\": \"2101\",\"startDateTime\": null,\"endDateTime\": null,\"streamDirection\": \"calleeToCaller\",\"averageAudioDegradation\": null,\"averageJitter\": \"PT0.004S\",\"maxJitter\": \"PT0.007S\",\"averagePacketLossRate\": 0,\"maxPacketLossRate\": 0,\"averageRatioOfConcealedSamples\": 0,\"maxRatioOfConcealedSamples\": null,\"averageRoundTripTime\": \"PT0.024S\",\"maxRoundTripTime\": \"PT0.05S\",\"packetUtilization\": 471,\"averageBandwidthEstimate\": 1174971,\"wasMediaBypassed\": null,\"postForwardErrorCorrectionPacketLossRate\": null,\"averageVideoFrameLossPercentage\": null,\"averageReceivedFrameRate\": null,\"lowFrameRateRatio\": null,\"averageVideoPacketLossRate\": null,\"averageVideoFrameRate\": null,\"lowVideoProcessingCapabilityRatio\": null,\"averageAudioNetworkJitter\": \"PT0.014S\",\"maxAudioNetworkJitter\": \"PT0.022S\"}";
        final MediaStream result = serializer.deserializeObject(source, MediaStream.class);
        assertNotNull(result);
        assertNotNull(result.maxRoundTripTime);
    }
    @Test
    public void testEnumActionParameterDeserialization() throws IOException {
        final ArrayList<String> users = new ArrayList<String>();
        users.add("michael@chambele.onmicrosoft.com");
        final EnumSet<MailTipsType> mailtips = EnumSet.of(MailTipsType.MAILBOX_FULL_STATUS, MailTipsType.MAX_MESSAGE_SIZE);
        final UserGetMailTipsParameterSet body = UserGetMailTipsParameterSet.newBuilder().withEmailAddresses(users).withMailTipsOptions(mailtips).build();
        final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
        final String serialized = serializer.serializeObject(body);
        assertTrue(serialized.contains("mailboxFullStatus"), "result contains camelCasedValues");

        final UserGetMailTipsParameterSet deserialized = serializer.deserializeObject(serialized, UserGetMailTipsParameterSet.class);

        assertEquals(2, deserialized.mailTipsOptions.size());
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
