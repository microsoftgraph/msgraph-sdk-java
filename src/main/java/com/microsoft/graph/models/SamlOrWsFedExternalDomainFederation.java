package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SamlOrWsFedExternalDomainFederation extends SamlOrWsFedProvider implements Parsable {
    /** Collection of domain names of the external organizations that the tenant is federating with. Supports $filter (eq). */
    private java.util.List<ExternalDomainName> _domains;
    /**
     * Instantiates a new SamlOrWsFedExternalDomainFederation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SamlOrWsFedExternalDomainFederation() {
        super();
        this.setOdataType("#microsoft.graph.samlOrWsFedExternalDomainFederation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SamlOrWsFedExternalDomainFederation
     */
    @javax.annotation.Nonnull
    public static SamlOrWsFedExternalDomainFederation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SamlOrWsFedExternalDomainFederation();
    }
    /**
     * Gets the domains property value. Collection of domain names of the external organizations that the tenant is federating with. Supports $filter (eq).
     * @return a externalDomainName
     */
    @javax.annotation.Nullable
    public java.util.List<ExternalDomainName> getDomains() {
        return this._domains;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("domains", (n) -> { this.setDomains(n.getCollectionOfObjectValues(ExternalDomainName::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("domains", this.getDomains());
    }
    /**
     * Sets the domains property value. Collection of domain names of the external organizations that the tenant is federating with. Supports $filter (eq).
     * @param value Value to set for the domains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomains(@javax.annotation.Nullable final java.util.List<ExternalDomainName> value) {
        this._domains = value;
    }
}
