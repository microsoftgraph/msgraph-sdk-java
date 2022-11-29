package com.microsoft.graph.models;

import com.microsoft.graph.models.IosMobileAppConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** An abstract class for Mobile app configuration for enrolled devices. */
public class ManagedDeviceMobileAppConfiguration extends Entity implements Parsable {
    /** The list of group assignemenets for app configration. */
    private java.util.List<ManagedDeviceMobileAppConfigurationAssignment> _assignments;
    /** DateTime the object was created. */
    private OffsetDateTime _createdDateTime;
    /** Admin provided description of the Device Configuration. */
    private String _description;
    /** List of ManagedDeviceMobileAppConfigurationDeviceStatus. */
    private java.util.List<ManagedDeviceMobileAppConfigurationDeviceStatus> _deviceStatuses;
    /** App configuration device status summary. */
    private ManagedDeviceMobileAppConfigurationDeviceSummary _deviceStatusSummary;
    /** Admin provided name of the device configuration. */
    private String _displayName;
    /** DateTime the object was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** the associated app. */
    private java.util.List<String> _targetedMobileApps;
    /** List of ManagedDeviceMobileAppConfigurationUserStatus. */
    private java.util.List<ManagedDeviceMobileAppConfigurationUserStatus> _userStatuses;
    /** App configuration user status summary. */
    private ManagedDeviceMobileAppConfigurationUserSummary _userStatusSummary;
    /** Version of the device configuration. */
    private Integer _version;
    /**
     * Instantiates a new managedDeviceMobileAppConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedDeviceMobileAppConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceMobileAppConfiguration
     */
    @javax.annotation.Nonnull
    public static ManagedDeviceMobileAppConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.iosMobileAppConfiguration": return new IosMobileAppConfiguration();
            }
        }
        return new ManagedDeviceMobileAppConfiguration();
    }
    /**
     * Gets the assignments property value. The list of group assignemenets for app configration.
     * @return a managedDeviceMobileAppConfigurationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfigurationAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Admin provided description of the Device Configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceStatuses property value. List of ManagedDeviceMobileAppConfigurationDeviceStatus.
     * @return a managedDeviceMobileAppConfigurationDeviceStatus
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfigurationDeviceStatus> getDeviceStatuses() {
        return this._deviceStatuses;
    }
    /**
     * Gets the deviceStatusSummary property value. App configuration device status summary.
     * @return a managedDeviceMobileAppConfigurationDeviceSummary
     */
    @javax.annotation.Nullable
    public ManagedDeviceMobileAppConfigurationDeviceSummary getDeviceStatusSummary() {
        return this._deviceStatusSummary;
    }
    /**
     * Gets the displayName property value. Admin provided name of the device configuration.
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
        final ManagedDeviceMobileAppConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfigurationAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceStatuses", (n) -> { currentObject.setDeviceStatuses(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfigurationDeviceStatus::createFromDiscriminatorValue)); });
            this.put("deviceStatusSummary", (n) -> { currentObject.setDeviceStatusSummary(n.getObjectValue(ManagedDeviceMobileAppConfigurationDeviceSummary::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("targetedMobileApps", (n) -> { currentObject.setTargetedMobileApps(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("userStatuses", (n) -> { currentObject.setUserStatuses(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfigurationUserStatus::createFromDiscriminatorValue)); });
            this.put("userStatusSummary", (n) -> { currentObject.setUserStatusSummary(n.getObjectValue(ManagedDeviceMobileAppConfigurationUserSummary::createFromDiscriminatorValue)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the targetedMobileApps property value. the associated app.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTargetedMobileApps() {
        return this._targetedMobileApps;
    }
    /**
     * Gets the userStatuses property value. List of ManagedDeviceMobileAppConfigurationUserStatus.
     * @return a managedDeviceMobileAppConfigurationUserStatus
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfigurationUserStatus> getUserStatuses() {
        return this._userStatuses;
    }
    /**
     * Gets the userStatusSummary property value. App configuration user status summary.
     * @return a managedDeviceMobileAppConfigurationUserSummary
     */
    @javax.annotation.Nullable
    public ManagedDeviceMobileAppConfigurationUserSummary getUserStatusSummary() {
        return this._userStatusSummary;
    }
    /**
     * Gets the version property value. Version of the device configuration.
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
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("deviceStatuses", this.getDeviceStatuses());
        writer.writeObjectValue("deviceStatusSummary", this.getDeviceStatusSummary());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("targetedMobileApps", this.getTargetedMobileApps());
        writer.writeCollectionOfObjectValues("userStatuses", this.getUserStatuses());
        writer.writeObjectValue("userStatusSummary", this.getUserStatusSummary());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The list of group assignemenets for app configration.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfigurationAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Admin provided description of the Device Configuration.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceStatuses property value. List of ManagedDeviceMobileAppConfigurationDeviceStatus.
     * @param value Value to set for the deviceStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStatuses(@javax.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfigurationDeviceStatus> value) {
        this._deviceStatuses = value;
    }
    /**
     * Sets the deviceStatusSummary property value. App configuration device status summary.
     * @param value Value to set for the deviceStatusSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStatusSummary(@javax.annotation.Nullable final ManagedDeviceMobileAppConfigurationDeviceSummary value) {
        this._deviceStatusSummary = value;
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the targetedMobileApps property value. the associated app.
     * @param value Value to set for the targetedMobileApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedMobileApps(@javax.annotation.Nullable final java.util.List<String> value) {
        this._targetedMobileApps = value;
    }
    /**
     * Sets the userStatuses property value. List of ManagedDeviceMobileAppConfigurationUserStatus.
     * @param value Value to set for the userStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserStatuses(@javax.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfigurationUserStatus> value) {
        this._userStatuses = value;
    }
    /**
     * Sets the userStatusSummary property value. App configuration user status summary.
     * @param value Value to set for the userStatusSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserStatusSummary(@javax.annotation.Nullable final ManagedDeviceMobileAppConfigurationUserSummary value) {
        this._userStatusSummary = value;
    }
    /**
     * Sets the version property value. Version of the device configuration.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
