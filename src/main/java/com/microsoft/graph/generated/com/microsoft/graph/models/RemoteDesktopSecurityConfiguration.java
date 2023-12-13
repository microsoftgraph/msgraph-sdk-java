package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RemoteDesktopSecurityConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new RemoteDesktopSecurityConfiguration and sets the default values.
     */
    public RemoteDesktopSecurityConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RemoteDesktopSecurityConfiguration
     */
    @jakarta.annotation.Nonnull
    public static RemoteDesktopSecurityConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteDesktopSecurityConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isRemoteDesktopProtocolEnabled", (n) -> { this.setIsRemoteDesktopProtocolEnabled(n.getBooleanValue()); });
        deserializerMap.put("targetDeviceGroups", (n) -> { this.setTargetDeviceGroups(n.getCollectionOfObjectValues(TargetDeviceGroup::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isRemoteDesktopProtocolEnabled property value. Determines if Microsoft Entra ID RDS authentication protocol for RDP is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRemoteDesktopProtocolEnabled() {
        return this.backingStore.get("isRemoteDesktopProtocolEnabled");
    }
    /**
     * Gets the targetDeviceGroups property value. The collection of target device groups that are associated with the RDS security configuration that will be enabled for SSO when a client connects to the target device over RDP using the new Microsoft Entra ID RDS authentication protocol.
     * @return a java.util.List<TargetDeviceGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TargetDeviceGroup> getTargetDeviceGroups() {
        return this.backingStore.get("targetDeviceGroups");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isRemoteDesktopProtocolEnabled", this.getIsRemoteDesktopProtocolEnabled());
        writer.writeCollectionOfObjectValues("targetDeviceGroups", this.getTargetDeviceGroups());
    }
    /**
     * Sets the isRemoteDesktopProtocolEnabled property value. Determines if Microsoft Entra ID RDS authentication protocol for RDP is enabled.
     * @param value Value to set for the isRemoteDesktopProtocolEnabled property.
     */
    public void setIsRemoteDesktopProtocolEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRemoteDesktopProtocolEnabled", value);
    }
    /**
     * Sets the targetDeviceGroups property value. The collection of target device groups that are associated with the RDS security configuration that will be enabled for SSO when a client connects to the target device over RDP using the new Microsoft Entra ID RDS authentication protocol.
     * @param value Value to set for the targetDeviceGroups property.
     */
    public void setTargetDeviceGroups(@jakarta.annotation.Nullable final java.util.List<TargetDeviceGroup> value) {
        this.backingStore.set("targetDeviceGroups", value);
    }
}
