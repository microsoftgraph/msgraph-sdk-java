package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OcrSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether or not OCR is enabled for the case.
     */
    private Boolean isEnabled;
    /**
     * Maximum image size that will be processed in KB).
     */
    private Integer maxImageSize;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The timeout duration for the OCR engine. A longer timeout might increase success of OCR, but might add to the total processing time.
     */
    private Period timeout;
    /**
     * Instantiates a new ocrSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OcrSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ocrSettings
     */
    @javax.annotation.Nonnull
    public static OcrSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OcrSettings();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("maxImageSize", (n) -> { this.setMaxImageSize(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("timeout", (n) -> { this.setTimeout(n.getPeriodValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Indicates whether or not OCR is enabled for the case.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the maxImageSize property value. Maximum image size that will be processed in KB).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxImageSize() {
        return this.maxImageSize;
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
     * Gets the timeout property value. The timeout duration for the OCR engine. A longer timeout might increase success of OCR, but might add to the total processing time.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getTimeout() {
        return this.timeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeIntegerValue("maxImageSize", this.getMaxImageSize());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writePeriodValue("timeout", this.getTimeout());
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
     * Sets the isEnabled property value. Indicates whether or not OCR is enabled for the case.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the maxImageSize property value. Maximum image size that will be processed in KB).
     * @param value Value to set for the maxImageSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxImageSize(@javax.annotation.Nullable final Integer value) {
        this.maxImageSize = value;
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
    /**
     * Sets the timeout property value. The timeout duration for the OCR engine. A longer timeout might increase success of OCR, but might add to the total processing time.
     * @param value Value to set for the timeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeout(@javax.annotation.Nullable final Period value) {
        this.timeout = value;
    }
}
