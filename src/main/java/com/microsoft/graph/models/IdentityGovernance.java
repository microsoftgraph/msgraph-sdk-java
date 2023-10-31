package com.microsoft.graph.models;

import com.microsoft.graph.models.identitygovernance.LifecycleWorkflowsContainer;
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
public class IdentityGovernance implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new IdentityGovernance and sets the default values.
     */
    public IdentityGovernance() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdentityGovernance
     */
    @jakarta.annotation.Nonnull
    public static IdentityGovernance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityGovernance();
    }
    /**
     * Gets the accessReviews property value. The accessReviews property
     * @return a AccessReviewSet
     */
    @jakarta.annotation.Nullable
    public AccessReviewSet getAccessReviews() {
        return this.getBackingStore().get("accessReviews");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the appConsent property value. The appConsent property
     * @return a AppConsentApprovalRoute
     */
    @jakarta.annotation.Nullable
    public AppConsentApprovalRoute getAppConsent() {
        return this.getBackingStore().get("appConsent");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the entitlementManagement property value. The entitlementManagement property
     * @return a EntitlementManagement
     */
    @jakarta.annotation.Nullable
    public EntitlementManagement getEntitlementManagement() {
        return this.getBackingStore().get("entitlementManagement");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("accessReviews", (n) -> { this.setAccessReviews(n.getObjectValue(AccessReviewSet::createFromDiscriminatorValue)); });
        deserializerMap.put("appConsent", (n) -> { this.setAppConsent(n.getObjectValue(AppConsentApprovalRoute::createFromDiscriminatorValue)); });
        deserializerMap.put("entitlementManagement", (n) -> { this.setEntitlementManagement(n.getObjectValue(EntitlementManagement::createFromDiscriminatorValue)); });
        deserializerMap.put("lifecycleWorkflows", (n) -> { this.setLifecycleWorkflows(n.getObjectValue(LifecycleWorkflowsContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("privilegedAccess", (n) -> { this.setPrivilegedAccess(n.getObjectValue(PrivilegedAccessRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("termsOfUse", (n) -> { this.setTermsOfUse(n.getObjectValue(TermsOfUseContainer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lifecycleWorkflows property value. The lifecycleWorkflows property
     * @return a LifecycleWorkflowsContainer
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowsContainer getLifecycleWorkflows() {
        return this.getBackingStore().get("lifecycleWorkflows");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the privilegedAccess property value. The privilegedAccess property
     * @return a PrivilegedAccessRoot
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessRoot getPrivilegedAccess() {
        return this.getBackingStore().get("privilegedAccess");
    }
    /**
     * Gets the termsOfUse property value. The termsOfUse property
     * @return a TermsOfUseContainer
     */
    @jakarta.annotation.Nullable
    public TermsOfUseContainer getTermsOfUse() {
        return this.getBackingStore().get("termsOfUse");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accessReviews", this.getAccessReviews());
        writer.writeObjectValue("appConsent", this.getAppConsent());
        writer.writeObjectValue("entitlementManagement", this.getEntitlementManagement());
        writer.writeObjectValue("lifecycleWorkflows", this.getLifecycleWorkflows());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("privilegedAccess", this.getPrivilegedAccess());
        writer.writeObjectValue("termsOfUse", this.getTermsOfUse());
    }
    /**
     * Sets the accessReviews property value. The accessReviews property
     * @param value Value to set for the accessReviews property.
     */
    public void setAccessReviews(@jakarta.annotation.Nullable final AccessReviewSet value) {
        this.getBackingStore().set("accessReviews", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the appConsent property value. The appConsent property
     * @param value Value to set for the appConsent property.
     */
    public void setAppConsent(@jakarta.annotation.Nullable final AppConsentApprovalRoute value) {
        this.getBackingStore().set("appConsent", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the entitlementManagement property value. The entitlementManagement property
     * @param value Value to set for the entitlementManagement property.
     */
    public void setEntitlementManagement(@jakarta.annotation.Nullable final EntitlementManagement value) {
        this.getBackingStore().set("entitlementManagement", value);
    }
    /**
     * Sets the lifecycleWorkflows property value. The lifecycleWorkflows property
     * @param value Value to set for the lifecycleWorkflows property.
     */
    public void setLifecycleWorkflows(@jakarta.annotation.Nullable final LifecycleWorkflowsContainer value) {
        this.getBackingStore().set("lifecycleWorkflows", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the privilegedAccess property value. The privilegedAccess property
     * @param value Value to set for the privilegedAccess property.
     */
    public void setPrivilegedAccess(@jakarta.annotation.Nullable final PrivilegedAccessRoot value) {
        this.getBackingStore().set("privilegedAccess", value);
    }
    /**
     * Sets the termsOfUse property value. The termsOfUse property
     * @param value Value to set for the termsOfUse property.
     */
    public void setTermsOfUse(@jakarta.annotation.Nullable final TermsOfUseContainer value) {
        this.getBackingStore().set("termsOfUse", value);
    }
}
