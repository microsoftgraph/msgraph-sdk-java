package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SocialIdentityProvider extends IdentityProviderBase implements Parsable {
    /** The client identifier for the application obtained when registering the application with the identity provider. Required. */
    private String _clientId;
    /** The client secret for the application that is obtained when the application is registered with the identity provider. This is write-only. A read operation returns ****. Required. */
    private String _clientSecret;
    /** For a B2B scenario, possible values: Google, Facebook. For a B2C scenario, possible values: Microsoft, Google, Amazon, LinkedIn, Facebook, GitHub, Twitter, Weibo, QQ, WeChat. Required. */
    private String _identityProviderType;
    /**
     * Instantiates a new SocialIdentityProvider and sets the default values.
     * @return a void
     */
    public SocialIdentityProvider() {
        super();
        this.setOdataType("#microsoft.graph.socialIdentityProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SocialIdentityProvider
     */
    @javax.annotation.Nonnull
    public static SocialIdentityProvider createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SocialIdentityProvider();
    }
    /**
     * Gets the clientId property value. The client identifier for the application obtained when registering the application with the identity provider. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientId() {
        return this._clientId;
    }
    /**
     * Gets the clientSecret property value. The client secret for the application that is obtained when the application is registered with the identity provider. This is write-only. A read operation returns ****. Required.
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
        final SocialIdentityProvider currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("clientId", (n) -> { currentObject.setClientId(n.getStringValue()); });
            this.put("clientSecret", (n) -> { currentObject.setClientSecret(n.getStringValue()); });
            this.put("identityProviderType", (n) -> { currentObject.setIdentityProviderType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the identityProviderType property value. For a B2B scenario, possible values: Google, Facebook. For a B2C scenario, possible values: Microsoft, Google, Amazon, LinkedIn, Facebook, GitHub, Twitter, Weibo, QQ, WeChat. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityProviderType() {
        return this._identityProviderType;
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
        writer.writeStringValue("identityProviderType", this.getIdentityProviderType());
    }
    /**
     * Sets the clientId property value. The client identifier for the application obtained when registering the application with the identity provider. Required.
     * @param value Value to set for the clientId property.
     * @return a void
     */
    public void setClientId(@javax.annotation.Nullable final String value) {
        this._clientId = value;
    }
    /**
     * Sets the clientSecret property value. The client secret for the application that is obtained when the application is registered with the identity provider. This is write-only. A read operation returns ****. Required.
     * @param value Value to set for the clientSecret property.
     * @return a void
     */
    public void setClientSecret(@javax.annotation.Nullable final String value) {
        this._clientSecret = value;
    }
    /**
     * Sets the identityProviderType property value. For a B2B scenario, possible values: Google, Facebook. For a B2C scenario, possible values: Microsoft, Google, Amazon, LinkedIn, Facebook, GitHub, Twitter, Weibo, QQ, WeChat. Required.
     * @param value Value to set for the identityProviderType property.
     * @return a void
     */
    public void setIdentityProviderType(@javax.annotation.Nullable final String value) {
        this._identityProviderType = value;
    }
}
