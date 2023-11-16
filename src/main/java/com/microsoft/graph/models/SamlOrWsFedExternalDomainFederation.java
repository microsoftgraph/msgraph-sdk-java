package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SamlOrWsFedExternalDomainFederation extends SamlOrWsFedProvider implements Parsable {
    /**
     * Instantiates a new SamlOrWsFedExternalDomainFederation and sets the default values.
     */
    public SamlOrWsFedExternalDomainFederation() {
        super();
        this.setOdataType("#microsoft.graph.samlOrWsFedExternalDomainFederation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SamlOrWsFedExternalDomainFederation
     */
    @jakarta.annotation.Nonnull
    public static SamlOrWsFedExternalDomainFederation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SamlOrWsFedExternalDomainFederation();
    }
    /**
     * Gets the domains property value. Collection of domain names of the external organizations that the tenant is federating with. Supports $filter (eq).
     * @return a java.util.List<ExternalDomainName>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExternalDomainName> getDomains() {
        return this.BackingStore.get("domains");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("domains", (n) -> { this.setDomains(n.getCollectionOfObjectValues(ExternalDomainName::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("domains", this.getDomains());
    }
    /**
     * Sets the domains property value. Collection of domain names of the external organizations that the tenant is federating with. Supports $filter (eq).
     * @param value Value to set for the domains property.
     */
    public void setDomains(@jakarta.annotation.Nullable final java.util.List<ExternalDomainName> value) {
        this.BackingStore.set("domains", value);
    }
}
