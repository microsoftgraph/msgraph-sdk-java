package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosLobAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /** The VPN Configuration Id to apply for this app. */
    private String _vpnConfigurationId;
    /**
     * Instantiates a new IosLobAppAssignmentSettings and sets the default values.
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
     * @return a IosLobAppAssignmentSettings
     */
    @javax.annotation.Nonnull
    public static IosLobAppAssignmentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosLobAppAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosLobAppAssignmentSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("vpnConfigurationId", (n) -> { currentObject.setVpnConfigurationId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the vpnConfigurationId property value. The VPN Configuration Id to apply for this app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVpnConfigurationId() {
        return this._vpnConfigurationId;
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
        writer.writeStringValue("vpnConfigurationId", this.getVpnConfigurationId());
    }
    /**
     * Sets the vpnConfigurationId property value. The VPN Configuration Id to apply for this app.
     * @param value Value to set for the vpnConfigurationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVpnConfigurationId(@javax.annotation.Nullable final String value) {
        this._vpnConfigurationId = value;
    }
}
