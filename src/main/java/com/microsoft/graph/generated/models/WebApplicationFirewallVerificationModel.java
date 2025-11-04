package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WebApplicationFirewallVerificationModel extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WebApplicationFirewallVerificationModel} and sets the default values.
     */
    public WebApplicationFirewallVerificationModel() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WebApplicationFirewallVerificationModel}
     */
    @jakarta.annotation.Nonnull
    public static WebApplicationFirewallVerificationModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebApplicationFirewallVerificationModel();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getObjectValue(WebApplicationFirewallProvider::createFromDiscriminatorValue)); });
        deserializerMap.put("providerType", (n) -> { this.setProviderType(n.getEnumValue(WebApplicationFirewallProviderType::forValue)); });
        deserializerMap.put("verificationResult", (n) -> { this.setVerificationResult(n.getObjectValue(WebApplicationFirewallVerificationResult::createFromDiscriminatorValue)); });
        deserializerMap.put("verifiedDetails", (n) -> { this.setVerifiedDetails(n.getObjectValue(WebApplicationFirewallVerifiedDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("verifiedHost", (n) -> { this.setVerifiedHost(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the provider property value. The provider property
     * @return a {@link WebApplicationFirewallProvider}
     */
    @jakarta.annotation.Nullable
    public WebApplicationFirewallProvider getProvider() {
        return this.backingStore.get("provider");
    }
    /**
     * Gets the providerType property value. The providerType property
     * @return a {@link WebApplicationFirewallProviderType}
     */
    @jakarta.annotation.Nullable
    public WebApplicationFirewallProviderType getProviderType() {
        return this.backingStore.get("providerType");
    }
    /**
     * Gets the verificationResult property value. The verificationResult property
     * @return a {@link WebApplicationFirewallVerificationResult}
     */
    @jakarta.annotation.Nullable
    public WebApplicationFirewallVerificationResult getVerificationResult() {
        return this.backingStore.get("verificationResult");
    }
    /**
     * Gets the verifiedDetails property value. The verifiedDetails property
     * @return a {@link WebApplicationFirewallVerifiedDetails}
     */
    @jakarta.annotation.Nullable
    public WebApplicationFirewallVerifiedDetails getVerifiedDetails() {
        return this.backingStore.get("verifiedDetails");
    }
    /**
     * Gets the verifiedHost property value. The verifiedHost property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVerifiedHost() {
        return this.backingStore.get("verifiedHost");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("provider", this.getProvider());
        writer.writeEnumValue("providerType", this.getProviderType());
        writer.writeObjectValue("verificationResult", this.getVerificationResult());
        writer.writeObjectValue("verifiedDetails", this.getVerifiedDetails());
        writer.writeStringValue("verifiedHost", this.getVerifiedHost());
    }
    /**
     * Sets the provider property value. The provider property
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final WebApplicationFirewallProvider value) {
        this.backingStore.set("provider", value);
    }
    /**
     * Sets the providerType property value. The providerType property
     * @param value Value to set for the providerType property.
     */
    public void setProviderType(@jakarta.annotation.Nullable final WebApplicationFirewallProviderType value) {
        this.backingStore.set("providerType", value);
    }
    /**
     * Sets the verificationResult property value. The verificationResult property
     * @param value Value to set for the verificationResult property.
     */
    public void setVerificationResult(@jakarta.annotation.Nullable final WebApplicationFirewallVerificationResult value) {
        this.backingStore.set("verificationResult", value);
    }
    /**
     * Sets the verifiedDetails property value. The verifiedDetails property
     * @param value Value to set for the verifiedDetails property.
     */
    public void setVerifiedDetails(@jakarta.annotation.Nullable final WebApplicationFirewallVerifiedDetails value) {
        this.backingStore.set("verifiedDetails", value);
    }
    /**
     * Sets the verifiedHost property value. The verifiedHost property
     * @param value Value to set for the verifiedHost property.
     */
    public void setVerifiedHost(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("verifiedHost", value);
    }
}
