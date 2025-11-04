package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AkamaiWebApplicationFirewallProvider extends WebApplicationFirewallProvider implements Parsable {
    /**
     * Instantiates a new {@link AkamaiWebApplicationFirewallProvider} and sets the default values.
     */
    public AkamaiWebApplicationFirewallProvider() {
        super();
        this.setOdataType("#microsoft.graph.akamaiWebApplicationFirewallProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AkamaiWebApplicationFirewallProvider}
     */
    @jakarta.annotation.Nonnull
    public static AkamaiWebApplicationFirewallProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AkamaiWebApplicationFirewallProvider();
    }
    /**
     * Gets the accessToken property value. The accessToken property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessToken() {
        return this.backingStore.get("accessToken");
    }
    /**
     * Gets the clientSecret property value. The clientSecret property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientSecret() {
        return this.backingStore.get("clientSecret");
    }
    /**
     * Gets the clientToken property value. The clientToken property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientToken() {
        return this.backingStore.get("clientToken");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessToken", (n) -> { this.setAccessToken(n.getStringValue()); });
        deserializerMap.put("clientSecret", (n) -> { this.setClientSecret(n.getStringValue()); });
        deserializerMap.put("clientToken", (n) -> { this.setClientToken(n.getStringValue()); });
        deserializerMap.put("hostPrefix", (n) -> { this.setHostPrefix(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hostPrefix property value. The hostPrefix property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHostPrefix() {
        return this.backingStore.get("hostPrefix");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accessToken", this.getAccessToken());
        writer.writeStringValue("clientSecret", this.getClientSecret());
        writer.writeStringValue("clientToken", this.getClientToken());
        writer.writeStringValue("hostPrefix", this.getHostPrefix());
    }
    /**
     * Sets the accessToken property value. The accessToken property
     * @param value Value to set for the accessToken property.
     */
    public void setAccessToken(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessToken", value);
    }
    /**
     * Sets the clientSecret property value. The clientSecret property
     * @param value Value to set for the clientSecret property.
     */
    public void setClientSecret(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientSecret", value);
    }
    /**
     * Sets the clientToken property value. The clientToken property
     * @param value Value to set for the clientToken property.
     */
    public void setClientToken(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientToken", value);
    }
    /**
     * Sets the hostPrefix property value. The hostPrefix property
     * @param value Value to set for the hostPrefix property.
     */
    public void setHostPrefix(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hostPrefix", value);
    }
}
