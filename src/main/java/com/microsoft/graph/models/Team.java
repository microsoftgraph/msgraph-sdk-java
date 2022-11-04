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
public class Team extends Entity implements Parsable {
    /** List of channels either hosted in or shared with the team (incoming channels). */
    private java.util.List<Channel> _allChannels;
    /** The collection of channels and messages associated with the team. */
    private java.util.List<Channel> _channels;
    /** An optional label. Typically describes the data or business sensitivity of the team. Must match one of a pre-configured set in the tenant's directory. */
    private String _classification;
    /** Timestamp at which the team was created. */
    private OffsetDateTime _createdDateTime;
    /** An optional description for the team. Maximum length: 1024 characters. */
    private String _description;
    /** The name of the team. */
    private String _displayName;
    /** Settings to configure use of Giphy, memes, and stickers in the team. */
    private TeamFunSettings _funSettings;
    /** The group property */
    private Group _group;
    /** Settings to configure whether guests can create, update, or delete channels in the team. */
    private TeamGuestSettings _guestSettings;
    /** List of channels shared with the team. */
    private java.util.List<Channel> _incomingChannels;
    /** The apps installed in this team. */
    private java.util.List<TeamsAppInstallation> _installedApps;
    /** A unique ID for the team that has been used in a few places such as the audit log/Office 365 Management Activity API. */
    private String _internalId;
    /** Whether this team is in read-only mode. */
    private Boolean _isArchived;
    /** Members and owners of the team. */
    private java.util.List<ConversationMember> _members;
    /** Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the team. */
    private TeamMemberSettings _memberSettings;
    /** Settings to configure messaging and mentions in the team. */
    private TeamMessagingSettings _messagingSettings;
    /** The async operations that ran or are running on this team. */
    private java.util.List<TeamsAsyncOperation> _operations;
    /** The profile photo for the team. */
    private ProfilePhoto _photo;
    /** The general channel for the team. */
    private Channel _primaryChannel;
    /** The schedule of shifts for this team. */
    private Schedule _schedule;
    /** Optional. Indicates whether the team is intended for a particular use case.  Each team specialization has access to unique behaviors and experiences targeted to its use case. */
    private TeamSpecialization _specialization;
    /** The summary property */
    private TeamSummary _summary;
    /** The tags associated with the team. */
    private java.util.List<TeamworkTag> _tags;
    /** The template this team was created from. See available templates. */
    private TeamsTemplate _template;
    /** The ID of the Azure Active Directory tenant. */
    private String _tenantId;
    /** The visibility of the group and team. Defaults to Public. */
    private TeamVisibilityType _visibility;
    /** A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not parsed. */
    private String _webUrl;
    /**
     * Instantiates a new team and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Team() {
        super();
        this.setOdataType("#microsoft.graph.team");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a team
     */
    @javax.annotation.Nonnull
    public static Team createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Team();
    }
    /**
     * Gets the allChannels property value. List of channels either hosted in or shared with the team (incoming channels).
     * @return a channel
     */
    @javax.annotation.Nullable
    public java.util.List<Channel> getAllChannels() {
        return this._allChannels;
    }
    /**
     * Gets the channels property value. The collection of channels and messages associated with the team.
     * @return a channel
     */
    @javax.annotation.Nullable
    public java.util.List<Channel> getChannels() {
        return this._channels;
    }
    /**
     * Gets the classification property value. An optional label. Typically describes the data or business sensitivity of the team. Must match one of a pre-configured set in the tenant's directory.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClassification() {
        return this._classification;
    }
    /**
     * Gets the createdDateTime property value. Timestamp at which the team was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. An optional description for the team. Maximum length: 1024 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The name of the team.
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
        final Team currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allChannels", (n) -> { currentObject.setAllChannels(n.getCollectionOfObjectValues(Channel::createFromDiscriminatorValue)); });
            this.put("channels", (n) -> { currentObject.setChannels(n.getCollectionOfObjectValues(Channel::createFromDiscriminatorValue)); });
            this.put("classification", (n) -> { currentObject.setClassification(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("funSettings", (n) -> { currentObject.setFunSettings(n.getObjectValue(TeamFunSettings::createFromDiscriminatorValue)); });
            this.put("group", (n) -> { currentObject.setGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
            this.put("guestSettings", (n) -> { currentObject.setGuestSettings(n.getObjectValue(TeamGuestSettings::createFromDiscriminatorValue)); });
            this.put("incomingChannels", (n) -> { currentObject.setIncomingChannels(n.getCollectionOfObjectValues(Channel::createFromDiscriminatorValue)); });
            this.put("installedApps", (n) -> { currentObject.setInstalledApps(n.getCollectionOfObjectValues(TeamsAppInstallation::createFromDiscriminatorValue)); });
            this.put("internalId", (n) -> { currentObject.setInternalId(n.getStringValue()); });
            this.put("isArchived", (n) -> { currentObject.setIsArchived(n.getBooleanValue()); });
            this.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfObjectValues(ConversationMember::createFromDiscriminatorValue)); });
            this.put("memberSettings", (n) -> { currentObject.setMemberSettings(n.getObjectValue(TeamMemberSettings::createFromDiscriminatorValue)); });
            this.put("messagingSettings", (n) -> { currentObject.setMessagingSettings(n.getObjectValue(TeamMessagingSettings::createFromDiscriminatorValue)); });
            this.put("operations", (n) -> { currentObject.setOperations(n.getCollectionOfObjectValues(TeamsAsyncOperation::createFromDiscriminatorValue)); });
            this.put("photo", (n) -> { currentObject.setPhoto(n.getObjectValue(ProfilePhoto::createFromDiscriminatorValue)); });
            this.put("primaryChannel", (n) -> { currentObject.setPrimaryChannel(n.getObjectValue(Channel::createFromDiscriminatorValue)); });
            this.put("schedule", (n) -> { currentObject.setSchedule(n.getObjectValue(Schedule::createFromDiscriminatorValue)); });
            this.put("specialization", (n) -> { currentObject.setSpecialization(n.getEnumValue(TeamSpecialization.class)); });
            this.put("summary", (n) -> { currentObject.setSummary(n.getObjectValue(TeamSummary::createFromDiscriminatorValue)); });
            this.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfObjectValues(TeamworkTag::createFromDiscriminatorValue)); });
            this.put("template", (n) -> { currentObject.setTemplate(n.getObjectValue(TeamsTemplate::createFromDiscriminatorValue)); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
            this.put("visibility", (n) -> { currentObject.setVisibility(n.getEnumValue(TeamVisibilityType.class)); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the funSettings property value. Settings to configure use of Giphy, memes, and stickers in the team.
     * @return a teamFunSettings
     */
    @javax.annotation.Nullable
    public TeamFunSettings getFunSettings() {
        return this._funSettings;
    }
    /**
     * Gets the group property value. The group property
     * @return a group
     */
    @javax.annotation.Nullable
    public Group getGroup() {
        return this._group;
    }
    /**
     * Gets the guestSettings property value. Settings to configure whether guests can create, update, or delete channels in the team.
     * @return a teamGuestSettings
     */
    @javax.annotation.Nullable
    public TeamGuestSettings getGuestSettings() {
        return this._guestSettings;
    }
    /**
     * Gets the incomingChannels property value. List of channels shared with the team.
     * @return a channel
     */
    @javax.annotation.Nullable
    public java.util.List<Channel> getIncomingChannels() {
        return this._incomingChannels;
    }
    /**
     * Gets the installedApps property value. The apps installed in this team.
     * @return a teamsAppInstallation
     */
    @javax.annotation.Nullable
    public java.util.List<TeamsAppInstallation> getInstalledApps() {
        return this._installedApps;
    }
    /**
     * Gets the internalId property value. A unique ID for the team that has been used in a few places such as the audit log/Office 365 Management Activity API.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternalId() {
        return this._internalId;
    }
    /**
     * Gets the isArchived property value. Whether this team is in read-only mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsArchived() {
        return this._isArchived;
    }
    /**
     * Gets the members property value. Members and owners of the team.
     * @return a conversationMember
     */
    @javax.annotation.Nullable
    public java.util.List<ConversationMember> getMembers() {
        return this._members;
    }
    /**
     * Gets the memberSettings property value. Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the team.
     * @return a teamMemberSettings
     */
    @javax.annotation.Nullable
    public TeamMemberSettings getMemberSettings() {
        return this._memberSettings;
    }
    /**
     * Gets the messagingSettings property value. Settings to configure messaging and mentions in the team.
     * @return a teamMessagingSettings
     */
    @javax.annotation.Nullable
    public TeamMessagingSettings getMessagingSettings() {
        return this._messagingSettings;
    }
    /**
     * Gets the operations property value. The async operations that ran or are running on this team.
     * @return a teamsAsyncOperation
     */
    @javax.annotation.Nullable
    public java.util.List<TeamsAsyncOperation> getOperations() {
        return this._operations;
    }
    /**
     * Gets the photo property value. The profile photo for the team.
     * @return a profilePhoto
     */
    @javax.annotation.Nullable
    public ProfilePhoto getPhoto() {
        return this._photo;
    }
    /**
     * Gets the primaryChannel property value. The general channel for the team.
     * @return a channel
     */
    @javax.annotation.Nullable
    public Channel getPrimaryChannel() {
        return this._primaryChannel;
    }
    /**
     * Gets the schedule property value. The schedule of shifts for this team.
     * @return a schedule
     */
    @javax.annotation.Nullable
    public Schedule getSchedule() {
        return this._schedule;
    }
    /**
     * Gets the specialization property value. Optional. Indicates whether the team is intended for a particular use case.  Each team specialization has access to unique behaviors and experiences targeted to its use case.
     * @return a teamSpecialization
     */
    @javax.annotation.Nullable
    public TeamSpecialization getSpecialization() {
        return this._specialization;
    }
    /**
     * Gets the summary property value. The summary property
     * @return a teamSummary
     */
    @javax.annotation.Nullable
    public TeamSummary getSummary() {
        return this._summary;
    }
    /**
     * Gets the tags property value. The tags associated with the team.
     * @return a teamworkTag
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkTag> getTags() {
        return this._tags;
    }
    /**
     * Gets the template property value. The template this team was created from. See available templates.
     * @return a teamsTemplate
     */
    @javax.annotation.Nullable
    public TeamsTemplate getTemplate() {
        return this._template;
    }
    /**
     * Gets the tenantId property value. The ID of the Azure Active Directory tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the visibility property value. The visibility of the group and team. Defaults to Public.
     * @return a teamVisibilityType
     */
    @javax.annotation.Nullable
    public TeamVisibilityType getVisibility() {
        return this._visibility;
    }
    /**
     * Gets the webUrl property value. A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not parsed.
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
        writer.writeCollectionOfObjectValues("allChannels", this.getAllChannels());
        writer.writeCollectionOfObjectValues("channels", this.getChannels());
        writer.writeStringValue("classification", this.getClassification());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("funSettings", this.getFunSettings());
        writer.writeObjectValue("group", this.getGroup());
        writer.writeObjectValue("guestSettings", this.getGuestSettings());
        writer.writeCollectionOfObjectValues("incomingChannels", this.getIncomingChannels());
        writer.writeCollectionOfObjectValues("installedApps", this.getInstalledApps());
        writer.writeStringValue("internalId", this.getInternalId());
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeObjectValue("memberSettings", this.getMemberSettings());
        writer.writeObjectValue("messagingSettings", this.getMessagingSettings());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeObjectValue("photo", this.getPhoto());
        writer.writeObjectValue("primaryChannel", this.getPrimaryChannel());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeEnumValue("specialization", this.getSpecialization());
        writer.writeObjectValue("summary", this.getSummary());
        writer.writeCollectionOfObjectValues("tags", this.getTags());
        writer.writeObjectValue("template", this.getTemplate());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeEnumValue("visibility", this.getVisibility());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the allChannels property value. List of channels either hosted in or shared with the team (incoming channels).
     * @param value Value to set for the allChannels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllChannels(@javax.annotation.Nullable final java.util.List<Channel> value) {
        this._allChannels = value;
    }
    /**
     * Sets the channels property value. The collection of channels and messages associated with the team.
     * @param value Value to set for the channels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChannels(@javax.annotation.Nullable final java.util.List<Channel> value) {
        this._channels = value;
    }
    /**
     * Sets the classification property value. An optional label. Typically describes the data or business sensitivity of the team. Must match one of a pre-configured set in the tenant's directory.
     * @param value Value to set for the classification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassification(@javax.annotation.Nullable final String value) {
        this._classification = value;
    }
    /**
     * Sets the createdDateTime property value. Timestamp at which the team was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. An optional description for the team. Maximum length: 1024 characters.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The name of the team.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the funSettings property value. Settings to configure use of Giphy, memes, and stickers in the team.
     * @param value Value to set for the funSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFunSettings(@javax.annotation.Nullable final TeamFunSettings value) {
        this._funSettings = value;
    }
    /**
     * Sets the group property value. The group property
     * @param value Value to set for the group property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroup(@javax.annotation.Nullable final Group value) {
        this._group = value;
    }
    /**
     * Sets the guestSettings property value. Settings to configure whether guests can create, update, or delete channels in the team.
     * @param value Value to set for the guestSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGuestSettings(@javax.annotation.Nullable final TeamGuestSettings value) {
        this._guestSettings = value;
    }
    /**
     * Sets the incomingChannels property value. List of channels shared with the team.
     * @param value Value to set for the incomingChannels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncomingChannels(@javax.annotation.Nullable final java.util.List<Channel> value) {
        this._incomingChannels = value;
    }
    /**
     * Sets the installedApps property value. The apps installed in this team.
     * @param value Value to set for the installedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstalledApps(@javax.annotation.Nullable final java.util.List<TeamsAppInstallation> value) {
        this._installedApps = value;
    }
    /**
     * Sets the internalId property value. A unique ID for the team that has been used in a few places such as the audit log/Office 365 Management Activity API.
     * @param value Value to set for the internalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternalId(@javax.annotation.Nullable final String value) {
        this._internalId = value;
    }
    /**
     * Sets the isArchived property value. Whether this team is in read-only mode.
     * @param value Value to set for the isArchived property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsArchived(@javax.annotation.Nullable final Boolean value) {
        this._isArchived = value;
    }
    /**
     * Sets the members property value. Members and owners of the team.
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<ConversationMember> value) {
        this._members = value;
    }
    /**
     * Sets the memberSettings property value. Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the team.
     * @param value Value to set for the memberSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberSettings(@javax.annotation.Nullable final TeamMemberSettings value) {
        this._memberSettings = value;
    }
    /**
     * Sets the messagingSettings property value. Settings to configure messaging and mentions in the team.
     * @param value Value to set for the messagingSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessagingSettings(@javax.annotation.Nullable final TeamMessagingSettings value) {
        this._messagingSettings = value;
    }
    /**
     * Sets the operations property value. The async operations that ran or are running on this team.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperations(@javax.annotation.Nullable final java.util.List<TeamsAsyncOperation> value) {
        this._operations = value;
    }
    /**
     * Sets the photo property value. The profile photo for the team.
     * @param value Value to set for the photo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoto(@javax.annotation.Nullable final ProfilePhoto value) {
        this._photo = value;
    }
    /**
     * Sets the primaryChannel property value. The general channel for the team.
     * @param value Value to set for the primaryChannel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryChannel(@javax.annotation.Nullable final Channel value) {
        this._primaryChannel = value;
    }
    /**
     * Sets the schedule property value. The schedule of shifts for this team.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchedule(@javax.annotation.Nullable final Schedule value) {
        this._schedule = value;
    }
    /**
     * Sets the specialization property value. Optional. Indicates whether the team is intended for a particular use case.  Each team specialization has access to unique behaviors and experiences targeted to its use case.
     * @param value Value to set for the specialization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpecialization(@javax.annotation.Nullable final TeamSpecialization value) {
        this._specialization = value;
    }
    /**
     * Sets the summary property value. The summary property
     * @param value Value to set for the summary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSummary(@javax.annotation.Nullable final TeamSummary value) {
        this._summary = value;
    }
    /**
     * Sets the tags property value. The tags associated with the team.
     * @param value Value to set for the tags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTags(@javax.annotation.Nullable final java.util.List<TeamworkTag> value) {
        this._tags = value;
    }
    /**
     * Sets the template property value. The template this team was created from. See available templates.
     * @param value Value to set for the template property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplate(@javax.annotation.Nullable final TeamsTemplate value) {
        this._template = value;
    }
    /**
     * Sets the tenantId property value. The ID of the Azure Active Directory tenant.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the visibility property value. The visibility of the group and team. Defaults to Public.
     * @param value Value to set for the visibility property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVisibility(@javax.annotation.Nullable final TeamVisibilityType value) {
        this._visibility = value;
    }
    /**
     * Sets the webUrl property value. A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not parsed.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
