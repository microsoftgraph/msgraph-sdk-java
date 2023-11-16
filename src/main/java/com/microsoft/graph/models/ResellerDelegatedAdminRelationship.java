package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResellerDelegatedAdminRelationship extends DelegatedAdminRelationship implements Parsable {
    /**
     * Instantiates a new ResellerDelegatedAdminRelationship and sets the default values.
     */
    public ResellerDelegatedAdminRelationship() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ResellerDelegatedAdminRelationship
     */
    @jakarta.annotation.Nonnull
    public static ResellerDelegatedAdminRelationship createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResellerDelegatedAdminRelationship();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("indirectProviderTenantId", (n) -> { this.setIndirectProviderTenantId(n.getStringValue()); });
        deserializerMap.put("isPartnerConsentPending", (n) -> { this.setIsPartnerConsentPending(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the indirectProviderTenantId property value. The tenant ID of the indirect provider partner who created the relationship for the indirect reseller partner.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIndirectProviderTenantId() {
        return this.BackingStore.get("indirectProviderTenantId");
    }
    /**
     * Gets the isPartnerConsentPending property value. Indicates the indirect reseller partner consent status. true indicates that the partner has yet to review the relationship; false indicates that the partner has already provided consent by approving or rejecting the relationship.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPartnerConsentPending() {
        return this.BackingStore.get("isPartnerConsentPending");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("indirectProviderTenantId", this.getIndirectProviderTenantId());
        writer.writeBooleanValue("isPartnerConsentPending", this.getIsPartnerConsentPending());
    }
    /**
     * Sets the indirectProviderTenantId property value. The tenant ID of the indirect provider partner who created the relationship for the indirect reseller partner.
     * @param value Value to set for the indirectProviderTenantId property.
     */
    public void setIndirectProviderTenantId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("indirectProviderTenantId", value);
    }
    /**
     * Sets the isPartnerConsentPending property value. Indicates the indirect reseller partner consent status. true indicates that the partner has yet to review the relationship; false indicates that the partner has already provided consent by approving or rejecting the relationship.
     * @param value Value to set for the isPartnerConsentPending property.
     */
    public void setIsPartnerConsentPending(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isPartnerConsentPending", value);
    }
}
