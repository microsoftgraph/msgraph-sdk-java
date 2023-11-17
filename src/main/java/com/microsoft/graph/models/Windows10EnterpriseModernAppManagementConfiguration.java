package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows10 Enterprise Modern App Management Configuration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10EnterpriseModernAppManagementConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new Windows10EnterpriseModernAppManagementConfiguration and sets the default values.
     */
    public Windows10EnterpriseModernAppManagementConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10EnterpriseModernAppManagementConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10EnterpriseModernAppManagementConfiguration
     */
    @jakarta.annotation.Nonnull
    public static Windows10EnterpriseModernAppManagementConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EnterpriseModernAppManagementConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("uninstallBuiltInApps", (n) -> { this.setUninstallBuiltInApps(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the uninstallBuiltInApps property value. Indicates whether or not to uninstall a fixed list of built-in Windows apps.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUninstallBuiltInApps() {
        return this.backingStore.get("uninstallBuiltInApps");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("uninstallBuiltInApps", this.getUninstallBuiltInApps());
    }
    /**
     * Sets the uninstallBuiltInApps property value. Indicates whether or not to uninstall a fixed list of built-in Windows apps.
     * @param value Value to set for the uninstallBuiltInApps property.
     */
    public void setUninstallBuiltInApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("uninstallBuiltInApps", value);
    }
}
