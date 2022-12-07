package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device Compliance Policy State for a given device. */
public class DeviceCompliancePolicyState extends Entity implements Parsable {
    /** The name of the policy for this policyBase */
    private String _displayName;
    /** Supported platform types for policies. */
    private PolicyPlatformType _platformType;
    /** Count of how many setting a policy holds */
    private Integer _settingCount;
    /** The settingStates property */
    private java.util.List<DeviceCompliancePolicySettingState> _settingStates;
    /** The state property */
    private ComplianceStatus _state;
    /** The version of the policy */
    private Integer _version;
    /**
     * Instantiates a new deviceCompliancePolicyState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicyState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceCompliancePolicyState
     */
    @javax.annotation.Nonnull
    public static DeviceCompliancePolicyState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceCompliancePolicyState();
    }
    /**
     * Gets the displayName property value. The name of the policy for this policyBase
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("platformType", (n) -> { this.setPlatformType(n.getEnumValue(PolicyPlatformType.class)); });
        deserializerMap.put("settingCount", (n) -> { this.setSettingCount(n.getIntegerValue()); });
        deserializerMap.put("settingStates", (n) -> { this.setSettingStates(n.getCollectionOfObjectValues(DeviceCompliancePolicySettingState::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ComplianceStatus.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the platformType property value. Supported platform types for policies.
     * @return a policyPlatformType
     */
    @javax.annotation.Nullable
    public PolicyPlatformType getPlatformType() {
        return this._platformType;
    }
    /**
     * Gets the settingCount property value. Count of how many setting a policy holds
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSettingCount() {
        return this._settingCount;
    }
    /**
     * Gets the settingStates property value. The settingStates property
     * @return a deviceCompliancePolicySettingState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicySettingState> getSettingStates() {
        return this._settingStates;
    }
    /**
     * Gets the state property value. The state property
     * @return a complianceStatus
     */
    @javax.annotation.Nullable
    public ComplianceStatus getState() {
        return this._state;
    }
    /**
     * Gets the version property value. The version of the policy
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the platformType property value. Supported platform types for policies.
     * @param value Value to set for the platformType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatformType(@javax.annotation.Nullable final PolicyPlatformType value) {
        this._platformType = value;
    }
    /**
     * Sets the settingCount property value. Count of how many setting a policy holds
     * @param value Value to set for the settingCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingCount(@javax.annotation.Nullable final Integer value) {
        this._settingCount = value;
    }
    /**
     * Sets the settingStates property value. The settingStates property
     * @param value Value to set for the settingStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingStates(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicySettingState> value) {
        this._settingStates = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ComplianceStatus value) {
        this._state = value;
    }
    /**
     * Sets the version property value. The version of the policy
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
