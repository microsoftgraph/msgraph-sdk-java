package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Video implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of audio bits per sample.
     */
    private Integer audioBitsPerSample;
    /**
     * Number of audio channels.
     */
    private Integer audioChannels;
    /**
     * Name of the audio format (AAC, MP3, etc.).
     */
    private String audioFormat;
    /**
     * Number of audio samples per second.
     */
    private Integer audioSamplesPerSecond;
    /**
     * Bit rate of the video in bits per second.
     */
    private Integer bitrate;
    /**
     * Duration of the file in milliseconds.
     */
    private Long duration;
    /**
     * 'Four character code' name of the video format.
     */
    private String fourCC;
    /**
     * Frame rate of the video.
     */
    private Double frameRate;
    /**
     * Height of the video, in pixels.
     */
    private Integer height;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Width of the video, in pixels.
     */
    private Integer width;
    /**
     * Instantiates a new video and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Video() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a video
     */
    @jakarta.annotation.Nonnull
    public static Video createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Video();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the audioBitsPerSample property value. Number of audio bits per sample.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getAudioBitsPerSample() {
        return this.audioBitsPerSample;
    }
    /**
     * Gets the audioChannels property value. Number of audio channels.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getAudioChannels() {
        return this.audioChannels;
    }
    /**
     * Gets the audioFormat property value. Name of the audio format (AAC, MP3, etc.).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAudioFormat() {
        return this.audioFormat;
    }
    /**
     * Gets the audioSamplesPerSecond property value. Number of audio samples per second.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getAudioSamplesPerSecond() {
        return this.audioSamplesPerSecond;
    }
    /**
     * Gets the bitrate property value. Bit rate of the video in bits per second.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getBitrate() {
        return this.bitrate;
    }
    /**
     * Gets the duration property value. Duration of the file in milliseconds.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getDuration() {
        return this.duration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("audioBitsPerSample", (n) -> { this.setAudioBitsPerSample(n.getIntegerValue()); });
        deserializerMap.put("audioChannels", (n) -> { this.setAudioChannels(n.getIntegerValue()); });
        deserializerMap.put("audioFormat", (n) -> { this.setAudioFormat(n.getStringValue()); });
        deserializerMap.put("audioSamplesPerSecond", (n) -> { this.setAudioSamplesPerSecond(n.getIntegerValue()); });
        deserializerMap.put("bitrate", (n) -> { this.setBitrate(n.getIntegerValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getLongValue()); });
        deserializerMap.put("fourCC", (n) -> { this.setFourCC(n.getStringValue()); });
        deserializerMap.put("frameRate", (n) -> { this.setFrameRate(n.getDoubleValue()); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fourCC property value. 'Four character code' name of the video format.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFourCC() {
        return this.fourCC;
    }
    /**
     * Gets the frameRate property value. Frame rate of the video.
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getFrameRate() {
        return this.frameRate;
    }
    /**
     * Gets the height property value. Height of the video, in pixels.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getHeight() {
        return this.height;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the width property value. Width of the video, in pixels.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("audioBitsPerSample", this.getAudioBitsPerSample());
        writer.writeIntegerValue("audioChannels", this.getAudioChannels());
        writer.writeStringValue("audioFormat", this.getAudioFormat());
        writer.writeIntegerValue("audioSamplesPerSecond", this.getAudioSamplesPerSecond());
        writer.writeIntegerValue("bitrate", this.getBitrate());
        writer.writeLongValue("duration", this.getDuration());
        writer.writeStringValue("fourCC", this.getFourCC());
        writer.writeDoubleValue("frameRate", this.getFrameRate());
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("width", this.getWidth());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the audioBitsPerSample property value. Number of audio bits per sample.
     * @param value Value to set for the audioBitsPerSample property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAudioBitsPerSample(@jakarta.annotation.Nullable final Integer value) {
        this.audioBitsPerSample = value;
    }
    /**
     * Sets the audioChannels property value. Number of audio channels.
     * @param value Value to set for the audioChannels property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAudioChannels(@jakarta.annotation.Nullable final Integer value) {
        this.audioChannels = value;
    }
    /**
     * Sets the audioFormat property value. Name of the audio format (AAC, MP3, etc.).
     * @param value Value to set for the audioFormat property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAudioFormat(@jakarta.annotation.Nullable final String value) {
        this.audioFormat = value;
    }
    /**
     * Sets the audioSamplesPerSecond property value. Number of audio samples per second.
     * @param value Value to set for the audioSamplesPerSecond property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAudioSamplesPerSecond(@jakarta.annotation.Nullable final Integer value) {
        this.audioSamplesPerSecond = value;
    }
    /**
     * Sets the bitrate property value. Bit rate of the video in bits per second.
     * @param value Value to set for the bitrate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBitrate(@jakarta.annotation.Nullable final Integer value) {
        this.bitrate = value;
    }
    /**
     * Sets the duration property value. Duration of the file in milliseconds.
     * @param value Value to set for the duration property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDuration(@jakarta.annotation.Nullable final Long value) {
        this.duration = value;
    }
    /**
     * Sets the fourCC property value. 'Four character code' name of the video format.
     * @param value Value to set for the fourCC property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFourCC(@jakarta.annotation.Nullable final String value) {
        this.fourCC = value;
    }
    /**
     * Sets the frameRate property value. Frame rate of the video.
     * @param value Value to set for the frameRate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFrameRate(@jakarta.annotation.Nullable final Double value) {
        this.frameRate = value;
    }
    /**
     * Sets the height property value. Height of the video, in pixels.
     * @param value Value to set for the height property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHeight(@jakarta.annotation.Nullable final Integer value) {
        this.height = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the width property value. Width of the video, in pixels.
     * @param value Value to set for the width property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWidth(@jakarta.annotation.Nullable final Integer value) {
        this.width = value;
    }
}
