package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageApprovalStage implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The number of days that a request can be pending a response before it is automatically denied. */
    private Period _durationBeforeAutomaticDenial;
    /** If escalation is required, the time a request can be pending a response from a primary approver. */
    private Period _durationBeforeEscalation;
    /** If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests. */
    private java.util.List<SubjectSet> _escalationApprovers;
    /** The subjects, typically users, who are the fallback escalation approvers. */
    private java.util.List<SubjectSet> _fallbackEscalationApprovers;
    /** The subjects, typically users, who are the fallback primary approvers. */
    private java.util.List<SubjectSet> _fallbackPrimaryApprovers;
    /** Indicates whether the approver is required to provide a justification for approving a request. */
    private Boolean _isApproverJustificationRequired;
    /** If true, then one or more escalationApprovers are configured in this approval stage. */
    private Boolean _isEscalationEnabled;
    /** The OdataType property */
    private String _odataType;
    /** The subjects, typically users, who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors or externalSponsors. */
    private java.util.List<SubjectSet> _primaryApprovers;
    /**
     * Instantiates a new accessPackageApprovalStage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageApprovalStage() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.accessPackageApprovalStage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageApprovalStage
     */
    @javax.annotation.Nonnull
    public static AccessPackageApprovalStage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageApprovalStage();
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
     * Gets the durationBeforeAutomaticDenial property value. The number of days that a request can be pending a response before it is automatically denied.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDurationBeforeAutomaticDenial() {
        return this._durationBeforeAutomaticDenial;
    }
    /**
     * Gets the durationBeforeEscalation property value. If escalation is required, the time a request can be pending a response from a primary approver.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDurationBeforeEscalation() {
        return this._durationBeforeEscalation;
    }
    /**
     * Gets the escalationApprovers property value. If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getEscalationApprovers() {
        return this._escalationApprovers;
    }
    /**
     * Gets the fallbackEscalationApprovers property value. The subjects, typically users, who are the fallback escalation approvers.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getFallbackEscalationApprovers() {
        return this._fallbackEscalationApprovers;
    }
    /**
     * Gets the fallbackPrimaryApprovers property value. The subjects, typically users, who are the fallback primary approvers.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getFallbackPrimaryApprovers() {
        return this._fallbackPrimaryApprovers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageApprovalStage currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(9);
        deserializerMap.put("durationBeforeAutomaticDenial", (n) -> { currentObject.setDurationBeforeAutomaticDenial(n.getPeriodValue()); });
        deserializerMap.put("durationBeforeEscalation", (n) -> { currentObject.setDurationBeforeEscalation(n.getPeriodValue()); });
        deserializerMap.put("escalationApprovers", (n) -> { currentObject.setEscalationApprovers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("fallbackEscalationApprovers", (n) -> { currentObject.setFallbackEscalationApprovers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("fallbackPrimaryApprovers", (n) -> { currentObject.setFallbackPrimaryApprovers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("isApproverJustificationRequired", (n) -> { currentObject.setIsApproverJustificationRequired(n.getBooleanValue()); });
        deserializerMap.put("isEscalationEnabled", (n) -> { currentObject.setIsEscalationEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("primaryApprovers", (n) -> { currentObject.setPrimaryApprovers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the isApproverJustificationRequired property value. Indicates whether the approver is required to provide a justification for approving a request.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApproverJustificationRequired() {
        return this._isApproverJustificationRequired;
    }
    /**
     * Gets the isEscalationEnabled property value. If true, then one or more escalationApprovers are configured in this approval stage.
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
     * Gets the primaryApprovers property value. The subjects, typically users, who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors or externalSponsors.
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
        writer.writePeriodValue("durationBeforeAutomaticDenial", this.getDurationBeforeAutomaticDenial());
        writer.writePeriodValue("durationBeforeEscalation", this.getDurationBeforeEscalation());
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the durationBeforeAutomaticDenial property value. The number of days that a request can be pending a response before it is automatically denied.
     * @param value Value to set for the durationBeforeAutomaticDenial property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDurationBeforeAutomaticDenial(@javax.annotation.Nullable final Period value) {
        this._durationBeforeAutomaticDenial = value;
    }
    /**
     * Sets the durationBeforeEscalation property value. If escalation is required, the time a request can be pending a response from a primary approver.
     * @param value Value to set for the durationBeforeEscalation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDurationBeforeEscalation(@javax.annotation.Nullable final Period value) {
        this._durationBeforeEscalation = value;
    }
    /**
     * Sets the escalationApprovers property value. If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests.
     * @param value Value to set for the escalationApprovers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEscalationApprovers(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this._escalationApprovers = value;
    }
    /**
     * Sets the fallbackEscalationApprovers property value. The subjects, typically users, who are the fallback escalation approvers.
     * @param value Value to set for the fallbackEscalationApprovers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFallbackEscalationApprovers(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this._fallbackEscalationApprovers = value;
    }
    /**
     * Sets the fallbackPrimaryApprovers property value. The subjects, typically users, who are the fallback primary approvers.
     * @param value Value to set for the fallbackPrimaryApprovers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFallbackPrimaryApprovers(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this._fallbackPrimaryApprovers = value;
    }
    /**
     * Sets the isApproverJustificationRequired property value. Indicates whether the approver is required to provide a justification for approving a request.
     * @param value Value to set for the isApproverJustificationRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsApproverJustificationRequired(@javax.annotation.Nullable final Boolean value) {
        this._isApproverJustificationRequired = value;
    }
    /**
     * Sets the isEscalationEnabled property value. If true, then one or more escalationApprovers are configured in this approval stage.
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
     * Sets the primaryApprovers property value. The subjects, typically users, who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors or externalSponsors.
     * @param value Value to set for the primaryApprovers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryApprovers(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this._primaryApprovers = value;
    }
}
