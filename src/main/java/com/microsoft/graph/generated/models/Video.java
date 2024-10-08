package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Video implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link Video} and sets the default values.
     */
    public Video() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Video}
     */
    @jakarta.annotation.Nonnull
    public static Video createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Video();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the audioBitsPerSample property value. Number of audio bits per sample.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAudioBitsPerSample() {
        return this.backingStore.get("audioBitsPerSample");
    }
    /**
     * Gets the audioChannels property value. Number of audio channels.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAudioChannels() {
        return this.backingStore.get("audioChannels");
    }
    /**
     * Gets the audioFormat property value. Name of the audio format (AAC, MP3, etc.).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAudioFormat() {
        return this.backingStore.get("audioFormat");
    }
    /**
     * Gets the audioSamplesPerSecond property value. Number of audio samples per second.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAudioSamplesPerSecond() {
        return this.backingStore.get("audioSamplesPerSecond");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the bitrate property value. Bit rate of the video in bits per second.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBitrate() {
        return this.backingStore.get("bitrate");
    }
    /**
     * Gets the duration property value. Duration of the file in milliseconds.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDuration() {
        return this.backingStore.get("duration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
        deserializerMap.put("frameRate", (n) -> { this.setFrameRate(n.getObjectValue(VideoFrameRate::createFromDiscriminatorValue)); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fourCC property value. 'Four character code' name of the video format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFourCC() {
        return this.backingStore.get("fourCC");
    }
    /**
     * Gets the frameRate property value. Frame rate of the video.
     * @return a {@link VideoFrameRate}
     */
    @jakarta.annotation.Nullable
    public VideoFrameRate getFrameRate() {
        return this.backingStore.get("frameRate");
    }
    /**
     * Gets the height property value. Height of the video, in pixels.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHeight() {
        return this.backingStore.get("height");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the width property value. Width of the video, in pixels.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWidth() {
        return this.backingStore.get("width");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("audioBitsPerSample", this.getAudioBitsPerSample());
        writer.writeIntegerValue("audioChannels", this.getAudioChannels());
        writer.writeStringValue("audioFormat", this.getAudioFormat());
        writer.writeIntegerValue("audioSamplesPerSecond", this.getAudioSamplesPerSecond());
        writer.writeIntegerValue("bitrate", this.getBitrate());
        writer.writeLongValue("duration", this.getDuration());
        writer.writeStringValue("fourCC", this.getFourCC());
        writer.writeObjectValue("frameRate", this.getFrameRate());
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("width", this.getWidth());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the audioBitsPerSample property value. Number of audio bits per sample.
     * @param value Value to set for the audioBitsPerSample property.
     */
    public void setAudioBitsPerSample(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("audioBitsPerSample", value);
    }
    /**
     * Sets the audioChannels property value. Number of audio channels.
     * @param value Value to set for the audioChannels property.
     */
    public void setAudioChannels(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("audioChannels", value);
    }
    /**
     * Sets the audioFormat property value. Name of the audio format (AAC, MP3, etc.).
     * @param value Value to set for the audioFormat property.
     */
    public void setAudioFormat(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("audioFormat", value);
    }
    /**
     * Sets the audioSamplesPerSecond property value. Number of audio samples per second.
     * @param value Value to set for the audioSamplesPerSecond property.
     */
    public void setAudioSamplesPerSecond(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("audioSamplesPerSecond", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the bitrate property value. Bit rate of the video in bits per second.
     * @param value Value to set for the bitrate property.
     */
    public void setBitrate(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("bitrate", value);
    }
    /**
     * Sets the duration property value. Duration of the file in milliseconds.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("duration", value);
    }
    /**
     * Sets the fourCC property value. 'Four character code' name of the video format.
     * @param value Value to set for the fourCC property.
     */
    public void setFourCC(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fourCC", value);
    }
    /**
     * Sets the frameRate property value. Frame rate of the video.
     * @param value Value to set for the frameRate property.
     */
    public void setFrameRate(@jakarta.annotation.Nullable final VideoFrameRate value) {
        this.backingStore.set("frameRate", value);
    }
    /**
     * Sets the height property value. Height of the video, in pixels.
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("height", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the width property value. Width of the video, in pixels.
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("width", value);
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class VideoFrameRate implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link VideoFrameRate} and sets the default values.
         */
        public VideoFrameRate() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link VideoFrameRate}
         */
        @jakarta.annotation.Nonnull
        public static VideoFrameRate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final VideoFrameRate result = new VideoFrameRate();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
}
