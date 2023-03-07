package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity which represents a connection to device management partner.
 */
public class DeviceManagementPartner extends Entity implements Parsable {
    /** Partner display name */
    private String displayName;
    /** User groups that specifies whether enrollment is through partner. */
    private java.util.List<DeviceManagementPartnerAssignment> groupsRequiringPartnerEnrollment;
    /** Whether device management partner is configured or not */
    private Boolean isConfigured;
    /** Timestamp of last heartbeat after admin enabled option Connect to Device management Partner */
    private OffsetDateTime lastHeartbeatDateTime;
    /** Partner App Type. */
    private DeviceManagementPartnerAppType partnerAppType;
    /** Partner state of this tenant. */
    private DeviceManagementPartnerTenantState partnerState;
    /** Partner Single tenant App id */
    private String singleTenantAppId;
    /** DateTime in UTC when PartnerDevices will be marked as NonCompliant */
    private OffsetDateTime whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime;
    /** DateTime in UTC when PartnerDevices will be removed */
    private OffsetDateTime whenPartnerDevicesWillBeRemovedDateTime;
    /**
     * Instantiates a new deviceManagementPartner and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementPartner() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementPartner
     */
    @javax.annotation.Nonnull
    public static DeviceManagementPartner createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementPartner();
    }
    /**
     * Gets the displayName property value. Partner display name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("groupsRequiringPartnerEnrollment", (n) -> { this.setGroupsRequiringPartnerEnrollment(n.getCollectionOfObjectValues(DeviceManagementPartnerAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("isConfigured", (n) -> { this.setIsConfigured(n.getBooleanValue()); });
        deserializerMap.put("lastHeartbeatDateTime", (n) -> { this.setLastHeartbeatDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("partnerAppType", (n) -> { this.setPartnerAppType(n.getEnumValue(DeviceManagementPartnerAppType.class)); });
        deserializerMap.put("partnerState", (n) -> { this.setPartnerState(n.getEnumValue(DeviceManagementPartnerTenantState.class)); });
        deserializerMap.put("singleTenantAppId", (n) -> { this.setSingleTenantAppId(n.getStringValue()); });
        deserializerMap.put("whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime", (n) -> { this.setWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("whenPartnerDevicesWillBeRemovedDateTime", (n) -> { this.setWhenPartnerDevicesWillBeRemovedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupsRequiringPartnerEnrollment property value. User groups that specifies whether enrollment is through partner.
     * @return a deviceManagementPartnerAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementPartnerAssignment> getGroupsRequiringPartnerEnrollment() {
        return this.groupsRequiringPartnerEnrollment;
    }
    /**
     * Gets the isConfigured property value. Whether device management partner is configured or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsConfigured() {
        return this.isConfigured;
    }
    /**
     * Gets the lastHeartbeatDateTime property value. Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastHeartbeatDateTime() {
        return this.lastHeartbeatDateTime;
    }
    /**
     * Gets the partnerAppType property value. Partner App Type.
     * @return a deviceManagementPartnerAppType
     */
    @javax.annotation.Nullable
    public DeviceManagementPartnerAppType getPartnerAppType() {
        return this.partnerAppType;
    }
    /**
     * Gets the partnerState property value. Partner state of this tenant.
     * @return a deviceManagementPartnerTenantState
     */
    @javax.annotation.Nullable
    public DeviceManagementPartnerTenantState getPartnerState() {
        return this.partnerState;
    }
    /**
     * Gets the singleTenantAppId property value. Partner Single tenant App id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSingleTenantAppId() {
        return this.singleTenantAppId;
    }
    /**
     * Gets the whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime property value. DateTime in UTC when PartnerDevices will be marked as NonCompliant
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime() {
        return this.whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime;
    }
    /**
     * Gets the whenPartnerDevicesWillBeRemovedDateTime property value. DateTime in UTC when PartnerDevices will be removed
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getWhenPartnerDevicesWillBeRemovedDateTime() {
        return this.whenPartnerDevicesWillBeRemovedDateTime;
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
        writer.writeCollectionOfObjectValues("groupsRequiringPartnerEnrollment", this.getGroupsRequiringPartnerEnrollment());
        writer.writeBooleanValue("isConfigured", this.getIsConfigured());
        writer.writeOffsetDateTimeValue("lastHeartbeatDateTime", this.getLastHeartbeatDateTime());
        writer.writeEnumValue("partnerAppType", this.getPartnerAppType());
        writer.writeEnumValue("partnerState", this.getPartnerState());
        writer.writeStringValue("singleTenantAppId", this.getSingleTenantAppId());
        writer.writeOffsetDateTimeValue("whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime", this.getWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime());
        writer.writeOffsetDateTimeValue("whenPartnerDevicesWillBeRemovedDateTime", this.getWhenPartnerDevicesWillBeRemovedDateTime());
    }
    /**
     * Sets the displayName property value. Partner display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the groupsRequiringPartnerEnrollment property value. User groups that specifies whether enrollment is through partner.
     * @param value Value to set for the groupsRequiringPartnerEnrollment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupsRequiringPartnerEnrollment(@javax.annotation.Nullable final java.util.List<DeviceManagementPartnerAssignment> value) {
        this.groupsRequiringPartnerEnrollment = value;
    }
    /**
     * Sets the isConfigured property value. Whether device management partner is configured or not
     * @param value Value to set for the isConfigured property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsConfigured(@javax.annotation.Nullable final Boolean value) {
        this.isConfigured = value;
    }
    /**
     * Sets the lastHeartbeatDateTime property value. Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
     * @param value Value to set for the lastHeartbeatDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastHeartbeatDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastHeartbeatDateTime = value;
    }
    /**
     * Sets the partnerAppType property value. Partner App Type.
     * @param value Value to set for the partnerAppType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartnerAppType(@javax.annotation.Nullable final DeviceManagementPartnerAppType value) {
        this.partnerAppType = value;
    }
    /**
     * Sets the partnerState property value. Partner state of this tenant.
     * @param value Value to set for the partnerState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartnerState(@javax.annotation.Nullable final DeviceManagementPartnerTenantState value) {
        this.partnerState = value;
    }
    /**
     * Sets the singleTenantAppId property value. Partner Single tenant App id
     * @param value Value to set for the singleTenantAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleTenantAppId(@javax.annotation.Nullable final String value) {
        this.singleTenantAppId = value;
    }
    /**
     * Sets the whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime property value. DateTime in UTC when PartnerDevices will be marked as NonCompliant
     * @param value Value to set for the whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime = value;
    }
    /**
     * Sets the whenPartnerDevicesWillBeRemovedDateTime property value. DateTime in UTC when PartnerDevices will be removed
     * @param value Value to set for the whenPartnerDevicesWillBeRemovedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWhenPartnerDevicesWillBeRemovedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.whenPartnerDevicesWillBeRemovedDateTime = value;
    }
}
