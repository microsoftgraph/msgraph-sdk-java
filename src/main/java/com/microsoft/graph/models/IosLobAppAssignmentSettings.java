package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign an iOS LOB mobile app to a group.
 */
public class IosLobAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * When TRUE, indicates that the app can be uninstalled by the user. When FALSE, indicates that the app cannot be uninstalled by the user. By default, this property is set to null which internally is treated as TRUE.
     */
    private Boolean isRemovable;
    /**
     * When TRUE, indicates that the app should be uninstalled when the device is removed from Intune. When FALSE, indicates that the app will not be uninstalled when the device is removed from Intune. By default, property is set to null which internally is treated as TRUE.
     */
    private Boolean uninstallOnDeviceRemoval;
    /**
     * This is the unique identifier (Id) of the VPN Configuration to apply to the app.
     */
    private String vpnConfigurationId;
    /**
     * Instantiates a new iosLobAppAssignmentSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosLobAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.iosLobAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosLobAppAssignmentSettings
     */
    @javax.annotation.Nonnull
    public static IosLobAppAssignmentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosLobAppAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isRemovable", (n) -> { this.setIsRemovable(n.getBooleanValue()); });
        deserializerMap.put("uninstallOnDeviceRemoval", (n) -> { this.setUninstallOnDeviceRemoval(n.getBooleanValue()); });
        deserializerMap.put("vpnConfigurationId", (n) -> { this.setVpnConfigurationId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRemovable property value. When TRUE, indicates that the app can be uninstalled by the user. When FALSE, indicates that the app cannot be uninstalled by the user. By default, this property is set to null which internally is treated as TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRemovable() {
        return this.isRemovable;
    }
    /**
     * Gets the uninstallOnDeviceRemoval property value. When TRUE, indicates that the app should be uninstalled when the device is removed from Intune. When FALSE, indicates that the app will not be uninstalled when the device is removed from Intune. By default, property is set to null which internally is treated as TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUninstallOnDeviceRemoval() {
        return this.uninstallOnDeviceRemoval;
    }
    /**
     * Gets the vpnConfigurationId property value. This is the unique identifier (Id) of the VPN Configuration to apply to the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVpnConfigurationId() {
        return this.vpnConfigurationId;
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
        writer.writeBooleanValue("isRemovable", this.getIsRemovable());
        writer.writeBooleanValue("uninstallOnDeviceRemoval", this.getUninstallOnDeviceRemoval());
        writer.writeStringValue("vpnConfigurationId", this.getVpnConfigurationId());
    }
    /**
     * Sets the isRemovable property value. When TRUE, indicates that the app can be uninstalled by the user. When FALSE, indicates that the app cannot be uninstalled by the user. By default, this property is set to null which internally is treated as TRUE.
     * @param value Value to set for the isRemovable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRemovable(@javax.annotation.Nullable final Boolean value) {
        this.isRemovable = value;
    }
    /**
     * Sets the uninstallOnDeviceRemoval property value. When TRUE, indicates that the app should be uninstalled when the device is removed from Intune. When FALSE, indicates that the app will not be uninstalled when the device is removed from Intune. By default, property is set to null which internally is treated as TRUE.
     * @param value Value to set for the uninstallOnDeviceRemoval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUninstallOnDeviceRemoval(@javax.annotation.Nullable final Boolean value) {
        this.uninstallOnDeviceRemoval = value;
    }
    /**
     * Sets the vpnConfigurationId property value. This is the unique identifier (Id) of the VPN Configuration to apply to the app.
     * @param value Value to set for the vpnConfigurationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVpnConfigurationId(@javax.annotation.Nullable final String value) {
        this.vpnConfigurationId = value;
    }
}
