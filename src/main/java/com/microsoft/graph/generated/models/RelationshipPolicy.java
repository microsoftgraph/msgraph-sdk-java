package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelationshipPolicy implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RelationshipPolicy} and sets the default values.
     */
    public RelationshipPolicy() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelationshipPolicy}
     */
    @jakarta.annotation.Nonnull
    public static RelationshipPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelationshipPolicy();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the delegatedAdministrationRoleAssignments property value. The delegatedAdministrationRoleAssignments property
     * @return a {@link java.util.List<DelegatedAdministrationRoleAssignmentSnapshot>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DelegatedAdministrationRoleAssignmentSnapshot> getDelegatedAdministrationRoleAssignments() {
        return this.backingStore.get("delegatedAdministrationRoleAssignments");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("delegatedAdministrationRoleAssignments", (n) -> { this.setDelegatedAdministrationRoleAssignments(n.getCollectionOfObjectValues(DelegatedAdministrationRoleAssignmentSnapshot::createFromDiscriminatorValue)); });
        deserializerMap.put("governedTenantCanTerminate", (n) -> { this.setGovernedTenantCanTerminate(n.getBooleanValue()); });
        deserializerMap.put("multiTenantApplicationsToProvision", (n) -> { this.setMultiTenantApplicationsToProvision(n.getCollectionOfObjectValues(MultiTenantApplicationsToProvisionSnapshot::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
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
     * Gets the multiTenantApplicationsToProvision property value. The multiTenantApplicationsToProvision property
     * @return a {@link java.util.List<MultiTenantApplicationsToProvisionSnapshot>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiTenantApplicationsToProvisionSnapshot> getMultiTenantApplicationsToProvision() {
        return this.backingStore.get("multiTenantApplicationsToProvision");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the policyId property value. The policyId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the version property value. The version property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("delegatedAdministrationRoleAssignments", this.getDelegatedAdministrationRoleAssignments());
        writer.writeBooleanValue("governedTenantCanTerminate", this.getGovernedTenantCanTerminate());
        writer.writeCollectionOfObjectValues("multiTenantApplicationsToProvision", this.getMultiTenantApplicationsToProvision());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the delegatedAdministrationRoleAssignments property value. The delegatedAdministrationRoleAssignments property
     * @param value Value to set for the delegatedAdministrationRoleAssignments property.
     */
    public void setDelegatedAdministrationRoleAssignments(@jakarta.annotation.Nullable final java.util.List<DelegatedAdministrationRoleAssignmentSnapshot> value) {
        this.backingStore.set("delegatedAdministrationRoleAssignments", value);
    }
    /**
     * Sets the governedTenantCanTerminate property value. The governedTenantCanTerminate property
     * @param value Value to set for the governedTenantCanTerminate property.
     */
    public void setGovernedTenantCanTerminate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("governedTenantCanTerminate", value);
    }
    /**
     * Sets the multiTenantApplicationsToProvision property value. The multiTenantApplicationsToProvision property
     * @param value Value to set for the multiTenantApplicationsToProvision property.
     */
    public void setMultiTenantApplicationsToProvision(@jakarta.annotation.Nullable final java.util.List<MultiTenantApplicationsToProvisionSnapshot> value) {
        this.backingStore.set("multiTenantApplicationsToProvision", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyId property value. The policyId property
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("version", value);
    }
}
