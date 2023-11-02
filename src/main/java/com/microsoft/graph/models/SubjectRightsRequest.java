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
     * Instantiates a new SubjectRightsRequest and sets the default values.
     */
    public SubjectRightsRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SubjectRightsRequest
     */
    @jakarta.annotation.Nonnull
    public static SubjectRightsRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubjectRightsRequest();
    }
    /**
     * Gets the approvers property value. Collection of users who can approve the request. Currently only supported for requests of type delete.
     * @return a java.util.List<User>
     */
    @jakarta.annotation.Nullable
    public java.util.List<User> getApprovers() {
        return this.getBackingStore().get("approvers");
    }
    /**
     * Gets the assignedTo property value. Identity that the request is assigned to.
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getAssignedTo() {
        return this.getBackingStore().get("assignedTo");
    }
    /**
     * Gets the closedDateTime property value. The date and time when the request was closed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getClosedDateTime() {
        return this.getBackingStore().get("closedDateTime");
    }
    /**
     * Gets the collaborators property value. Collection of users who can collaborate on the request.
     * @return a java.util.List<User>
     */
    @jakarta.annotation.Nullable
    public java.util.List<User> getCollaborators() {
        return this.getBackingStore().get("collaborators");
    }
    /**
     * Gets the contentQuery property value. KQL based content query that should be used for search. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentQuery() {
        return this.getBackingStore().get("contentQuery");
    }
    /**
     * Gets the createdBy property value. Identity information for the entity that created the request.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.getBackingStore().get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the request was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.getBackingStore().get("createdDateTime");
    }
    /**
     * Gets the dataSubject property value. Information about the data subject.
     * @return a DataSubject
     */
    @jakarta.annotation.Nullable
    public DataSubject getDataSubject() {
        return this.getBackingStore().get("dataSubject");
    }
    /**
     * Gets the dataSubjectType property value. The type of the data subject. Possible values are: customer, currentEmployee, formerEmployee, prospectiveEmployee, student, teacher, faculty, other, unknownFutureValue.
     * @return a DataSubjectType
     */
    @jakarta.annotation.Nullable
    public DataSubjectType getDataSubjectType() {
        return this.getBackingStore().get("dataSubjectType");
    }
    /**
     * Gets the description property value. Description for the request.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.getBackingStore().get("description");
    }
    /**
     * Gets the displayName property value. The name of the request.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.getBackingStore().get("displayName");
    }
    /**
     * Gets the externalId property value. The external ID for the request that is immutable after creation and is used for tracking the request for the external system. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.getBackingStore().get("externalId");
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
        deserializerMap.put("mailboxLocations", (n) -> { this.setMailboxLocations(n.getObjectValue(SubjectRightsRequestMailboxLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getCollectionOfObjectValues(AuthoredNote::createFromDiscriminatorValue)); });
        deserializerMap.put("pauseAfterEstimate", (n) -> { this.setPauseAfterEstimate(n.getBooleanValue()); });
        deserializerMap.put("regulations", (n) -> { this.setRegulations(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("siteLocations", (n) -> { this.setSiteLocations(n.getObjectValue(SubjectRightsRequestSiteLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("stages", (n) -> { this.setStages(n.getCollectionOfObjectValues(SubjectRightsRequestStageDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SubjectRightsRequestStatus.class)); });
        deserializerMap.put("team", (n) -> { this.setTeam(n.getObjectValue(Team::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(SubjectRightsRequestType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. Collection of history change events.
     * @return a java.util.List<SubjectRightsRequestHistory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectRightsRequestHistory> getHistory() {
        return this.getBackingStore().get("history");
    }
    /**
     * Gets the includeAllVersions property value. Include all versions of the documents. By default, the current copies of the documents are returned. If SharePoint sites have versioning enabled, including all versions includes the historical copies of the documents. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludeAllVersions() {
        return this.getBackingStore().get("includeAllVersions");
    }
    /**
     * Gets the includeAuthoredContent property value. Include content authored by the data subject. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludeAuthoredContent() {
        return this.getBackingStore().get("includeAuthoredContent");
    }
    /**
     * Gets the insight property value. Insight about the request.
     * @return a SubjectRightsRequestDetail
     */
    @jakarta.annotation.Nullable
    public SubjectRightsRequestDetail getInsight() {
        return this.getBackingStore().get("insight");
    }
    /**
     * Gets the internalDueDateTime property value. The date and time when the request is internally due. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getInternalDueDateTime() {
        return this.getBackingStore().get("internalDueDateTime");
    }
    /**
     * Gets the lastModifiedBy property value. Identity information for the entity that last modified the request.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.getBackingStore().get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the request was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.getBackingStore().get("lastModifiedDateTime");
    }
    /**
     * Gets the mailboxLocations property value. The mailbox locations that should be searched. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @return a SubjectRightsRequestMailboxLocation
     */
    @jakarta.annotation.Nullable
    public SubjectRightsRequestMailboxLocation getMailboxLocations() {
        return this.getBackingStore().get("mailboxLocations");
    }
    /**
     * Gets the notes property value. List of notes associated with the request.
     * @return a java.util.List<AuthoredNote>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthoredNote> getNotes() {
        return this.getBackingStore().get("notes");
    }
    /**
     * Gets the pauseAfterEstimate property value. Pause the request after estimate has finished. By default, the data estimate runs and then pauses, allowing you to preview results and then select the option to retrieve data in the UI. You can set this property to false if you want it to perform the estimate and then automatically begin with the retrieval of the content. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPauseAfterEstimate() {
        return this.getBackingStore().get("pauseAfterEstimate");
    }
    /**
     * Gets the regulations property value. List of regulations that this request fulfill.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRegulations() {
        return this.getBackingStore().get("regulations");
    }
    /**
     * Gets the siteLocations property value. The SharePoint and OneDrive site locations that should be searched. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @return a SubjectRightsRequestSiteLocation
     */
    @jakarta.annotation.Nullable
    public SubjectRightsRequestSiteLocation getSiteLocations() {
        return this.getBackingStore().get("siteLocations");
    }
    /**
     * Gets the stages property value. Information about the different stages for the request.
     * @return a java.util.List<SubjectRightsRequestStageDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectRightsRequestStageDetail> getStages() {
        return this.getBackingStore().get("stages");
    }
    /**
     * Gets the status property value. The status of the request. Possible values are: active, closed, unknownFutureValue.
     * @return a SubjectRightsRequestStatus
     */
    @jakarta.annotation.Nullable
    public SubjectRightsRequestStatus getStatus() {
        return this.getBackingStore().get("status");
    }
    /**
     * Gets the team property value. Information about the Microsoft Teams team that was created for the request.
     * @return a Team
     */
    @jakarta.annotation.Nullable
    public Team getTeam() {
        return this.getBackingStore().get("team");
    }
    /**
     * Gets the type property value. The type of the request. Possible values are: export, delete, access, tagForAction, unknownFutureValue.
     * @return a SubjectRightsRequestType
     */
    @jakarta.annotation.Nullable
    public SubjectRightsRequestType getType() {
        return this.getBackingStore().get("type");
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
        writer.writeObjectValue("mailboxLocations", this.getMailboxLocations());
        writer.writeCollectionOfObjectValues("notes", this.getNotes());
        writer.writeBooleanValue("pauseAfterEstimate", this.getPauseAfterEstimate());
        writer.writeCollectionOfPrimitiveValues("regulations", this.getRegulations());
        writer.writeObjectValue("siteLocations", this.getSiteLocations());
        writer.writeCollectionOfObjectValues("stages", this.getStages());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("team", this.getTeam());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the approvers property value. Collection of users who can approve the request. Currently only supported for requests of type delete.
     * @param value Value to set for the approvers property.
     */
    public void setApprovers(@jakarta.annotation.Nullable final java.util.List<User> value) {
        this.getBackingStore().set("approvers", value);
    }
    /**
     * Sets the assignedTo property value. Identity that the request is assigned to.
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final Identity value) {
        this.getBackingStore().set("assignedTo", value);
    }
    /**
     * Sets the closedDateTime property value. The date and time when the request was closed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the closedDateTime property.
     */
    public void setClosedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("closedDateTime", value);
    }
    /**
     * Sets the collaborators property value. Collection of users who can collaborate on the request.
     * @param value Value to set for the collaborators property.
     */
    public void setCollaborators(@jakarta.annotation.Nullable final java.util.List<User> value) {
        this.getBackingStore().set("collaborators", value);
    }
    /**
     * Sets the contentQuery property value. KQL based content query that should be used for search. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @param value Value to set for the contentQuery property.
     */
    public void setContentQuery(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("contentQuery", value);
    }
    /**
     * Sets the createdBy property value. Identity information for the entity that created the request.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.getBackingStore().set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the request was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("createdDateTime", value);
    }
    /**
     * Sets the dataSubject property value. Information about the data subject.
     * @param value Value to set for the dataSubject property.
     */
    public void setDataSubject(@jakarta.annotation.Nullable final DataSubject value) {
        this.getBackingStore().set("dataSubject", value);
    }
    /**
     * Sets the dataSubjectType property value. The type of the data subject. Possible values are: customer, currentEmployee, formerEmployee, prospectiveEmployee, student, teacher, faculty, other, unknownFutureValue.
     * @param value Value to set for the dataSubjectType property.
     */
    public void setDataSubjectType(@jakarta.annotation.Nullable final DataSubjectType value) {
        this.getBackingStore().set("dataSubjectType", value);
    }
    /**
     * Sets the description property value. Description for the request.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("description", value);
    }
    /**
     * Sets the displayName property value. The name of the request.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("displayName", value);
    }
    /**
     * Sets the externalId property value. The external ID for the request that is immutable after creation and is used for tracking the request for the external system. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("externalId", value);
    }
    /**
     * Sets the history property value. Collection of history change events.
     * @param value Value to set for the history property.
     */
    public void setHistory(@jakarta.annotation.Nullable final java.util.List<SubjectRightsRequestHistory> value) {
        this.getBackingStore().set("history", value);
    }
    /**
     * Sets the includeAllVersions property value. Include all versions of the documents. By default, the current copies of the documents are returned. If SharePoint sites have versioning enabled, including all versions includes the historical copies of the documents. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @param value Value to set for the includeAllVersions property.
     */
    public void setIncludeAllVersions(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("includeAllVersions", value);
    }
    /**
     * Sets the includeAuthoredContent property value. Include content authored by the data subject. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @param value Value to set for the includeAuthoredContent property.
     */
    public void setIncludeAuthoredContent(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("includeAuthoredContent", value);
    }
    /**
     * Sets the insight property value. Insight about the request.
     * @param value Value to set for the insight property.
     */
    public void setInsight(@jakarta.annotation.Nullable final SubjectRightsRequestDetail value) {
        this.getBackingStore().set("insight", value);
    }
    /**
     * Sets the internalDueDateTime property value. The date and time when the request is internally due. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the internalDueDateTime property.
     */
    public void setInternalDueDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("internalDueDateTime", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity information for the entity that last modified the request.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.getBackingStore().set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the request was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("lastModifiedDateTime", value);
    }
    /**
     * Sets the mailboxLocations property value. The mailbox locations that should be searched. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @param value Value to set for the mailboxLocations property.
     */
    public void setMailboxLocations(@jakarta.annotation.Nullable final SubjectRightsRequestMailboxLocation value) {
        this.getBackingStore().set("mailboxLocations", value);
    }
    /**
     * Sets the notes property value. List of notes associated with the request.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final java.util.List<AuthoredNote> value) {
        this.getBackingStore().set("notes", value);
    }
    /**
     * Sets the pauseAfterEstimate property value. Pause the request after estimate has finished. By default, the data estimate runs and then pauses, allowing you to preview results and then select the option to retrieve data in the UI. You can set this property to false if you want it to perform the estimate and then automatically begin with the retrieval of the content. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @param value Value to set for the pauseAfterEstimate property.
     */
    public void setPauseAfterEstimate(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("pauseAfterEstimate", value);
    }
    /**
     * Sets the regulations property value. List of regulations that this request fulfill.
     * @param value Value to set for the regulations property.
     */
    public void setRegulations(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.getBackingStore().set("regulations", value);
    }
    /**
     * Sets the siteLocations property value. The SharePoint and OneDrive site locations that should be searched. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     * @param value Value to set for the siteLocations property.
     */
    public void setSiteLocations(@jakarta.annotation.Nullable final SubjectRightsRequestSiteLocation value) {
        this.getBackingStore().set("siteLocations", value);
    }
    /**
     * Sets the stages property value. Information about the different stages for the request.
     * @param value Value to set for the stages property.
     */
    public void setStages(@jakarta.annotation.Nullable final java.util.List<SubjectRightsRequestStageDetail> value) {
        this.getBackingStore().set("stages", value);
    }
    /**
     * Sets the status property value. The status of the request. Possible values are: active, closed, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SubjectRightsRequestStatus value) {
        this.getBackingStore().set("status", value);
    }
    /**
     * Sets the team property value. Information about the Microsoft Teams team that was created for the request.
     * @param value Value to set for the team property.
     */
    public void setTeam(@jakarta.annotation.Nullable final Team value) {
        this.getBackingStore().set("team", value);
    }
    /**
     * Sets the type property value. The type of the request. Possible values are: export, delete, access, tagForAction, unknownFutureValue.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final SubjectRightsRequestType value) {
        this.getBackingStore().set("type", value);
    }
}
