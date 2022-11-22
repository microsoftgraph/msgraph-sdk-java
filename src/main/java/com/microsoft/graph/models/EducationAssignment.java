package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class EducationAssignment extends Entity implements Parsable {
    /** Optional field to control the assignment behavior for students who are added after the assignment is published. If not specified, defaults to none value. Currently supports only two values: none or assignIfOpen. */
    private EducationAddedStudentAction _addedStudentAction;
    /** Optional field to control the assignment behavior  for adding assignments to students' and teachers' calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: studentsOnly. The default value is none. */
    private EducationAddToCalendarOptions _addToCalendarAction;
    /** Identifies whether students can submit after the due date. If this property isn't specified during create, it defaults to true. */
    private Boolean _allowLateSubmissions;
    /** Identifies whether students can add their own resources to a submission or if they can only modify resources added by the teacher. */
    private Boolean _allowStudentsToAddResourcesToSubmission;
    /** The date when the assignment should become active.  If in the future, the assignment isn't shown to the student until this date.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _assignDateTime;
    /** The moment that the assignment was published to students and the assignment shows up on the students timeline.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _assignedDateTime;
    /** Which users, or whole class should receive a submission object once the assignment is published. */
    private EducationAssignmentRecipient _assignTo;
    /** When set, enables users to easily find assignments of a given type.  Read-only. Nullable. */
    private java.util.List<EducationCategory> _categories;
    /** Class which this assignment belongs. */
    private String _classId;
    /** Date when the assignment will be closed for submissions. This is an optional field that can be null if the assignment does not allowLateSubmissions or when the closeDateTime is the same as the dueDateTime. But if specified, then the closeDateTime must be greater than or equal to the dueDateTime. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _closeDateTime;
    /** Who created the assignment. */
    private IdentitySet _createdBy;
    /** Moment when the assignment was created.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _createdDateTime;
    /** Name of the assignment. */
    private String _displayName;
    /** Date when the students assignment is due.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _dueDateTime;
    /** Folder URL where all the feedback file resources for this assignment are stored. */
    private String _feedbackResourcesFolderUrl;
    /** How the assignment will be graded. */
    private EducationAssignmentGradeType _grading;
    /** Instructions for the assignment.  This along with the display name tell the student what to do. */
    private EducationItemBody _instructions;
    /** Who last modified the assignment. */
    private IdentitySet _lastModifiedBy;
    /** Moment when the assignment was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _lastModifiedDateTime;
    /** Optional field to specify the URL of the channel to post the assignment publish notification. If not specified or null, defaults to the General channel. This field only applies to assignments where the assignTo value is educationAssignmentClassRecipient. Updating the notificationChannelUrl isn't allowed after the assignment has been published. */
    private String _notificationChannelUrl;
    /** Learning objects that are associated with this assignment.  Only teachers can modify this list. Nullable. */
    private java.util.List<EducationAssignmentResource> _resources;
    /** Folder URL where all the file resources for this assignment are stored. */
    private String _resourcesFolderUrl;
    /** When set, the grading rubric attached to this assignment. */
    private EducationRubric _rubric;
    /** Status of the Assignment.  You can't PATCH this value.  Possible values are: draft, scheduled, published, assigned. */
    private EducationAssignmentStatus _status;
    /** Once published, there is a submission object for each student representing their work and grade.  Read-only. Nullable. */
    private java.util.List<EducationSubmission> _submissions;
    /** The deep link URL for the given assignment. */
    private String _webUrl;
    /**
     * Instantiates a new educationAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationAssignment
     */
    @javax.annotation.Nonnull
    public static EducationAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignment();
    }
    /**
     * Gets the addedStudentAction property value. Optional field to control the assignment behavior for students who are added after the assignment is published. If not specified, defaults to none value. Currently supports only two values: none or assignIfOpen.
     * @return a educationAddedStudentAction
     */
    @javax.annotation.Nullable
    public EducationAddedStudentAction getAddedStudentAction() {
        return this._addedStudentAction;
    }
    /**
     * Gets the addToCalendarAction property value. Optional field to control the assignment behavior  for adding assignments to students' and teachers' calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: studentsOnly. The default value is none.
     * @return a educationAddToCalendarOptions
     */
    @javax.annotation.Nullable
    public EducationAddToCalendarOptions getAddToCalendarAction() {
        return this._addToCalendarAction;
    }
    /**
     * Gets the allowLateSubmissions property value. Identifies whether students can submit after the due date. If this property isn't specified during create, it defaults to true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowLateSubmissions() {
        return this._allowLateSubmissions;
    }
    /**
     * Gets the allowStudentsToAddResourcesToSubmission property value. Identifies whether students can add their own resources to a submission or if they can only modify resources added by the teacher.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowStudentsToAddResourcesToSubmission() {
        return this._allowStudentsToAddResourcesToSubmission;
    }
    /**
     * Gets the assignDateTime property value. The date when the assignment should become active.  If in the future, the assignment isn't shown to the student until this date.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAssignDateTime() {
        return this._assignDateTime;
    }
    /**
     * Gets the assignedDateTime property value. The moment that the assignment was published to students and the assignment shows up on the students timeline.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAssignedDateTime() {
        return this._assignedDateTime;
    }
    /**
     * Gets the assignTo property value. Which users, or whole class should receive a submission object once the assignment is published.
     * @return a educationAssignmentRecipient
     */
    @javax.annotation.Nullable
    public EducationAssignmentRecipient getAssignTo() {
        return this._assignTo;
    }
    /**
     * Gets the categories property value. When set, enables users to easily find assignments of a given type.  Read-only. Nullable.
     * @return a educationCategory
     */
    @javax.annotation.Nullable
    public java.util.List<EducationCategory> getCategories() {
        return this._categories;
    }
    /**
     * Gets the classId property value. Class which this assignment belongs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClassId() {
        return this._classId;
    }
    /**
     * Gets the closeDateTime property value. Date when the assignment will be closed for submissions. This is an optional field that can be null if the assignment does not allowLateSubmissions or when the closeDateTime is the same as the dueDateTime. But if specified, then the closeDateTime must be greater than or equal to the dueDateTime. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCloseDateTime() {
        return this._closeDateTime;
    }
    /**
     * Gets the createdBy property value. Who created the assignment.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. Moment when the assignment was created.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the displayName property value. Name of the assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the dueDateTime property value. Date when the students assignment is due.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this._dueDateTime;
    }
    /**
     * Gets the feedbackResourcesFolderUrl property value. Folder URL where all the feedback file resources for this assignment are stored.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFeedbackResourcesFolderUrl() {
        return this._feedbackResourcesFolderUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addedStudentAction", (n) -> { this.setAddedStudentAction(n.getEnumValue(EducationAddedStudentAction.class)); });
        deserializerMap.put("addToCalendarAction", (n) -> { this.setAddToCalendarAction(n.getEnumValue(EducationAddToCalendarOptions.class)); });
        deserializerMap.put("allowLateSubmissions", (n) -> { this.setAllowLateSubmissions(n.getBooleanValue()); });
        deserializerMap.put("allowStudentsToAddResourcesToSubmission", (n) -> { this.setAllowStudentsToAddResourcesToSubmission(n.getBooleanValue()); });
        deserializerMap.put("assignDateTime", (n) -> { this.setAssignDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("assignedDateTime", (n) -> { this.setAssignedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("assignTo", (n) -> { this.setAssignTo(n.getObjectValue(EducationAssignmentRecipient::createFromDiscriminatorValue)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfObjectValues(EducationCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("classId", (n) -> { this.setClassId(n.getStringValue()); });
        deserializerMap.put("closeDateTime", (n) -> { this.setCloseDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("feedbackResourcesFolderUrl", (n) -> { this.setFeedbackResourcesFolderUrl(n.getStringValue()); });
        deserializerMap.put("grading", (n) -> { this.setGrading(n.getObjectValue(EducationAssignmentGradeType::createFromDiscriminatorValue)); });
        deserializerMap.put("instructions", (n) -> { this.setInstructions(n.getObjectValue(EducationItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notificationChannelUrl", (n) -> { this.setNotificationChannelUrl(n.getStringValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(EducationAssignmentResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourcesFolderUrl", (n) -> { this.setResourcesFolderUrl(n.getStringValue()); });
        deserializerMap.put("rubric", (n) -> { this.setRubric(n.getObjectValue(EducationRubric::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(EducationAssignmentStatus.class)); });
        deserializerMap.put("submissions", (n) -> { this.setSubmissions(n.getCollectionOfObjectValues(EducationSubmission::createFromDiscriminatorValue)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the grading property value. How the assignment will be graded.
     * @return a educationAssignmentGradeType
     */
    @javax.annotation.Nullable
    public EducationAssignmentGradeType getGrading() {
        return this._grading;
    }
    /**
     * Gets the instructions property value. Instructions for the assignment.  This along with the display name tell the student what to do.
     * @return a educationItemBody
     */
    @javax.annotation.Nullable
    public EducationItemBody getInstructions() {
        return this._instructions;
    }
    /**
     * Gets the lastModifiedBy property value. Who last modified the assignment.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Moment when the assignment was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the notificationChannelUrl property value. Optional field to specify the URL of the channel to post the assignment publish notification. If not specified or null, defaults to the General channel. This field only applies to assignments where the assignTo value is educationAssignmentClassRecipient. Updating the notificationChannelUrl isn't allowed after the assignment has been published.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationChannelUrl() {
        return this._notificationChannelUrl;
    }
    /**
     * Gets the resources property value. Learning objects that are associated with this assignment.  Only teachers can modify this list. Nullable.
     * @return a educationAssignmentResource
     */
    @javax.annotation.Nullable
    public java.util.List<EducationAssignmentResource> getResources() {
        return this._resources;
    }
    /**
     * Gets the resourcesFolderUrl property value. Folder URL where all the file resources for this assignment are stored.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourcesFolderUrl() {
        return this._resourcesFolderUrl;
    }
    /**
     * Gets the rubric property value. When set, the grading rubric attached to this assignment.
     * @return a educationRubric
     */
    @javax.annotation.Nullable
    public EducationRubric getRubric() {
        return this._rubric;
    }
    /**
     * Gets the status property value. Status of the Assignment.  You can't PATCH this value.  Possible values are: draft, scheduled, published, assigned.
     * @return a educationAssignmentStatus
     */
    @javax.annotation.Nullable
    public EducationAssignmentStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the submissions property value. Once published, there is a submission object for each student representing their work and grade.  Read-only. Nullable.
     * @return a educationSubmission
     */
    @javax.annotation.Nullable
    public java.util.List<EducationSubmission> getSubmissions() {
        return this._submissions;
    }
    /**
     * Gets the webUrl property value. The deep link URL for the given assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("addedStudentAction", this.getAddedStudentAction());
        writer.writeEnumValue("addToCalendarAction", this.getAddToCalendarAction());
        writer.writeBooleanValue("allowLateSubmissions", this.getAllowLateSubmissions());
        writer.writeBooleanValue("allowStudentsToAddResourcesToSubmission", this.getAllowStudentsToAddResourcesToSubmission());
        writer.writeObjectValue("assignTo", this.getAssignTo());
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
        writer.writeStringValue("classId", this.getClassId());
        writer.writeOffsetDateTimeValue("closeDateTime", this.getCloseDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("dueDateTime", this.getDueDateTime());
        writer.writeObjectValue("grading", this.getGrading());
        writer.writeObjectValue("instructions", this.getInstructions());
        writer.writeStringValue("notificationChannelUrl", this.getNotificationChannelUrl());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeObjectValue("rubric", this.getRubric());
        writer.writeCollectionOfObjectValues("submissions", this.getSubmissions());
    }
    /**
     * Sets the addedStudentAction property value. Optional field to control the assignment behavior for students who are added after the assignment is published. If not specified, defaults to none value. Currently supports only two values: none or assignIfOpen.
     * @param value Value to set for the addedStudentAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddedStudentAction(@javax.annotation.Nullable final EducationAddedStudentAction value) {
        this._addedStudentAction = value;
    }
    /**
     * Sets the addToCalendarAction property value. Optional field to control the assignment behavior  for adding assignments to students' and teachers' calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: studentsOnly. The default value is none.
     * @param value Value to set for the addToCalendarAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddToCalendarAction(@javax.annotation.Nullable final EducationAddToCalendarOptions value) {
        this._addToCalendarAction = value;
    }
    /**
     * Sets the allowLateSubmissions property value. Identifies whether students can submit after the due date. If this property isn't specified during create, it defaults to true.
     * @param value Value to set for the allowLateSubmissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowLateSubmissions(@javax.annotation.Nullable final Boolean value) {
        this._allowLateSubmissions = value;
    }
    /**
     * Sets the allowStudentsToAddResourcesToSubmission property value. Identifies whether students can add their own resources to a submission or if they can only modify resources added by the teacher.
     * @param value Value to set for the allowStudentsToAddResourcesToSubmission property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowStudentsToAddResourcesToSubmission(@javax.annotation.Nullable final Boolean value) {
        this._allowStudentsToAddResourcesToSubmission = value;
    }
    /**
     * Sets the assignDateTime property value. The date when the assignment should become active.  If in the future, the assignment isn't shown to the student until this date.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the assignDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._assignDateTime = value;
    }
    /**
     * Sets the assignedDateTime property value. The moment that the assignment was published to students and the assignment shows up on the students timeline.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the assignedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._assignedDateTime = value;
    }
    /**
     * Sets the assignTo property value. Which users, or whole class should receive a submission object once the assignment is published.
     * @param value Value to set for the assignTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignTo(@javax.annotation.Nullable final EducationAssignmentRecipient value) {
        this._assignTo = value;
    }
    /**
     * Sets the categories property value. When set, enables users to easily find assignments of a given type.  Read-only. Nullable.
     * @param value Value to set for the categories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategories(@javax.annotation.Nullable final java.util.List<EducationCategory> value) {
        this._categories = value;
    }
    /**
     * Sets the classId property value. Class which this assignment belongs.
     * @param value Value to set for the classId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassId(@javax.annotation.Nullable final String value) {
        this._classId = value;
    }
    /**
     * Sets the closeDateTime property value. Date when the assignment will be closed for submissions. This is an optional field that can be null if the assignment does not allowLateSubmissions or when the closeDateTime is the same as the dueDateTime. But if specified, then the closeDateTime must be greater than or equal to the dueDateTime. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the closeDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloseDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._closeDateTime = value;
    }
    /**
     * Sets the createdBy property value. Who created the assignment.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Moment when the assignment was created.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the displayName property value. Name of the assignment.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the dueDateTime property value. Date when the students assignment is due.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the dueDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDueDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._dueDateTime = value;
    }
    /**
     * Sets the feedbackResourcesFolderUrl property value. Folder URL where all the feedback file resources for this assignment are stored.
     * @param value Value to set for the feedbackResourcesFolderUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeedbackResourcesFolderUrl(@javax.annotation.Nullable final String value) {
        this._feedbackResourcesFolderUrl = value;
    }
    /**
     * Sets the grading property value. How the assignment will be graded.
     * @param value Value to set for the grading property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGrading(@javax.annotation.Nullable final EducationAssignmentGradeType value) {
        this._grading = value;
    }
    /**
     * Sets the instructions property value. Instructions for the assignment.  This along with the display name tell the student what to do.
     * @param value Value to set for the instructions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstructions(@javax.annotation.Nullable final EducationItemBody value) {
        this._instructions = value;
    }
    /**
     * Sets the lastModifiedBy property value. Who last modified the assignment.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Moment when the assignment was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the notificationChannelUrl property value. Optional field to specify the URL of the channel to post the assignment publish notification. If not specified or null, defaults to the General channel. This field only applies to assignments where the assignTo value is educationAssignmentClassRecipient. Updating the notificationChannelUrl isn't allowed after the assignment has been published.
     * @param value Value to set for the notificationChannelUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationChannelUrl(@javax.annotation.Nullable final String value) {
        this._notificationChannelUrl = value;
    }
    /**
     * Sets the resources property value. Learning objects that are associated with this assignment.  Only teachers can modify this list. Nullable.
     * @param value Value to set for the resources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResources(@javax.annotation.Nullable final java.util.List<EducationAssignmentResource> value) {
        this._resources = value;
    }
    /**
     * Sets the resourcesFolderUrl property value. Folder URL where all the file resources for this assignment are stored.
     * @param value Value to set for the resourcesFolderUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourcesFolderUrl(@javax.annotation.Nullable final String value) {
        this._resourcesFolderUrl = value;
    }
    /**
     * Sets the rubric property value. When set, the grading rubric attached to this assignment.
     * @param value Value to set for the rubric property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRubric(@javax.annotation.Nullable final EducationRubric value) {
        this._rubric = value;
    }
    /**
     * Sets the status property value. Status of the Assignment.  You can't PATCH this value.  Possible values are: draft, scheduled, published, assigned.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final EducationAssignmentStatus value) {
        this._status = value;
    }
    /**
     * Sets the submissions property value. Once published, there is a submission object for each student representing their work and grade.  Read-only. Nullable.
     * @param value Value to set for the submissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubmissions(@javax.annotation.Nullable final java.util.List<EducationSubmission> value) {
        this._submissions = value;
    }
    /**
     * Sets the webUrl property value. The deep link URL for the given assignment.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
