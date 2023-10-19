package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalDomainFederation extends IdentitySource implements Parsable {
    /**
     * The name of the identity source, typically also the domain name. Read only.
     */
    private String displayName;
    /**
     * The domain name. Read only.
     */
    private String domainName;
    /**
     * The issuerURI of the incoming federation. Read only.
     */
    private String issuerUri;
    /**
     * Instantiates a new ExternalDomainFederation and sets the default values.
     */
    public ExternalDomainFederation() {
        super();
        this.setOdataType("#microsoft.graph.externalDomainFederation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExternalDomainFederation
     */
    @jakarta.annotation.Nonnull
    public static ExternalDomainFederation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalDomainFederation();
    }
    /**
     * Gets the displayName property value. The name of the identity source, typically also the domain name. Read only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the domainName property value. The domain name. Read only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("issuerUri", (n) -> { this.setIssuerUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuerUri property value. The issuerURI of the incoming federation. Read only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIssuerUri() {
        return this.issuerUri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeStringValue("issuerUri", this.getIssuerUri());
    }
    /**
     * Sets the displayName property value. The name of the identity source, typically also the domain name. Read only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the domainName property value. The domain name. Read only.
     * @param value Value to set for the domainName property.
     */
    public void setDomainName(@jakarta.annotation.Nullable final String value) {
        this.domainName = value;
    }
    /**
     * Sets the issuerUri property value. The issuerURI of the incoming federation. Read only.
     * @param value Value to set for the issuerUri property.
     */
    public void setIssuerUri(@jakarta.annotation.Nullable final String value) {
        this.issuerUri = value;
    }
}
