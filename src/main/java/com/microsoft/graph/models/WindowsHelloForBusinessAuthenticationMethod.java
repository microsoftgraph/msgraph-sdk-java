package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsHelloForBusinessAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /** The date and time that this Windows Hello for Business key was registered.  */
    private OffsetDateTime _createdDateTime;
    /** The registered device on which this Windows Hello for Business key resides. Supports $expand. When you get a user's Windows Hello for Business registration information, this property is returned only on a single GET and when you specify ?$expand. For example, GET /users/admin@contoso.com/authentication/windowsHelloForBusinessMethods/_jpuR-TGZtk6aQCLF3BQjA2?$expand=device.  */
    private Device _device;
    /** The name of the device on which Windows Hello for Business is registered  */
    private String _displayName;
    /** Key strength of this Windows Hello for Business key. Possible values are: normal, weak, unknown.  */
    private AuthenticationMethodKeyStrength _keyStrength;
    /**
     * Instantiates a new windowsHelloForBusinessAuthenticationMethod and sets the default values.
     * @return a void
     */
    public WindowsHelloForBusinessAuthenticationMethod() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsHelloForBusinessAuthenticationMethod
     */
    @javax.annotation.Nonnull
    public static WindowsHelloForBusinessAuthenticationMethod createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsHelloForBusinessAuthenticationMethod();
    }
    /**
     * Gets the createdDateTime property value. The date and time that this Windows Hello for Business key was registered.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the device property value. The registered device on which this Windows Hello for Business key resides. Supports $expand. When you get a user's Windows Hello for Business registration information, this property is returned only on a single GET and when you specify ?$expand. For example, GET /users/admin@contoso.com/authentication/windowsHelloForBusinessMethods/_jpuR-TGZtk6aQCLF3BQjA2?$expand=device.
     * @return a device
     */
    @javax.annotation.Nullable
    public Device getDevice() {
        return this._device;
    }
    /**
     * Gets the displayName property value. The name of the device on which Windows Hello for Business is registered
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
        final WindowsHelloForBusinessAuthenticationMethod currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("device", (n) -> { currentObject.setDevice(n.getObjectValue(Device::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("keyStrength", (n) -> { currentObject.setKeyStrength(n.getEnumValue(AuthenticationMethodKeyStrength.class)); });
        }};
    }
    /**
     * Gets the keyStrength property value. Key strength of this Windows Hello for Business key. Possible values are: normal, weak, unknown.
     * @return a authenticationMethodKeyStrength
     */
    @javax.annotation.Nullable
    public AuthenticationMethodKeyStrength getKeyStrength() {
        return this._keyStrength;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("device", this.getDevice());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("keyStrength", this.getKeyStrength());
    }
    /**
     * Sets the createdDateTime property value. The date and time that this Windows Hello for Business key was registered.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the device property value. The registered device on which this Windows Hello for Business key resides. Supports $expand. When you get a user's Windows Hello for Business registration information, this property is returned only on a single GET and when you specify ?$expand. For example, GET /users/admin@contoso.com/authentication/windowsHelloForBusinessMethods/_jpuR-TGZtk6aQCLF3BQjA2?$expand=device.
     * @param value Value to set for the device property.
     * @return a void
     */
    public void setDevice(@javax.annotation.Nullable final Device value) {
        this._device = value;
    }
    /**
     * Sets the displayName property value. The name of the device on which Windows Hello for Business is registered
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the keyStrength property value. Key strength of this Windows Hello for Business key. Possible values are: normal, weak, unknown.
     * @param value Value to set for the keyStrength property.
     * @return a void
     */
    public void setKeyStrength(@javax.annotation.Nullable final AuthenticationMethodKeyStrength value) {
        this._keyStrength = value;
    }
}
