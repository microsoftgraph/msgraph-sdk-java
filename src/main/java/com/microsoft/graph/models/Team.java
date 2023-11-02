package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Team extends Entity implements Parsable {
    /**
     * Instantiates a new Team and sets the default values.
     */
    public Team() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Team
     */
    @jakarta.annotation.Nonnull
    public static Team createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Team();
    }
    /**
     * Gets the allChannels property value. List of channels either hosted in or shared with the team (incoming channels).
     * @return a java.util.List<Channel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Channel> getAllChannels() {
        return this.getBackingStore().get("allChannels");
    }
    /**
     * Gets the channels property value. The collection of channels and messages associated with the team.
     * @return a java.util.List<Channel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Channel> getChannels() {
        return this.getBackingStore().get("channels");
    }
    /**
     * Gets the classification property value. An optional label. Typically describes the data or business sensitivity of the team. Must match one of a pre-configured set in the tenant's directory.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClassification() {
        return this.getBackingStore().get("classification");
    }
    /**
     * Gets the createdDateTime property value. Timestamp at which the team was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.getBackingStore().get("createdDateTime");
    }
    /**
     * Gets the description property value. An optional description for the team. Maximum length: 1024 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.getBackingStore().get("description");
    }
    /**
     * Gets the displayName property value. The name of the team.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.getBackingStore().get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allChannels", (n) -> { this.setAllChannels(n.getCollectionOfObjectValues(Channel::createFromDiscriminatorValue)); });
        deserializerMap.put("channels", (n) -> { this.setChannels(n.getCollectionOfObjectValues(Channel::createFromDiscriminatorValue)); });
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("funSettings", (n) -> { this.setFunSettings(n.getObjectValue(TeamFunSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("guestSettings", (n) -> { this.setGuestSettings(n.getObjectValue(TeamGuestSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("incomingChannels", (n) -> { this.setIncomingChannels(n.getCollectionOfObjectValues(Channel::createFromDiscriminatorValue)); });
        deserializerMap.put("installedApps", (n) -> { this.setInstalledApps(n.getCollectionOfObjectValues(TeamsAppInstallation::createFromDiscriminatorValue)); });
        deserializerMap.put("internalId", (n) -> { this.setInternalId(n.getStringValue()); });
        deserializerMap.put("isArchived", (n) -> { this.setIsArchived(n.getBooleanValue()); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(ConversationMember::createFromDiscriminatorValue)); });
        deserializerMap.put("memberSettings", (n) -> { this.setMemberSettings(n.getObjectValue(TeamMemberSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("messagingSettings", (n) -> { this.setMessagingSettings(n.getObjectValue(TeamMessagingSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(TeamsAsyncOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionGrants", (n) -> { this.setPermissionGrants(n.getCollectionOfObjectValues(ResourceSpecificPermissionGrant::createFromDiscriminatorValue)); });
        deserializerMap.put("photo", (n) -> { this.setPhoto(n.getObjectValue(ProfilePhoto::createFromDiscriminatorValue)); });
        deserializerMap.put("primaryChannel", (n) -> { this.setPrimaryChannel(n.getObjectValue(Channel::createFromDiscriminatorValue)); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(Schedule::createFromDiscriminatorValue)); });
        deserializerMap.put("specialization", (n) -> { this.setSpecialization(n.getEnumValue(TeamSpecialization.class)); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getObjectValue(TeamSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfObjectValues(TeamworkTag::createFromDiscriminatorValue)); });
        deserializerMap.put("template", (n) -> { this.setTemplate(n.getObjectValue(TeamsTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getEnumValue(TeamVisibilityType.class)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the funSettings property value. Settings to configure use of Giphy, memes, and stickers in the team.
     * @return a TeamFunSettings
     */
    @jakarta.annotation.Nullable
    public TeamFunSettings getFunSettings() {
        return this.getBackingStore().get("funSettings");
    }
    /**
     * Gets the group property value. The group property
     * @return a Group
     */
    @jakarta.annotation.Nullable
    public Group getGroup() {
        return this.getBackingStore().get("group");
    }
    /**
     * Gets the guestSettings property value. Settings to configure whether guests can create, update, or delete channels in the team.
     * @return a TeamGuestSettings
     */
    @jakarta.annotation.Nullable
    public TeamGuestSettings getGuestSettings() {
        return this.getBackingStore().get("guestSettings");
    }
    /**
     * Gets the incomingChannels property value. List of channels shared with the team.
     * @return a java.util.List<Channel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Channel> getIncomingChannels() {
        return this.getBackingStore().get("incomingChannels");
    }
    /**
     * Gets the installedApps property value. The apps installed in this team.
     * @return a java.util.List<TeamsAppInstallation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamsAppInstallation> getInstalledApps() {
        return this.getBackingStore().get("installedApps");
    }
    /**
     * Gets the internalId property value. A unique ID for the team that has been used in a few places such as the audit log/Office 365 Management Activity API.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInternalId() {
        return this.getBackingStore().get("internalId");
    }
    /**
     * Gets the isArchived property value. Whether this team is in read-only mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsArchived() {
        return this.getBackingStore().get("isArchived");
    }
    /**
     * Gets the members property value. Members and owners of the team.
     * @return a java.util.List<ConversationMember>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConversationMember> getMembers() {
        return this.getBackingStore().get("members");
    }
    /**
     * Gets the memberSettings property value. Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the team.
     * @return a TeamMemberSettings
     */
    @jakarta.annotation.Nullable
    public TeamMemberSettings getMemberSettings() {
        return this.getBackingStore().get("memberSettings");
    }
    /**
     * Gets the messagingSettings property value. Settings to configure messaging and mentions in the team.
     * @return a TeamMessagingSettings
     */
    @jakarta.annotation.Nullable
    public TeamMessagingSettings getMessagingSettings() {
        return this.getBackingStore().get("messagingSettings");
    }
    /**
     * Gets the operations property value. The async operations that ran or are running on this team.
     * @return a java.util.List<TeamsAsyncOperation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamsAsyncOperation> getOperations() {
        return this.getBackingStore().get("operations");
    }
    /**
     * Gets the permissionGrants property value. A collection of permissions granted to apps to access the team.
     * @return a java.util.List<ResourceSpecificPermissionGrant>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourceSpecificPermissionGrant> getPermissionGrants() {
        return this.getBackingStore().get("permissionGrants");
    }
    /**
     * Gets the photo property value. The profile photo for the team.
     * @return a ProfilePhoto
     */
    @jakarta.annotation.Nullable
    public ProfilePhoto getPhoto() {
        return this.getBackingStore().get("photo");
    }
    /**
     * Gets the primaryChannel property value. The general channel for the team.
     * @return a Channel
     */
    @jakarta.annotation.Nullable
    public Channel getPrimaryChannel() {
        return this.getBackingStore().get("primaryChannel");
    }
    /**
     * Gets the schedule property value. The schedule of shifts for this team.
     * @return a Schedule
     */
    @jakarta.annotation.Nullable
    public Schedule getSchedule() {
        return this.getBackingStore().get("schedule");
    }
    /**
     * Gets the specialization property value. Optional. Indicates whether the team is intended for a particular use case.  Each team specialization has access to unique behaviors and experiences targeted to its use case.
     * @return a TeamSpecialization
     */
    @jakarta.annotation.Nullable
    public TeamSpecialization getSpecialization() {
        return this.getBackingStore().get("specialization");
    }
    /**
     * Gets the summary property value. Contains summary information about the team, including number of owners, members, and guests.
     * @return a TeamSummary
     */
    @jakarta.annotation.Nullable
    public TeamSummary getSummary() {
        return this.getBackingStore().get("summary");
    }
    /**
     * Gets the tags property value. The tags associated with the team.
     * @return a java.util.List<TeamworkTag>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamworkTag> getTags() {
        return this.getBackingStore().get("tags");
    }
    /**
     * Gets the template property value. The template this team was created from. See available templates.
     * @return a TeamsTemplate
     */
    @jakarta.annotation.Nullable
    public TeamsTemplate getTemplate() {
        return this.getBackingStore().get("template");
    }
    /**
     * Gets the tenantId property value. The ID of the Microsoft Entra tenant.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.getBackingStore().get("tenantId");
    }
    /**
     * Gets the visibility property value. The visibility of the group and team. Defaults to Public.
     * @return a TeamVisibilityType
     */
    @jakarta.annotation.Nullable
    public TeamVisibilityType getVisibility() {
        return this.getBackingStore().get("visibility");
    }
    /**
     * Gets the webUrl property value. A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not parsed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.getBackingStore().get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeCollectionOfObjectValues("permissionGrants", this.getPermissionGrants());
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
     */
    public void setAllChannels(@jakarta.annotation.Nullable final java.util.List<Channel> value) {
        this.getBackingStore().set("allChannels", value);
    }
    /**
     * Sets the channels property value. The collection of channels and messages associated with the team.
     * @param value Value to set for the channels property.
     */
    public void setChannels(@jakarta.annotation.Nullable final java.util.List<Channel> value) {
        this.getBackingStore().set("channels", value);
    }
    /**
     * Sets the classification property value. An optional label. Typically describes the data or business sensitivity of the team. Must match one of a pre-configured set in the tenant's directory.
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("classification", value);
    }
    /**
     * Sets the createdDateTime property value. Timestamp at which the team was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("createdDateTime", value);
    }
    /**
     * Sets the description property value. An optional description for the team. Maximum length: 1024 characters.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("description", value);
    }
    /**
     * Sets the displayName property value. The name of the team.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("displayName", value);
    }
    /**
     * Sets the funSettings property value. Settings to configure use of Giphy, memes, and stickers in the team.
     * @param value Value to set for the funSettings property.
     */
    public void setFunSettings(@jakarta.annotation.Nullable final TeamFunSettings value) {
        this.getBackingStore().set("funSettings", value);
    }
    /**
     * Sets the group property value. The group property
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final Group value) {
        this.getBackingStore().set("group", value);
    }
    /**
     * Sets the guestSettings property value. Settings to configure whether guests can create, update, or delete channels in the team.
     * @param value Value to set for the guestSettings property.
     */
    public void setGuestSettings(@jakarta.annotation.Nullable final TeamGuestSettings value) {
        this.getBackingStore().set("guestSettings", value);
    }
    /**
     * Sets the incomingChannels property value. List of channels shared with the team.
     * @param value Value to set for the incomingChannels property.
     */
    public void setIncomingChannels(@jakarta.annotation.Nullable final java.util.List<Channel> value) {
        this.getBackingStore().set("incomingChannels", value);
    }
    /**
     * Sets the installedApps property value. The apps installed in this team.
     * @param value Value to set for the installedApps property.
     */
    public void setInstalledApps(@jakarta.annotation.Nullable final java.util.List<TeamsAppInstallation> value) {
        this.getBackingStore().set("installedApps", value);
    }
    /**
     * Sets the internalId property value. A unique ID for the team that has been used in a few places such as the audit log/Office 365 Management Activity API.
     * @param value Value to set for the internalId property.
     */
    public void setInternalId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("internalId", value);
    }
    /**
     * Sets the isArchived property value. Whether this team is in read-only mode.
     * @param value Value to set for the isArchived property.
     */
    public void setIsArchived(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("isArchived", value);
    }
    /**
     * Sets the members property value. Members and owners of the team.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<ConversationMember> value) {
        this.getBackingStore().set("members", value);
    }
    /**
     * Sets the memberSettings property value. Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the team.
     * @param value Value to set for the memberSettings property.
     */
    public void setMemberSettings(@jakarta.annotation.Nullable final TeamMemberSettings value) {
        this.getBackingStore().set("memberSettings", value);
    }
    /**
     * Sets the messagingSettings property value. Settings to configure messaging and mentions in the team.
     * @param value Value to set for the messagingSettings property.
     */
    public void setMessagingSettings(@jakarta.annotation.Nullable final TeamMessagingSettings value) {
        this.getBackingStore().set("messagingSettings", value);
    }
    /**
     * Sets the operations property value. The async operations that ran or are running on this team.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<TeamsAsyncOperation> value) {
        this.getBackingStore().set("operations", value);
    }
    /**
     * Sets the permissionGrants property value. A collection of permissions granted to apps to access the team.
     * @param value Value to set for the permissionGrants property.
     */
    public void setPermissionGrants(@jakarta.annotation.Nullable final java.util.List<ResourceSpecificPermissionGrant> value) {
        this.getBackingStore().set("permissionGrants", value);
    }
    /**
     * Sets the photo property value. The profile photo for the team.
     * @param value Value to set for the photo property.
     */
    public void setPhoto(@jakarta.annotation.Nullable final ProfilePhoto value) {
        this.getBackingStore().set("photo", value);
    }
    /**
     * Sets the primaryChannel property value. The general channel for the team.
     * @param value Value to set for the primaryChannel property.
     */
    public void setPrimaryChannel(@jakarta.annotation.Nullable final Channel value) {
        this.getBackingStore().set("primaryChannel", value);
    }
    /**
     * Sets the schedule property value. The schedule of shifts for this team.
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final Schedule value) {
        this.getBackingStore().set("schedule", value);
    }
    /**
     * Sets the specialization property value. Optional. Indicates whether the team is intended for a particular use case.  Each team specialization has access to unique behaviors and experiences targeted to its use case.
     * @param value Value to set for the specialization property.
     */
    public void setSpecialization(@jakarta.annotation.Nullable final TeamSpecialization value) {
        this.getBackingStore().set("specialization", value);
    }
    /**
     * Sets the summary property value. Contains summary information about the team, including number of owners, members, and guests.
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final TeamSummary value) {
        this.getBackingStore().set("summary", value);
    }
    /**
     * Sets the tags property value. The tags associated with the team.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<TeamworkTag> value) {
        this.getBackingStore().set("tags", value);
    }
    /**
     * Sets the template property value. The template this team was created from. See available templates.
     * @param value Value to set for the template property.
     */
    public void setTemplate(@jakarta.annotation.Nullable final TeamsTemplate value) {
        this.getBackingStore().set("template", value);
    }
    /**
     * Sets the tenantId property value. The ID of the Microsoft Entra tenant.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("tenantId", value);
    }
    /**
     * Sets the visibility property value. The visibility of the group and team. Defaults to Public.
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final TeamVisibilityType value) {
        this.getBackingStore().set("visibility", value);
    }
    /**
     * Sets the webUrl property value. A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not parsed.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("webUrl", value);
    }
}
