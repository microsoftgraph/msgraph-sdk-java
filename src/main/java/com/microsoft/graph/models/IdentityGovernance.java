package com.microsoft.graph.models;

import com.microsoft.graph.models.identitygovernance.LifecycleWorkflowsContainer;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentityGovernance implements AdditionalDataHolder, Parsable {
    /**
     * The accessReviews property
     */
    private AccessReviewSet accessReviews;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The appConsent property
     */
    private AppConsentApprovalRoute appConsent;
    /**
     * The entitlementManagement property
     */
    private EntitlementManagement entitlementManagement;
    /**
     * The lifecycleWorkflows property
     */
    private LifecycleWorkflowsContainer lifecycleWorkflows;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The termsOfUse property
     */
    private TermsOfUseContainer termsOfUse;
    /**
     * Instantiates a new identityGovernance and sets the default values.
     */
    public IdentityGovernance() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identityGovernance
     */
    @jakarta.annotation.Nonnull
    public static IdentityGovernance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityGovernance();
    }
    /**
     * Gets the accessReviews property value. The accessReviews property
     * @return a accessReviewSet
     */
    @jakarta.annotation.Nullable
    public AccessReviewSet getAccessReviews() {
        return this.accessReviews;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the appConsent property value. The appConsent property
     * @return a appConsentApprovalRoute
     */
    @jakarta.annotation.Nullable
    public AppConsentApprovalRoute getAppConsent() {
        return this.appConsent;
    }
    /**
     * Gets the entitlementManagement property value. The entitlementManagement property
     * @return a entitlementManagement
     */
    @jakarta.annotation.Nullable
    public EntitlementManagement getEntitlementManagement() {
        return this.entitlementManagement;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("accessReviews", (n) -> { this.setAccessReviews(n.getObjectValue(AccessReviewSet::createFromDiscriminatorValue)); });
        deserializerMap.put("appConsent", (n) -> { this.setAppConsent(n.getObjectValue(AppConsentApprovalRoute::createFromDiscriminatorValue)); });
        deserializerMap.put("entitlementManagement", (n) -> { this.setEntitlementManagement(n.getObjectValue(EntitlementManagement::createFromDiscriminatorValue)); });
        deserializerMap.put("lifecycleWorkflows", (n) -> { this.setLifecycleWorkflows(n.getObjectValue(LifecycleWorkflowsContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("termsOfUse", (n) -> { this.setTermsOfUse(n.getObjectValue(TermsOfUseContainer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lifecycleWorkflows property value. The lifecycleWorkflows property
     * @return a lifecycleWorkflowsContainer
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowsContainer getLifecycleWorkflows() {
        return this.lifecycleWorkflows;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the termsOfUse property value. The termsOfUse property
     * @return a termsOfUseContainer
     */
    @jakarta.annotation.Nullable
    public TermsOfUseContainer getTermsOfUse() {
        return this.termsOfUse;
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
        writer.writeObjectValue("termsOfUse", this.getTermsOfUse());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessReviews property value. The accessReviews property
     * @param value Value to set for the accessReviews property.
     */
    public void setAccessReviews(@jakarta.annotation.Nullable final AccessReviewSet value) {
        this.accessReviews = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the appConsent property value. The appConsent property
     * @param value Value to set for the appConsent property.
     */
    public void setAppConsent(@jakarta.annotation.Nullable final AppConsentApprovalRoute value) {
        this.appConsent = value;
    }
    /**
     * Sets the entitlementManagement property value. The entitlementManagement property
     * @param value Value to set for the entitlementManagement property.
     */
    public void setEntitlementManagement(@jakarta.annotation.Nullable final EntitlementManagement value) {
        this.entitlementManagement = value;
    }
    /**
     * Sets the lifecycleWorkflows property value. The lifecycleWorkflows property
     * @param value Value to set for the lifecycleWorkflows property.
     */
    public void setLifecycleWorkflows(@jakarta.annotation.Nullable final LifecycleWorkflowsContainer value) {
        this.lifecycleWorkflows = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the termsOfUse property value. The termsOfUse property
     * @param value Value to set for the termsOfUse property.
     */
    public void setTermsOfUse(@jakarta.annotation.Nullable final TermsOfUseContainer value) {
        this.termsOfUse = value;
    }
}
