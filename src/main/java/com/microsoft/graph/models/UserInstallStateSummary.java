package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for the installation state summary for a user.
 */
public class UserInstallStateSummary extends Entity implements Parsable {
    /**
     * The install state of the eBook.
     */
    private java.util.List<DeviceInstallState> deviceStates;
    /**
     * Failed Device Count.
     */
    private Integer failedDeviceCount;
    /**
     * Installed Device Count.
     */
    private Integer installedDeviceCount;
    /**
     * Not installed device count.
     */
    private Integer notInstalledDeviceCount;
    /**
     * User name.
     */
    private String userName;
    /**
     * Instantiates a new userInstallStateSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserInstallStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userInstallStateSummary
     */
    @javax.annotation.Nonnull
    public static UserInstallStateSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserInstallStateSummary();
    }
    /**
     * Gets the deviceStates property value. The install state of the eBook.
     * @return a deviceInstallState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceInstallState> getDeviceStates() {
        return this.deviceStates;
    }
    /**
     * Gets the failedDeviceCount property value. Failed Device Count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this.failedDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceStates", (n) -> { this.setDeviceStates(n.getCollectionOfObjectValues(DeviceInstallState::createFromDiscriminatorValue)); });
        deserializerMap.put("failedDeviceCount", (n) -> { this.setFailedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("installedDeviceCount", (n) -> { this.setInstalledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("notInstalledDeviceCount", (n) -> { this.setNotInstalledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installedDeviceCount property value. Installed Device Count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInstalledDeviceCount() {
        return this.installedDeviceCount;
    }
    /**
     * Gets the notInstalledDeviceCount property value. Not installed device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotInstalledDeviceCount() {
        return this.notInstalledDeviceCount;
    }
    /**
     * Gets the userName property value. User name.
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
        writer.writeCollectionOfObjectValues("deviceStates", this.getDeviceStates());
        writer.writeIntegerValue("failedDeviceCount", this.getFailedDeviceCount());
        writer.writeIntegerValue("installedDeviceCount", this.getInstalledDeviceCount());
        writer.writeIntegerValue("notInstalledDeviceCount", this.getNotInstalledDeviceCount());
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the deviceStates property value. The install state of the eBook.
     * @param value Value to set for the deviceStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStates(@javax.annotation.Nullable final java.util.List<DeviceInstallState> value) {
        this.deviceStates = value;
    }
    /**
     * Sets the failedDeviceCount property value. Failed Device Count.
     * @param value Value to set for the failedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.failedDeviceCount = value;
    }
    /**
     * Sets the installedDeviceCount property value. Installed Device Count.
     * @param value Value to set for the installedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstalledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.installedDeviceCount = value;
    }
    /**
     * Sets the notInstalledDeviceCount property value. Not installed device count.
     * @param value Value to set for the notInstalledDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotInstalledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.notInstalledDeviceCount = value;
    }
    /**
     * Sets the userName property value. User name.
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this.userName = value;
    }
}
