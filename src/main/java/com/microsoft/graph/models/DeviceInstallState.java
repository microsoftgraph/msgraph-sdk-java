package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for the installation state for a device.
 */
public class DeviceInstallState extends Entity implements Parsable {
    /** Device Id. */
    private String deviceId;
    /** Device name. */
    private String deviceName;
    /** The error code for install failures. */
    private String errorCode;
    /** Possible values for install state. */
    private InstallState installState;
    /** Last sync date and time. */
    private OffsetDateTime lastSyncDateTime;
    /** OS Description. */
    private String osDescription;
    /** OS Version. */
    private String osVersion;
    /** Device User Name. */
    private String userName;
    /**
     * Instantiates a new deviceInstallState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceInstallState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceInstallState
     */
    @javax.annotation.Nonnull
    public static DeviceInstallState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceInstallState();
    }
    /**
     * Gets the deviceId property value. Device Id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceName property value. Device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the errorCode property value. The error code for install failures.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("installState", (n) -> { this.setInstallState(n.getEnumValue(InstallState.class)); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("osDescription", (n) -> { this.setOsDescription(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installState property value. Possible values for install state.
     * @return a InstallState
     */
    @javax.annotation.Nullable
    public InstallState getInstallState() {
        return this.installState;
    }
    /**
     * Gets the lastSyncDateTime property value. Last sync date and time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the osDescription property value. OS Description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsDescription() {
        return this.osDescription;
    }
    /**
     * Gets the osVersion property value. OS Version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the userName property value. Device User Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this.userName;
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
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeEnumValue("installState", this.getInstallState());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeStringValue("osDescription", this.getOsDescription());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the deviceId property value. Device Id.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceName property value. Device name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the errorCode property value. The error code for install failures.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final String value) {
        this.errorCode = value;
    }
    /**
     * Sets the installState property value. Possible values for install state.
     * @param value Value to set for the installState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallState(@javax.annotation.Nullable final InstallState value) {
        this.installState = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Last sync date and time.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the osDescription property value. OS Description.
     * @param value Value to set for the osDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsDescription(@javax.annotation.Nullable final String value) {
        this.osDescription = value;
    }
    /**
     * Sets the osVersion property value. OS Version.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the userName property value. Device User Name.
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this.userName = value;
    }
}
