package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationSubmission extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EducationSubmission} and sets the default values.
     */
    public EducationSubmission() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationSubmission}
     */
    @jakarta.annotation.Nonnull
    public static EducationSubmission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSubmission();
    }
    /**
     * Gets the assignmentId property value. The unique identifier for the assignment with which this submission is associated. A submission is always associated with one and only one assignment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignmentId() {
        return this.backingStore.get("assignmentId");
    }
    /**
     * Gets the excusedBy property value. The user that marked the submission as excused.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getExcusedBy() {
        return this.backingStore.get("excusedBy");
    }
    /**
     * Gets the excusedDateTime property value. The time that the submission was excused. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExcusedDateTime() {
        return this.backingStore.get("excusedDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignmentId", (n) -> { this.setAssignmentId(n.getStringValue()); });
        deserializerMap.put("excusedBy", (n) -> { this.setExcusedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("excusedDateTime", (n) -> { this.setExcusedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("outcomes", (n) -> { this.setOutcomes(n.getCollectionOfObjectValues(EducationOutcome::createFromDiscriminatorValue)); });
        deserializerMap.put("reassignedBy", (n) -> { this.setReassignedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("reassignedDateTime", (n) -> { this.setReassignedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recipient", (n) -> { this.setRecipient(n.getObjectValue(EducationSubmissionRecipient::createFromDiscriminatorValue)); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(EducationSubmissionResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourcesFolderUrl", (n) -> { this.setResourcesFolderUrl(n.getStringValue()); });
        deserializerMap.put("returnedBy", (n) -> { this.setReturnedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("returnedDateTime", (n) -> { this.setReturnedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(EducationSubmissionStatus::forValue)); });
        deserializerMap.put("submittedBy", (n) -> { this.setSubmittedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("submittedDateTime", (n) -> { this.setSubmittedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("submittedResources", (n) -> { this.setSubmittedResources(n.getCollectionOfObjectValues(EducationSubmissionResource::createFromDiscriminatorValue)); });
        deserializerMap.put("unsubmittedBy", (n) -> { this.setUnsubmittedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("unsubmittedDateTime", (n) -> { this.setUnsubmittedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. The identities of those who modified the submission.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the submission was modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the outcomes property value. The outcomes property
     * @return a {@link java.util.List<EducationOutcome>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationOutcome> getOutcomes() {
        return this.backingStore.get("outcomes");
    }
    /**
     * Gets the reassignedBy property value. User who moved the status of this submission to reassigned.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getReassignedBy() {
        return this.backingStore.get("reassignedBy");
    }
    /**
     * Gets the reassignedDateTime property value. Moment in time when the submission was reassigned. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReassignedDateTime() {
        return this.backingStore.get("reassignedDateTime");
    }
    /**
     * Gets the recipient property value. Who this submission is assigned to.
     * @return a {@link EducationSubmissionRecipient}
     */
    @jakarta.annotation.Nullable
    public EducationSubmissionRecipient getRecipient() {
        return this.backingStore.get("recipient");
    }
    /**
     * Gets the resources property value. The resources property
     * @return a {@link java.util.List<EducationSubmissionResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationSubmissionResource> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Gets the resourcesFolderUrl property value. Folder where all file resources for this submission need to be stored.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourcesFolderUrl() {
        return this.backingStore.get("resourcesFolderUrl");
    }
    /**
     * Gets the returnedBy property value. User who moved the status of this submission to returned.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getReturnedBy() {
        return this.backingStore.get("returnedBy");
    }
    /**
     * Gets the returnedDateTime property value. Moment in time when the submission was returned. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReturnedDateTime() {
        return this.backingStore.get("returnedDateTime");
    }
    /**
     * Gets the status property value. Read-only. Possible values are: excused, reassigned, returned, submitted and working. Use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: excused and reassigned.
     * @return a {@link EducationSubmissionStatus}
     */
    @jakarta.annotation.Nullable
    public EducationSubmissionStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the submittedBy property value. User who moved the resource into the submitted state.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getSubmittedBy() {
        return this.backingStore.get("submittedBy");
    }
    /**
     * Gets the submittedDateTime property value. Moment in time when the submission was moved into the submitted state. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubmittedDateTime() {
        return this.backingStore.get("submittedDateTime");
    }
    /**
     * Gets the submittedResources property value. The submittedResources property
     * @return a {@link java.util.List<EducationSubmissionResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationSubmissionResource> getSubmittedResources() {
        return this.backingStore.get("submittedResources");
    }
    /**
     * Gets the unsubmittedBy property value. User who moved the resource from submitted into the working state.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getUnsubmittedBy() {
        return this.backingStore.get("unsubmittedBy");
    }
    /**
     * Gets the unsubmittedDateTime property value. Moment in time when the submission was moved from submitted into the working state. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUnsubmittedDateTime() {
        return this.backingStore.get("unsubmittedDateTime");
    }
    /**
     * Gets the webUrl property value. The deep link URL for the given submission.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
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
     * Sets the assignmentId property value. The unique identifier for the assignment with which this submission is associated. A submission is always associated with one and only one assignment.
     * @param value Value to set for the assignmentId property.
     */
    public void setAssignmentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignmentId", value);
    }
    /**
     * Sets the excusedBy property value. The user that marked the submission as excused.
     * @param value Value to set for the excusedBy property.
     */
    public void setExcusedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("excusedBy", value);
    }
    /**
     * Sets the excusedDateTime property value. The time that the submission was excused. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the excusedDateTime property.
     */
    public void setExcusedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("excusedDateTime", value);
    }
    /**
     * Sets the lastModifiedBy property value. The identities of those who modified the submission.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the submission was modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the outcomes property value. The outcomes property
     * @param value Value to set for the outcomes property.
     */
    public void setOutcomes(@jakarta.annotation.Nullable final java.util.List<EducationOutcome> value) {
        this.backingStore.set("outcomes", value);
    }
    /**
     * Sets the reassignedBy property value. User who moved the status of this submission to reassigned.
     * @param value Value to set for the reassignedBy property.
     */
    public void setReassignedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("reassignedBy", value);
    }
    /**
     * Sets the reassignedDateTime property value. Moment in time when the submission was reassigned. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the reassignedDateTime property.
     */
    public void setReassignedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("reassignedDateTime", value);
    }
    /**
     * Sets the recipient property value. Who this submission is assigned to.
     * @param value Value to set for the recipient property.
     */
    public void setRecipient(@jakarta.annotation.Nullable final EducationSubmissionRecipient value) {
        this.backingStore.set("recipient", value);
    }
    /**
     * Sets the resources property value. The resources property
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<EducationSubmissionResource> value) {
        this.backingStore.set("resources", value);
    }
    /**
     * Sets the resourcesFolderUrl property value. Folder where all file resources for this submission need to be stored.
     * @param value Value to set for the resourcesFolderUrl property.
     */
    public void setResourcesFolderUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourcesFolderUrl", value);
    }
    /**
     * Sets the returnedBy property value. User who moved the status of this submission to returned.
     * @param value Value to set for the returnedBy property.
     */
    public void setReturnedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("returnedBy", value);
    }
    /**
     * Sets the returnedDateTime property value. Moment in time when the submission was returned. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the returnedDateTime property.
     */
    public void setReturnedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("returnedDateTime", value);
    }
    /**
     * Sets the status property value. Read-only. Possible values are: excused, reassigned, returned, submitted and working. Use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: excused and reassigned.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final EducationSubmissionStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the submittedBy property value. User who moved the resource into the submitted state.
     * @param value Value to set for the submittedBy property.
     */
    public void setSubmittedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("submittedBy", value);
    }
    /**
     * Sets the submittedDateTime property value. Moment in time when the submission was moved into the submitted state. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the submittedDateTime property.
     */
    public void setSubmittedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("submittedDateTime", value);
    }
    /**
     * Sets the submittedResources property value. The submittedResources property
     * @param value Value to set for the submittedResources property.
     */
    public void setSubmittedResources(@jakarta.annotation.Nullable final java.util.List<EducationSubmissionResource> value) {
        this.backingStore.set("submittedResources", value);
    }
    /**
     * Sets the unsubmittedBy property value. User who moved the resource from submitted into the working state.
     * @param value Value to set for the unsubmittedBy property.
     */
    public void setUnsubmittedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("unsubmittedBy", value);
    }
    /**
     * Sets the unsubmittedDateTime property value. Moment in time when the submission was moved from submitted into the working state. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the unsubmittedDateTime property.
     */
    public void setUnsubmittedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("unsubmittedDateTime", value);
    }
    /**
     * Sets the webUrl property value. The deep link URL for the given submission.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}
