package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserTrainingContentEventInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The browser property */
    private String _browser;
    /** The contentDateTime property */
    private OffsetDateTime _contentDateTime;
    /** The ipAddress property */
    private String _ipAddress;
    /** The OdataType property */
    private String _odataType;
    /** The osPlatformDeviceDetails property */
    private String _osPlatformDeviceDetails;
    /** The potentialScoreImpact property */
    private Double _potentialScoreImpact;
    /**
     * Instantiates a new userTrainingContentEventInfo and sets the default values.
     * @return a void
     */
    public UserTrainingContentEventInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.userTrainingContentEventInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userTrainingContentEventInfo
     */
    @javax.annotation.Nonnull
    public static UserTrainingContentEventInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserTrainingContentEventInfo();
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
     * Gets the browser property value. The browser property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBrowser() {
        return this._browser;
    }
    /**
     * Gets the contentDateTime property value. The contentDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getContentDateTime() {
        return this._contentDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserTrainingContentEventInfo currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("browser", (n) -> { currentObject.setBrowser(n.getStringValue()); });
            this.put("contentDateTime", (n) -> { currentObject.setContentDateTime(n.getOffsetDateTimeValue()); });
            this.put("ipAddress", (n) -> { currentObject.setIpAddress(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("osPlatformDeviceDetails", (n) -> { currentObject.setOsPlatformDeviceDetails(n.getStringValue()); });
            this.put("potentialScoreImpact", (n) -> { currentObject.setPotentialScoreImpact(n.getDoubleValue()); });
        }};
    }
    /**
     * Gets the ipAddress property value. The ipAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this._ipAddress;
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
     * Gets the osPlatformDeviceDetails property value. The osPlatformDeviceDetails property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsPlatformDeviceDetails() {
        return this._osPlatformDeviceDetails;
    }
    /**
     * Gets the potentialScoreImpact property value. The potentialScoreImpact property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getPotentialScoreImpact() {
        return this._potentialScoreImpact;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("browser", this.getBrowser());
        writer.writeOffsetDateTimeValue("contentDateTime", this.getContentDateTime());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("osPlatformDeviceDetails", this.getOsPlatformDeviceDetails());
        writer.writeDoubleValue("potentialScoreImpact", this.getPotentialScoreImpact());
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
     * Sets the browser property value. The browser property
     * @param value Value to set for the browser property.
     * @return a void
     */
    public void setBrowser(@javax.annotation.Nullable final String value) {
        this._browser = value;
    }
    /**
     * Sets the contentDateTime property value. The contentDateTime property
     * @param value Value to set for the contentDateTime property.
     * @return a void
     */
    public void setContentDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._contentDateTime = value;
    }
    /**
     * Sets the ipAddress property value. The ipAddress property
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this._ipAddress = value;
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
     * Sets the osPlatformDeviceDetails property value. The osPlatformDeviceDetails property
     * @param value Value to set for the osPlatformDeviceDetails property.
     * @return a void
     */
    public void setOsPlatformDeviceDetails(@javax.annotation.Nullable final String value) {
        this._osPlatformDeviceDetails = value;
    }
    /**
     * Sets the potentialScoreImpact property value. The potentialScoreImpact property
     * @param value Value to set for the potentialScoreImpact property.
     * @return a void
     */
    public void setPotentialScoreImpact(@javax.annotation.Nullable final Double value) {
        this._potentialScoreImpact = value;
    }
}
