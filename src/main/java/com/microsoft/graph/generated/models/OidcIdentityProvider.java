package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OidcIdentityProvider extends IdentityProviderBase implements Parsable {
    /**
     * Instantiates a new {@link OidcIdentityProvider} and sets the default values.
     */
    public OidcIdentityProvider() {
        super();
        this.setOdataType("#microsoft.graph.oidcIdentityProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OidcIdentityProvider}
     */
    @jakarta.annotation.Nonnull
    public static OidcIdentityProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OidcIdentityProvider();
    }
    /**
     * Gets the clientAuthentication property value. The clientAuthentication property
     * @return a {@link OidcClientAuthentication}
     */
    @jakarta.annotation.Nullable
    public OidcClientAuthentication getClientAuthentication() {
        return this.backingStore.get("clientAuthentication");
    }
    /**
     * Gets the clientId property value. The clientId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.backingStore.get("clientId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clientAuthentication", (n) -> { this.setClientAuthentication(n.getObjectValue(OidcClientAuthentication::createFromDiscriminatorValue)); });
        deserializerMap.put("clientId", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("inboundClaimMapping", (n) -> { this.setInboundClaimMapping(n.getObjectValue(OidcInboundClaimMappingOverride::createFromDiscriminatorValue)); });
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getStringValue()); });
        deserializerMap.put("responseType", (n) -> { this.setResponseType(n.getEnumSetValue(OidcResponseType::forValue)); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getStringValue()); });
        deserializerMap.put("wellKnownEndpoint", (n) -> { this.setWellKnownEndpoint(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inboundClaimMapping property value. The inboundClaimMapping property
     * @return a {@link OidcInboundClaimMappingOverride}
     */
    @jakarta.annotation.Nullable
    public OidcInboundClaimMappingOverride getInboundClaimMapping() {
        return this.backingStore.get("inboundClaimMapping");
    }
    /**
     * Gets the issuer property value. The issuer property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssuer() {
        return this.backingStore.get("issuer");
    }
    /**
     * Gets the responseType property value. The responseType property
     * @return a {@link EnumSet<OidcResponseType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<OidcResponseType> getResponseType() {
        return this.backingStore.get("responseType");
    }
    /**
     * Gets the scope property value. The scope property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScope() {
        return this.backingStore.get("scope");
    }
    /**
     * Gets the wellKnownEndpoint property value. The wellKnownEndpoint property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWellKnownEndpoint() {
        return this.backingStore.get("wellKnownEndpoint");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("clientAuthentication", this.getClientAuthentication());
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeObjectValue("inboundClaimMapping", this.getInboundClaimMapping());
        writer.writeStringValue("issuer", this.getIssuer());
        writer.writeEnumSetValue("responseType", this.getResponseType());
        writer.writeStringValue("scope", this.getScope());
        writer.writeStringValue("wellKnownEndpoint", this.getWellKnownEndpoint());
    }
    /**
     * Sets the clientAuthentication property value. The clientAuthentication property
     * @param value Value to set for the clientAuthentication property.
     */
    public void setClientAuthentication(@jakarta.annotation.Nullable final OidcClientAuthentication value) {
        this.backingStore.set("clientAuthentication", value);
    }
    /**
     * Sets the clientId property value. The clientId property
     * @param value Value to set for the clientId property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientId", value);
    }
    /**
     * Sets the inboundClaimMapping property value. The inboundClaimMapping property
     * @param value Value to set for the inboundClaimMapping property.
     */
    public void setInboundClaimMapping(@jakarta.annotation.Nullable final OidcInboundClaimMappingOverride value) {
        this.backingStore.set("inboundClaimMapping", value);
    }
    /**
     * Sets the issuer property value. The issuer property
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issuer", value);
    }
    /**
     * Sets the responseType property value. The responseType property
     * @param value Value to set for the responseType property.
     */
    public void setResponseType(@jakarta.annotation.Nullable final EnumSet<OidcResponseType> value) {
        this.backingStore.set("responseType", value);
    }
    /**
     * Sets the scope property value. The scope property
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scope", value);
    }
    /**
     * Sets the wellKnownEndpoint property value. The wellKnownEndpoint property
     * @param value Value to set for the wellKnownEndpoint property.
     */
    public void setWellKnownEndpoint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("wellKnownEndpoint", value);
    }
}
