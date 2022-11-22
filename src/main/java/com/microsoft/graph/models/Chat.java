package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Chat extends Entity implements Parsable {
    /** The chatType property */
    private ChatType _chatType;
    /** Date and time at which the chat was created. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** A collection of all the apps in the chat. Nullable. */
    private java.util.List<TeamsAppInstallation> _installedApps;
    /** Preview of the last message sent in the chat. Null if no messages have been sent in the chat. Currently, only the list chats operation supports this property. */
    private ChatMessageInfo _lastMessagePreview;
    /** Date and time at which the chat was renamed or list of members were last changed. Read-only. */
    private OffsetDateTime _lastUpdatedDateTime;
    /** A collection of all the members in the chat. Nullable. */
    private java.util.List<ConversationMember> _members;
    /** A collection of all the messages in the chat. Nullable. */
    private java.util.List<ChatMessage> _messages;
    /** Represents details about an online meeting. If the chat isn't associated with an online meeting, the property is empty. Read-only. */
    private TeamworkOnlineMeetingInfo _onlineMeetingInfo;
    /** A collection of all the pinned messages in the chat. Nullable. */
    private java.util.List<PinnedChatMessageInfo> _pinnedMessages;
    /** A collection of all the tabs in the chat. Nullable. */
    private java.util.List<TeamsTab> _tabs;
    /** The identifier of the tenant in which the chat was created. Read-only. */
    private String _tenantId;
    /** (Optional) Subject or topic for the chat. Only available for group chats. */
    private String _topic;
    /** Represents caller-specific information about the chat, such as last message read date and time. This property is populated only when the request is made in a delegated context. */
    private ChatViewpoint _viewpoint;
    /** The URL for the chat in Microsoft Teams. The URL should be treated as an opaque blob, and not parsed. Read-only. */
    private String _webUrl;
    /**
     * Instantiates a new chat and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Chat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chat
     */
    @javax.annotation.Nonnull
    public static Chat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Chat();
    }
    /**
     * Gets the chatType property value. The chatType property
     * @return a chatType
     */
    @javax.annotation.Nullable
    public ChatType getChatType() {
        return this._chatType;
    }
    /**
     * Gets the createdDateTime property value. Date and time at which the chat was created. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("chatType", (n) -> { this.setChatType(n.getEnumValue(ChatType.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("installedApps", (n) -> { this.setInstalledApps(n.getCollectionOfObjectValues(TeamsAppInstallation::createFromDiscriminatorValue)); });
        deserializerMap.put("lastMessagePreview", (n) -> { this.setLastMessagePreview(n.getObjectValue(ChatMessageInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(ConversationMember::createFromDiscriminatorValue)); });
        deserializerMap.put("messages", (n) -> { this.setMessages(n.getCollectionOfObjectValues(ChatMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("onlineMeetingInfo", (n) -> { this.setOnlineMeetingInfo(n.getObjectValue(TeamworkOnlineMeetingInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("pinnedMessages", (n) -> { this.setPinnedMessages(n.getCollectionOfObjectValues(PinnedChatMessageInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("tabs", (n) -> { this.setTabs(n.getCollectionOfObjectValues(TeamsTab::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("topic", (n) -> { this.setTopic(n.getStringValue()); });
        deserializerMap.put("viewpoint", (n) -> { this.setViewpoint(n.getObjectValue(ChatViewpoint::createFromDiscriminatorValue)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installedApps property value. A collection of all the apps in the chat. Nullable.
     * @return a teamsAppInstallation
     */
    @javax.annotation.Nullable
    public java.util.List<TeamsAppInstallation> getInstalledApps() {
        return this._installedApps;
    }
    /**
     * Gets the lastMessagePreview property value. Preview of the last message sent in the chat. Null if no messages have been sent in the chat. Currently, only the list chats operation supports this property.
     * @return a chatMessageInfo
     */
    @javax.annotation.Nullable
    public ChatMessageInfo getLastMessagePreview() {
        return this._lastMessagePreview;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Date and time at which the chat was renamed or list of members were last changed. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the members property value. A collection of all the members in the chat. Nullable.
     * @return a conversationMember
     */
    @javax.annotation.Nullable
    public java.util.List<ConversationMember> getMembers() {
        return this._members;
    }
    /**
     * Gets the messages property value. A collection of all the messages in the chat. Nullable.
     * @return a chatMessage
     */
    @javax.annotation.Nullable
    public java.util.List<ChatMessage> getMessages() {
        return this._messages;
    }
    /**
     * Gets the onlineMeetingInfo property value. Represents details about an online meeting. If the chat isn't associated with an online meeting, the property is empty. Read-only.
     * @return a teamworkOnlineMeetingInfo
     */
    @javax.annotation.Nullable
    public TeamworkOnlineMeetingInfo getOnlineMeetingInfo() {
        return this._onlineMeetingInfo;
    }
    /**
     * Gets the pinnedMessages property value. A collection of all the pinned messages in the chat. Nullable.
     * @return a pinnedChatMessageInfo
     */
    @javax.annotation.Nullable
    public java.util.List<PinnedChatMessageInfo> getPinnedMessages() {
        return this._pinnedMessages;
    }
    /**
     * Gets the tabs property value. A collection of all the tabs in the chat. Nullable.
     * @return a teamsTab
     */
    @javax.annotation.Nullable
    public java.util.List<TeamsTab> getTabs() {
        return this._tabs;
    }
    /**
     * Gets the tenantId property value. The identifier of the tenant in which the chat was created. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the topic property value. (Optional) Subject or topic for the chat. Only available for group chats.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTopic() {
        return this._topic;
    }
    /**
     * Gets the viewpoint property value. Represents caller-specific information about the chat, such as last message read date and time. This property is populated only when the request is made in a delegated context.
     * @return a chatViewpoint
     */
    @javax.annotation.Nullable
    public ChatViewpoint getViewpoint() {
        return this._viewpoint;
    }
    /**
     * Gets the webUrl property value. The URL for the chat in Microsoft Teams. The URL should be treated as an opaque blob, and not parsed. Read-only.
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
        writer.writeEnumValue("chatType", this.getChatType());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("installedApps", this.getInstalledApps());
        writer.writeObjectValue("lastMessagePreview", this.getLastMessagePreview());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
        writer.writeObjectValue("onlineMeetingInfo", this.getOnlineMeetingInfo());
        writer.writeCollectionOfObjectValues("pinnedMessages", this.getPinnedMessages());
        writer.writeCollectionOfObjectValues("tabs", this.getTabs());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("topic", this.getTopic());
        writer.writeObjectValue("viewpoint", this.getViewpoint());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the chatType property value. The chatType property
     * @param value Value to set for the chatType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChatType(@javax.annotation.Nullable final ChatType value) {
        this._chatType = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time at which the chat was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the installedApps property value. A collection of all the apps in the chat. Nullable.
     * @param value Value to set for the installedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstalledApps(@javax.annotation.Nullable final java.util.List<TeamsAppInstallation> value) {
        this._installedApps = value;
    }
    /**
     * Sets the lastMessagePreview property value. Preview of the last message sent in the chat. Null if no messages have been sent in the chat. Currently, only the list chats operation supports this property.
     * @param value Value to set for the lastMessagePreview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastMessagePreview(@javax.annotation.Nullable final ChatMessageInfo value) {
        this._lastMessagePreview = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Date and time at which the chat was renamed or list of members were last changed. Read-only.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the members property value. A collection of all the members in the chat. Nullable.
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<ConversationMember> value) {
        this._members = value;
    }
    /**
     * Sets the messages property value. A collection of all the messages in the chat. Nullable.
     * @param value Value to set for the messages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessages(@javax.annotation.Nullable final java.util.List<ChatMessage> value) {
        this._messages = value;
    }
    /**
     * Sets the onlineMeetingInfo property value. Represents details about an online meeting. If the chat isn't associated with an online meeting, the property is empty. Read-only.
     * @param value Value to set for the onlineMeetingInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineMeetingInfo(@javax.annotation.Nullable final TeamworkOnlineMeetingInfo value) {
        this._onlineMeetingInfo = value;
    }
    /**
     * Sets the pinnedMessages property value. A collection of all the pinned messages in the chat. Nullable.
     * @param value Value to set for the pinnedMessages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPinnedMessages(@javax.annotation.Nullable final java.util.List<PinnedChatMessageInfo> value) {
        this._pinnedMessages = value;
    }
    /**
     * Sets the tabs property value. A collection of all the tabs in the chat. Nullable.
     * @param value Value to set for the tabs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTabs(@javax.annotation.Nullable final java.util.List<TeamsTab> value) {
        this._tabs = value;
    }
    /**
     * Sets the tenantId property value. The identifier of the tenant in which the chat was created. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the topic property value. (Optional) Subject or topic for the chat. Only available for group chats.
     * @param value Value to set for the topic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopic(@javax.annotation.Nullable final String value) {
        this._topic = value;
    }
    /**
     * Sets the viewpoint property value. Represents caller-specific information about the chat, such as last message read date and time. This property is populated only when the request is made in a delegated context.
     * @param value Value to set for the viewpoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setViewpoint(@javax.annotation.Nullable final ChatViewpoint value) {
        this._viewpoint = value;
    }
    /**
     * Sets the webUrl property value. The URL for the chat in Microsoft Teams. The URL should be treated as an opaque blob, and not parsed. Read-only.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
