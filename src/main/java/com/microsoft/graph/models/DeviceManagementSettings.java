package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The number of days a device is allowed to go without checking in to remain compliant. */
    private Integer _deviceComplianceCheckinThresholdDays;
    /** Is feature enabled or not for scheduled action for rule. */
    private Boolean _isScheduledActionEnabled;
    /** The OdataType property */
    private String _odataType;
    /** Device should be noncompliant when there is no compliance policy targeted when this is true */
    private Boolean _secureByDefault;
    /**
     * Instantiates a new deviceManagementSettings and sets the default values.
     * @return a void
     */
    public DeviceManagementSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceManagementSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettings
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettings();
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
     * Gets the deviceComplianceCheckinThresholdDays property value. The number of days a device is allowed to go without checking in to remain compliant.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceComplianceCheckinThresholdDays() {
        return this._deviceComplianceCheckinThresholdDays;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementSettings currentObject = this;
        return new HashMap<>(4) {{
            this.put("deviceComplianceCheckinThresholdDays", (n) -> { currentObject.setDeviceComplianceCheckinThresholdDays(n.getIntegerValue()); });
            this.put("isScheduledActionEnabled", (n) -> { currentObject.setIsScheduledActionEnabled(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("secureByDefault", (n) -> { currentObject.setSecureByDefault(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isScheduledActionEnabled property value. Is feature enabled or not for scheduled action for rule.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsScheduledActionEnabled() {
        return this._isScheduledActionEnabled;
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
     * Gets the secureByDefault property value. Device should be noncompliant when there is no compliance policy targeted when this is true
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecureByDefault() {
        return this._secureByDefault;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("deviceComplianceCheckinThresholdDays", this.getDeviceComplianceCheckinThresholdDays());
        writer.writeBooleanValue("isScheduledActionEnabled", this.getIsScheduledActionEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("secureByDefault", this.getSecureByDefault());
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
     * Sets the deviceComplianceCheckinThresholdDays property value. The number of days a device is allowed to go without checking in to remain compliant.
     * @param value Value to set for the deviceComplianceCheckinThresholdDays property.
     * @return a void
     */
    public void setDeviceComplianceCheckinThresholdDays(@javax.annotation.Nullable final Integer value) {
        this._deviceComplianceCheckinThresholdDays = value;
    }
    /**
     * Sets the isScheduledActionEnabled property value. Is feature enabled or not for scheduled action for rule.
     * @param value Value to set for the isScheduledActionEnabled property.
     * @return a void
     */
    public void setIsScheduledActionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isScheduledActionEnabled = value;
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
     * Sets the secureByDefault property value. Device should be noncompliant when there is no compliance policy targeted when this is true
     * @param value Value to set for the secureByDefault property.
     * @return a void
     */
    public void setSecureByDefault(@javax.annotation.Nullable final Boolean value) {
        this._secureByDefault = value;
    }
}
