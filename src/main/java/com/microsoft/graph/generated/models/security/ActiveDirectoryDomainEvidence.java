package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActiveDirectoryDomainEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link ActiveDirectoryDomainEvidence} and sets the default values.
     */
    public ActiveDirectoryDomainEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.activeDirectoryDomainEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ActiveDirectoryDomainEvidence}
     */
    @jakarta.annotation.Nonnull
    public static ActiveDirectoryDomainEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActiveDirectoryDomainEvidence();
    }
    /**
     * Gets the activeDirectoryDomainName property value. The activeDirectoryDomainName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActiveDirectoryDomainName() {
        return this.backingStore.get("activeDirectoryDomainName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDirectoryDomainName", (n) -> { this.setActiveDirectoryDomainName(n.getStringValue()); });
        deserializerMap.put("trustedDomains", (n) -> { this.setTrustedDomains(n.getCollectionOfObjectValues(ActiveDirectoryDomainEvidence::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the trustedDomains property value. The trustedDomains property
     * @return a {@link java.util.List<ActiveDirectoryDomainEvidence>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActiveDirectoryDomainEvidence> getTrustedDomains() {
        return this.backingStore.get("trustedDomains");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("activeDirectoryDomainName", this.getActiveDirectoryDomainName());
        writer.writeCollectionOfObjectValues("trustedDomains", this.getTrustedDomains());
    }
    /**
     * Sets the activeDirectoryDomainName property value. The activeDirectoryDomainName property
     * @param value Value to set for the activeDirectoryDomainName property.
     */
    public void setActiveDirectoryDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activeDirectoryDomainName", value);
    }
    /**
     * Sets the trustedDomains property value. The trustedDomains property
     * @param value Value to set for the trustedDomains property.
     */
    public void setTrustedDomains(@jakarta.annotation.Nullable final java.util.List<ActiveDirectoryDomainEvidence> value) {
        this.backingStore.set("trustedDomains", value);
    }
}
