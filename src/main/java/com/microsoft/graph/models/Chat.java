package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Chat extends Entity implements Parsable {
    /**
     * The chatType property
     */
    private ChatType chatType;
    /**
     * Date and time at which the chat was created. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * A collection of all the apps in the chat. Nullable.
     */
    private java.util.List<TeamsAppInstallation> installedApps;
    /**
     * Preview of the last message sent in the chat. Null if no messages have been sent in the chat. Currently, only the list chats operation supports this property.
     */
    private ChatMessageInfo lastMessagePreview;
    /**
     * Date and time at which the chat was renamed or list of members were last changed. Read-only.
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * A collection of all the members in the chat. Nullable.
     */
    private java.util.List<ConversationMember> members;
    /**
     * A collection of all the messages in the chat. Nullable.
     */
    private java.util.List<ChatMessage> messages;
    /**
     * Represents details about an online meeting. If the chat isn't associated with an online meeting, the property is empty. Read-only.
     */
    private TeamworkOnlineMeetingInfo onlineMeetingInfo;
    /**
     * A collection of permissions granted to apps for the chat.
     */
    private java.util.List<ResourceSpecificPermissionGrant> permissionGrants;
    /**
     * A collection of all the pinned messages in the chat. Nullable.
     */
    private java.util.List<PinnedChatMessageInfo> pinnedMessages;
    /**
     * A collection of all the tabs in the chat. Nullable.
     */
    private java.util.List<TeamsTab> tabs;
    /**
     * The identifier of the tenant in which the chat was created. Read-only.
     */
    private String tenantId;
    /**
     * (Optional) Subject or topic for the chat. Only available for group chats.
     */
    private String topic;
    /**
     * Represents caller-specific information about the chat, such as last message read date and time. This property is populated only when the request is made in a delegated context.
     */
    private ChatViewpoint viewpoint;
    /**
     * The URL for the chat in Microsoft Teams. The URL should be treated as an opaque blob, and not parsed. Read-only.
     */
    private String webUrl;
    /**
     * Instantiates a new Chat and sets the default values.
     */
    public Chat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Chat
     */
    @jakarta.annotation.Nonnull
    public static Chat createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Chat();
    }
    /**
     * Gets the chatType property value. The chatType property
     * @return a ChatType
     */
    @jakarta.annotation.Nullable
    public ChatType getChatType() {
        return this.chatType;
    }
    /**
     * Gets the createdDateTime property value. Date and time at which the chat was created. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("chatType", (n) -> { this.setChatType(n.getEnumValue(ChatType.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("installedApps", (n) -> { this.setInstalledApps(n.getCollectionOfObjectValues(TeamsAppInstallation::createFromDiscriminatorValue)); });
        deserializerMap.put("lastMessagePreview", (n) -> { this.setLastMessagePreview(n.getObjectValue(ChatMessageInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(ConversationMember::createFromDiscriminatorValue)); });
        deserializerMap.put("messages", (n) -> { this.setMessages(n.getCollectionOfObjectValues(ChatMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("onlineMeetingInfo", (n) -> { this.setOnlineMeetingInfo(n.getObjectValue(TeamworkOnlineMeetingInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionGrants", (n) -> { this.setPermissionGrants(n.getCollectionOfObjectValues(ResourceSpecificPermissionGrant::createFromDiscriminatorValue)); });
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
     * @return a java.util.List<TeamsAppInstallation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamsAppInstallation> getInstalledApps() {
        return this.installedApps;
    }
    /**
     * Gets the lastMessagePreview property value. Preview of the last message sent in the chat. Null if no messages have been sent in the chat. Currently, only the list chats operation supports this property.
     * @return a ChatMessageInfo
     */
    @jakarta.annotation.Nullable
    public ChatMessageInfo getLastMessagePreview() {
        return this.lastMessagePreview;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Date and time at which the chat was renamed or list of members were last changed. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the members property value. A collection of all the members in the chat. Nullable.
     * @return a java.util.List<ConversationMember>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConversationMember> getMembers() {
        return this.members;
    }
    /**
     * Gets the messages property value. A collection of all the messages in the chat. Nullable.
     * @return a java.util.List<ChatMessage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChatMessage> getMessages() {
        return this.messages;
    }
    /**
     * Gets the onlineMeetingInfo property value. Represents details about an online meeting. If the chat isn't associated with an online meeting, the property is empty. Read-only.
     * @return a TeamworkOnlineMeetingInfo
     */
    @jakarta.annotation.Nullable
    public TeamworkOnlineMeetingInfo getOnlineMeetingInfo() {
        return this.onlineMeetingInfo;
    }
    /**
     * Gets the permissionGrants property value. A collection of permissions granted to apps for the chat.
     * @return a java.util.List<ResourceSpecificPermissionGrant>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourceSpecificPermissionGrant> getPermissionGrants() {
        return this.permissionGrants;
    }
    /**
     * Gets the pinnedMessages property value. A collection of all the pinned messages in the chat. Nullable.
     * @return a java.util.List<PinnedChatMessageInfo>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PinnedChatMessageInfo> getPinnedMessages() {
        return this.pinnedMessages;
    }
    /**
     * Gets the tabs property value. A collection of all the tabs in the chat. Nullable.
     * @return a java.util.List<TeamsTab>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamsTab> getTabs() {
        return this.tabs;
    }
    /**
     * Gets the tenantId property value. The identifier of the tenant in which the chat was created. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the topic property value. (Optional) Subject or topic for the chat. Only available for group chats.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTopic() {
        return this.topic;
    }
    /**
     * Gets the viewpoint property value. Represents caller-specific information about the chat, such as last message read date and time. This property is populated only when the request is made in a delegated context.
     * @return a ChatViewpoint
     */
    @jakarta.annotation.Nullable
    public ChatViewpoint getViewpoint() {
        return this.viewpoint;
    }
    /**
     * Gets the webUrl property value. The URL for the chat in Microsoft Teams. The URL should be treated as an opaque blob, and not parsed. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeCollectionOfObjectValues("permissionGrants", this.getPermissionGrants());
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
     */
    public void setChatType(@jakarta.annotation.Nullable final ChatType value) {
        this.chatType = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time at which the chat was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the installedApps property value. A collection of all the apps in the chat. Nullable.
     * @param value Value to set for the installedApps property.
     */
    public void setInstalledApps(@jakarta.annotation.Nullable final java.util.List<TeamsAppInstallation> value) {
        this.installedApps = value;
    }
    /**
     * Sets the lastMessagePreview property value. Preview of the last message sent in the chat. Null if no messages have been sent in the chat. Currently, only the list chats operation supports this property.
     * @param value Value to set for the lastMessagePreview property.
     */
    public void setLastMessagePreview(@jakarta.annotation.Nullable final ChatMessageInfo value) {
        this.lastMessagePreview = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Date and time at which the chat was renamed or list of members were last changed. Read-only.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the members property value. A collection of all the members in the chat. Nullable.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<ConversationMember> value) {
        this.members = value;
    }
    /**
     * Sets the messages property value. A collection of all the messages in the chat. Nullable.
     * @param value Value to set for the messages property.
     */
    public void setMessages(@jakarta.annotation.Nullable final java.util.List<ChatMessage> value) {
        this.messages = value;
    }
    /**
     * Sets the onlineMeetingInfo property value. Represents details about an online meeting. If the chat isn't associated with an online meeting, the property is empty. Read-only.
     * @param value Value to set for the onlineMeetingInfo property.
     */
    public void setOnlineMeetingInfo(@jakarta.annotation.Nullable final TeamworkOnlineMeetingInfo value) {
        this.onlineMeetingInfo = value;
    }
    /**
     * Sets the permissionGrants property value. A collection of permissions granted to apps for the chat.
     * @param value Value to set for the permissionGrants property.
     */
    public void setPermissionGrants(@jakarta.annotation.Nullable final java.util.List<ResourceSpecificPermissionGrant> value) {
        this.permissionGrants = value;
    }
    /**
     * Sets the pinnedMessages property value. A collection of all the pinned messages in the chat. Nullable.
     * @param value Value to set for the pinnedMessages property.
     */
    public void setPinnedMessages(@jakarta.annotation.Nullable final java.util.List<PinnedChatMessageInfo> value) {
        this.pinnedMessages = value;
    }
    /**
     * Sets the tabs property value. A collection of all the tabs in the chat. Nullable.
     * @param value Value to set for the tabs property.
     */
    public void setTabs(@jakarta.annotation.Nullable final java.util.List<TeamsTab> value) {
        this.tabs = value;
    }
    /**
     * Sets the tenantId property value. The identifier of the tenant in which the chat was created. Read-only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the topic property value. (Optional) Subject or topic for the chat. Only available for group chats.
     * @param value Value to set for the topic property.
     */
    public void setTopic(@jakarta.annotation.Nullable final String value) {
        this.topic = value;
    }
    /**
     * Sets the viewpoint property value. Represents caller-specific information about the chat, such as last message read date and time. This property is populated only when the request is made in a delegated context.
     * @param value Value to set for the viewpoint property.
     */
    public void setViewpoint(@jakarta.annotation.Nullable final ChatViewpoint value) {
        this.viewpoint = value;
    }
    /**
     * Sets the webUrl property value. The URL for the chat in Microsoft Teams. The URL should be treated as an opaque blob, and not parsed. Read-only.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}
