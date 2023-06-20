package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatMessage extends Entity implements Parsable {
    /** References to attached objects like files, tabs, meetings etc. */
    private java.util.List<ChatMessageAttachment> attachments;
    /** The body property */
    private ItemBody body;
    /** If the message was sent in a channel, represents identity of the channel. */
    private ChannelIdentity channelIdentity;
    /** If the message was sent in a chat, represents the identity of the chat. */
    private String chatId;
    /** Timestamp of when the chat message was created. */
    private OffsetDateTime createdDateTime;
    /** Read only. Timestamp at which the chat message was deleted, or null if not deleted. */
    private OffsetDateTime deletedDateTime;
    /** Read-only. Version number of the chat message. */
    private String etag;
    /** Read-only. If present, represents details of an event that happened in a chat, a channel, or a team, for example, adding new members. For event messages, the messageType property will be set to systemEventMessage. */
    private EventMessageDetail eventDetail;
    /** Details of the sender of the chat message. Can only be set during migration. */
    private ChatMessageFromIdentitySet from;
    /** Content in a message hosted by Microsoft Teams - for example, images or code snippets. */
    private java.util.List<ChatMessageHostedContent> hostedContents;
    /** The importance property */
    private ChatMessageImportance importance;
    /** Read only. Timestamp when edits to the chat message were made. Triggers an 'Edited' flag in the Teams UI. If no edits are made the value is null. */
    private OffsetDateTime lastEditedDateTime;
    /** Read only. Timestamp when the chat message is created (initial setting) or modified, including when a reaction is added or removed. */
    private OffsetDateTime lastModifiedDateTime;
    /** Locale of the chat message set by the client. Always set to en-us. */
    private String locale;
    /** List of entities mentioned in the chat message. Supported entities are: user, bot, team, and channel. */
    private java.util.List<ChatMessageMention> mentions;
    /** List of activity history of a message item, including modification time and actions, such as reactionAdded, reactionRemoved, or reaction changes, on the message. */
    private java.util.List<ChatMessageHistoryItem> messageHistory;
    /** The messageType property */
    private ChatMessageType messageType;
    /** Defines the properties of a policy violation set by a data loss prevention (DLP) application. */
    private ChatMessagePolicyViolation policyViolation;
    /** Reactions for this chat message (for example, Like). */
    private java.util.List<ChatMessageReaction> reactions;
    /** Replies for a specified message. Supports $expand for channel messages. */
    private java.util.List<ChatMessage> replies;
    /** Read-only. ID of the parent chat message or root chat message of the thread. (Only applies to chat messages in channels, not chats.) */
    private String replyToId;
    /** The subject of the chat message, in plaintext. */
    private String subject;
    /** Summary text of the chat message that could be used for push notifications and summary views or fall back views. Only applies to channel chat messages, not chat messages in a chat. */
    private String summary;
    /** Read-only. Link to the message in Microsoft Teams. */
    private String webUrl;
    /**
     * Instantiates a new chatMessage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChatMessage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chatMessage
     */
    @javax.annotation.Nonnull
    public static ChatMessage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMessage();
    }
    /**
     * Gets the attachments property value. References to attached objects like files, tabs, meetings etc.
     * @return a chatMessageAttachment
     */
    @javax.annotation.Nullable
    public java.util.List<ChatMessageAttachment> getAttachments() {
        return this.attachments;
    }
    /**
     * Gets the body property value. The body property
     * @return a ItemBody
     */
    @javax.annotation.Nullable
    public ItemBody getBody() {
        return this.body;
    }
    /**
     * Gets the channelIdentity property value. If the message was sent in a channel, represents identity of the channel.
     * @return a channelIdentity
     */
    @javax.annotation.Nullable
    public ChannelIdentity getChannelIdentity() {
        return this.channelIdentity;
    }
    /**
     * Gets the chatId property value. If the message was sent in a chat, represents the identity of the chat.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChatId() {
        return this.chatId;
    }
    /**
     * Gets the createdDateTime property value. Timestamp of when the chat message was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the deletedDateTime property value. Read only. Timestamp at which the chat message was deleted, or null if not deleted.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this.deletedDateTime;
    }
    /**
     * Gets the etag property value. Read-only. Version number of the chat message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEtag() {
        return this.etag;
    }
    /**
     * Gets the eventDetail property value. Read-only. If present, represents details of an event that happened in a chat, a channel, or a team, for example, adding new members. For event messages, the messageType property will be set to systemEventMessage.
     * @return a eventMessageDetail
     */
    @javax.annotation.Nullable
    public EventMessageDetail getEventDetail() {
        return this.eventDetail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attachments", (n) -> { this.setAttachments(n.getCollectionOfObjectValues(ChatMessageAttachment::createFromDiscriminatorValue)); });
        deserializerMap.put("body", (n) -> { this.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("channelIdentity", (n) -> { this.setChannelIdentity(n.getObjectValue(ChannelIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("chatId", (n) -> { this.setChatId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deletedDateTime", (n) -> { this.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("etag", (n) -> { this.setEtag(n.getStringValue()); });
        deserializerMap.put("eventDetail", (n) -> { this.setEventDetail(n.getObjectValue(EventMessageDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("from", (n) -> { this.setFrom(n.getObjectValue(ChatMessageFromIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("hostedContents", (n) -> { this.setHostedContents(n.getCollectionOfObjectValues(ChatMessageHostedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("importance", (n) -> { this.setImportance(n.getEnumValue(ChatMessageImportance.class)); });
        deserializerMap.put("lastEditedDateTime", (n) -> { this.setLastEditedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("mentions", (n) -> { this.setMentions(n.getCollectionOfObjectValues(ChatMessageMention::createFromDiscriminatorValue)); });
        deserializerMap.put("messageHistory", (n) -> { this.setMessageHistory(n.getCollectionOfObjectValues(ChatMessageHistoryItem::createFromDiscriminatorValue)); });
        deserializerMap.put("messageType", (n) -> { this.setMessageType(n.getEnumValue(ChatMessageType.class)); });
        deserializerMap.put("policyViolation", (n) -> { this.setPolicyViolation(n.getObjectValue(ChatMessagePolicyViolation::createFromDiscriminatorValue)); });
        deserializerMap.put("reactions", (n) -> { this.setReactions(n.getCollectionOfObjectValues(ChatMessageReaction::createFromDiscriminatorValue)); });
        deserializerMap.put("replies", (n) -> { this.setReplies(n.getCollectionOfObjectValues(ChatMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("replyToId", (n) -> { this.setReplyToId(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the from property value. Details of the sender of the chat message. Can only be set during migration.
     * @return a chatMessageFromIdentitySet
     */
    @javax.annotation.Nullable
    public ChatMessageFromIdentitySet getFrom() {
        return this.from;
    }
    /**
     * Gets the hostedContents property value. Content in a message hosted by Microsoft Teams - for example, images or code snippets.
     * @return a chatMessageHostedContent
     */
    @javax.annotation.Nullable
    public java.util.List<ChatMessageHostedContent> getHostedContents() {
        return this.hostedContents;
    }
    /**
     * Gets the importance property value. The importance property
     * @return a ChatMessageImportance
     */
    @javax.annotation.Nullable
    public ChatMessageImportance getImportance() {
        return this.importance;
    }
    /**
     * Gets the lastEditedDateTime property value. Read only. Timestamp when edits to the chat message were made. Triggers an 'Edited' flag in the Teams UI. If no edits are made the value is null.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastEditedDateTime() {
        return this.lastEditedDateTime;
    }
    /**
     * Gets the lastModifiedDateTime property value. Read only. Timestamp when the chat message is created (initial setting) or modified, including when a reaction is added or removed.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the locale property value. Locale of the chat message set by the client. Always set to en-us.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocale() {
        return this.locale;
    }
    /**
     * Gets the mentions property value. List of entities mentioned in the chat message. Supported entities are: user, bot, team, and channel.
     * @return a chatMessageMention
     */
    @javax.annotation.Nullable
    public java.util.List<ChatMessageMention> getMentions() {
        return this.mentions;
    }
    /**
     * Gets the messageHistory property value. List of activity history of a message item, including modification time and actions, such as reactionAdded, reactionRemoved, or reaction changes, on the message.
     * @return a chatMessageHistoryItem
     */
    @javax.annotation.Nullable
    public java.util.List<ChatMessageHistoryItem> getMessageHistory() {
        return this.messageHistory;
    }
    /**
     * Gets the messageType property value. The messageType property
     * @return a ChatMessageType
     */
    @javax.annotation.Nullable
    public ChatMessageType getMessageType() {
        return this.messageType;
    }
    /**
     * Gets the policyViolation property value. Defines the properties of a policy violation set by a data loss prevention (DLP) application.
     * @return a chatMessagePolicyViolation
     */
    @javax.annotation.Nullable
    public ChatMessagePolicyViolation getPolicyViolation() {
        return this.policyViolation;
    }
    /**
     * Gets the reactions property value. Reactions for this chat message (for example, Like).
     * @return a chatMessageReaction
     */
    @javax.annotation.Nullable
    public java.util.List<ChatMessageReaction> getReactions() {
        return this.reactions;
    }
    /**
     * Gets the replies property value. Replies for a specified message. Supports $expand for channel messages.
     * @return a chatMessage
     */
    @javax.annotation.Nullable
    public java.util.List<ChatMessage> getReplies() {
        return this.replies;
    }
    /**
     * Gets the replyToId property value. Read-only. ID of the parent chat message or root chat message of the thread. (Only applies to chat messages in channels, not chats.)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReplyToId() {
        return this.replyToId;
    }
    /**
     * Gets the subject property value. The subject of the chat message, in plaintext.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Gets the summary property value. Summary text of the chat message that could be used for push notifications and summary views or fall back views. Only applies to channel chat messages, not chat messages in a chat.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSummary() {
        return this.summary;
    }
    /**
     * Gets the webUrl property value. Read-only. Link to the message in Microsoft Teams.
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
        writer.writeCollectionOfObjectValues("attachments", this.getAttachments());
        writer.writeObjectValue("body", this.getBody());
        writer.writeObjectValue("channelIdentity", this.getChannelIdentity());
        writer.writeStringValue("chatId", this.getChatId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("deletedDateTime", this.getDeletedDateTime());
        writer.writeStringValue("etag", this.getEtag());
        writer.writeObjectValue("eventDetail", this.getEventDetail());
        writer.writeObjectValue("from", this.getFrom());
        writer.writeCollectionOfObjectValues("hostedContents", this.getHostedContents());
        writer.writeEnumValue("importance", this.getImportance());
        writer.writeOffsetDateTimeValue("lastEditedDateTime", this.getLastEditedDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("locale", this.getLocale());
        writer.writeCollectionOfObjectValues("mentions", this.getMentions());
        writer.writeCollectionOfObjectValues("messageHistory", this.getMessageHistory());
        writer.writeEnumValue("messageType", this.getMessageType());
        writer.writeObjectValue("policyViolation", this.getPolicyViolation());
        writer.writeCollectionOfObjectValues("reactions", this.getReactions());
        writer.writeCollectionOfObjectValues("replies", this.getReplies());
        writer.writeStringValue("replyToId", this.getReplyToId());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeStringValue("summary", this.getSummary());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the attachments property value. References to attached objects like files, tabs, meetings etc.
     * @param value Value to set for the attachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttachments(@javax.annotation.Nullable final java.util.List<ChatMessageAttachment> value) {
        this.attachments = value;
    }
    /**
     * Sets the body property value. The body property
     * @param value Value to set for the body property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBody(@javax.annotation.Nullable final ItemBody value) {
        this.body = value;
    }
    /**
     * Sets the channelIdentity property value. If the message was sent in a channel, represents identity of the channel.
     * @param value Value to set for the channelIdentity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChannelIdentity(@javax.annotation.Nullable final ChannelIdentity value) {
        this.channelIdentity = value;
    }
    /**
     * Sets the chatId property value. If the message was sent in a chat, represents the identity of the chat.
     * @param value Value to set for the chatId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChatId(@javax.annotation.Nullable final String value) {
        this.chatId = value;
    }
    /**
     * Sets the createdDateTime property value. Timestamp of when the chat message was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the deletedDateTime property value. Read only. Timestamp at which the chat message was deleted, or null if not deleted.
     * @param value Value to set for the deletedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.deletedDateTime = value;
    }
    /**
     * Sets the etag property value. Read-only. Version number of the chat message.
     * @param value Value to set for the etag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEtag(@javax.annotation.Nullable final String value) {
        this.etag = value;
    }
    /**
     * Sets the eventDetail property value. Read-only. If present, represents details of an event that happened in a chat, a channel, or a team, for example, adding new members. For event messages, the messageType property will be set to systemEventMessage.
     * @param value Value to set for the eventDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventDetail(@javax.annotation.Nullable final EventMessageDetail value) {
        this.eventDetail = value;
    }
    /**
     * Sets the from property value. Details of the sender of the chat message. Can only be set during migration.
     * @param value Value to set for the from property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFrom(@javax.annotation.Nullable final ChatMessageFromIdentitySet value) {
        this.from = value;
    }
    /**
     * Sets the hostedContents property value. Content in a message hosted by Microsoft Teams - for example, images or code snippets.
     * @param value Value to set for the hostedContents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostedContents(@javax.annotation.Nullable final java.util.List<ChatMessageHostedContent> value) {
        this.hostedContents = value;
    }
    /**
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportance(@javax.annotation.Nullable final ChatMessageImportance value) {
        this.importance = value;
    }
    /**
     * Sets the lastEditedDateTime property value. Read only. Timestamp when edits to the chat message were made. Triggers an 'Edited' flag in the Teams UI. If no edits are made the value is null.
     * @param value Value to set for the lastEditedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastEditedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastEditedDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Read only. Timestamp when the chat message is created (initial setting) or modified, including when a reaction is added or removed.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the locale property value. Locale of the chat message set by the client. Always set to en-us.
     * @param value Value to set for the locale property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocale(@javax.annotation.Nullable final String value) {
        this.locale = value;
    }
    /**
     * Sets the mentions property value. List of entities mentioned in the chat message. Supported entities are: user, bot, team, and channel.
     * @param value Value to set for the mentions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMentions(@javax.annotation.Nullable final java.util.List<ChatMessageMention> value) {
        this.mentions = value;
    }
    /**
     * Sets the messageHistory property value. List of activity history of a message item, including modification time and actions, such as reactionAdded, reactionRemoved, or reaction changes, on the message.
     * @param value Value to set for the messageHistory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessageHistory(@javax.annotation.Nullable final java.util.List<ChatMessageHistoryItem> value) {
        this.messageHistory = value;
    }
    /**
     * Sets the messageType property value. The messageType property
     * @param value Value to set for the messageType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessageType(@javax.annotation.Nullable final ChatMessageType value) {
        this.messageType = value;
    }
    /**
     * Sets the policyViolation property value. Defines the properties of a policy violation set by a data loss prevention (DLP) application.
     * @param value Value to set for the policyViolation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyViolation(@javax.annotation.Nullable final ChatMessagePolicyViolation value) {
        this.policyViolation = value;
    }
    /**
     * Sets the reactions property value. Reactions for this chat message (for example, Like).
     * @param value Value to set for the reactions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReactions(@javax.annotation.Nullable final java.util.List<ChatMessageReaction> value) {
        this.reactions = value;
    }
    /**
     * Sets the replies property value. Replies for a specified message. Supports $expand for channel messages.
     * @param value Value to set for the replies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplies(@javax.annotation.Nullable final java.util.List<ChatMessage> value) {
        this.replies = value;
    }
    /**
     * Sets the replyToId property value. Read-only. ID of the parent chat message or root chat message of the thread. (Only applies to chat messages in channels, not chats.)
     * @param value Value to set for the replyToId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplyToId(@javax.annotation.Nullable final String value) {
        this.replyToId = value;
    }
    /**
     * Sets the subject property value. The subject of the chat message, in plaintext.
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this.subject = value;
    }
    /**
     * Sets the summary property value. Summary text of the chat message that could be used for push notifications and summary views or fall back views. Only applies to channel chat messages, not chat messages in a chat.
     * @param value Value to set for the summary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSummary(@javax.annotation.Nullable final String value) {
        this.summary = value;
    }
    /**
     * Sets the webUrl property value. Read-only. Link to the message in Microsoft Teams.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}
