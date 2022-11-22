package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10EnterpriseModernAppManagementConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not to uninstall a fixed list of built-in Windows apps. */
    private Boolean _uninstallBuiltInApps;
    /**
     * Instantiates a new Windows10EnterpriseModernAppManagementConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows10EnterpriseModernAppManagementConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10EnterpriseModernAppManagementConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10EnterpriseModernAppManagementConfiguration
     */
    @javax.annotation.Nonnull
    public static Windows10EnterpriseModernAppManagementConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EnterpriseModernAppManagementConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("uninstallBuiltInApps", (n) -> { this.setUninstallBuiltInApps(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the uninstallBuiltInApps property value. Indicates whether or not to uninstall a fixed list of built-in Windows apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUninstallBuiltInApps() {
        return this._uninstallBuiltInApps;
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
        writer.writeBooleanValue("uninstallBuiltInApps", this.getUninstallBuiltInApps());
    }
    /**
     * Sets the uninstallBuiltInApps property value. Indicates whether or not to uninstall a fixed list of built-in Windows apps.
     * @param value Value to set for the uninstallBuiltInApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUninstallBuiltInApps(@javax.annotation.Nullable final Boolean value) {
        this._uninstallBuiltInApps = value;
    }
}
