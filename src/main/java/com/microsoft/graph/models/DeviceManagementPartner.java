package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity which represents a connection to device management partner. */
public class DeviceManagementPartner extends Entity implements Parsable {
    /** Partner display name */
    private String _displayName;
    /** Whether device management partner is configured or not */
    private Boolean _isConfigured;
    /** Timestamp of last heartbeat after admin enabled option Connect to Device management Partner */
    private OffsetDateTime _lastHeartbeatDateTime;
    /** Partner App Type. */
    private DeviceManagementPartnerAppType _partnerAppType;
    /** Partner state of this tenant. */
    private DeviceManagementPartnerTenantState _partnerState;
    /** Partner Single tenant App id */
    private String _singleTenantAppId;
    /** DateTime in UTC when PartnerDevices will be marked as NonCompliant */
    private OffsetDateTime _whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime;
    /** DateTime in UTC when PartnerDevices will be removed */
    private OffsetDateTime _whenPartnerDevicesWillBeRemovedDateTime;
    /**
     * Instantiates a new deviceManagementPartner and sets the default values.
     * @return a void
     */
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
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementPartner currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isConfigured", (n) -> { currentObject.setIsConfigured(n.getBooleanValue()); });
            this.put("lastHeartbeatDateTime", (n) -> { currentObject.setLastHeartbeatDateTime(n.getOffsetDateTimeValue()); });
            this.put("partnerAppType", (n) -> { currentObject.setPartnerAppType(n.getEnumValue(DeviceManagementPartnerAppType.class)); });
            this.put("partnerState", (n) -> { currentObject.setPartnerState(n.getEnumValue(DeviceManagementPartnerTenantState.class)); });
            this.put("singleTenantAppId", (n) -> { currentObject.setSingleTenantAppId(n.getStringValue()); });
            this.put("whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime", (n) -> { currentObject.setWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime(n.getOffsetDateTimeValue()); });
            this.put("whenPartnerDevicesWillBeRemovedDateTime", (n) -> { currentObject.setWhenPartnerDevicesWillBeRemovedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the isConfigured property value. Whether device management partner is configured or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsConfigured() {
        return this._isConfigured;
    }
    /**
     * Gets the lastHeartbeatDateTime property value. Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastHeartbeatDateTime() {
        return this._lastHeartbeatDateTime;
    }
    /**
     * Gets the partnerAppType property value. Partner App Type.
     * @return a deviceManagementPartnerAppType
     */
    @javax.annotation.Nullable
    public DeviceManagementPartnerAppType getPartnerAppType() {
        return this._partnerAppType;
    }
    /**
     * Gets the partnerState property value. Partner state of this tenant.
     * @return a deviceManagementPartnerTenantState
     */
    @javax.annotation.Nullable
    public DeviceManagementPartnerTenantState getPartnerState() {
        return this._partnerState;
    }
    /**
     * Gets the singleTenantAppId property value. Partner Single tenant App id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSingleTenantAppId() {
        return this._singleTenantAppId;
    }
    /**
     * Gets the whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime property value. DateTime in UTC when PartnerDevices will be marked as NonCompliant
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime() {
        return this._whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime;
    }
    /**
     * Gets the whenPartnerDevicesWillBeRemovedDateTime property value. DateTime in UTC when PartnerDevices will be removed
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getWhenPartnerDevicesWillBeRemovedDateTime() {
        return this._whenPartnerDevicesWillBeRemovedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
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
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isConfigured property value. Whether device management partner is configured or not
     * @param value Value to set for the isConfigured property.
     * @return a void
     */
    public void setIsConfigured(@javax.annotation.Nullable final Boolean value) {
        this._isConfigured = value;
    }
    /**
     * Sets the lastHeartbeatDateTime property value. Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
     * @param value Value to set for the lastHeartbeatDateTime property.
     * @return a void
     */
    public void setLastHeartbeatDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastHeartbeatDateTime = value;
    }
    /**
     * Sets the partnerAppType property value. Partner App Type.
     * @param value Value to set for the partnerAppType property.
     * @return a void
     */
    public void setPartnerAppType(@javax.annotation.Nullable final DeviceManagementPartnerAppType value) {
        this._partnerAppType = value;
    }
    /**
     * Sets the partnerState property value. Partner state of this tenant.
     * @param value Value to set for the partnerState property.
     * @return a void
     */
    public void setPartnerState(@javax.annotation.Nullable final DeviceManagementPartnerTenantState value) {
        this._partnerState = value;
    }
    /**
     * Sets the singleTenantAppId property value. Partner Single tenant App id
     * @param value Value to set for the singleTenantAppId property.
     * @return a void
     */
    public void setSingleTenantAppId(@javax.annotation.Nullable final String value) {
        this._singleTenantAppId = value;
    }
    /**
     * Sets the whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime property value. DateTime in UTC when PartnerDevices will be marked as NonCompliant
     * @param value Value to set for the whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime property.
     * @return a void
     */
    public void setWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime = value;
    }
    /**
     * Sets the whenPartnerDevicesWillBeRemovedDateTime property value. DateTime in UTC when PartnerDevices will be removed
     * @param value Value to set for the whenPartnerDevicesWillBeRemovedDateTime property.
     * @return a void
     */
    public void setWhenPartnerDevicesWillBeRemovedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._whenPartnerDevicesWillBeRemovedDateTime = value;
    }
}
