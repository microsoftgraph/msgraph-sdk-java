package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantGovernancePolicyTemplate extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TenantGovernancePolicyTemplate} and sets the default values.
     */
    public TenantGovernancePolicyTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TenantGovernancePolicyTemplate}
     */
    @jakarta.annotation.Nonnull
    public static TenantGovernancePolicyTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantGovernancePolicyTemplate();
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the delegatedAdministrationRoleAssignments property value. The delegatedAdministrationRoleAssignments property
     * @return a {@link java.util.List<DelegatedAdministrationRoleAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DelegatedAdministrationRoleAssignment> getDelegatedAdministrationRoleAssignments() {
        return this.backingStore.get("delegatedAdministrationRoleAssignments");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
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
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("delegatedAdministrationRoleAssignments", (n) -> { this.setDelegatedAdministrationRoleAssignments(n.getCollectionOfObjectValues(DelegatedAdministrationRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("governedTenantCanTerminate", (n) -> { this.setGovernedTenantCanTerminate(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("multiTenantApplicationsToProvision", (n) -> { this.setMultiTenantApplicationsToProvision(n.getCollectionOfObjectValues(MultiTenantApplicationsToProvision::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the governedTenantCanTerminate property value. The governedTenantCanTerminate property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGovernedTenantCanTerminate() {
        return this.backingStore.get("governedTenantCanTerminate");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the multiTenantApplicationsToProvision property value. The multiTenantApplicationsToProvision property
     * @return a {@link java.util.List<MultiTenantApplicationsToProvision>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiTenantApplicationsToProvision> getMultiTenantApplicationsToProvision() {
        return this.backingStore.get("multiTenantApplicationsToProvision");
    }
    /**
     * Gets the version property value. The version property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("delegatedAdministrationRoleAssignments", this.getDelegatedAdministrationRoleAssignments());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("governedTenantCanTerminate", this.getGovernedTenantCanTerminate());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("multiTenantApplicationsToProvision", this.getMultiTenantApplicationsToProvision());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the delegatedAdministrationRoleAssignments property value. The delegatedAdministrationRoleAssignments property
     * @param value Value to set for the delegatedAdministrationRoleAssignments property.
     */
    public void setDelegatedAdministrationRoleAssignments(@jakarta.annotation.Nullable final java.util.List<DelegatedAdministrationRoleAssignment> value) {
        this.backingStore.set("delegatedAdministrationRoleAssignments", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the governedTenantCanTerminate property value. The governedTenantCanTerminate property
     * @param value Value to set for the governedTenantCanTerminate property.
     */
    public void setGovernedTenantCanTerminate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("governedTenantCanTerminate", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the multiTenantApplicationsToProvision property value. The multiTenantApplicationsToProvision property
     * @param value Value to set for the multiTenantApplicationsToProvision property.
     */
    public void setMultiTenantApplicationsToProvision(@jakarta.annotation.Nullable final java.util.List<MultiTenantApplicationsToProvision> value) {
        this.backingStore.set("multiTenantApplicationsToProvision", value);
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
