package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Channel extends Entity implements Parsable {
    /**
     * Read only. Timestamp at which the channel was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Optional textual description for the channel.
     */
    private String description;
    /**
     * Channel name as it will appear to the user in Microsoft Teams. The maximum length is 50 characters.
     */
    private String displayName;
    /**
     * The email address for sending messages to the channel. Read-only.
     */
    private String email;
    /**
     * Metadata for the location where the channel's files are stored.
     */
    private DriveItem filesFolder;
    /**
     * Indicates whether the channel should automatically be marked 'favorite' for all members of the team. Can only be set programmatically with Create team. Default: false.
     */
    private Boolean isFavoriteByDefault;
    /**
     * A collection of membership records associated with the channel.
     */
    private java.util.List<ConversationMember> members;
    /**
     * The type of the channel. Can be set during creation and can't be changed. The possible values are: standard, private, unknownFutureValue, shared. The default value is standard. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: shared.
     */
    private ChannelMembershipType membershipType;
    /**
     * A collection of all the messages in the channel. A navigation property. Nullable.
     */
    private java.util.List<ChatMessage> messages;
    /**
     * A collection of teams with which a channel is shared.
     */
    private java.util.List<SharedWithChannelTeamInfo> sharedWithTeams;
    /**
     * A collection of all the tabs in the channel. A navigation property.
     */
    private java.util.List<TeamsTab> tabs;
    /**
     * The ID of the Azure Active Directory tenant.
     */
    private String tenantId;
    /**
     * A hyperlink that will go to the channel in Microsoft Teams. This is the URL that you get when you right-click a channel in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not parsed. Read-only.
     */
    private String webUrl;
    /**
     * Instantiates a new channel and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Channel() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a channel
     */
    @javax.annotation.Nonnull
    public static Channel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Channel();
    }
    /**
     * Gets the createdDateTime property value. Read only. Timestamp at which the channel was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Optional textual description for the channel.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Channel name as it will appear to the user in Microsoft Teams. The maximum length is 50 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the email property value. The email address for sending messages to the channel. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("filesFolder", (n) -> { this.setFilesFolder(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("isFavoriteByDefault", (n) -> { this.setIsFavoriteByDefault(n.getBooleanValue()); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(ConversationMember::createFromDiscriminatorValue)); });
        deserializerMap.put("membershipType", (n) -> { this.setMembershipType(n.getEnumValue(ChannelMembershipType.class)); });
        deserializerMap.put("messages", (n) -> { this.setMessages(n.getCollectionOfObjectValues(ChatMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedWithTeams", (n) -> { this.setSharedWithTeams(n.getCollectionOfObjectValues(SharedWithChannelTeamInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("tabs", (n) -> { this.setTabs(n.getCollectionOfObjectValues(TeamsTab::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filesFolder property value. Metadata for the location where the channel's files are stored.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public DriveItem getFilesFolder() {
        return this.filesFolder;
    }
    /**
     * Gets the isFavoriteByDefault property value. Indicates whether the channel should automatically be marked 'favorite' for all members of the team. Can only be set programmatically with Create team. Default: false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFavoriteByDefault() {
        return this.isFavoriteByDefault;
    }
    /**
     * Gets the members property value. A collection of membership records associated with the channel.
     * @return a conversationMember
     */
    @javax.annotation.Nullable
    public java.util.List<ConversationMember> getMembers() {
        return this.members;
    }
    /**
     * Gets the membershipType property value. The type of the channel. Can be set during creation and can't be changed. The possible values are: standard, private, unknownFutureValue, shared. The default value is standard. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: shared.
     * @return a channelMembershipType
     */
    @javax.annotation.Nullable
    public ChannelMembershipType getMembershipType() {
        return this.membershipType;
    }
    /**
     * Gets the messages property value. A collection of all the messages in the channel. A navigation property. Nullable.
     * @return a chatMessage
     */
    @javax.annotation.Nullable
    public java.util.List<ChatMessage> getMessages() {
        return this.messages;
    }
    /**
     * Gets the sharedWithTeams property value. A collection of teams with which a channel is shared.
     * @return a sharedWithChannelTeamInfo
     */
    @javax.annotation.Nullable
    public java.util.List<SharedWithChannelTeamInfo> getSharedWithTeams() {
        return this.sharedWithTeams;
    }
    /**
     * Gets the tabs property value. A collection of all the tabs in the channel. A navigation property.
     * @return a teamsTab
     */
    @javax.annotation.Nullable
    public java.util.List<TeamsTab> getTabs() {
        return this.tabs;
    }
    /**
     * Gets the tenantId property value. The ID of the Azure Active Directory tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the webUrl property value. A hyperlink that will go to the channel in Microsoft Teams. This is the URL that you get when you right-click a channel in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not parsed. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeObjectValue("filesFolder", this.getFilesFolder());
        writer.writeBooleanValue("isFavoriteByDefault", this.getIsFavoriteByDefault());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeEnumValue("membershipType", this.getMembershipType());
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
        writer.writeCollectionOfObjectValues("sharedWithTeams", this.getSharedWithTeams());
        writer.writeCollectionOfObjectValues("tabs", this.getTabs());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the createdDateTime property value. Read only. Timestamp at which the channel was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Optional textual description for the channel.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Channel name as it will appear to the user in Microsoft Teams. The maximum length is 50 characters.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the email property value. The email address for sending messages to the channel. Read-only.
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the filesFolder property value. Metadata for the location where the channel's files are stored.
     * @param value Value to set for the filesFolder property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilesFolder(@javax.annotation.Nullable final DriveItem value) {
        this.filesFolder = value;
    }
    /**
     * Sets the isFavoriteByDefault property value. Indicates whether the channel should automatically be marked 'favorite' for all members of the team. Can only be set programmatically with Create team. Default: false.
     * @param value Value to set for the isFavoriteByDefault property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsFavoriteByDefault(@javax.annotation.Nullable final Boolean value) {
        this.isFavoriteByDefault = value;
    }
    /**
     * Sets the members property value. A collection of membership records associated with the channel.
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<ConversationMember> value) {
        this.members = value;
    }
    /**
     * Sets the membershipType property value. The type of the channel. Can be set during creation and can't be changed. The possible values are: standard, private, unknownFutureValue, shared. The default value is standard. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: shared.
     * @param value Value to set for the membershipType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembershipType(@javax.annotation.Nullable final ChannelMembershipType value) {
        this.membershipType = value;
    }
    /**
     * Sets the messages property value. A collection of all the messages in the channel. A navigation property. Nullable.
     * @param value Value to set for the messages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessages(@javax.annotation.Nullable final java.util.List<ChatMessage> value) {
        this.messages = value;
    }
    /**
     * Sets the sharedWithTeams property value. A collection of teams with which a channel is shared.
     * @param value Value to set for the sharedWithTeams property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedWithTeams(@javax.annotation.Nullable final java.util.List<SharedWithChannelTeamInfo> value) {
        this.sharedWithTeams = value;
    }
    /**
     * Sets the tabs property value. A collection of all the tabs in the channel. A navigation property.
     * @param value Value to set for the tabs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTabs(@javax.annotation.Nullable final java.util.List<TeamsTab> value) {
        this.tabs = value;
    }
    /**
     * Sets the tenantId property value. The ID of the Azure Active Directory tenant.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the webUrl property value. A hyperlink that will go to the channel in Microsoft Teams. This is the URL that you get when you right-click a channel in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not parsed. Read-only.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}
