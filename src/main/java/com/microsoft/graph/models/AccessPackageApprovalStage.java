package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageApprovalStage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of days that a request can be pending a response before it is automatically denied.
     */
    private PeriodAndDuration durationBeforeAutomaticDenial;
    /**
     * If escalation is required, the time a request can be pending a response from a primary approver.
     */
    private PeriodAndDuration durationBeforeEscalation;
    /**
     * If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests.
     */
    private java.util.List<SubjectSet> escalationApprovers;
    /**
     * The subjects, typically users, who are the fallback escalation approvers.
     */
    private java.util.List<SubjectSet> fallbackEscalationApprovers;
    /**
     * The subjects, typically users, who are the fallback primary approvers.
     */
    private java.util.List<SubjectSet> fallbackPrimaryApprovers;
    /**
     * Indicates whether the approver is required to provide a justification for approving a request.
     */
    private Boolean isApproverJustificationRequired;
    /**
     * If true, then one or more escalationApprovers are configured in this approval stage.
     */
    private Boolean isEscalationEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The subjects, typically users, who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors or externalSponsors.
     */
    private java.util.List<SubjectSet> primaryApprovers;
    /**
     * Instantiates a new accessPackageApprovalStage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageApprovalStage() {
        this.setAdditionalData(new HashMap<>());
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
        return this.additionalData;
    }
    /**
     * Gets the durationBeforeAutomaticDenial property value. The number of days that a request can be pending a response before it is automatically denied.
     * @return a PeriodAndDuration
     */
    @javax.annotation.Nullable
    public PeriodAndDuration getDurationBeforeAutomaticDenial() {
        return this.durationBeforeAutomaticDenial;
    }
    /**
     * Gets the durationBeforeEscalation property value. If escalation is required, the time a request can be pending a response from a primary approver.
     * @return a PeriodAndDuration
     */
    @javax.annotation.Nullable
    public PeriodAndDuration getDurationBeforeEscalation() {
        return this.durationBeforeEscalation;
    }
    /**
     * Gets the escalationApprovers property value. If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getEscalationApprovers() {
        return this.escalationApprovers;
    }
    /**
     * Gets the fallbackEscalationApprovers property value. The subjects, typically users, who are the fallback escalation approvers.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getFallbackEscalationApprovers() {
        return this.fallbackEscalationApprovers;
    }
    /**
     * Gets the fallbackPrimaryApprovers property value. The subjects, typically users, who are the fallback primary approvers.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getFallbackPrimaryApprovers() {
        return this.fallbackPrimaryApprovers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApproverJustificationRequired() {
        return this.isApproverJustificationRequired;
    }
    /**
     * Gets the isEscalationEnabled property value. If true, then one or more escalationApprovers are configured in this approval stage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEscalationEnabled() {
        return this.isEscalationEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the primaryApprovers property value. The subjects, typically users, who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors or externalSponsors.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getPrimaryApprovers() {
        return this.primaryApprovers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the durationBeforeAutomaticDenial property value. The number of days that a request can be pending a response before it is automatically denied.
     * @param value Value to set for the durationBeforeAutomaticDenial property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDurationBeforeAutomaticDenial(@javax.annotation.Nullable final PeriodAndDuration value) {
        this.durationBeforeAutomaticDenial = value;
    }
    /**
     * Sets the durationBeforeEscalation property value. If escalation is required, the time a request can be pending a response from a primary approver.
     * @param value Value to set for the durationBeforeEscalation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDurationBeforeEscalation(@javax.annotation.Nullable final PeriodAndDuration value) {
        this.durationBeforeEscalation = value;
    }
    /**
     * Sets the escalationApprovers property value. If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers are the users who will be asked to approve requests.
     * @param value Value to set for the escalationApprovers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEscalationApprovers(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.escalationApprovers = value;
    }
    /**
     * Sets the fallbackEscalationApprovers property value. The subjects, typically users, who are the fallback escalation approvers.
     * @param value Value to set for the fallbackEscalationApprovers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFallbackEscalationApprovers(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.fallbackEscalationApprovers = value;
    }
    /**
     * Sets the fallbackPrimaryApprovers property value. The subjects, typically users, who are the fallback primary approvers.
     * @param value Value to set for the fallbackPrimaryApprovers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFallbackPrimaryApprovers(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.fallbackPrimaryApprovers = value;
    }
    /**
     * Sets the isApproverJustificationRequired property value. Indicates whether the approver is required to provide a justification for approving a request.
     * @param value Value to set for the isApproverJustificationRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsApproverJustificationRequired(@javax.annotation.Nullable final Boolean value) {
        this.isApproverJustificationRequired = value;
    }
    /**
     * Sets the isEscalationEnabled property value. If true, then one or more escalationApprovers are configured in this approval stage.
     * @param value Value to set for the isEscalationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEscalationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEscalationEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the primaryApprovers property value. The subjects, typically users, who will be asked to approve requests. A collection of singleUser, groupMembers, requestorManager, internalSponsors or externalSponsors.
     * @param value Value to set for the primaryApprovers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryApprovers(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.primaryApprovers = value;
    }
}
