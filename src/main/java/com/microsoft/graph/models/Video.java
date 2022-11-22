package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Video implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Number of audio bits per sample. */
    private Integer _audioBitsPerSample;
    /** Number of audio channels. */
    private Integer _audioChannels;
    /** Name of the audio format (AAC, MP3, etc.). */
    private String _audioFormat;
    /** Number of audio samples per second. */
    private Integer _audioSamplesPerSecond;
    /** Bit rate of the video in bits per second. */
    private Integer _bitrate;
    /** Duration of the file in milliseconds. */
    private Long _duration;
    /** 'Four character code' name of the video format. */
    private String _fourCC;
    /** Frame rate of the video. */
    private Double _frameRate;
    /** Height of the video, in pixels. */
    private Integer _height;
    /** The OdataType property */
    private String _odataType;
    /** Width of the video, in pixels. */
    private Integer _width;
    /**
     * Instantiates a new video and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Video() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a video
     */
    @javax.annotation.Nonnull
    public static Video createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Video();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the audioBitsPerSample property value. Number of audio bits per sample.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAudioBitsPerSample() {
        return this._audioBitsPerSample;
    }
    /**
     * Gets the audioChannels property value. Number of audio channels.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAudioChannels() {
        return this._audioChannels;
    }
    /**
     * Gets the audioFormat property value. Name of the audio format (AAC, MP3, etc.).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAudioFormat() {
        return this._audioFormat;
    }
    /**
     * Gets the audioSamplesPerSecond property value. Number of audio samples per second.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAudioSamplesPerSecond() {
        return this._audioSamplesPerSecond;
    }
    /**
     * Gets the bitrate property value. Bit rate of the video in bits per second.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBitrate() {
        return this._bitrate;
    }
    /**
     * Gets the duration property value. Duration of the file in milliseconds.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDuration() {
        return this._duration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(11);
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
    @javax.annotation.Nullable
    public String getFourCC() {
        return this._fourCC;
    }
    /**
     * Gets the frameRate property value. Frame rate of the video.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getFrameRate() {
        return this._frameRate;
    }
    /**
     * Gets the height property value. Height of the video, in pixels.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHeight() {
        return this._height;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the width property value. Width of the video, in pixels.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWidth() {
        return this._width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the audioBitsPerSample property value. Number of audio bits per sample.
     * @param value Value to set for the audioBitsPerSample property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAudioBitsPerSample(@javax.annotation.Nullable final Integer value) {
        this._audioBitsPerSample = value;
    }
    /**
     * Sets the audioChannels property value. Number of audio channels.
     * @param value Value to set for the audioChannels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAudioChannels(@javax.annotation.Nullable final Integer value) {
        this._audioChannels = value;
    }
    /**
     * Sets the audioFormat property value. Name of the audio format (AAC, MP3, etc.).
     * @param value Value to set for the audioFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAudioFormat(@javax.annotation.Nullable final String value) {
        this._audioFormat = value;
    }
    /**
     * Sets the audioSamplesPerSecond property value. Number of audio samples per second.
     * @param value Value to set for the audioSamplesPerSecond property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAudioSamplesPerSecond(@javax.annotation.Nullable final Integer value) {
        this._audioSamplesPerSecond = value;
    }
    /**
     * Sets the bitrate property value. Bit rate of the video in bits per second.
     * @param value Value to set for the bitrate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitrate(@javax.annotation.Nullable final Integer value) {
        this._bitrate = value;
    }
    /**
     * Sets the duration property value. Duration of the file in milliseconds.
     * @param value Value to set for the duration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDuration(@javax.annotation.Nullable final Long value) {
        this._duration = value;
    }
    /**
     * Sets the fourCC property value. 'Four character code' name of the video format.
     * @param value Value to set for the fourCC property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFourCC(@javax.annotation.Nullable final String value) {
        this._fourCC = value;
    }
    /**
     * Sets the frameRate property value. Frame rate of the video.
     * @param value Value to set for the frameRate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFrameRate(@javax.annotation.Nullable final Double value) {
        this._frameRate = value;
    }
    /**
     * Sets the height property value. Height of the video, in pixels.
     * @param value Value to set for the height property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHeight(@javax.annotation.Nullable final Integer value) {
        this._height = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the width property value. Width of the video, in pixels.
     * @param value Value to set for the width property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWidth(@javax.annotation.Nullable final Integer value) {
        this._width = value;
    }
}
