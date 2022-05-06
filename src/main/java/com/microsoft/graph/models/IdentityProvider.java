package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentityProvider extends Entity implements Parsable {
    /** The client ID for the application obtained when registering the application with the identity provider. This is a required field.  Required. Not nullable.  */
    private String _clientId;
    /** The client secret for the application obtained when registering the application with the identity provider. This is write-only. A read operation will return ****. This is a required field. Required. Not nullable.  */
    private String _clientSecret;
    /** The display name of the identity provider. Not nullable.  */
    private String _name;
    /** The identity provider type is a required field. For B2B scenario: Google, Facebook. For B2C scenario: Microsoft, Google, Amazon, LinkedIn, Facebook, GitHub, Twitter, Weibo,QQ, WeChat, OpenIDConnect. Not nullable.  */
    private String _type;
    /**
     * Instantiates a new identityProvider and sets the default values.
     * @return a void
     */
    public IdentityProvider() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identityProvider
     */
    @javax.annotation.Nonnull
    public static IdentityProvider createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityProvider();
    }
    /**
     * Gets the clientId property value. The client ID for the application obtained when registering the application with the identity provider. This is a required field.  Required. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientId() {
        return this._clientId;
    }
    /**
     * Gets the clientSecret property value. The client secret for the application obtained when registering the application with the identity provider. This is write-only. A read operation will return ****. This is a required field. Required. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientSecret() {
        return this._clientSecret;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IdentityProvider currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("clientId", (n) -> { currentObject.setClientId(n.getStringValue()); });
            this.put("clientSecret", (n) -> { currentObject.setClientSecret(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the name property value. The display name of the identity provider. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the type property value. The identity provider type is a required field. For B2B scenario: Google, Facebook. For B2C scenario: Microsoft, Google, Amazon, LinkedIn, Facebook, GitHub, Twitter, Weibo,QQ, WeChat, OpenIDConnect. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("clientSecret", this.getClientSecret());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the clientId property value. The client ID for the application obtained when registering the application with the identity provider. This is a required field.  Required. Not nullable.
     * @param value Value to set for the clientId property.
     * @return a void
     */
    public void setClientId(@javax.annotation.Nullable final String value) {
        this._clientId = value;
    }
    /**
     * Sets the clientSecret property value. The client secret for the application obtained when registering the application with the identity provider. This is write-only. A read operation will return ****. This is a required field. Required. Not nullable.
     * @param value Value to set for the clientSecret property.
     * @return a void
     */
    public void setClientSecret(@javax.annotation.Nullable final String value) {
        this._clientSecret = value;
    }
    /**
     * Sets the name property value. The display name of the identity provider. Not nullable.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the type property value. The identity provider type is a required field. For B2B scenario: Google, Facebook. For B2C scenario: Microsoft, Google, Amazon, LinkedIn, Facebook, GitHub, Twitter, Weibo,QQ, WeChat, OpenIDConnect. Not nullable.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
