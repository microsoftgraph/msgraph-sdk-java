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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementPartner extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementPartner and sets the default values.
     */
    public DeviceManagementPartner() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementPartner
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementPartner createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementPartner();
    }
    /**
     * Gets the displayName property value. Partner display name
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
     * @return a java.util.List<DeviceManagementPartnerAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementPartnerAssignment> getGroupsRequiringPartnerEnrollment() {
        return this.backingStore.get("groupsRequiringPartnerEnrollment");
    }
    /**
     * Gets the isConfigured property value. Whether device management partner is configured or not
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsConfigured() {
        return this.backingStore.get("isConfigured");
    }
    /**
     * Gets the lastHeartbeatDateTime property value. Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastHeartbeatDateTime() {
        return this.backingStore.get("lastHeartbeatDateTime");
    }
    /**
     * Gets the partnerAppType property value. Partner App Type.
     * @return a DeviceManagementPartnerAppType
     */
    @jakarta.annotation.Nullable
    public DeviceManagementPartnerAppType getPartnerAppType() {
        return this.backingStore.get("partnerAppType");
    }
    /**
     * Gets the partnerState property value. Partner state of this tenant.
     * @return a DeviceManagementPartnerTenantState
     */
    @jakarta.annotation.Nullable
    public DeviceManagementPartnerTenantState getPartnerState() {
        return this.backingStore.get("partnerState");
    }
    /**
     * Gets the singleTenantAppId property value. Partner Single tenant App id
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSingleTenantAppId() {
        return this.backingStore.get("singleTenantAppId");
    }
    /**
     * Gets the whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime property value. DateTime in UTC when PartnerDevices will be marked as NonCompliant
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime() {
        return this.backingStore.get("whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime");
    }
    /**
     * Gets the whenPartnerDevicesWillBeRemovedDateTime property value. DateTime in UTC when PartnerDevices will be removed
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getWhenPartnerDevicesWillBeRemovedDateTime() {
        return this.backingStore.get("whenPartnerDevicesWillBeRemovedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the groupsRequiringPartnerEnrollment property value. User groups that specifies whether enrollment is through partner.
     * @param value Value to set for the groupsRequiringPartnerEnrollment property.
     */
    public void setGroupsRequiringPartnerEnrollment(@jakarta.annotation.Nullable final java.util.List<DeviceManagementPartnerAssignment> value) {
        this.backingStore.set("groupsRequiringPartnerEnrollment", value);
    }
    /**
     * Sets the isConfigured property value. Whether device management partner is configured or not
     * @param value Value to set for the isConfigured property.
     */
    public void setIsConfigured(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isConfigured", value);
    }
    /**
     * Sets the lastHeartbeatDateTime property value. Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
     * @param value Value to set for the lastHeartbeatDateTime property.
     */
    public void setLastHeartbeatDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastHeartbeatDateTime", value);
    }
    /**
     * Sets the partnerAppType property value. Partner App Type.
     * @param value Value to set for the partnerAppType property.
     */
    public void setPartnerAppType(@jakarta.annotation.Nullable final DeviceManagementPartnerAppType value) {
        this.backingStore.set("partnerAppType", value);
    }
    /**
     * Sets the partnerState property value. Partner state of this tenant.
     * @param value Value to set for the partnerState property.
     */
    public void setPartnerState(@jakarta.annotation.Nullable final DeviceManagementPartnerTenantState value) {
        this.backingStore.set("partnerState", value);
    }
    /**
     * Sets the singleTenantAppId property value. Partner Single tenant App id
     * @param value Value to set for the singleTenantAppId property.
     */
    public void setSingleTenantAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("singleTenantAppId", value);
    }
    /**
     * Sets the whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime property value. DateTime in UTC when PartnerDevices will be marked as NonCompliant
     * @param value Value to set for the whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime property.
     */
    public void setWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime", value);
    }
    /**
     * Sets the whenPartnerDevicesWillBeRemovedDateTime property value. DateTime in UTC when PartnerDevices will be removed
     * @param value Value to set for the whenPartnerDevicesWillBeRemovedDateTime property.
     */
    public void setWhenPartnerDevicesWillBeRemovedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("whenPartnerDevicesWillBeRemovedDateTime", value);
    }
}
