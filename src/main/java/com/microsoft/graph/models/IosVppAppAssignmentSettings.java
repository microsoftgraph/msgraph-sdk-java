package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign an iOS VPP mobile app to a group.
 */
public class IosVppAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * Whether or not to use device licensing.
     */
    private Boolean useDeviceLicensing;
    /**
     * The VPN Configuration Id to apply for this app.
     */
    private String vpnConfigurationId;
    /**
     * Instantiates a new iosVppAppAssignmentSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosVppAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.iosVppAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosVppAppAssignmentSettings
     */
    @javax.annotation.Nonnull
    public static IosVppAppAssignmentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVppAppAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("useDeviceLicensing", (n) -> { this.setUseDeviceLicensing(n.getBooleanValue()); });
        deserializerMap.put("vpnConfigurationId", (n) -> { this.setVpnConfigurationId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the useDeviceLicensing property value. Whether or not to use device licensing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseDeviceLicensing() {
        return this.useDeviceLicensing;
    }
    /**
     * Gets the vpnConfigurationId property value. The VPN Configuration Id to apply for this app.
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
        writer.writeBooleanValue("useDeviceLicensing", this.getUseDeviceLicensing());
        writer.writeStringValue("vpnConfigurationId", this.getVpnConfigurationId());
    }
    /**
     * Sets the useDeviceLicensing property value. Whether or not to use device licensing.
     * @param value Value to set for the useDeviceLicensing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseDeviceLicensing(@javax.annotation.Nullable final Boolean value) {
        this.useDeviceLicensing = value;
    }
    /**
     * Sets the vpnConfigurationId property value. The VPN Configuration Id to apply for this app.
     * @param value Value to set for the vpnConfigurationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVpnConfigurationId(@javax.annotation.Nullable final String value) {
        this.vpnConfigurationId = value;
    }
}
