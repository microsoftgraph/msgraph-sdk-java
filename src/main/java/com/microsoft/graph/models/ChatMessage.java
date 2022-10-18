package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreement entities. */
public class ChatMessage extends Entity implements Parsable {
    /** References to attached objects like files, tabs, meetings etc. */
    private java.util.List<ChatMessageAttachment> _attachments;
    /** The body property */
    private ItemBody _body;
    /** If the message was sent in a channel, represents identity of the channel. */
    private ChannelIdentity _channelIdentity;
    /** If the message was sent in a chat, represents the identity of the chat. */
    private String _chatId;
    /** Timestamp of when the chat message was created. */
    private OffsetDateTime _createdDateTime;
    /** Read only. Timestamp at which the chat message was deleted, or null if not deleted. */
    private OffsetDateTime _deletedDateTime;
    /** Read-only. Version number of the chat message. */
    private String _etag;
    /** Read-only. If present, represents details of an event that happened in a chat, a channel, or a team, for example, adding new members. For event messages, the messageType property will be set to systemEventMessage. */
    private EventMessageDetail _eventDetail;
    /** Details of the sender of the chat message. Can only be set during migration. */
    private ChatMessageFromIdentitySet _from;
    /** Content in a message hosted by Microsoft Teams - for example, images or code snippets. */
    private java.util.List<ChatMessageHostedContent> _hostedContents;
    /** The importance property */
    private ChatMessageImportance _importance;
    /** Read only. Timestamp when edits to the chat message were made. Triggers an 'Edited' flag in the Teams UI. If no edits are made the value is null. */
    private OffsetDateTime _lastEditedDateTime;
    /** Read only. Timestamp when the chat message is created (initial setting) or modified, including when a reaction is added or removed. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Locale of the chat message set by the client. Always set to en-us. */
    private String _locale;
    /** List of entities mentioned in the chat message. Supported entities are: user, bot, team, and channel. */
    private java.util.List<ChatMessageMention> _mentions;
    /** The messageType property */
    private ChatMessageType _messageType;
    /** Defines the properties of a policy violation set by a data loss prevention (DLP) application. */
    private ChatMessagePolicyViolation _policyViolation;
    /** Reactions for this chat message (for example, Like). */
    private java.util.List<ChatMessageReaction> _reactions;
    /** Replies for a specified message. Supports $expand for channel messages. */
    private java.util.List<ChatMessage> _replies;
    /** Read-only. ID of the parent chat message or root chat message of the thread. (Only applies to chat messages in channels, not chats.) */
    private String _replyToId;
    /** The subject of the chat message, in plaintext. */
    private String _subject;
    /** Summary text of the chat message that could be used for push notifications and summary views or fall back views. Only applies to channel chat messages, not chat messages in a chat. */
    private String _summary;
    /** Read-only. Link to the message in Microsoft Teams. */
    private String _webUrl;
    /**
     * Instantiates a new chatMessage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChatMessage() {
        super();
        this.setOdataType("#microsoft.graph.chatMessage");
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
        return this._attachments;
    }
    /**
     * Gets the body property value. The body property
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getBody() {
        return this._body;
    }
    /**
     * Gets the channelIdentity property value. If the message was sent in a channel, represents identity of the channel.
     * @return a channelIdentity
     */
    @javax.annotation.Nullable
    public ChannelIdentity getChannelIdentity() {
        return this._channelIdentity;
    }
    /**
     * Gets the chatId property value. If the message was sent in a chat, represents the identity of the chat.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChatId() {
        return this._chatId;
    }
    /**
     * Gets the createdDateTime property value. Timestamp of when the chat message was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the deletedDateTime property value. Read only. Timestamp at which the chat message was deleted, or null if not deleted.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this._deletedDateTime;
    }
    /**
     * Gets the etag property value. Read-only. Version number of the chat message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEtag() {
        return this._etag;
    }
    /**
     * Gets the eventDetail property value. Read-only. If present, represents details of an event that happened in a chat, a channel, or a team, for example, adding new members. For event messages, the messageType property will be set to systemEventMessage.
     * @return a eventMessageDetail
     */
    @javax.annotation.Nullable
    public EventMessageDetail getEventDetail() {
        return this._eventDetail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChatMessage currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("attachments", (n) -> { currentObject.setAttachments(n.getCollectionOfObjectValues(ChatMessageAttachment::createFromDiscriminatorValue)); });
            this.put("body", (n) -> { currentObject.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
            this.put("channelIdentity", (n) -> { currentObject.setChannelIdentity(n.getObjectValue(ChannelIdentity::createFromDiscriminatorValue)); });
            this.put("chatId", (n) -> { currentObject.setChatId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("deletedDateTime", (n) -> { currentObject.setDeletedDateTime(n.getOffsetDateTimeValue()); });
            this.put("etag", (n) -> { currentObject.setEtag(n.getStringValue()); });
            this.put("eventDetail", (n) -> { currentObject.setEventDetail(n.getObjectValue(EventMessageDetail::createFromDiscriminatorValue)); });
            this.put("from", (n) -> { currentObject.setFrom(n.getObjectValue(ChatMessageFromIdentitySet::createFromDiscriminatorValue)); });
            this.put("hostedContents", (n) -> { currentObject.setHostedContents(n.getCollectionOfObjectValues(ChatMessageHostedContent::createFromDiscriminatorValue)); });
            this.put("importance", (n) -> { currentObject.setImportance(n.getEnumValue(ChatMessageImportance.class)); });
            this.put("lastEditedDateTime", (n) -> { currentObject.setLastEditedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("locale", (n) -> { currentObject.setLocale(n.getStringValue()); });
            this.put("mentions", (n) -> { currentObject.setMentions(n.getCollectionOfObjectValues(ChatMessageMention::createFromDiscriminatorValue)); });
            this.put("messageType", (n) -> { currentObject.setMessageType(n.getEnumValue(ChatMessageType.class)); });
            this.put("policyViolation", (n) -> { currentObject.setPolicyViolation(n.getObjectValue(ChatMessagePolicyViolation::createFromDiscriminatorValue)); });
            this.put("reactions", (n) -> { currentObject.setReactions(n.getCollectionOfObjectValues(ChatMessageReaction::createFromDiscriminatorValue)); });
            this.put("replies", (n) -> { currentObject.setReplies(n.getCollectionOfObjectValues(ChatMessage::createFromDiscriminatorValue)); });
            this.put("replyToId", (n) -> { currentObject.setReplyToId(n.getStringValue()); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getStringValue()); });
            this.put("summary", (n) -> { currentObject.setSummary(n.getStringValue()); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the from property value. Details of the sender of the chat message. Can only be set during migration.
     * @return a chatMessageFromIdentitySet
     */
    @javax.annotation.Nullable
    public ChatMessageFromIdentitySet getFrom() {
        return this._from;
    }
    /**
     * Gets the hostedContents property value. Content in a message hosted by Microsoft Teams - for example, images or code snippets.
     * @return a chatMessageHostedContent
     */
    @javax.annotation.Nullable
    public java.util.List<ChatMessageHostedContent> getHostedContents() {
        return this._hostedContents;
    }
    /**
     * Gets the importance property value. The importance property
     * @return a chatMessageImportance
     */
    @javax.annotation.Nullable
    public ChatMessageImportance getImportance() {
        return this._importance;
    }
    /**
     * Gets the lastEditedDateTime property value. Read only. Timestamp when edits to the chat message were made. Triggers an 'Edited' flag in the Teams UI. If no edits are made the value is null.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastEditedDateTime() {
        return this._lastEditedDateTime;
    }
    /**
     * Gets the lastModifiedDateTime property value. Read only. Timestamp when the chat message is created (initial setting) or modified, including when a reaction is added or removed.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the locale property value. Locale of the chat message set by the client. Always set to en-us.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocale() {
        return this._locale;
    }
    /**
     * Gets the mentions property value. List of entities mentioned in the chat message. Supported entities are: user, bot, team, and channel.
     * @return a chatMessageMention
     */
    @javax.annotation.Nullable
    public java.util.List<ChatMessageMention> getMentions() {
        return this._mentions;
    }
    /**
     * Gets the messageType property value. The messageType property
     * @return a chatMessageType
     */
    @javax.annotation.Nullable
    public ChatMessageType getMessageType() {
        return this._messageType;
    }
    /**
     * Gets the policyViolation property value. Defines the properties of a policy violation set by a data loss prevention (DLP) application.
     * @return a chatMessagePolicyViolation
     */
    @javax.annotation.Nullable
    public ChatMessagePolicyViolation getPolicyViolation() {
        return this._policyViolation;
    }
    /**
     * Gets the reactions property value. Reactions for this chat message (for example, Like).
     * @return a chatMessageReaction
     */
    @javax.annotation.Nullable
    public java.util.List<ChatMessageReaction> getReactions() {
        return this._reactions;
    }
    /**
     * Gets the replies property value. Replies for a specified message. Supports $expand for channel messages.
     * @return a chatMessage
     */
    @javax.annotation.Nullable
    public java.util.List<ChatMessage> getReplies() {
        return this._replies;
    }
    /**
     * Gets the replyToId property value. Read-only. ID of the parent chat message or root chat message of the thread. (Only applies to chat messages in channels, not chats.)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReplyToId() {
        return this._replyToId;
    }
    /**
     * Gets the subject property value. The subject of the chat message, in plaintext.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
    }
    /**
     * Gets the summary property value. Summary text of the chat message that could be used for push notifications and summary views or fall back views. Only applies to channel chat messages, not chat messages in a chat.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSummary() {
        return this._summary;
    }
    /**
     * Gets the webUrl property value. Read-only. Link to the message in Microsoft Teams.
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
        this._attachments = value;
    }
    /**
     * Sets the body property value. The body property
     * @param value Value to set for the body property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBody(@javax.annotation.Nullable final ItemBody value) {
        this._body = value;
    }
    /**
     * Sets the channelIdentity property value. If the message was sent in a channel, represents identity of the channel.
     * @param value Value to set for the channelIdentity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChannelIdentity(@javax.annotation.Nullable final ChannelIdentity value) {
        this._channelIdentity = value;
    }
    /**
     * Sets the chatId property value. If the message was sent in a chat, represents the identity of the chat.
     * @param value Value to set for the chatId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChatId(@javax.annotation.Nullable final String value) {
        this._chatId = value;
    }
    /**
     * Sets the createdDateTime property value. Timestamp of when the chat message was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the deletedDateTime property value. Read only. Timestamp at which the chat message was deleted, or null if not deleted.
     * @param value Value to set for the deletedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deletedDateTime = value;
    }
    /**
     * Sets the etag property value. Read-only. Version number of the chat message.
     * @param value Value to set for the etag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEtag(@javax.annotation.Nullable final String value) {
        this._etag = value;
    }
    /**
     * Sets the eventDetail property value. Read-only. If present, represents details of an event that happened in a chat, a channel, or a team, for example, adding new members. For event messages, the messageType property will be set to systemEventMessage.
     * @param value Value to set for the eventDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventDetail(@javax.annotation.Nullable final EventMessageDetail value) {
        this._eventDetail = value;
    }
    /**
     * Sets the from property value. Details of the sender of the chat message. Can only be set during migration.
     * @param value Value to set for the from property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFrom(@javax.annotation.Nullable final ChatMessageFromIdentitySet value) {
        this._from = value;
    }
    /**
     * Sets the hostedContents property value. Content in a message hosted by Microsoft Teams - for example, images or code snippets.
     * @param value Value to set for the hostedContents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostedContents(@javax.annotation.Nullable final java.util.List<ChatMessageHostedContent> value) {
        this._hostedContents = value;
    }
    /**
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportance(@javax.annotation.Nullable final ChatMessageImportance value) {
        this._importance = value;
    }
    /**
     * Sets the lastEditedDateTime property value. Read only. Timestamp when edits to the chat message were made. Triggers an 'Edited' flag in the Teams UI. If no edits are made the value is null.
     * @param value Value to set for the lastEditedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastEditedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastEditedDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Read only. Timestamp when the chat message is created (initial setting) or modified, including when a reaction is added or removed.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the locale property value. Locale of the chat message set by the client. Always set to en-us.
     * @param value Value to set for the locale property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocale(@javax.annotation.Nullable final String value) {
        this._locale = value;
    }
    /**
     * Sets the mentions property value. List of entities mentioned in the chat message. Supported entities are: user, bot, team, and channel.
     * @param value Value to set for the mentions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMentions(@javax.annotation.Nullable final java.util.List<ChatMessageMention> value) {
        this._mentions = value;
    }
    /**
     * Sets the messageType property value. The messageType property
     * @param value Value to set for the messageType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessageType(@javax.annotation.Nullable final ChatMessageType value) {
        this._messageType = value;
    }
    /**
     * Sets the policyViolation property value. Defines the properties of a policy violation set by a data loss prevention (DLP) application.
     * @param value Value to set for the policyViolation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyViolation(@javax.annotation.Nullable final ChatMessagePolicyViolation value) {
        this._policyViolation = value;
    }
    /**
     * Sets the reactions property value. Reactions for this chat message (for example, Like).
     * @param value Value to set for the reactions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReactions(@javax.annotation.Nullable final java.util.List<ChatMessageReaction> value) {
        this._reactions = value;
    }
    /**
     * Sets the replies property value. Replies for a specified message. Supports $expand for channel messages.
     * @param value Value to set for the replies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplies(@javax.annotation.Nullable final java.util.List<ChatMessage> value) {
        this._replies = value;
    }
    /**
     * Sets the replyToId property value. Read-only. ID of the parent chat message or root chat message of the thread. (Only applies to chat messages in channels, not chats.)
     * @param value Value to set for the replyToId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplyToId(@javax.annotation.Nullable final String value) {
        this._replyToId = value;
    }
    /**
     * Sets the subject property value. The subject of the chat message, in plaintext.
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
    /**
     * Sets the summary property value. Summary text of the chat message that could be used for push notifications and summary views or fall back views. Only applies to channel chat messages, not chat messages in a chat.
     * @param value Value to set for the summary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSummary(@javax.annotation.Nullable final String value) {
        this._summary = value;
    }
    /**
     * Sets the webUrl property value. Read-only. Link to the message in Microsoft Teams.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
