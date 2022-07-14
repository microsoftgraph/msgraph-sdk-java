package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Pkcs12Certificate extends ApiAuthenticationConfigurationBase implements Parsable {
    /** This is the password for the pfx file. Required. If no password is used, must still provide a value of ''. */
    private String _password;
    /** This is the field for sending pfx content. The value should be a base-64 encoded version of the actual certificate content. Required. */
    private String _pkcs12Value;
    /**
     * Instantiates a new Pkcs12Certificate and sets the default values.
     * @return a void
     */
    public Pkcs12Certificate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Pkcs12Certificate
     */
    @javax.annotation.Nonnull
    public static Pkcs12Certificate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Pkcs12Certificate();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Pkcs12Certificate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("password", (n) -> { currentObject.setPassword(n.getStringValue()); });
            this.put("pkcs12Value", (n) -> { currentObject.setPkcs12Value(n.getStringValue()); });
        }};
    }
    /**
     * Gets the password property value. This is the password for the pfx file. Required. If no password is used, must still provide a value of ''.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPassword() {
        return this._password;
    }
    /**
     * Gets the pkcs12Value property value. This is the field for sending pfx content. The value should be a base-64 encoded version of the actual certificate content. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPkcs12Value() {
        return this._pkcs12Value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("password", this.getPassword());
        writer.writeStringValue("pkcs12Value", this.getPkcs12Value());
    }
    /**
     * Sets the password property value. This is the password for the pfx file. Required. If no password is used, must still provide a value of ''.
     * @param value Value to set for the password property.
     * @return a void
     */
    public void setPassword(@javax.annotation.Nullable final String value) {
        this._password = value;
    }
    /**
     * Sets the pkcs12Value property value. This is the field for sending pfx content. The value should be a base-64 encoded version of the actual certificate content. Required.
     * @param value Value to set for the pkcs12Value property.
     * @return a void
     */
    public void setPkcs12Value(@javax.annotation.Nullable final String value) {
        this._pkcs12Value = value;
    }
}
