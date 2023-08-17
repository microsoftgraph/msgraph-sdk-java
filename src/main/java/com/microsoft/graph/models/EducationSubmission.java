package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSubmission extends Entity implements Parsable {
    /**
     * The outcomes property
     */
    private java.util.List<EducationOutcome> outcomes;
    /**
     * User who moved the status of this submission to reassigned.
     */
    private IdentitySet reassignedBy;
    /**
     * Moment in time when the submission was reassigned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime reassignedDateTime;
    /**
     * Who this submission is assigned to.
     */
    private EducationSubmissionRecipient recipient;
    /**
     * The resources property
     */
    private java.util.List<EducationSubmissionResource> resources;
    /**
     * Folder where all file resources for this submission need to be stored.
     */
    private String resourcesFolderUrl;
    /**
     * User who moved the status of this submission to returned.
     */
    private IdentitySet returnedBy;
    /**
     * Moment in time when the submission was returned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime returnedDateTime;
    /**
     * Read-only. Possible values are: working, submitted, returned, and reassigned. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: reassigned.
     */
    private EducationSubmissionStatus status;
    /**
     * User who moved the resource into the submitted state.
     */
    private IdentitySet submittedBy;
    /**
     * Moment in time when the submission was moved into the submitted state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime submittedDateTime;
    /**
     * The submittedResources property
     */
    private java.util.List<EducationSubmissionResource> submittedResources;
    /**
     * User who moved the resource from submitted into the working state.
     */
    private IdentitySet unsubmittedBy;
    /**
     * Moment in time when the submission was moved from submitted into the working state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime unsubmittedDateTime;
    /**
     * Instantiates a new educationSubmission and sets the default values.
     */
    public EducationSubmission() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationSubmission
     */
    @jakarta.annotation.Nonnull
    public static EducationSubmission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSubmission();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("outcomes", (n) -> { this.setOutcomes(n.getCollectionOfObjectValues(EducationOutcome::createFromDiscriminatorValue)); });
        deserializerMap.put("reassignedBy", (n) -> { this.setReassignedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("reassignedDateTime", (n) -> { this.setReassignedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recipient", (n) -> { this.setRecipient(n.getObjectValue(EducationSubmissionRecipient::createFromDiscriminatorValue)); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(EducationSubmissionResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourcesFolderUrl", (n) -> { this.setResourcesFolderUrl(n.getStringValue()); });
        deserializerMap.put("returnedBy", (n) -> { this.setReturnedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("returnedDateTime", (n) -> { this.setReturnedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(EducationSubmissionStatus.class)); });
        deserializerMap.put("submittedBy", (n) -> { this.setSubmittedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("submittedDateTime", (n) -> { this.setSubmittedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("submittedResources", (n) -> { this.setSubmittedResources(n.getCollectionOfObjectValues(EducationSubmissionResource::createFromDiscriminatorValue)); });
        deserializerMap.put("unsubmittedBy", (n) -> { this.setUnsubmittedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("unsubmittedDateTime", (n) -> { this.setUnsubmittedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the outcomes property value. The outcomes property
     * @return a educationOutcome
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationOutcome> getOutcomes() {
        return this.outcomes;
    }
    /**
     * Gets the reassignedBy property value. User who moved the status of this submission to reassigned.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getReassignedBy() {
        return this.reassignedBy;
    }
    /**
     * Gets the reassignedDateTime property value. Moment in time when the submission was reassigned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReassignedDateTime() {
        return this.reassignedDateTime;
    }
    /**
     * Gets the recipient property value. Who this submission is assigned to.
     * @return a educationSubmissionRecipient
     */
    @jakarta.annotation.Nullable
    public EducationSubmissionRecipient getRecipient() {
        return this.recipient;
    }
    /**
     * Gets the resources property value. The resources property
     * @return a educationSubmissionResource
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationSubmissionResource> getResources() {
        return this.resources;
    }
    /**
     * Gets the resourcesFolderUrl property value. Folder where all file resources for this submission need to be stored.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResourcesFolderUrl() {
        return this.resourcesFolderUrl;
    }
    /**
     * Gets the returnedBy property value. User who moved the status of this submission to returned.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getReturnedBy() {
        return this.returnedBy;
    }
    /**
     * Gets the returnedDateTime property value. Moment in time when the submission was returned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReturnedDateTime() {
        return this.returnedDateTime;
    }
    /**
     * Gets the status property value. Read-only. Possible values are: working, submitted, returned, and reassigned. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: reassigned.
     * @return a educationSubmissionStatus
     */
    @jakarta.annotation.Nullable
    public EducationSubmissionStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the submittedBy property value. User who moved the resource into the submitted state.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getSubmittedBy() {
        return this.submittedBy;
    }
    /**
     * Gets the submittedDateTime property value. Moment in time when the submission was moved into the submitted state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubmittedDateTime() {
        return this.submittedDateTime;
    }
    /**
     * Gets the submittedResources property value. The submittedResources property
     * @return a educationSubmissionResource
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationSubmissionResource> getSubmittedResources() {
        return this.submittedResources;
    }
    /**
     * Gets the unsubmittedBy property value. User who moved the resource from submitted into the working state.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getUnsubmittedBy() {
        return this.unsubmittedBy;
    }
    /**
     * Gets the unsubmittedDateTime property value. Moment in time when the submission was moved from submitted into the working state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUnsubmittedDateTime() {
        return this.unsubmittedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("outcomes", this.getOutcomes());
        writer.writeObjectValue("recipient", this.getRecipient());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeCollectionOfObjectValues("submittedResources", this.getSubmittedResources());
    }
    /**
     * Sets the outcomes property value. The outcomes property
     * @param value Value to set for the outcomes property.
     */
    public void setOutcomes(@jakarta.annotation.Nullable final java.util.List<EducationOutcome> value) {
        this.outcomes = value;
    }
    /**
     * Sets the reassignedBy property value. User who moved the status of this submission to reassigned.
     * @param value Value to set for the reassignedBy property.
     */
    public void setReassignedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.reassignedBy = value;
    }
    /**
     * Sets the reassignedDateTime property value. Moment in time when the submission was reassigned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the reassignedDateTime property.
     */
    public void setReassignedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.reassignedDateTime = value;
    }
    /**
     * Sets the recipient property value. Who this submission is assigned to.
     * @param value Value to set for the recipient property.
     */
    public void setRecipient(@jakarta.annotation.Nullable final EducationSubmissionRecipient value) {
        this.recipient = value;
    }
    /**
     * Sets the resources property value. The resources property
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<EducationSubmissionResource> value) {
        this.resources = value;
    }
    /**
     * Sets the resourcesFolderUrl property value. Folder where all file resources for this submission need to be stored.
     * @param value Value to set for the resourcesFolderUrl property.
     */
    public void setResourcesFolderUrl(@jakarta.annotation.Nullable final String value) {
        this.resourcesFolderUrl = value;
    }
    /**
     * Sets the returnedBy property value. User who moved the status of this submission to returned.
     * @param value Value to set for the returnedBy property.
     */
    public void setReturnedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.returnedBy = value;
    }
    /**
     * Sets the returnedDateTime property value. Moment in time when the submission was returned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the returnedDateTime property.
     */
    public void setReturnedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.returnedDateTime = value;
    }
    /**
     * Sets the status property value. Read-only. Possible values are: working, submitted, returned, and reassigned. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: reassigned.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final EducationSubmissionStatus value) {
        this.status = value;
    }
    /**
     * Sets the submittedBy property value. User who moved the resource into the submitted state.
     * @param value Value to set for the submittedBy property.
     */
    public void setSubmittedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.submittedBy = value;
    }
    /**
     * Sets the submittedDateTime property value. Moment in time when the submission was moved into the submitted state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the submittedDateTime property.
     */
    public void setSubmittedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.submittedDateTime = value;
    }
    /**
     * Sets the submittedResources property value. The submittedResources property
     * @param value Value to set for the submittedResources property.
     */
    public void setSubmittedResources(@jakarta.annotation.Nullable final java.util.List<EducationSubmissionResource> value) {
        this.submittedResources = value;
    }
    /**
     * Sets the unsubmittedBy property value. User who moved the resource from submitted into the working state.
     * @param value Value to set for the unsubmittedBy property.
     */
    public void setUnsubmittedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.unsubmittedBy = value;
    }
    /**
     * Sets the unsubmittedDateTime property value. Moment in time when the submission was moved from submitted into the working state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the unsubmittedDateTime property.
     */
    public void setUnsubmittedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.unsubmittedDateTime = value;
    }
}
