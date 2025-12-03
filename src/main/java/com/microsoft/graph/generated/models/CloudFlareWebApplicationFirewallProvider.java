package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudFlareWebApplicationFirewallProvider extends WebApplicationFirewallProvider implements Parsable {
    /**
     * Instantiates a new {@link CloudFlareWebApplicationFirewallProvider} and sets the default values.
     */
    public CloudFlareWebApplicationFirewallProvider() {
        super();
        this.setOdataType("#microsoft.graph.cloudFlareWebApplicationFirewallProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudFlareWebApplicationFirewallProvider}
     */
    @jakarta.annotation.Nonnull
    public static CloudFlareWebApplicationFirewallProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudFlareWebApplicationFirewallProvider();
    }
    /**
     * Gets the apiToken property value. Cloudflare API token or credential used by Microsoft services to authenticate to the Cloudflare account. Contact your Cloudflare Customer Success Manager for assistance with your apitoken.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApiToken() {
        return this.backingStore.get("apiToken");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("apiToken", (n) -> { this.setApiToken(n.getStringValue()); });
        deserializerMap.put("zoneId", (n) -> { this.setZoneId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the zoneId property value. Default Cloudflare Zone ID associated with this provider configuration. This ID identifies the DNS zone in Cloudflare that is commonly used for verification and configuration operations for the provider.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getZoneId() {
        return this.backingStore.get("zoneId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("apiToken", this.getApiToken());
        writer.writeStringValue("zoneId", this.getZoneId());
    }
    /**
     * Sets the apiToken property value. Cloudflare API token or credential used by Microsoft services to authenticate to the Cloudflare account. Contact your Cloudflare Customer Success Manager for assistance with your apitoken.
     * @param value Value to set for the apiToken property.
     */
    public void setApiToken(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("apiToken", value);
    }
    /**
     * Sets the zoneId property value. Default Cloudflare Zone ID associated with this provider configuration. This ID identifies the DNS zone in Cloudflare that is commonly used for verification and configuration operations for the provider.
     * @param value Value to set for the zoneId property.
     */
    public void setZoneId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("zoneId", value);
    }
}
