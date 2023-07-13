package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubjectRightsRequest extends Entity implements Parsable {
    /**
     * Identity that the request is assigned to.
     */
    private Identity assignedTo;
    /**
     * The date and time when the request was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime closedDateTime;
    /**
     * Identity information for the entity that created the request.
     */
    private IdentitySet createdBy;
    /**
     * The date and time when the request was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Information about the data subject.
     */
    private DataSubject dataSubject;
    /**
     * The type of the data subject. Possible values are: customer, currentEmployee, formerEmployee, prospectiveEmployee, student, teacher, faculty, other, unknownFutureValue.
     */
    private DataSubjectType dataSubjectType;
    /**
     * Description for the request.
     */
    private String description;
    /**
     * The name of the request.
     */
    private String displayName;
    /**
     * Collection of history change events.
     */
    private java.util.List<SubjectRightsRequestHistory> history;
    /**
     * Insight about the request.
     */
    private SubjectRightsRequestDetail insight;
    /**
     * The date and time when the request is internally due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime internalDueDateTime;
    /**
     * Identity information for the entity that last modified the request.
     */
    private IdentitySet lastModifiedBy;
    /**
     * The date and time when the request was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * List of notes associcated with the request.
     */
    private java.util.List<AuthoredNote> notes;
    /**
     * List of regulations that this request will fulfill.
     */
    private java.util.List<String> regulations;
    /**
     * Information about the different stages for the request.
     */
    private java.util.List<SubjectRightsRequestStageDetail> stages;
    /**
     * The status of the request.. Possible values are: active, closed, unknownFutureValue.
     */
    private SubjectRightsRequestStatus status;
    /**
     * Information about the Microsoft Teams team that was created for the request.
     */
    private Team team;
    /**
     * The type of the request. Possible values are: export, delete,  access, tagForAction, unknownFutureValue.
     */
    private SubjectRightsRequestType type;
    /**
     * Instantiates a new subjectRightsRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubjectRightsRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a subjectRightsRequest
     */
    @javax.annotation.Nonnull
    public static SubjectRightsRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubjectRightsRequest();
    }
    /**
     * Gets the assignedTo property value. Identity that the request is assigned to.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getAssignedTo() {
        return this.assignedTo;
    }
    /**
     * Gets the closedDateTime property value. The date and time when the request was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getClosedDateTime() {
        return this.closedDateTime;
    }
    /**
     * Gets the createdBy property value. Identity information for the entity that created the request.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the request was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the dataSubject property value. Information about the data subject.
     * @return a dataSubject
     */
    @javax.annotation.Nullable
    public DataSubject getDataSubject() {
        return this.dataSubject;
    }
    /**
     * Gets the dataSubjectType property value. The type of the data subject. Possible values are: customer, currentEmployee, formerEmployee, prospectiveEmployee, student, teacher, faculty, other, unknownFutureValue.
     * @return a dataSubjectType
     */
    @javax.annotation.Nullable
    public DataSubjectType getDataSubjectType() {
        return this.dataSubjectType;
    }
    /**
     * Gets the description property value. Description for the request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The name of the request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("closedDateTime", (n) -> { this.setClosedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dataSubject", (n) -> { this.setDataSubject(n.getObjectValue(DataSubject::createFromDiscriminatorValue)); });
        deserializerMap.put("dataSubjectType", (n) -> { this.setDataSubjectType(n.getEnumValue(DataSubjectType.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("history", (n) -> { this.setHistory(n.getCollectionOfObjectValues(SubjectRightsRequestHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("insight", (n) -> { this.setInsight(n.getObjectValue(SubjectRightsRequestDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("internalDueDateTime", (n) -> { this.setInternalDueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getCollectionOfObjectValues(AuthoredNote::createFromDiscriminatorValue)); });
        deserializerMap.put("regulations", (n) -> { this.setRegulations(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("stages", (n) -> { this.setStages(n.getCollectionOfObjectValues(SubjectRightsRequestStageDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SubjectRightsRequestStatus.class)); });
        deserializerMap.put("team", (n) -> { this.setTeam(n.getObjectValue(Team::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(SubjectRightsRequestType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. Collection of history change events.
     * @return a subjectRightsRequestHistory
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectRightsRequestHistory> getHistory() {
        return this.history;
    }
    /**
     * Gets the insight property value. Insight about the request.
     * @return a subjectRightsRequestDetail
     */
    @javax.annotation.Nullable
    public SubjectRightsRequestDetail getInsight() {
        return this.insight;
    }
    /**
     * Gets the internalDueDateTime property value. The date and time when the request is internally due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getInternalDueDateTime() {
        return this.internalDueDateTime;
    }
    /**
     * Gets the lastModifiedBy property value. Identity information for the entity that last modified the request.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the request was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the notes property value. List of notes associcated with the request.
     * @return a authoredNote
     */
    @javax.annotation.Nullable
    public java.util.List<AuthoredNote> getNotes() {
        return this.notes;
    }
    /**
     * Gets the regulations property value. List of regulations that this request will fulfill.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRegulations() {
        return this.regulations;
    }
    /**
     * Gets the stages property value. Information about the different stages for the request.
     * @return a subjectRightsRequestStageDetail
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectRightsRequestStageDetail> getStages() {
        return this.stages;
    }
    /**
     * Gets the status property value. The status of the request.. Possible values are: active, closed, unknownFutureValue.
     * @return a subjectRightsRequestStatus
     */
    @javax.annotation.Nullable
    public SubjectRightsRequestStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the team property value. Information about the Microsoft Teams team that was created for the request.
     * @return a team
     */
    @javax.annotation.Nullable
    public Team getTeam() {
        return this.team;
    }
    /**
     * Gets the type property value. The type of the request. Possible values are: export, delete,  access, tagForAction, unknownFutureValue.
     * @return a subjectRightsRequestType
     */
    @javax.annotation.Nullable
    public SubjectRightsRequestType getType() {
        return this.type;
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
        writer.writeObjectValue("assignedTo", this.getAssignedTo());
        writer.writeOffsetDateTimeValue("closedDateTime", this.getClosedDateTime());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("dataSubject", this.getDataSubject());
        writer.writeEnumValue("dataSubjectType", this.getDataSubjectType());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("history", this.getHistory());
        writer.writeObjectValue("insight", this.getInsight());
        writer.writeOffsetDateTimeValue("internalDueDateTime", this.getInternalDueDateTime());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("notes", this.getNotes());
        writer.writeCollectionOfPrimitiveValues("regulations", this.getRegulations());
        writer.writeCollectionOfObjectValues("stages", this.getStages());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("team", this.getTeam());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the assignedTo property value. Identity that the request is assigned to.
     * @param value Value to set for the assignedTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedTo(@javax.annotation.Nullable final Identity value) {
        this.assignedTo = value;
    }
    /**
     * Sets the closedDateTime property value. The date and time when the request was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the closedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClosedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.closedDateTime = value;
    }
    /**
     * Sets the createdBy property value. Identity information for the entity that created the request.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the request was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the dataSubject property value. Information about the data subject.
     * @param value Value to set for the dataSubject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataSubject(@javax.annotation.Nullable final DataSubject value) {
        this.dataSubject = value;
    }
    /**
     * Sets the dataSubjectType property value. The type of the data subject. Possible values are: customer, currentEmployee, formerEmployee, prospectiveEmployee, student, teacher, faculty, other, unknownFutureValue.
     * @param value Value to set for the dataSubjectType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataSubjectType(@javax.annotation.Nullable final DataSubjectType value) {
        this.dataSubjectType = value;
    }
    /**
     * Sets the description property value. Description for the request.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The name of the request.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the history property value. Collection of history change events.
     * @param value Value to set for the history property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHistory(@javax.annotation.Nullable final java.util.List<SubjectRightsRequestHistory> value) {
        this.history = value;
    }
    /**
     * Sets the insight property value. Insight about the request.
     * @param value Value to set for the insight property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInsight(@javax.annotation.Nullable final SubjectRightsRequestDetail value) {
        this.insight = value;
    }
    /**
     * Sets the internalDueDateTime property value. The date and time when the request is internally due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the internalDueDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternalDueDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.internalDueDateTime = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity information for the entity that last modified the request.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the request was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the notes property value. List of notes associcated with the request.
     * @param value Value to set for the notes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotes(@javax.annotation.Nullable final java.util.List<AuthoredNote> value) {
        this.notes = value;
    }
    /**
     * Sets the regulations property value. List of regulations that this request will fulfill.
     * @param value Value to set for the regulations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegulations(@javax.annotation.Nullable final java.util.List<String> value) {
        this.regulations = value;
    }
    /**
     * Sets the stages property value. Information about the different stages for the request.
     * @param value Value to set for the stages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStages(@javax.annotation.Nullable final java.util.List<SubjectRightsRequestStageDetail> value) {
        this.stages = value;
    }
    /**
     * Sets the status property value. The status of the request.. Possible values are: active, closed, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final SubjectRightsRequestStatus value) {
        this.status = value;
    }
    /**
     * Sets the team property value. Information about the Microsoft Teams team that was created for the request.
     * @param value Value to set for the team property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeam(@javax.annotation.Nullable final Team value) {
        this.team = value;
    }
    /**
     * Sets the type property value. The type of the request. Possible values are: export, delete,  access, tagForAction, unknownFutureValue.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final SubjectRightsRequestType value) {
        this.type = value;
    }
}
