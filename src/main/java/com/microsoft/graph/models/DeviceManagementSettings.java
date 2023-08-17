package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of days a device is allowed to go without checking in to remain compliant.
     */
    private Integer deviceComplianceCheckinThresholdDays;
    /**
     * Is feature enabled or not for scheduled action for rule.
     */
    private Boolean isScheduledActionEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Device should be noncompliant when there is no compliance policy targeted when this is true
     */
    private Boolean secureByDefault;
    /**
     * Instantiates a new deviceManagementSettings and sets the default values.
     */
    public DeviceManagementSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettings
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettings();
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
     * Gets the deviceComplianceCheckinThresholdDays property value. The number of days a device is allowed to go without checking in to remain compliant.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceComplianceCheckinThresholdDays() {
        return this.deviceComplianceCheckinThresholdDays;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("deviceComplianceCheckinThresholdDays", (n) -> { this.setDeviceComplianceCheckinThresholdDays(n.getIntegerValue()); });
        deserializerMap.put("isScheduledActionEnabled", (n) -> { this.setIsScheduledActionEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("secureByDefault", (n) -> { this.setSecureByDefault(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isScheduledActionEnabled property value. Is feature enabled or not for scheduled action for rule.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsScheduledActionEnabled() {
        return this.isScheduledActionEnabled;
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
     * Gets the secureByDefault property value. Device should be noncompliant when there is no compliance policy targeted when this is true
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecureByDefault() {
        return this.secureByDefault;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("deviceComplianceCheckinThresholdDays", this.getDeviceComplianceCheckinThresholdDays());
        writer.writeBooleanValue("isScheduledActionEnabled", this.getIsScheduledActionEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("secureByDefault", this.getSecureByDefault());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceComplianceCheckinThresholdDays property value. The number of days a device is allowed to go without checking in to remain compliant.
     * @param value Value to set for the deviceComplianceCheckinThresholdDays property.
     */
    public void setDeviceComplianceCheckinThresholdDays(@jakarta.annotation.Nullable final Integer value) {
        this.deviceComplianceCheckinThresholdDays = value;
    }
    /**
     * Sets the isScheduledActionEnabled property value. Is feature enabled or not for scheduled action for rule.
     * @param value Value to set for the isScheduledActionEnabled property.
     */
    public void setIsScheduledActionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isScheduledActionEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the secureByDefault property value. Device should be noncompliant when there is no compliance policy targeted when this is true
     * @param value Value to set for the secureByDefault property.
     */
    public void setSecureByDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.secureByDefault = value;
    }
}
