package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSubmission extends Entity implements Parsable {
    /** Read-Write. Nullable. */
    private java.util.List<EducationOutcome> _outcomes;
    /** User who moved the status of this submission to reassigned. */
    private IdentitySet _reassignedBy;
    /** Moment in time when the submission was reassigned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _reassignedDateTime;
    /** Who this submission is assigned to. */
    private EducationSubmissionRecipient _recipient;
    /** Nullable. */
    private java.util.List<EducationSubmissionResource> _resources;
    /** Folder where all file resources for this submission need to be stored. */
    private String _resourcesFolderUrl;
    /** User who moved the status of this submission to returned. */
    private IdentitySet _returnedBy;
    /** Moment in time when the submission was returned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _returnedDateTime;
    /** Read-only. Possible values are: working, submitted, released, returned, unknownFutureValue and reassigned. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: reassigned. */
    private EducationSubmissionStatus _status;
    /** User who moved the resource into the submitted state. */
    private IdentitySet _submittedBy;
    /** Moment in time when the submission was moved into the submitted state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _submittedDateTime;
    /** Read-only. Nullable. */
    private java.util.List<EducationSubmissionResource> _submittedResources;
    /** User who moved the resource from submitted into the working state. */
    private IdentitySet _unsubmittedBy;
    /** Moment in time when the submission was moved from submitted into the working state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _unsubmittedDateTime;
    /**
     * Instantiates a new educationSubmission and sets the default values.
     * @return a void
     */
    public EducationSubmission() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationSubmission
     */
    @javax.annotation.Nonnull
    public static EducationSubmission createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSubmission();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationSubmission currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("outcomes", (n) -> { currentObject.setOutcomes(n.getCollectionOfObjectValues(EducationOutcome::createFromDiscriminatorValue)); });
            this.put("reassignedBy", (n) -> { currentObject.setReassignedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("reassignedDateTime", (n) -> { currentObject.setReassignedDateTime(n.getOffsetDateTimeValue()); });
            this.put("recipient", (n) -> { currentObject.setRecipient(n.getObjectValue(EducationSubmissionRecipient::createFromDiscriminatorValue)); });
            this.put("resources", (n) -> { currentObject.setResources(n.getCollectionOfObjectValues(EducationSubmissionResource::createFromDiscriminatorValue)); });
            this.put("resourcesFolderUrl", (n) -> { currentObject.setResourcesFolderUrl(n.getStringValue()); });
            this.put("returnedBy", (n) -> { currentObject.setReturnedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("returnedDateTime", (n) -> { currentObject.setReturnedDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(EducationSubmissionStatus.class)); });
            this.put("submittedBy", (n) -> { currentObject.setSubmittedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("submittedDateTime", (n) -> { currentObject.setSubmittedDateTime(n.getOffsetDateTimeValue()); });
            this.put("submittedResources", (n) -> { currentObject.setSubmittedResources(n.getCollectionOfObjectValues(EducationSubmissionResource::createFromDiscriminatorValue)); });
            this.put("unsubmittedBy", (n) -> { currentObject.setUnsubmittedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("unsubmittedDateTime", (n) -> { currentObject.setUnsubmittedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the outcomes property value. Read-Write. Nullable.
     * @return a educationOutcome
     */
    @javax.annotation.Nullable
    public java.util.List<EducationOutcome> getOutcomes() {
        return this._outcomes;
    }
    /**
     * Gets the reassignedBy property value. User who moved the status of this submission to reassigned.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getReassignedBy() {
        return this._reassignedBy;
    }
    /**
     * Gets the reassignedDateTime property value. Moment in time when the submission was reassigned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReassignedDateTime() {
        return this._reassignedDateTime;
    }
    /**
     * Gets the recipient property value. Who this submission is assigned to.
     * @return a educationSubmissionRecipient
     */
    @javax.annotation.Nullable
    public EducationSubmissionRecipient getRecipient() {
        return this._recipient;
    }
    /**
     * Gets the resources property value. Nullable.
     * @return a educationSubmissionResource
     */
    @javax.annotation.Nullable
    public java.util.List<EducationSubmissionResource> getResources() {
        return this._resources;
    }
    /**
     * Gets the resourcesFolderUrl property value. Folder where all file resources for this submission need to be stored.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourcesFolderUrl() {
        return this._resourcesFolderUrl;
    }
    /**
     * Gets the returnedBy property value. User who moved the status of this submission to returned.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getReturnedBy() {
        return this._returnedBy;
    }
    /**
     * Gets the returnedDateTime property value. Moment in time when the submission was returned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReturnedDateTime() {
        return this._returnedDateTime;
    }
    /**
     * Gets the status property value. Read-only. Possible values are: working, submitted, released, returned, unknownFutureValue and reassigned. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: reassigned.
     * @return a educationSubmissionStatus
     */
    @javax.annotation.Nullable
    public EducationSubmissionStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the submittedBy property value. User who moved the resource into the submitted state.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getSubmittedBy() {
        return this._submittedBy;
    }
    /**
     * Gets the submittedDateTime property value. Moment in time when the submission was moved into the submitted state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSubmittedDateTime() {
        return this._submittedDateTime;
    }
    /**
     * Gets the submittedResources property value. Read-only. Nullable.
     * @return a educationSubmissionResource
     */
    @javax.annotation.Nullable
    public java.util.List<EducationSubmissionResource> getSubmittedResources() {
        return this._submittedResources;
    }
    /**
     * Gets the unsubmittedBy property value. User who moved the resource from submitted into the working state.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getUnsubmittedBy() {
        return this._unsubmittedBy;
    }
    /**
     * Gets the unsubmittedDateTime property value. Moment in time when the submission was moved from submitted into the working state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUnsubmittedDateTime() {
        return this._unsubmittedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("outcomes", this.getOutcomes());
        writer.writeObjectValue("reassignedBy", this.getReassignedBy());
        writer.writeOffsetDateTimeValue("reassignedDateTime", this.getReassignedDateTime());
        writer.writeObjectValue("recipient", this.getRecipient());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeStringValue("resourcesFolderUrl", this.getResourcesFolderUrl());
        writer.writeObjectValue("returnedBy", this.getReturnedBy());
        writer.writeOffsetDateTimeValue("returnedDateTime", this.getReturnedDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("submittedBy", this.getSubmittedBy());
        writer.writeOffsetDateTimeValue("submittedDateTime", this.getSubmittedDateTime());
        writer.writeCollectionOfObjectValues("submittedResources", this.getSubmittedResources());
        writer.writeObjectValue("unsubmittedBy", this.getUnsubmittedBy());
        writer.writeOffsetDateTimeValue("unsubmittedDateTime", this.getUnsubmittedDateTime());
    }
    /**
     * Sets the outcomes property value. Read-Write. Nullable.
     * @param value Value to set for the outcomes property.
     * @return a void
     */
    public void setOutcomes(@javax.annotation.Nullable final java.util.List<EducationOutcome> value) {
        this._outcomes = value;
    }
    /**
     * Sets the reassignedBy property value. User who moved the status of this submission to reassigned.
     * @param value Value to set for the reassignedBy property.
     * @return a void
     */
    public void setReassignedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._reassignedBy = value;
    }
    /**
     * Sets the reassignedDateTime property value. Moment in time when the submission was reassigned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the reassignedDateTime property.
     * @return a void
     */
    public void setReassignedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._reassignedDateTime = value;
    }
    /**
     * Sets the recipient property value. Who this submission is assigned to.
     * @param value Value to set for the recipient property.
     * @return a void
     */
    public void setRecipient(@javax.annotation.Nullable final EducationSubmissionRecipient value) {
        this._recipient = value;
    }
    /**
     * Sets the resources property value. Nullable.
     * @param value Value to set for the resources property.
     * @return a void
     */
    public void setResources(@javax.annotation.Nullable final java.util.List<EducationSubmissionResource> value) {
        this._resources = value;
    }
    /**
     * Sets the resourcesFolderUrl property value. Folder where all file resources for this submission need to be stored.
     * @param value Value to set for the resourcesFolderUrl property.
     * @return a void
     */
    public void setResourcesFolderUrl(@javax.annotation.Nullable final String value) {
        this._resourcesFolderUrl = value;
    }
    /**
     * Sets the returnedBy property value. User who moved the status of this submission to returned.
     * @param value Value to set for the returnedBy property.
     * @return a void
     */
    public void setReturnedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._returnedBy = value;
    }
    /**
     * Sets the returnedDateTime property value. Moment in time when the submission was returned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the returnedDateTime property.
     * @return a void
     */
    public void setReturnedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._returnedDateTime = value;
    }
    /**
     * Sets the status property value. Read-only. Possible values are: working, submitted, released, returned, unknownFutureValue and reassigned. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: reassigned.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final EducationSubmissionStatus value) {
        this._status = value;
    }
    /**
     * Sets the submittedBy property value. User who moved the resource into the submitted state.
     * @param value Value to set for the submittedBy property.
     * @return a void
     */
    public void setSubmittedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._submittedBy = value;
    }
    /**
     * Sets the submittedDateTime property value. Moment in time when the submission was moved into the submitted state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the submittedDateTime property.
     * @return a void
     */
    public void setSubmittedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._submittedDateTime = value;
    }
    /**
     * Sets the submittedResources property value. Read-only. Nullable.
     * @param value Value to set for the submittedResources property.
     * @return a void
     */
    public void setSubmittedResources(@javax.annotation.Nullable final java.util.List<EducationSubmissionResource> value) {
        this._submittedResources = value;
    }
    /**
     * Sets the unsubmittedBy property value. User who moved the resource from submitted into the working state.
     * @param value Value to set for the unsubmittedBy property.
     * @return a void
     */
    public void setUnsubmittedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._unsubmittedBy = value;
    }
    /**
     * Sets the unsubmittedDateTime property value. Moment in time when the submission was moved from submitted into the working state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the unsubmittedDateTime property.
     * @return a void
     */
    public void setUnsubmittedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._unsubmittedDateTime = value;
    }
}
