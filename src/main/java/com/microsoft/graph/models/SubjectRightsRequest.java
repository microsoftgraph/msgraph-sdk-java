package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubjectRightsRequest extends Entity implements Parsable {
    /**
     * The approvers property
     */
    private java.util.List<User> approvers;
    /**
     * Identity that the request is assigned to.
     */
    private Identity assignedTo;
    /**
     * The date and time when the request was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime closedDateTime;
    /**
     * The collaborators property
     */
    private java.util.List<User> collaborators;
    /**
     * The contentQuery property
     */
    private String contentQuery;
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
     * The externalId property
     */
    private String externalId;
    /**
     * Collection of history change events.
     */
    private java.util.List<SubjectRightsRequestHistory> history;
    /**
     * The includeAllVersions property
     */
    private Boolean includeAllVersions;
    /**
     * The includeAuthoredContent property
     */
    private Boolean includeAuthoredContent;
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
     * The mailboxlocations property
     */
    private SubjectRightsRequestMailboxLocation mailboxlocations;
    /**
     * List of notes associcated with the request.
     */
    private java.util.List<AuthoredNote> notes;
    /**
     * The pauseAfterEstimate property
     */
    private Boolean pauseAfterEstimate;
    /**
     * List of regulations that this request will fulfill.
     */
    private java.util.List<String> regulations;
    /**
     * The sitelocations property
     */
    private SubjectRightsRequestSiteLocation sitelocations;
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
     */
    public SubjectRightsRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a subjectRightsRequest
     */
    @jakarta.annotation.Nonnull
    public static SubjectRightsRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubjectRightsRequest();
    }
    /**
     * Gets the approvers property value. The approvers property
     * @return a user
     */
    @jakarta.annotation.Nullable
    public java.util.List<User> getApprovers() {
        return this.approvers;
    }
    /**
     * Gets the assignedTo property value. Identity that the request is assigned to.
     * @return a identity
     */
    @jakarta.annotation.Nullable
    public Identity getAssignedTo() {
        return this.assignedTo;
    }
    /**
     * Gets the closedDateTime property value. The date and time when the request was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getClosedDateTime() {
        return this.closedDateTime;
    }
    /**
     * Gets the collaborators property value. The collaborators property
     * @return a user
     */
    @jakarta.annotation.Nullable
    public java.util.List<User> getCollaborators() {
        return this.collaborators;
    }
    /**
     * Gets the contentQuery property value. The contentQuery property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContentQuery() {
        return this.contentQuery;
    }
    /**
     * Gets the createdBy property value. Identity information for the entity that created the request.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the request was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the dataSubject property value. Information about the data subject.
     * @return a dataSubject
     */
    @jakarta.annotation.Nullable
    public DataSubject getDataSubject() {
        return this.dataSubject;
    }
    /**
     * Gets the dataSubjectType property value. The type of the data subject. Possible values are: customer, currentEmployee, formerEmployee, prospectiveEmployee, student, teacher, faculty, other, unknownFutureValue.
     * @return a dataSubjectType
     */
    @jakarta.annotation.Nullable
    public DataSubjectType getDataSubjectType() {
        return this.dataSubjectType;
    }
    /**
     * Gets the description property value. Description for the request.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The name of the request.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the externalId property value. The externalId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvers", (n) -> { this.setApprovers(n.getCollectionOfObjectValues(User::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("closedDateTime", (n) -> { this.setClosedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("collaborators", (n) -> { this.setCollaborators(n.getCollectionOfObjectValues(User::createFromDiscriminatorValue)); });
        deserializerMap.put("contentQuery", (n) -> { this.setContentQuery(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dataSubject", (n) -> { this.setDataSubject(n.getObjectValue(DataSubject::createFromDiscriminatorValue)); });
        deserializerMap.put("dataSubjectType", (n) -> { this.setDataSubjectType(n.getEnumValue(DataSubjectType.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("history", (n) -> { this.setHistory(n.getCollectionOfObjectValues(SubjectRightsRequestHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("includeAllVersions", (n) -> { this.setIncludeAllVersions(n.getBooleanValue()); });
        deserializerMap.put("includeAuthoredContent", (n) -> { this.setIncludeAuthoredContent(n.getBooleanValue()); });
        deserializerMap.put("insight", (n) -> { this.setInsight(n.getObjectValue(SubjectRightsRequestDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("internalDueDateTime", (n) -> { this.setInternalDueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mailboxlocations", (n) -> { this.setMailboxlocations(n.getObjectValue(SubjectRightsRequestMailboxLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getCollectionOfObjectValues(AuthoredNote::createFromDiscriminatorValue)); });
        deserializerMap.put("pauseAfterEstimate", (n) -> { this.setPauseAfterEstimate(n.getBooleanValue()); });
        deserializerMap.put("regulations", (n) -> { this.setRegulations(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sitelocations", (n) -> { this.setSitelocations(n.getObjectValue(SubjectRightsRequestSiteLocation::createFromDiscriminatorValue)); });
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
    @jakarta.annotation.Nullable
    public java.util.List<SubjectRightsRequestHistory> getHistory() {
        return this.history;
    }
    /**
     * Gets the includeAllVersions property value. The includeAllVersions property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludeAllVersions() {
        return this.includeAllVersions;
    }
    /**
     * Gets the includeAuthoredContent property value. The includeAuthoredContent property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludeAuthoredContent() {
        return this.includeAuthoredContent;
    }
    /**
     * Gets the insight property value. Insight about the request.
     * @return a subjectRightsRequestDetail
     */
    @jakarta.annotation.Nullable
    public SubjectRightsRequestDetail getInsight() {
        return this.insight;
    }
    /**
     * Gets the internalDueDateTime property value. The date and time when the request is internally due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getInternalDueDateTime() {
        return this.internalDueDateTime;
    }
    /**
     * Gets the lastModifiedBy property value. Identity information for the entity that last modified the request.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the request was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the mailboxlocations property value. The mailboxlocations property
     * @return a subjectRightsRequestMailboxLocation
     */
    @jakarta.annotation.Nullable
    public SubjectRightsRequestMailboxLocation getMailboxlocations() {
        return this.mailboxlocations;
    }
    /**
     * Gets the notes property value. List of notes associcated with the request.
     * @return a authoredNote
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthoredNote> getNotes() {
        return this.notes;
    }
    /**
     * Gets the pauseAfterEstimate property value. The pauseAfterEstimate property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPauseAfterEstimate() {
        return this.pauseAfterEstimate;
    }
    /**
     * Gets the regulations property value. List of regulations that this request will fulfill.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRegulations() {
        return this.regulations;
    }
    /**
     * Gets the sitelocations property value. The sitelocations property
     * @return a subjectRightsRequestSiteLocation
     */
    @jakarta.annotation.Nullable
    public SubjectRightsRequestSiteLocation getSitelocations() {
        return this.sitelocations;
    }
    /**
     * Gets the stages property value. Information about the different stages for the request.
     * @return a subjectRightsRequestStageDetail
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectRightsRequestStageDetail> getStages() {
        return this.stages;
    }
    /**
     * Gets the status property value. The status of the request.. Possible values are: active, closed, unknownFutureValue.
     * @return a subjectRightsRequestStatus
     */
    @jakarta.annotation.Nullable
    public SubjectRightsRequestStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the team property value. Information about the Microsoft Teams team that was created for the request.
     * @return a team
     */
    @jakarta.annotation.Nullable
    public Team getTeam() {
        return this.team;
    }
    /**
     * Gets the type property value. The type of the request. Possible values are: export, delete,  access, tagForAction, unknownFutureValue.
     * @return a subjectRightsRequestType
     */
    @jakarta.annotation.Nullable
    public SubjectRightsRequestType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("approvers", this.getApprovers());
        writer.writeObjectValue("assignedTo", this.getAssignedTo());
        writer.writeOffsetDateTimeValue("closedDateTime", this.getClosedDateTime());
        writer.writeCollectionOfObjectValues("collaborators", this.getCollaborators());
        writer.writeStringValue("contentQuery", this.getContentQuery());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("dataSubject", this.getDataSubject());
        writer.writeEnumValue("dataSubjectType", this.getDataSubjectType());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeCollectionOfObjectValues("history", this.getHistory());
        writer.writeBooleanValue("includeAllVersions", this.getIncludeAllVersions());
        writer.writeBooleanValue("includeAuthoredContent", this.getIncludeAuthoredContent());
        writer.writeObjectValue("insight", this.getInsight());
        writer.writeOffsetDateTimeValue("internalDueDateTime", this.getInternalDueDateTime());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("mailboxlocations", this.getMailboxlocations());
        writer.writeCollectionOfObjectValues("notes", this.getNotes());
        writer.writeBooleanValue("pauseAfterEstimate", this.getPauseAfterEstimate());
        writer.writeCollectionOfPrimitiveValues("regulations", this.getRegulations());
        writer.writeObjectValue("sitelocations", this.getSitelocations());
        writer.writeCollectionOfObjectValues("stages", this.getStages());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("team", this.getTeam());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the approvers property value. The approvers property
     * @param value Value to set for the approvers property.
     */
    public void setApprovers(@jakarta.annotation.Nullable final java.util.List<User> value) {
        this.approvers = value;
    }
    /**
     * Sets the assignedTo property value. Identity that the request is assigned to.
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final Identity value) {
        this.assignedTo = value;
    }
    /**
     * Sets the closedDateTime property value. The date and time when the request was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the closedDateTime property.
     */
    public void setClosedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.closedDateTime = value;
    }
    /**
     * Sets the collaborators property value. The collaborators property
     * @param value Value to set for the collaborators property.
     */
    public void setCollaborators(@jakarta.annotation.Nullable final java.util.List<User> value) {
        this.collaborators = value;
    }
    /**
     * Sets the contentQuery property value. The contentQuery property
     * @param value Value to set for the contentQuery property.
     */
    public void setContentQuery(@jakarta.annotation.Nullable final String value) {
        this.contentQuery = value;
    }
    /**
     * Sets the createdBy property value. Identity information for the entity that created the request.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the request was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the dataSubject property value. Information about the data subject.
     * @param value Value to set for the dataSubject property.
     */
    public void setDataSubject(@jakarta.annotation.Nullable final DataSubject value) {
        this.dataSubject = value;
    }
    /**
     * Sets the dataSubjectType property value. The type of the data subject. Possible values are: customer, currentEmployee, formerEmployee, prospectiveEmployee, student, teacher, faculty, other, unknownFutureValue.
     * @param value Value to set for the dataSubjectType property.
     */
    public void setDataSubjectType(@jakarta.annotation.Nullable final DataSubjectType value) {
        this.dataSubjectType = value;
    }
    /**
     * Sets the description property value. Description for the request.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The name of the request.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the externalId property value. The externalId property
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the history property value. Collection of history change events.
     * @param value Value to set for the history property.
     */
    public void setHistory(@jakarta.annotation.Nullable final java.util.List<SubjectRightsRequestHistory> value) {
        this.history = value;
    }
    /**
     * Sets the includeAllVersions property value. The includeAllVersions property
     * @param value Value to set for the includeAllVersions property.
     */
    public void setIncludeAllVersions(@jakarta.annotation.Nullable final Boolean value) {
        this.includeAllVersions = value;
    }
    /**
     * Sets the includeAuthoredContent property value. The includeAuthoredContent property
     * @param value Value to set for the includeAuthoredContent property.
     */
    public void setIncludeAuthoredContent(@jakarta.annotation.Nullable final Boolean value) {
        this.includeAuthoredContent = value;
    }
    /**
     * Sets the insight property value. Insight about the request.
     * @param value Value to set for the insight property.
     */
    public void setInsight(@jakarta.annotation.Nullable final SubjectRightsRequestDetail value) {
        this.insight = value;
    }
    /**
     * Sets the internalDueDateTime property value. The date and time when the request is internally due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the internalDueDateTime property.
     */
    public void setInternalDueDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.internalDueDateTime = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity information for the entity that last modified the request.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the request was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the mailboxlocations property value. The mailboxlocations property
     * @param value Value to set for the mailboxlocations property.
     */
    public void setMailboxlocations(@jakarta.annotation.Nullable final SubjectRightsRequestMailboxLocation value) {
        this.mailboxlocations = value;
    }
    /**
     * Sets the notes property value. List of notes associcated with the request.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final java.util.List<AuthoredNote> value) {
        this.notes = value;
    }
    /**
     * Sets the pauseAfterEstimate property value. The pauseAfterEstimate property
     * @param value Value to set for the pauseAfterEstimate property.
     */
    public void setPauseAfterEstimate(@jakarta.annotation.Nullable final Boolean value) {
        this.pauseAfterEstimate = value;
    }
    /**
     * Sets the regulations property value. List of regulations that this request will fulfill.
     * @param value Value to set for the regulations property.
     */
    public void setRegulations(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.regulations = value;
    }
    /**
     * Sets the sitelocations property value. The sitelocations property
     * @param value Value to set for the sitelocations property.
     */
    public void setSitelocations(@jakarta.annotation.Nullable final SubjectRightsRequestSiteLocation value) {
        this.sitelocations = value;
    }
    /**
     * Sets the stages property value. Information about the different stages for the request.
     * @param value Value to set for the stages property.
     */
    public void setStages(@jakarta.annotation.Nullable final java.util.List<SubjectRightsRequestStageDetail> value) {
        this.stages = value;
    }
    /**
     * Sets the status property value. The status of the request.. Possible values are: active, closed, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SubjectRightsRequestStatus value) {
        this.status = value;
    }
    /**
     * Sets the team property value. Information about the Microsoft Teams team that was created for the request.
     * @param value Value to set for the team property.
     */
    public void setTeam(@jakarta.annotation.Nullable final Team value) {
        this.team = value;
    }
    /**
     * Sets the type property value. The type of the request. Possible values are: export, delete,  access, tagForAction, unknownFutureValue.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final SubjectRightsRequestType value) {
        this.type = value;
    }
}
