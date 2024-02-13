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
public class UnifiedApprovalStage implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UnifiedApprovalStage} and sets the default values.
     */
    public UnifiedApprovalStage() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedApprovalStage}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedApprovalStage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedApprovalStage();
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
     * Gets the approvalStageTimeOutInDays property value. The number of days that a request can be pending a response before it is automatically denied.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getApprovalStageTimeOutInDays() {
        return this.backingStore.get("approvalStageTimeOutInDays");
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
     * Gets the escalationApprovers property value. The escalation approvers for this stage when the primary approvers don't respond.
     * @return a {@link java.util.List<SubjectSet>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectSet> getEscalationApprovers() {
        return this.backingStore.get("escalationApprovers");
    }
    /**
     * Gets the escalationTimeInMinutes property value. The time a request can be pending a response from a primary approver before it can be escalated to the escalation approvers.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEscalationTimeInMinutes() {
        return this.backingStore.get("escalationTimeInMinutes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("approvalStageTimeOutInDays", (n) -> { this.setApprovalStageTimeOutInDays(n.getIntegerValue()); });
        deserializerMap.put("escalationApprovers", (n) -> { this.setEscalationApprovers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("escalationTimeInMinutes", (n) -> { this.setEscalationTimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("isApproverJustificationRequired", (n) -> { this.setIsApproverJustificationRequired(n.getBooleanValue()); });
        deserializerMap.put("isEscalationEnabled", (n) -> { this.setIsEscalationEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("primaryApprovers", (n) -> { this.setPrimaryApprovers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isApproverJustificationRequired property value. Indicates whether the approver must provide justification for their reponse.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApproverJustificationRequired() {
        return this.backingStore.get("isApproverJustificationRequired");
    }
    /**
     * Gets the isEscalationEnabled property value. Indicates whether escalation if enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEscalationEnabled() {
        return this.backingStore.get("isEscalationEnabled");
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
     * Gets the primaryApprovers property value. The primary approvers of this stage.
     * @return a {@link java.util.List<SubjectSet>}
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
        writer.writeIntegerValue("approvalStageTimeOutInDays", this.getApprovalStageTimeOutInDays());
        writer.writeCollectionOfObjectValues("escalationApprovers", this.getEscalationApprovers());
        writer.writeIntegerValue("escalationTimeInMinutes", this.getEscalationTimeInMinutes());
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
     * Sets the approvalStageTimeOutInDays property value. The number of days that a request can be pending a response before it is automatically denied.
     * @param value Value to set for the approvalStageTimeOutInDays property.
     */
    public void setApprovalStageTimeOutInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("approvalStageTimeOutInDays", value);
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
     * Sets the escalationApprovers property value. The escalation approvers for this stage when the primary approvers don't respond.
     * @param value Value to set for the escalationApprovers property.
     */
    public void setEscalationApprovers(@jakarta.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.backingStore.set("escalationApprovers", value);
    }
    /**
     * Sets the escalationTimeInMinutes property value. The time a request can be pending a response from a primary approver before it can be escalated to the escalation approvers.
     * @param value Value to set for the escalationTimeInMinutes property.
     */
    public void setEscalationTimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("escalationTimeInMinutes", value);
    }
    /**
     * Sets the isApproverJustificationRequired property value. Indicates whether the approver must provide justification for their reponse.
     * @param value Value to set for the isApproverJustificationRequired property.
     */
    public void setIsApproverJustificationRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isApproverJustificationRequired", value);
    }
    /**
     * Sets the isEscalationEnabled property value. Indicates whether escalation if enabled.
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
     * Sets the primaryApprovers property value. The primary approvers of this stage.
     * @param value Value to set for the primaryApprovers property.
     */
    public void setPrimaryApprovers(@jakarta.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.backingStore.set("primaryApprovers", value);
    }
}
