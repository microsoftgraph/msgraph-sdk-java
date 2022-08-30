package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OcrSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether or not OCR is enabled for the case. */
    private Boolean _isEnabled;
    /** Maximum image size that will be processed in KB). */
    private Integer _maxImageSize;
    /** The OdataType property */
    private String _odataType;
    /** The timeout duration for the OCR engine. A longer timeout might increase success of OCR, but might add to the total processing time. */
    private Period _timeout;
    /**
     * Instantiates a new ocrSettings and sets the default values.
     * @return a void
     */
    public OcrSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.security.ocrSettings");
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
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OcrSettings currentObject = this;
        return new HashMap<>(4) {{
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("maxImageSize", (n) -> { currentObject.setMaxImageSize(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("timeout", (n) -> { currentObject.setTimeout(n.getPeriodValue()); });
        }};
    }
    /**
     * Gets the isEnabled property value. Indicates whether or not OCR is enabled for the case.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the maxImageSize property value. Maximum image size that will be processed in KB).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxImageSize() {
        return this._maxImageSize;
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
     * Gets the timeout property value. The timeout duration for the OCR engine. A longer timeout might increase success of OCR, but might add to the total processing time.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getTimeout() {
        return this._timeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether or not OCR is enabled for the case.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the maxImageSize property value. Maximum image size that will be processed in KB).
     * @param value Value to set for the maxImageSize property.
     * @return a void
     */
    public void setMaxImageSize(@javax.annotation.Nullable final Integer value) {
        this._maxImageSize = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the timeout property value. The timeout duration for the OCR engine. A longer timeout might increase success of OCR, but might add to the total processing time.
     * @param value Value to set for the timeout property.
     * @return a void
     */
    public void setTimeout(@javax.annotation.Nullable final Period value) {
        this._timeout = value;
    }
}
