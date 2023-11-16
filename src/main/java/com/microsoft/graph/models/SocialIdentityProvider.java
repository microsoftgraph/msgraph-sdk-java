package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SocialIdentityProvider extends IdentityProviderBase implements Parsable {
    /**
     * Instantiates a new SocialIdentityProvider and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static SocialIdentityProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SocialIdentityProvider();
    }
    /**
     * Gets the clientId property value. The identifier for the client application obtained when registering the application with the identity provider. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.BackingStore.get("clientId");
    }
    /**
     * Gets the clientSecret property value. The client secret for the application that is obtained when the application is registered with the identity provider. This is write-only. A read operation returns . Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientSecret() {
        return this.BackingStore.get("clientSecret");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clientId", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("clientSecret", (n) -> { this.setClientSecret(n.getStringValue()); });
        deserializerMap.put("identityProviderType", (n) -> { this.setIdentityProviderType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityProviderType property value. For a B2B scenario, possible values: Google, Facebook. For a B2C scenario, possible values: Microsoft, Google, Amazon, LinkedIn, Facebook, GitHub, Twitter, Weibo, QQ, WeChat. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentityProviderType() {
        return this.BackingStore.get("identityProviderType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("clientSecret", this.getClientSecret());
        writer.writeStringValue("identityProviderType", this.getIdentityProviderType());
    }
    /**
     * Sets the clientId property value. The identifier for the client application obtained when registering the application with the identity provider. Required.
     * @param value Value to set for the clientId property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("clientId", value);
    }
    /**
     * Sets the clientSecret property value. The client secret for the application that is obtained when the application is registered with the identity provider. This is write-only. A read operation returns . Required.
     * @param value Value to set for the clientSecret property.
     */
    public void setClientSecret(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("clientSecret", value);
    }
    /**
     * Sets the identityProviderType property value. For a B2B scenario, possible values: Google, Facebook. For a B2C scenario, possible values: Microsoft, Google, Amazon, LinkedIn, Facebook, GitHub, Twitter, Weibo, QQ, WeChat. Required.
     * @param value Value to set for the identityProviderType property.
     */
    public void setIdentityProviderType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("identityProviderType", value);
    }
}
