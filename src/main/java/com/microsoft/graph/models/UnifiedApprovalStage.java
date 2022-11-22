package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedApprovalStage implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The number of days that a request can be pending a response before it is automatically denied. */
    private Integer _approvalStageTimeOutInDays;
    /** The escalation approvers for this stage when the primary approvers don't respond. */
    private java.util.List<SubjectSet> _escalationApprovers;
    /** The time a request can be pending a response from a primary approver before it can be escalated to the escalation approvers. */
    private Integer _escalationTimeInMinutes;
    /** Indicates whether the approver must provide justification for their reponse. */
    private Boolean _isApproverJustificationRequired;
    /** Indicates whether escalation if enabled. */
    private Boolean _isEscalationEnabled;
    /** The OdataType property */
    private String _odataType;
    /** The primary approvers of this stage. */
    private java.util.List<SubjectSet> _primaryApprovers;
    /**
     * Instantiates a new unifiedApprovalStage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedApprovalStage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedApprovalStage
     */
    @javax.annotation.Nonnull
    public static UnifiedApprovalStage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedApprovalStage();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the approvalStageTimeOutInDays property value. The number of days that a request can be pending a response before it is automatically denied.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getApprovalStageTimeOutInDays() {
        return this._approvalStageTimeOutInDays;
    }
    /**
     * Gets the escalationApprovers property value. The escalation approvers for this stage when the primary approvers don't respond.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getEscalationApprovers() {
        return this._escalationApprovers;
    }
    /**
     * Gets the escalationTimeInMinutes property value. The time a request can be pending a response from a primary approver before it can be escalated to the escalation approvers.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEscalationTimeInMinutes() {
        return this._escalationTimeInMinutes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(7);
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApproverJustificationRequired() {
        return this._isApproverJustificationRequired;
    }
    /**
     * Gets the isEscalationEnabled property value. Indicates whether escalation if enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEscalationEnabled() {
        return this._isEscalationEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the primaryApprovers property value. The primary approvers of this stage.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getPrimaryApprovers() {
        return this._primaryApprovers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the approvalStageTimeOutInDays property value. The number of days that a request can be pending a response before it is automatically denied.
     * @param value Value to set for the approvalStageTimeOutInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApprovalStageTimeOutInDays(@javax.annotation.Nullable final Integer value) {
        this._approvalStageTimeOutInDays = value;
    }
    /**
     * Sets the escalationApprovers property value. The escalation approvers for this stage when the primary approvers don't respond.
     * @param value Value to set for the escalationApprovers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEscalationApprovers(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this._escalationApprovers = value;
    }
    /**
     * Sets the escalationTimeInMinutes property value. The time a request can be pending a response from a primary approver before it can be escalated to the escalation approvers.
     * @param value Value to set for the escalationTimeInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEscalationTimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._escalationTimeInMinutes = value;
    }
    /**
     * Sets the isApproverJustificationRequired property value. Indicates whether the approver must provide justification for their reponse.
     * @param value Value to set for the isApproverJustificationRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsApproverJustificationRequired(@javax.annotation.Nullable final Boolean value) {
        this._isApproverJustificationRequired = value;
    }
    /**
     * Sets the isEscalationEnabled property value. Indicates whether escalation if enabled.
     * @param value Value to set for the isEscalationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEscalationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEscalationEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the primaryApprovers property value. The primary approvers of this stage.
     * @param value Value to set for the primaryApprovers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryApprovers(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this._primaryApprovers = value;
    }
}
