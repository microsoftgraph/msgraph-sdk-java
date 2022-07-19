package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosVppAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /** Whether or not to use device licensing. */
    private Boolean _useDeviceLicensing;
    /** The VPN Configuration Id to apply for this app. */
    private String _vpnConfigurationId;
    /**
     * Instantiates a new IosVppAppAssignmentSettings and sets the default values.
     * @return a void
     */
    public IosVppAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.iosVppAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosVppAppAssignmentSettings
     */
    @javax.annotation.Nonnull
    public static IosVppAppAssignmentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVppAppAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosVppAppAssignmentSettings currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("useDeviceLicensing", (n) -> { currentObject.setUseDeviceLicensing(n.getBooleanValue()); });
            this.put("vpnConfigurationId", (n) -> { currentObject.setVpnConfigurationId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the useDeviceLicensing property value. Whether or not to use device licensing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseDeviceLicensing() {
        return this._useDeviceLicensing;
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
    public void setUseDeviceLicensing(@javax.annotation.Nullable final Boolean value) {
        this._useDeviceLicensing = value;
    }
    /**
     * Sets the vpnConfigurationId property value. The VPN Configuration Id to apply for this app.
     * @param value Value to set for the vpnConfigurationId property.
     * @return a void
     */
    public void setVpnConfigurationId(@javax.annotation.Nullable final String value) {
        this._vpnConfigurationId = value;
    }
}
