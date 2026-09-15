package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantGovernance extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TenantGovernance} and sets the default values.
     */
    public TenantGovernance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TenantGovernance}
     */
    @jakarta.annotation.Nonnull
    public static TenantGovernance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantGovernance();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("governanceInvitations", (n) -> { this.setGovernanceInvitations(n.getCollectionOfObjectValues(GovernanceInvitation::createFromDiscriminatorValue)); });
        deserializerMap.put("governancePolicyTemplates", (n) -> { this.setGovernancePolicyTemplates(n.getCollectionOfObjectValues(TenantGovernancePolicyTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("governanceRelationships", (n) -> { this.setGovernanceRelationships(n.getCollectionOfObjectValues(GovernanceRelationship::createFromDiscriminatorValue)); });
        deserializerMap.put("governanceRequests", (n) -> { this.setGovernanceRequests(n.getCollectionOfObjectValues(GovernanceRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("relatedTenants", (n) -> { this.setRelatedTenants(n.getCollectionOfObjectValues(RelatedTenant::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(TenantGovernanceSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the governanceInvitations property value. The governanceInvitations property
     * @return a {@link java.util.List<GovernanceInvitation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceInvitation> getGovernanceInvitations() {
        return this.backingStore.get("governanceInvitations");
    }
    /**
     * Gets the governancePolicyTemplates property value. The governancePolicyTemplates property
     * @return a {@link java.util.List<TenantGovernancePolicyTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantGovernancePolicyTemplate> getGovernancePolicyTemplates() {
        return this.backingStore.get("governancePolicyTemplates");
    }
    /**
     * Gets the governanceRelationships property value. The governanceRelationships property
     * @return a {@link java.util.List<GovernanceRelationship>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRelationship> getGovernanceRelationships() {
        return this.backingStore.get("governanceRelationships");
    }
    /**
     * Gets the governanceRequests property value. The governanceRequests property
     * @return a {@link java.util.List<GovernanceRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRequest> getGovernanceRequests() {
        return this.backingStore.get("governanceRequests");
    }
    /**
     * Gets the relatedTenants property value. The relatedTenants property
     * @return a {@link java.util.List<RelatedTenant>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RelatedTenant> getRelatedTenants() {
        return this.backingStore.get("relatedTenants");
    }
    /**
     * Gets the settings property value. The settings property
     * @return a {@link TenantGovernanceSetting}
     */
    @jakarta.annotation.Nullable
    public TenantGovernanceSetting getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("governanceInvitations", this.getGovernanceInvitations());
        writer.writeCollectionOfObjectValues("governancePolicyTemplates", this.getGovernancePolicyTemplates());
        writer.writeCollectionOfObjectValues("governanceRelationships", this.getGovernanceRelationships());
        writer.writeCollectionOfObjectValues("governanceRequests", this.getGovernanceRequests());
        writer.writeCollectionOfObjectValues("relatedTenants", this.getRelatedTenants());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the governanceInvitations property value. The governanceInvitations property
     * @param value Value to set for the governanceInvitations property.
     */
    public void setGovernanceInvitations(@jakarta.annotation.Nullable final java.util.List<GovernanceInvitation> value) {
        this.backingStore.set("governanceInvitations", value);
    }
    /**
     * Sets the governancePolicyTemplates property value. The governancePolicyTemplates property
     * @param value Value to set for the governancePolicyTemplates property.
     */
    public void setGovernancePolicyTemplates(@jakarta.annotation.Nullable final java.util.List<TenantGovernancePolicyTemplate> value) {
        this.backingStore.set("governancePolicyTemplates", value);
    }
    /**
     * Sets the governanceRelationships property value. The governanceRelationships property
     * @param value Value to set for the governanceRelationships property.
     */
    public void setGovernanceRelationships(@jakarta.annotation.Nullable final java.util.List<GovernanceRelationship> value) {
        this.backingStore.set("governanceRelationships", value);
    }
    /**
     * Sets the governanceRequests property value. The governanceRequests property
     * @param value Value to set for the governanceRequests property.
     */
    public void setGovernanceRequests(@jakarta.annotation.Nullable final java.util.List<GovernanceRequest> value) {
        this.backingStore.set("governanceRequests", value);
    }
    /**
     * Sets the relatedTenants property value. The relatedTenants property
     * @param value Value to set for the relatedTenants property.
     */
    public void setRelatedTenants(@jakarta.annotation.Nullable final java.util.List<RelatedTenant> value) {
        this.backingStore.set("relatedTenants", value);
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final TenantGovernanceSetting value) {
        this.backingStore.set("settings", value);
    }
}
