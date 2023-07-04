package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WatermarkProtectionValues implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether to apply a watermark to any shared content.
     */
    private Boolean isEnabledForContentSharing;
    /**
     * Indicates whether to apply a watermark to everyone's video feed.
     */
    private Boolean isEnabledForVideo;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new watermarkProtectionValues and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WatermarkProtectionValues() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a watermarkProtectionValues
     */
    @javax.annotation.Nonnull
    public static WatermarkProtectionValues createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WatermarkProtectionValues();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("isEnabledForContentSharing", (n) -> { this.setIsEnabledForContentSharing(n.getBooleanValue()); });
        deserializerMap.put("isEnabledForVideo", (n) -> { this.setIsEnabledForVideo(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabledForContentSharing property value. Indicates whether to apply a watermark to any shared content.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabledForContentSharing() {
        return this.isEnabledForContentSharing;
    }
    /**
     * Gets the isEnabledForVideo property value. Indicates whether to apply a watermark to everyone's video feed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabledForVideo() {
        return this.isEnabledForVideo;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isEnabledForContentSharing", this.getIsEnabledForContentSharing());
        writer.writeBooleanValue("isEnabledForVideo", this.getIsEnabledForVideo());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the isEnabledForContentSharing property value. Indicates whether to apply a watermark to any shared content.
     * @param value Value to set for the isEnabledForContentSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabledForContentSharing(@javax.annotation.Nullable final Boolean value) {
        this.isEnabledForContentSharing = value;
    }
    /**
     * Sets the isEnabledForVideo property value. Indicates whether to apply a watermark to everyone's video feed.
     * @param value Value to set for the isEnabledForVideo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabledForVideo(@javax.annotation.Nullable final Boolean value) {
        this.isEnabledForVideo = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
