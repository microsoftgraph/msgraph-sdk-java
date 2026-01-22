package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Contract extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link Contract} and sets the default values.
     */
    public Contract() {
        super();
        this.setOdataType("#microsoft.graph.contract");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Contract}
     */
    @jakarta.annotation.Nonnull
    public static Contract createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Contract();
    }
    /**
     * Gets the contractType property value. Type of contract. The possible values are:  SyndicationPartner, BreadthPartner, ResellerPartner. See more in the table below.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContractType() {
        return this.backingStore.get("contractType");
    }
    /**
     * Gets the customerId property value. The unique identifier for the customer tenant referenced by this partnership. Corresponds to the id property of the customer tenant&apos;s organization resource.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getCustomerId() {
        return this.backingStore.get("customerId");
    }
    /**
     * Gets the defaultDomainName property value. A copy of the customer tenant&apos;s default domain name. The copy is made when the partnership with the customer is established. It isn&apos;t automatically updated if the customer tenant&apos;s default domain name changes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultDomainName() {
        return this.backingStore.get("defaultDomainName");
    }
    /**
     * Gets the displayName property value. A copy of the customer tenant&apos;s display name. The copy is made when the partnership with the customer is established. It is not automatically updated if the customer tenant&apos;s display name changes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contractType", (n) -> { this.setContractType(n.getStringValue()); });
        deserializerMap.put("customerId", (n) -> { this.setCustomerId(n.getUUIDValue()); });
        deserializerMap.put("defaultDomainName", (n) -> { this.setDefaultDomainName(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("contractType", this.getContractType());
        writer.writeUUIDValue("customerId", this.getCustomerId());
        writer.writeStringValue("defaultDomainName", this.getDefaultDomainName());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the contractType property value. Type of contract. The possible values are:  SyndicationPartner, BreadthPartner, ResellerPartner. See more in the table below.
     * @param value Value to set for the contractType property.
     */
    public void setContractType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contractType", value);
    }
    /**
     * Sets the customerId property value. The unique identifier for the customer tenant referenced by this partnership. Corresponds to the id property of the customer tenant&apos;s organization resource.
     * @param value Value to set for the customerId property.
     */
    public void setCustomerId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("customerId", value);
    }
    /**
     * Sets the defaultDomainName property value. A copy of the customer tenant&apos;s default domain name. The copy is made when the partnership with the customer is established. It isn&apos;t automatically updated if the customer tenant&apos;s default domain name changes.
     * @param value Value to set for the defaultDomainName property.
     */
    public void setDefaultDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultDomainName", value);
    }
    /**
     * Sets the displayName property value. A copy of the customer tenant&apos;s display name. The copy is made when the partnership with the customer is established. It is not automatically updated if the customer tenant&apos;s display name changes.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
}
