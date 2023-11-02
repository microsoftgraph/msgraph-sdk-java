package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MediaStream implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new MediaStream and sets the default values.
     */
    public MediaStream() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MediaStream
     */
    @jakarta.annotation.Nonnull
    public static MediaStream createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaStream();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the audioCodec property value. Codec name used to encode audio for transmission on the network. Possible values are: unknown, invalid, cn, pcma, pcmu, amrWide, g722, g7221, g7221c, g729, multiChannelAudio, muchv2, opus, satin, satinFullband, rtAudio8, rtAudio16, silk, silkNarrow, silkWide, siren, xmsRta, unknownFutureValue.
     * @return a AudioCodec
     */
    @jakarta.annotation.Nullable
    public AudioCodec getAudioCodec() {
        return this.getBackingStore().get("audioCodec");
    }
    /**
     * Gets the averageAudioDegradation property value. Average Network Mean Opinion Score degradation for stream. Represents how much the network loss and jitter has impacted the quality of received audio.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getAverageAudioDegradation() {
        return this.getBackingStore().get("averageAudioDegradation");
    }
    /**
     * Gets the averageAudioNetworkJitter property value. Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getAverageAudioNetworkJitter() {
        return this.getBackingStore().get("averageAudioNetworkJitter");
    }
    /**
     * Gets the averageBandwidthEstimate property value. Average estimated bandwidth available between two endpoints in bits per second.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getAverageBandwidthEstimate() {
        return this.getBackingStore().get("averageBandwidthEstimate");
    }
    /**
     * Gets the averageFreezeDuration property value. Average duration of the received freezing time in the video stream.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getAverageFreezeDuration() {
        return this.getBackingStore().get("averageFreezeDuration");
    }
    /**
     * Gets the averageJitter property value. Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getAverageJitter() {
        return this.getBackingStore().get("averageJitter");
    }
    /**
     * Gets the averagePacketLossRate property value. Average packet loss rate for stream.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getAveragePacketLossRate() {
        return this.getBackingStore().get("averagePacketLossRate");
    }
    /**
     * Gets the averageRatioOfConcealedSamples property value. Ratio of the number of audio frames with samples generated by packet loss concealment to the total number of audio frames.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getAverageRatioOfConcealedSamples() {
        return this.getBackingStore().get("averageRatioOfConcealedSamples");
    }
    /**
     * Gets the averageReceivedFrameRate property value. Average frames per second received for all video streams computed over the duration of the session.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getAverageReceivedFrameRate() {
        return this.getBackingStore().get("averageReceivedFrameRate");
    }
    /**
     * Gets the averageRoundTripTime property value. Average network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getAverageRoundTripTime() {
        return this.getBackingStore().get("averageRoundTripTime");
    }
    /**
     * Gets the averageVideoFrameLossPercentage property value. Average percentage of video frames lost as displayed to the user.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getAverageVideoFrameLossPercentage() {
        return this.getBackingStore().get("averageVideoFrameLossPercentage");
    }
    /**
     * Gets the averageVideoFrameRate property value. Average frames per second received for a video stream, computed over the duration of the session.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getAverageVideoFrameRate() {
        return this.getBackingStore().get("averageVideoFrameRate");
    }
    /**
     * Gets the averageVideoPacketLossRate property value. Average fraction of packets lost, as specified in [RFC 3550][], computed over the duration of the session.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getAverageVideoPacketLossRate() {
        return this.getBackingStore().get("averageVideoPacketLossRate");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the endDateTime property value. UTC time when the stream ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. This field is only available for streams that use the SIP protocol.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.getBackingStore().get("endDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(31);
        deserializerMap.put("audioCodec", (n) -> { this.setAudioCodec(n.getEnumValue(AudioCodec.class)); });
        deserializerMap.put("averageAudioDegradation", (n) -> { this.setAverageAudioDegradation(n.getFloatValue()); });
        deserializerMap.put("averageAudioNetworkJitter", (n) -> { this.setAverageAudioNetworkJitter(n.getPeriodAndDurationValue()); });
        deserializerMap.put("averageBandwidthEstimate", (n) -> { this.setAverageBandwidthEstimate(n.getLongValue()); });
        deserializerMap.put("averageFreezeDuration", (n) -> { this.setAverageFreezeDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("averageJitter", (n) -> { this.setAverageJitter(n.getPeriodAndDurationValue()); });
        deserializerMap.put("averagePacketLossRate", (n) -> { this.setAveragePacketLossRate(n.getFloatValue()); });
        deserializerMap.put("averageRatioOfConcealedSamples", (n) -> { this.setAverageRatioOfConcealedSamples(n.getFloatValue()); });
        deserializerMap.put("averageReceivedFrameRate", (n) -> { this.setAverageReceivedFrameRate(n.getFloatValue()); });
        deserializerMap.put("averageRoundTripTime", (n) -> { this.setAverageRoundTripTime(n.getPeriodAndDurationValue()); });
        deserializerMap.put("averageVideoFrameLossPercentage", (n) -> { this.setAverageVideoFrameLossPercentage(n.getFloatValue()); });
        deserializerMap.put("averageVideoFrameRate", (n) -> { this.setAverageVideoFrameRate(n.getFloatValue()); });
        deserializerMap.put("averageVideoPacketLossRate", (n) -> { this.setAverageVideoPacketLossRate(n.getFloatValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isAudioForwardErrorCorrectionUsed", (n) -> { this.setIsAudioForwardErrorCorrectionUsed(n.getBooleanValue()); });
        deserializerMap.put("lowFrameRateRatio", (n) -> { this.setLowFrameRateRatio(n.getFloatValue()); });
        deserializerMap.put("lowVideoProcessingCapabilityRatio", (n) -> { this.setLowVideoProcessingCapabilityRatio(n.getFloatValue()); });
        deserializerMap.put("maxAudioNetworkJitter", (n) -> { this.setMaxAudioNetworkJitter(n.getPeriodAndDurationValue()); });
        deserializerMap.put("maxJitter", (n) -> { this.setMaxJitter(n.getPeriodAndDurationValue()); });
        deserializerMap.put("maxPacketLossRate", (n) -> { this.setMaxPacketLossRate(n.getFloatValue()); });
        deserializerMap.put("maxRatioOfConcealedSamples", (n) -> { this.setMaxRatioOfConcealedSamples(n.getFloatValue()); });
        deserializerMap.put("maxRoundTripTime", (n) -> { this.setMaxRoundTripTime(n.getPeriodAndDurationValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("packetUtilization", (n) -> { this.setPacketUtilization(n.getLongValue()); });
        deserializerMap.put("postForwardErrorCorrectionPacketLossRate", (n) -> { this.setPostForwardErrorCorrectionPacketLossRate(n.getFloatValue()); });
        deserializerMap.put("rmsFreezeDuration", (n) -> { this.setRmsFreezeDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("streamDirection", (n) -> { this.setStreamDirection(n.getEnumValue(MediaStreamDirection.class)); });
        deserializerMap.put("streamId", (n) -> { this.setStreamId(n.getStringValue()); });
        deserializerMap.put("videoCodec", (n) -> { this.setVideoCodec(n.getEnumValue(VideoCodec.class)); });
        deserializerMap.put("wasMediaBypassed", (n) -> { this.setWasMediaBypassed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAudioForwardErrorCorrectionUsed property value. Indicates whether the forward error correction (FEC) was used at some point during the session. The default value is null.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAudioForwardErrorCorrectionUsed() {
        return this.getBackingStore().get("isAudioForwardErrorCorrectionUsed");
    }
    /**
     * Gets the lowFrameRateRatio property value. Fraction of the call where frame rate is less than 7.5 frames per second.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getLowFrameRateRatio() {
        return this.getBackingStore().get("lowFrameRateRatio");
    }
    /**
     * Gets the lowVideoProcessingCapabilityRatio property value. Fraction of the call that the client is running less than 70% expected video processing capability.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getLowVideoProcessingCapabilityRatio() {
        return this.getBackingStore().get("lowVideoProcessingCapabilityRatio");
    }
    /**
     * Gets the maxAudioNetworkJitter property value. Maximum of audio network jitter computed over each of the 20 second windows during the session, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMaxAudioNetworkJitter() {
        return this.getBackingStore().get("maxAudioNetworkJitter");
    }
    /**
     * Gets the maxJitter property value. Maximum jitter for the stream computed as specified in RFC 3550, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMaxJitter() {
        return this.getBackingStore().get("maxJitter");
    }
    /**
     * Gets the maxPacketLossRate property value. Maximum packet loss rate for the stream.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getMaxPacketLossRate() {
        return this.getBackingStore().get("maxPacketLossRate");
    }
    /**
     * Gets the maxRatioOfConcealedSamples property value. Maximum ratio of packets concealed by the healer.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getMaxRatioOfConcealedSamples() {
        return this.getBackingStore().get("maxRatioOfConcealedSamples");
    }
    /**
     * Gets the maxRoundTripTime property value. Maximum network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMaxRoundTripTime() {
        return this.getBackingStore().get("maxRoundTripTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the packetUtilization property value. Packet count for the stream.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getPacketUtilization() {
        return this.getBackingStore().get("packetUtilization");
    }
    /**
     * Gets the postForwardErrorCorrectionPacketLossRate property value. Packet loss rate after FEC has been applied aggregated across all video streams and codecs.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getPostForwardErrorCorrectionPacketLossRate() {
        return this.getBackingStore().get("postForwardErrorCorrectionPacketLossRate");
    }
    /**
     * Gets the rmsFreezeDuration property value. Average duration of the received freezing time in the video stream represented in root mean square.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getRmsFreezeDuration() {
        return this.getBackingStore().get("rmsFreezeDuration");
    }
    /**
     * Gets the startDateTime property value. UTC time when the stream started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. This field is only available for streams that use the SIP protocol.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.getBackingStore().get("startDateTime");
    }
    /**
     * Gets the streamDirection property value. The streamDirection property
     * @return a MediaStreamDirection
     */
    @jakarta.annotation.Nullable
    public MediaStreamDirection getStreamDirection() {
        return this.getBackingStore().get("streamDirection");
    }
    /**
     * Gets the streamId property value. Unique identifier for the stream.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStreamId() {
        return this.getBackingStore().get("streamId");
    }
    /**
     * Gets the videoCodec property value. Codec name used to encode video for transmission on the network. Possible values are: unknown, invalid, av1, h263, h264, h264s, h264uc, h265, rtvc1, rtVideo, xrtvc1, unknownFutureValue.
     * @return a VideoCodec
     */
    @jakarta.annotation.Nullable
    public VideoCodec getVideoCodec() {
        return this.getBackingStore().get("videoCodec");
    }
    /**
     * Gets the wasMediaBypassed property value. True if the media stream bypassed the Mediation Server and went straight between client and PSTN Gateway/PBX, false otherwise.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWasMediaBypassed() {
        return this.getBackingStore().get("wasMediaBypassed");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("audioCodec", this.getAudioCodec());
        writer.writeFloatValue("averageAudioDegradation", this.getAverageAudioDegradation());
        writer.writePeriodAndDurationValue("averageAudioNetworkJitter", this.getAverageAudioNetworkJitter());
        writer.writeLongValue("averageBandwidthEstimate", this.getAverageBandwidthEstimate());
        writer.writePeriodAndDurationValue("averageFreezeDuration", this.getAverageFreezeDuration());
        writer.writePeriodAndDurationValue("averageJitter", this.getAverageJitter());
        writer.writeFloatValue("averagePacketLossRate", this.getAveragePacketLossRate());
        writer.writeFloatValue("averageRatioOfConcealedSamples", this.getAverageRatioOfConcealedSamples());
        writer.writeFloatValue("averageReceivedFrameRate", this.getAverageReceivedFrameRate());
        writer.writePeriodAndDurationValue("averageRoundTripTime", this.getAverageRoundTripTime());
        writer.writeFloatValue("averageVideoFrameLossPercentage", this.getAverageVideoFrameLossPercentage());
        writer.writeFloatValue("averageVideoFrameRate", this.getAverageVideoFrameRate());
        writer.writeFloatValue("averageVideoPacketLossRate", this.getAverageVideoPacketLossRate());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeBooleanValue("isAudioForwardErrorCorrectionUsed", this.getIsAudioForwardErrorCorrectionUsed());
        writer.writeFloatValue("lowFrameRateRatio", this.getLowFrameRateRatio());
        writer.writeFloatValue("lowVideoProcessingCapabilityRatio", this.getLowVideoProcessingCapabilityRatio());
        writer.writePeriodAndDurationValue("maxAudioNetworkJitter", this.getMaxAudioNetworkJitter());
        writer.writePeriodAndDurationValue("maxJitter", this.getMaxJitter());
        writer.writeFloatValue("maxPacketLossRate", this.getMaxPacketLossRate());
        writer.writeFloatValue("maxRatioOfConcealedSamples", this.getMaxRatioOfConcealedSamples());
        writer.writePeriodAndDurationValue("maxRoundTripTime", this.getMaxRoundTripTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("packetUtilization", this.getPacketUtilization());
        writer.writeFloatValue("postForwardErrorCorrectionPacketLossRate", this.getPostForwardErrorCorrectionPacketLossRate());
        writer.writePeriodAndDurationValue("rmsFreezeDuration", this.getRmsFreezeDuration());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("streamDirection", this.getStreamDirection());
        writer.writeStringValue("streamId", this.getStreamId());
        writer.writeEnumValue("videoCodec", this.getVideoCodec());
        writer.writeBooleanValue("wasMediaBypassed", this.getWasMediaBypassed());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the audioCodec property value. Codec name used to encode audio for transmission on the network. Possible values are: unknown, invalid, cn, pcma, pcmu, amrWide, g722, g7221, g7221c, g729, multiChannelAudio, muchv2, opus, satin, satinFullband, rtAudio8, rtAudio16, silk, silkNarrow, silkWide, siren, xmsRta, unknownFutureValue.
     * @param value Value to set for the audioCodec property.
     */
    public void setAudioCodec(@jakarta.annotation.Nullable final AudioCodec value) {
        this.getBackingStore().set("audioCodec", value);
    }
    /**
     * Sets the averageAudioDegradation property value. Average Network Mean Opinion Score degradation for stream. Represents how much the network loss and jitter has impacted the quality of received audio.
     * @param value Value to set for the averageAudioDegradation property.
     */
    public void setAverageAudioDegradation(@jakarta.annotation.Nullable final Float value) {
        this.getBackingStore().set("averageAudioDegradation", value);
    }
    /**
     * Sets the averageAudioNetworkJitter property value. Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @param value Value to set for the averageAudioNetworkJitter property.
     */
    public void setAverageAudioNetworkJitter(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.getBackingStore().set("averageAudioNetworkJitter", value);
    }
    /**
     * Sets the averageBandwidthEstimate property value. Average estimated bandwidth available between two endpoints in bits per second.
     * @param value Value to set for the averageBandwidthEstimate property.
     */
    public void setAverageBandwidthEstimate(@jakarta.annotation.Nullable final Long value) {
        this.getBackingStore().set("averageBandwidthEstimate", value);
    }
    /**
     * Sets the averageFreezeDuration property value. Average duration of the received freezing time in the video stream.
     * @param value Value to set for the averageFreezeDuration property.
     */
    public void setAverageFreezeDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.getBackingStore().set("averageFreezeDuration", value);
    }
    /**
     * Sets the averageJitter property value. Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @param value Value to set for the averageJitter property.
     */
    public void setAverageJitter(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.getBackingStore().set("averageJitter", value);
    }
    /**
     * Sets the averagePacketLossRate property value. Average packet loss rate for stream.
     * @param value Value to set for the averagePacketLossRate property.
     */
    public void setAveragePacketLossRate(@jakarta.annotation.Nullable final Float value) {
        this.getBackingStore().set("averagePacketLossRate", value);
    }
    /**
     * Sets the averageRatioOfConcealedSamples property value. Ratio of the number of audio frames with samples generated by packet loss concealment to the total number of audio frames.
     * @param value Value to set for the averageRatioOfConcealedSamples property.
     */
    public void setAverageRatioOfConcealedSamples(@jakarta.annotation.Nullable final Float value) {
        this.getBackingStore().set("averageRatioOfConcealedSamples", value);
    }
    /**
     * Sets the averageReceivedFrameRate property value. Average frames per second received for all video streams computed over the duration of the session.
     * @param value Value to set for the averageReceivedFrameRate property.
     */
    public void setAverageReceivedFrameRate(@jakarta.annotation.Nullable final Float value) {
        this.getBackingStore().set("averageReceivedFrameRate", value);
    }
    /**
     * Sets the averageRoundTripTime property value. Average network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @param value Value to set for the averageRoundTripTime property.
     */
    public void setAverageRoundTripTime(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.getBackingStore().set("averageRoundTripTime", value);
    }
    /**
     * Sets the averageVideoFrameLossPercentage property value. Average percentage of video frames lost as displayed to the user.
     * @param value Value to set for the averageVideoFrameLossPercentage property.
     */
    public void setAverageVideoFrameLossPercentage(@jakarta.annotation.Nullable final Float value) {
        this.getBackingStore().set("averageVideoFrameLossPercentage", value);
    }
    /**
     * Sets the averageVideoFrameRate property value. Average frames per second received for a video stream, computed over the duration of the session.
     * @param value Value to set for the averageVideoFrameRate property.
     */
    public void setAverageVideoFrameRate(@jakarta.annotation.Nullable final Float value) {
        this.getBackingStore().set("averageVideoFrameRate", value);
    }
    /**
     * Sets the averageVideoPacketLossRate property value. Average fraction of packets lost, as specified in [RFC 3550][], computed over the duration of the session.
     * @param value Value to set for the averageVideoPacketLossRate property.
     */
    public void setAverageVideoPacketLossRate(@jakarta.annotation.Nullable final Float value) {
        this.getBackingStore().set("averageVideoPacketLossRate", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the endDateTime property value. UTC time when the stream ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. This field is only available for streams that use the SIP protocol.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("endDateTime", value);
    }
    /**
     * Sets the isAudioForwardErrorCorrectionUsed property value. Indicates whether the forward error correction (FEC) was used at some point during the session. The default value is null.
     * @param value Value to set for the isAudioForwardErrorCorrectionUsed property.
     */
    public void setIsAudioForwardErrorCorrectionUsed(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("isAudioForwardErrorCorrectionUsed", value);
    }
    /**
     * Sets the lowFrameRateRatio property value. Fraction of the call where frame rate is less than 7.5 frames per second.
     * @param value Value to set for the lowFrameRateRatio property.
     */
    public void setLowFrameRateRatio(@jakarta.annotation.Nullable final Float value) {
        this.getBackingStore().set("lowFrameRateRatio", value);
    }
    /**
     * Sets the lowVideoProcessingCapabilityRatio property value. Fraction of the call that the client is running less than 70% expected video processing capability.
     * @param value Value to set for the lowVideoProcessingCapabilityRatio property.
     */
    public void setLowVideoProcessingCapabilityRatio(@jakarta.annotation.Nullable final Float value) {
        this.getBackingStore().set("lowVideoProcessingCapabilityRatio", value);
    }
    /**
     * Sets the maxAudioNetworkJitter property value. Maximum of audio network jitter computed over each of the 20 second windows during the session, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @param value Value to set for the maxAudioNetworkJitter property.
     */
    public void setMaxAudioNetworkJitter(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.getBackingStore().set("maxAudioNetworkJitter", value);
    }
    /**
     * Sets the maxJitter property value. Maximum jitter for the stream computed as specified in RFC 3550, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @param value Value to set for the maxJitter property.
     */
    public void setMaxJitter(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.getBackingStore().set("maxJitter", value);
    }
    /**
     * Sets the maxPacketLossRate property value. Maximum packet loss rate for the stream.
     * @param value Value to set for the maxPacketLossRate property.
     */
    public void setMaxPacketLossRate(@jakarta.annotation.Nullable final Float value) {
        this.getBackingStore().set("maxPacketLossRate", value);
    }
    /**
     * Sets the maxRatioOfConcealedSamples property value. Maximum ratio of packets concealed by the healer.
     * @param value Value to set for the maxRatioOfConcealedSamples property.
     */
    public void setMaxRatioOfConcealedSamples(@jakarta.annotation.Nullable final Float value) {
        this.getBackingStore().set("maxRatioOfConcealedSamples", value);
    }
    /**
     * Sets the maxRoundTripTime property value. Maximum network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @param value Value to set for the maxRoundTripTime property.
     */
    public void setMaxRoundTripTime(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.getBackingStore().set("maxRoundTripTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the packetUtilization property value. Packet count for the stream.
     * @param value Value to set for the packetUtilization property.
     */
    public void setPacketUtilization(@jakarta.annotation.Nullable final Long value) {
        this.getBackingStore().set("packetUtilization", value);
    }
    /**
     * Sets the postForwardErrorCorrectionPacketLossRate property value. Packet loss rate after FEC has been applied aggregated across all video streams and codecs.
     * @param value Value to set for the postForwardErrorCorrectionPacketLossRate property.
     */
    public void setPostForwardErrorCorrectionPacketLossRate(@jakarta.annotation.Nullable final Float value) {
        this.getBackingStore().set("postForwardErrorCorrectionPacketLossRate", value);
    }
    /**
     * Sets the rmsFreezeDuration property value. Average duration of the received freezing time in the video stream represented in root mean square.
     * @param value Value to set for the rmsFreezeDuration property.
     */
    public void setRmsFreezeDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.getBackingStore().set("rmsFreezeDuration", value);
    }
    /**
     * Sets the startDateTime property value. UTC time when the stream started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. This field is only available for streams that use the SIP protocol.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("startDateTime", value);
    }
    /**
     * Sets the streamDirection property value. The streamDirection property
     * @param value Value to set for the streamDirection property.
     */
    public void setStreamDirection(@jakarta.annotation.Nullable final MediaStreamDirection value) {
        this.getBackingStore().set("streamDirection", value);
    }
    /**
     * Sets the streamId property value. Unique identifier for the stream.
     * @param value Value to set for the streamId property.
     */
    public void setStreamId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("streamId", value);
    }
    /**
     * Sets the videoCodec property value. Codec name used to encode video for transmission on the network. Possible values are: unknown, invalid, av1, h263, h264, h264s, h264uc, h265, rtvc1, rtVideo, xrtvc1, unknownFutureValue.
     * @param value Value to set for the videoCodec property.
     */
    public void setVideoCodec(@jakarta.annotation.Nullable final VideoCodec value) {
        this.getBackingStore().set("videoCodec", value);
    }
    /**
     * Sets the wasMediaBypassed property value. True if the media stream bypassed the Mediation Server and went straight between client and PSTN Gateway/PBX, false otherwise.
     * @param value Value to set for the wasMediaBypassed property.
     */
    public void setWasMediaBypassed(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("wasMediaBypassed", value);
    }
}
