package com.microsoft.graph.communications.calls.logteleconferencedevicequality;

import com.microsoft.graph.models.TeleconferenceDeviceQuality;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LogTeleconferenceDeviceQualityPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The quality property */
    private TeleconferenceDeviceQuality quality;
    /**
     * Instantiates a new logTeleconferenceDeviceQualityPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LogTeleconferenceDeviceQualityPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a logTeleconferenceDeviceQualityPostRequestBody
     */
    @javax.annotation.Nonnull
    public static LogTeleconferenceDeviceQualityPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LogTeleconferenceDeviceQualityPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("quality", (n) -> { this.setQuality(n.getObjectValue(TeleconferenceDeviceQuality::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the quality property value. The quality property
     * @return a TeleconferenceDeviceQuality
     */
    @javax.annotation.Nullable
    public TeleconferenceDeviceQuality getQuality() {
        return this.quality;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("quality", this.getQuality());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the quality property value. The quality property
     * @param value Value to set for the quality property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuality(@javax.annotation.Nullable final TeleconferenceDeviceQuality value) {
        this.quality = value;
    }
}
