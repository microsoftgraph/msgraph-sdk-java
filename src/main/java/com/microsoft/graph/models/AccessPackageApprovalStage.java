package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
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
public class AccessPackageApprovalStage implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AccessPackageApprovalStage and sets the default values.
     */
    public AccessPackageApprovalStage() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageApprovalStage
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageApprovalStage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageApprovalStage();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the durationBeforeAutomaticDenial property value. The number of days that a request can be pending a response before it is automatically denied.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDurationBeforeAutomaticDenial() {
        return this.backingStore.get("durationBeforeAutomaticDenial");
    }
    /**
     * Gets the durationBeforeEscalation property value. If escalation is required, the time a request can be pending a response from a primary approver.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDurationBeforeEscalation() {
        return this.backingStore.get("durationBeforeEscalation");
    }
    /**
     * Gets the escalationApprovers property value. If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests.
     * @return a java.util.List<SubjectSet>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectSet> getEscalationApprovers() {
        return this.backingStore.get("escalationApprovers");
    }
    /**
     * Gets the fallbackEscalationApprovers property value. The subjects, typically users, who are the fallback escalation approvers.
     * @return a java.util.List<SubjectSet>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectSet> getFallbackEscalationApprovers() {
        return this.backingStore.get("fallbackEscalationApprovers");
    }
    /**
     * Gets the fallbackPrimaryApprovers property value. The subjects, typically users, who are the fallback primary approvers.
     * @return a java.util.List<SubjectSet>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectSet> getFallbackPrimaryApprovers() {
        return this.backingStore.get("fallbackPrimaryApprovers");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("durationBeforeAutomaticDenial", (n) -> { this.setDurationBeforeAutomaticDenial(n.getPeriodAndDurationValue()); });
        deserializerMap.put("durationBeforeEscalation", (n) -> { this.setDurationBeforeEscalation(n.getPeriodAndDurationValue()); });
        deserializerMap.put("escalationApprovers", (n) -> { this.setEscalationApprovers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("fallbackEscalationApprovers", (n) -> { this.setFallbackEscalationApprovers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("fallbackPrimaryApprovers", (n) -> { this.setFallbackPrimaryApprovers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("isApproverJustificationRequired", (n) -> { this.setIsApproverJustificationRequired(n.getBooleanValue()); });
        deserializerMap.put("isEscalationEnabled", (n) -> { this.setIsEscalationEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("primaryApprovers", (n) -> { this.setPrimaryApprovers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isApproverJustificationRequired property value. Indicates whether the approver is required to provide a justification for approving a request.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApproverJustificationRequired() {
        return this.backingStore.get("isApproverJustificationRequired");
    }
    /**
     * Gets the isEscalationEnabled property value. If true, then one or more escalationApprovers are configured in this approval stage.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEscalationEnabled() {
        return this.backingStore.get("isEscalationEnabled");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the primaryApprovers property value. The subjects, typically users, who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors or externalSponsors.
     * @return a java.util.List<SubjectSet>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectSet> getPrimaryApprovers() {
        return this.backingStore.get("primaryApprovers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writePeriodAndDurationValue("durationBeforeAutomaticDenial", this.getDurationBeforeAutomaticDenial());
        writer.writePeriodAndDurationValue("durationBeforeEscalation", this.getDurationBeforeEscalation());
        writer.writeCollectionOfObjectValues("escalationApprovers", this.getEscalationApprovers());
        writer.writeCollectionOfObjectValues("fallbackEscalationApprovers", this.getFallbackEscalationApprovers());
        writer.writeCollectionOfObjectValues("fallbackPrimaryApprovers", this.getFallbackPrimaryApprovers());
        writer.writeBooleanValue("isApproverJustificationRequired", this.getIsApproverJustificationRequired());
        writer.writeBooleanValue("isEscalationEnabled", this.getIsEscalationEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("primaryApprovers", this.getPrimaryApprovers());
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
     * Sets the durationBeforeAutomaticDenial property value. The number of days that a request can be pending a response before it is automatically denied.
     * @param value Value to set for the durationBeforeAutomaticDenial property.
     */
    public void setDurationBeforeAutomaticDenial(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("durationBeforeAutomaticDenial", value);
    }
    /**
     * Sets the durationBeforeEscalation property value. If escalation is required, the time a request can be pending a response from a primary approver.
     * @param value Value to set for the durationBeforeEscalation property.
     */
    public void setDurationBeforeEscalation(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("durationBeforeEscalation", value);
    }
    /**
     * Sets the escalationApprovers property value. If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests.
     * @param value Value to set for the escalationApprovers property.
     */
    public void setEscalationApprovers(@jakarta.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.backingStore.set("escalationApprovers", value);
    }
    /**
     * Sets the fallbackEscalationApprovers property value. The subjects, typically users, who are the fallback escalation approvers.
     * @param value Value to set for the fallbackEscalationApprovers property.
     */
    public void setFallbackEscalationApprovers(@jakarta.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.backingStore.set("fallbackEscalationApprovers", value);
    }
    /**
     * Sets the fallbackPrimaryApprovers property value. The subjects, typically users, who are the fallback primary approvers.
     * @param value Value to set for the fallbackPrimaryApprovers property.
     */
    public void setFallbackPrimaryApprovers(@jakarta.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.backingStore.set("fallbackPrimaryApprovers", value);
    }
    /**
     * Sets the isApproverJustificationRequired property value. Indicates whether the approver is required to provide a justification for approving a request.
     * @param value Value to set for the isApproverJustificationRequired property.
     */
    public void setIsApproverJustificationRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isApproverJustificationRequired", value);
    }
    /**
     * Sets the isEscalationEnabled property value. If true, then one or more escalationApprovers are configured in this approval stage.
     * @param value Value to set for the isEscalationEnabled property.
     */
    public void setIsEscalationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEscalationEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the primaryApprovers property value. The subjects, typically users, who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors or externalSponsors.
     * @param value Value to set for the primaryApprovers property.
     */
    public void setPrimaryApprovers(@jakarta.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.backingStore.set("primaryApprovers", value);
    }
}
