package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the privacy singleton. */
public class SubjectRightsRequest extends Entity implements Parsable {
    /** Identity that the request is assigned to. */
    private Identity _assignedTo;
    /** The date and time when the request was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _closedDateTime;
    /** Identity information for the entity that created the request. */
    private IdentitySet _createdBy;
    /** The date and time when the request was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _createdDateTime;
    /** Information about the data subject. */
    private DataSubject _dataSubject;
    /** The type of the data subject. Possible values are: customer, currentEmployee, formerEmployee, prospectiveEmployee, student, teacher, faculty, other, unknownFutureValue. */
    private DataSubjectType _dataSubjectType;
    /** Description for the request. */
    private String _description;
    /** The name of the request. */
    private String _displayName;
    /** Collection of history change events. */
    private java.util.List<SubjectRightsRequestHistory> _history;
    /** Insight about the request. */
    private SubjectRightsRequestDetail _insight;
    /** The date and time when the request is internally due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _internalDueDateTime;
    /** Identity information for the entity that last modified the request. */
    private IdentitySet _lastModifiedBy;
    /** The date and time when the request was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _lastModifiedDateTime;
    /** List of notes associated with the request. */
    private java.util.List<AuthoredNote> _notes;
    /** List of regulations that this request will fulfill. */
    private java.util.List<String> _regulations;
    /** Information about the different stages for the request. */
    private java.util.List<SubjectRightsRequestStageDetail> _stages;
    /** The status of the request. Possible values are: active, closed, unknownFutureValue. */
    private SubjectRightsRequestStatus _status;
    /** Information about the Microsoft Teams team that was created for the request. */
    private Team _team;
    /** The type of the request. Possible values are: export, delete, access, tagForAction, unknownFutureValue. */
    private SubjectRightsRequestType _type;
    /**
     * Instantiates a new subjectRightsRequest and sets the default values.
     * @return a void
     */
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
        return this._assignedTo;
    }
    /**
     * Gets the closedDateTime property value. The date and time when the request was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getClosedDateTime() {
        return this._closedDateTime;
    }
    /**
     * Gets the createdBy property value. Identity information for the entity that created the request.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the request was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the dataSubject property value. Information about the data subject.
     * @return a dataSubject
     */
    @javax.annotation.Nullable
    public DataSubject getDataSubject() {
        return this._dataSubject;
    }
    /**
     * Gets the dataSubjectType property value. The type of the data subject. Possible values are: customer, currentEmployee, formerEmployee, prospectiveEmployee, student, teacher, faculty, other, unknownFutureValue.
     * @return a dataSubjectType
     */
    @javax.annotation.Nullable
    public DataSubjectType getDataSubjectType() {
        return this._dataSubjectType;
    }
    /**
     * Gets the description property value. Description for the request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The name of the request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SubjectRightsRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignedTo", (n) -> { currentObject.setAssignedTo(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("closedDateTime", (n) -> { currentObject.setClosedDateTime(n.getOffsetDateTimeValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("dataSubject", (n) -> { currentObject.setDataSubject(n.getObjectValue(DataSubject::createFromDiscriminatorValue)); });
            this.put("dataSubjectType", (n) -> { currentObject.setDataSubjectType(n.getEnumValue(DataSubjectType.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("history", (n) -> { currentObject.setHistory(n.getCollectionOfObjectValues(SubjectRightsRequestHistory::createFromDiscriminatorValue)); });
            this.put("insight", (n) -> { currentObject.setInsight(n.getObjectValue(SubjectRightsRequestDetail::createFromDiscriminatorValue)); });
            this.put("internalDueDateTime", (n) -> { currentObject.setInternalDueDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getCollectionOfObjectValues(AuthoredNote::createFromDiscriminatorValue)); });
            this.put("regulations", (n) -> { currentObject.setRegulations(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("stages", (n) -> { currentObject.setStages(n.getCollectionOfObjectValues(SubjectRightsRequestStageDetail::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(SubjectRightsRequestStatus.class)); });
            this.put("team", (n) -> { currentObject.setTeam(n.getObjectValue(Team::createFromDiscriminatorValue)); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(SubjectRightsRequestType.class)); });
        }};
    }
    /**
     * Gets the history property value. Collection of history change events.
     * @return a subjectRightsRequestHistory
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectRightsRequestHistory> getHistory() {
        return this._history;
    }
    /**
     * Gets the insight property value. Insight about the request.
     * @return a subjectRightsRequestDetail
     */
    @javax.annotation.Nullable
    public SubjectRightsRequestDetail getInsight() {
        return this._insight;
    }
    /**
     * Gets the internalDueDateTime property value. The date and time when the request is internally due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getInternalDueDateTime() {
        return this._internalDueDateTime;
    }
    /**
     * Gets the lastModifiedBy property value. Identity information for the entity that last modified the request.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the request was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the notes property value. List of notes associated with the request.
     * @return a authoredNote
     */
    @javax.annotation.Nullable
    public java.util.List<AuthoredNote> getNotes() {
        return this._notes;
    }
    /**
     * Gets the regulations property value. List of regulations that this request will fulfill.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRegulations() {
        return this._regulations;
    }
    /**
     * Gets the stages property value. Information about the different stages for the request.
     * @return a subjectRightsRequestStageDetail
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectRightsRequestStageDetail> getStages() {
        return this._stages;
    }
    /**
     * Gets the status property value. The status of the request. Possible values are: active, closed, unknownFutureValue.
     * @return a subjectRightsRequestStatus
     */
    @javax.annotation.Nullable
    public SubjectRightsRequestStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the team property value. Information about the Microsoft Teams team that was created for the request.
     * @return a team
     */
    @javax.annotation.Nullable
    public Team getTeam() {
        return this._team;
    }
    /**
     * Gets the type property value. The type of the request. Possible values are: export, delete, access, tagForAction, unknownFutureValue.
     * @return a subjectRightsRequestType
     */
    @javax.annotation.Nullable
    public SubjectRightsRequestType getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAssignedTo(@javax.annotation.Nullable final Identity value) {
        this._assignedTo = value;
    }
    /**
     * Sets the closedDateTime property value. The date and time when the request was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the closedDateTime property.
     * @return a void
     */
    public void setClosedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._closedDateTime = value;
    }
    /**
     * Sets the createdBy property value. Identity information for the entity that created the request.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the request was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the dataSubject property value. Information about the data subject.
     * @param value Value to set for the dataSubject property.
     * @return a void
     */
    public void setDataSubject(@javax.annotation.Nullable final DataSubject value) {
        this._dataSubject = value;
    }
    /**
     * Sets the dataSubjectType property value. The type of the data subject. Possible values are: customer, currentEmployee, formerEmployee, prospectiveEmployee, student, teacher, faculty, other, unknownFutureValue.
     * @param value Value to set for the dataSubjectType property.
     * @return a void
     */
    public void setDataSubjectType(@javax.annotation.Nullable final DataSubjectType value) {
        this._dataSubjectType = value;
    }
    /**
     * Sets the description property value. Description for the request.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The name of the request.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the history property value. Collection of history change events.
     * @param value Value to set for the history property.
     * @return a void
     */
    public void setHistory(@javax.annotation.Nullable final java.util.List<SubjectRightsRequestHistory> value) {
        this._history = value;
    }
    /**
     * Sets the insight property value. Insight about the request.
     * @param value Value to set for the insight property.
     * @return a void
     */
    public void setInsight(@javax.annotation.Nullable final SubjectRightsRequestDetail value) {
        this._insight = value;
    }
    /**
     * Sets the internalDueDateTime property value. The date and time when the request is internally due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the internalDueDateTime property.
     * @return a void
     */
    public void setInternalDueDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._internalDueDateTime = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity information for the entity that last modified the request.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the request was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the notes property value. List of notes associated with the request.
     * @param value Value to set for the notes property.
     * @return a void
     */
    public void setNotes(@javax.annotation.Nullable final java.util.List<AuthoredNote> value) {
        this._notes = value;
    }
    /**
     * Sets the regulations property value. List of regulations that this request will fulfill.
     * @param value Value to set for the regulations property.
     * @return a void
     */
    public void setRegulations(@javax.annotation.Nullable final java.util.List<String> value) {
        this._regulations = value;
    }
    /**
     * Sets the stages property value. Information about the different stages for the request.
     * @param value Value to set for the stages property.
     * @return a void
     */
    public void setStages(@javax.annotation.Nullable final java.util.List<SubjectRightsRequestStageDetail> value) {
        this._stages = value;
    }
    /**
     * Sets the status property value. The status of the request. Possible values are: active, closed, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final SubjectRightsRequestStatus value) {
        this._status = value;
    }
    /**
     * Sets the team property value. Information about the Microsoft Teams team that was created for the request.
     * @param value Value to set for the team property.
     * @return a void
     */
    public void setTeam(@javax.annotation.Nullable final Team value) {
        this._team = value;
    }
    /**
     * Sets the type property value. The type of the request. Possible values are: export, delete, access, tagForAction, unknownFutureValue.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final SubjectRightsRequestType value) {
        this._type = value;
    }
}
