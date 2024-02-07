package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Configuration State for a given device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceConfigurationState extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceConfigurationState and sets the default values.
     */
    public DeviceConfigurationState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceConfigurationState
     */
    @jakarta.annotation.Nonnull
    public static DeviceConfigurationState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationState();
    }
    /**
     * Gets the displayName property value. The name of the policy for this policyBase
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("platformType", (n) -> { this.setPlatformType(n.getEnumValue(PolicyPlatformType::forValue)); });
        deserializerMap.put("settingCount", (n) -> { this.setSettingCount(n.getIntegerValue()); });
        deserializerMap.put("settingStates", (n) -> { this.setSettingStates(n.getCollectionOfObjectValues(DeviceConfigurationSettingState::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ComplianceStatus::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the platformType property value. Supported platform types for policies.
     * @return a PolicyPlatformType
     */
    @jakarta.annotation.Nullable
    public PolicyPlatformType getPlatformType() {
        return this.backingStore.get("platformType");
    }
    /**
     * Gets the settingCount property value. Count of how many setting a policy holds
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSettingCount() {
        return this.backingStore.get("settingCount");
    }
    /**
     * Gets the settingStates property value. The settingStates property
     * @return a java.util.List<DeviceConfigurationSettingState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationSettingState> getSettingStates() {
        return this.backingStore.get("settingStates");
    }
    /**
     * Gets the state property value. The state property
     * @return a ComplianceStatus
     */
    @jakarta.annotation.Nullable
    public ComplianceStatus getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the version property value. The version of the policy
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("platformType", this.getPlatformType());
        writer.writeIntegerValue("settingCount", this.getSettingCount());
        writer.writeCollectionOfObjectValues("settingStates", this.getSettingStates());
        writer.writeEnumValue("state", this.getState());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the displayName property value. The name of the policy for this policyBase
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the platformType property value. Supported platform types for policies.
     * @param value Value to set for the platformType property.
     */
    public void setPlatformType(@jakarta.annotation.Nullable final PolicyPlatformType value) {
        this.backingStore.set("platformType", value);
    }
    /**
     * Sets the settingCount property value. Count of how many setting a policy holds
     * @param value Value to set for the settingCount property.
     */
    public void setSettingCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("settingCount", value);
    }
    /**
     * Sets the settingStates property value. The settingStates property
     * @param value Value to set for the settingStates property.
     */
    public void setSettingStates(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationSettingState> value) {
        this.backingStore.set("settingStates", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ComplianceStatus value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the version property value. The version of the policy
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("version", value);
    }
}
