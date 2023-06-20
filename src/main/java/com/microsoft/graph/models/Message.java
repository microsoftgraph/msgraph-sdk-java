package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Message extends OutlookItem implements Parsable {
    /** The fileAttachment and itemAttachment attachments for the message. */
    private java.util.List<Attachment> attachments;
    /** The Bcc: recipients for the message. */
    private java.util.List<Recipient> bccRecipients;
    /** The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body. */
    private ItemBody body;
    /** The first 255 characters of the message body. It is in text format. */
    private String bodyPreview;
    /** The Cc: recipients for the message. */
    private java.util.List<Recipient> ccRecipients;
    /** The ID of the conversation the email belongs to. */
    private String conversationId;
    /** Indicates the position of the message within the conversation. */
    private byte[] conversationIndex;
    /** The collection of open extensions defined for the message. Nullable. */
    private java.util.List<Extension> extensions;
    /** The flag value that indicates the status, start date, due date, or completion date for the message. */
    private FollowupFlag flag;
    /** The owner of the mailbox from which the message is sent. In most cases, this value is the same as the sender property, except for sharing or delegation scenarios. The value must correspond to the actual mailbox used. Find out more about setting the from and sender properties of a message. */
    private Recipient from;
    /** Indicates whether the message has attachments. This property doesn't include inline attachments, so if a message contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body property to look for a src attribute, such as <IMG src='cid:image001.jpg@01D26CD8.6C05F070'>. */
    private Boolean hasAttachments;
    /** The importance property */
    private Importance importance;
    /** The inferenceClassification property */
    private InferenceClassificationType inferenceClassification;
    /** The internetMessageHeaders property */
    private java.util.List<InternetMessageHeader> internetMessageHeaders;
    /** The internetMessageId property */
    private String internetMessageId;
    /** The isDeliveryReceiptRequested property */
    private Boolean isDeliveryReceiptRequested;
    /** The isDraft property */
    private Boolean isDraft;
    /** The isRead property */
    private Boolean isRead;
    /** The isReadReceiptRequested property */
    private Boolean isReadReceiptRequested;
    /** The collection of multi-value extended properties defined for the message. Nullable. */
    private java.util.List<MultiValueLegacyExtendedProperty> multiValueExtendedProperties;
    /** The parentFolderId property */
    private String parentFolderId;
    /** The receivedDateTime property */
    private OffsetDateTime receivedDateTime;
    /** The replyTo property */
    private java.util.List<Recipient> replyTo;
    /** The sender property */
    private Recipient sender;
    /** The sentDateTime property */
    private OffsetDateTime sentDateTime;
    /** The collection of single-value extended properties defined for the message. Nullable. */
    private java.util.List<SingleValueLegacyExtendedProperty> singleValueExtendedProperties;
    /** The subject property */
    private String subject;
    /** The toRecipients property */
    private java.util.List<Recipient> toRecipients;
    /** The uniqueBody property */
    private ItemBody uniqueBody;
    /** The webLink property */
    private String webLink;
    /**
     * Instantiates a new message and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Message() {
        super();
        this.setOdataType("#microsoft.graph.message");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a message
     */
    @javax.annotation.Nonnull
    public static Message createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.calendarSharingMessage": return new CalendarSharingMessage();
                case "#microsoft.graph.eventMessage": return new EventMessage();
                case "#microsoft.graph.eventMessageRequest": return new EventMessageRequest();
                case "#microsoft.graph.eventMessageResponse": return new EventMessageResponse();
            }
        }
        return new Message();
    }
    /**
     * Gets the attachments property value. The fileAttachment and itemAttachment attachments for the message.
     * @return a attachment
     */
    @javax.annotation.Nullable
    public java.util.List<Attachment> getAttachments() {
        return this.attachments;
    }
    /**
     * Gets the bccRecipients property value. The Bcc: recipients for the message.
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getBccRecipients() {
        return this.bccRecipients;
    }
    /**
     * Gets the body property value. The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getBody() {
        return this.body;
    }
    /**
     * Gets the bodyPreview property value. The first 255 characters of the message body. It is in text format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBodyPreview() {
        return this.bodyPreview;
    }
    /**
     * Gets the ccRecipients property value. The Cc: recipients for the message.
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getCcRecipients() {
        return this.ccRecipients;
    }
    /**
     * Gets the conversationId property value. The ID of the conversation the email belongs to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConversationId() {
        return this.conversationId;
    }
    /**
     * Gets the conversationIndex property value. Indicates the position of the message within the conversation.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getConversationIndex() {
        return this.conversationIndex;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the message. Nullable.
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attachments", (n) -> { this.setAttachments(n.getCollectionOfObjectValues(Attachment::createFromDiscriminatorValue)); });
        deserializerMap.put("bccRecipients", (n) -> { this.setBccRecipients(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("body", (n) -> { this.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("bodyPreview", (n) -> { this.setBodyPreview(n.getStringValue()); });
        deserializerMap.put("ccRecipients", (n) -> { this.setCcRecipients(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("conversationIndex", (n) -> { this.setConversationIndex(n.getByteArrayValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("flag", (n) -> { this.setFlag(n.getObjectValue(FollowupFlag::createFromDiscriminatorValue)); });
        deserializerMap.put("from", (n) -> { this.setFrom(n.getObjectValue(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("hasAttachments", (n) -> { this.setHasAttachments(n.getBooleanValue()); });
        deserializerMap.put("importance", (n) -> { this.setImportance(n.getEnumValue(Importance.class)); });
        deserializerMap.put("inferenceClassification", (n) -> { this.setInferenceClassification(n.getEnumValue(InferenceClassificationType.class)); });
        deserializerMap.put("internetMessageHeaders", (n) -> { this.setInternetMessageHeaders(n.getCollectionOfObjectValues(InternetMessageHeader::createFromDiscriminatorValue)); });
        deserializerMap.put("internetMessageId", (n) -> { this.setInternetMessageId(n.getStringValue()); });
        deserializerMap.put("isDeliveryReceiptRequested", (n) -> { this.setIsDeliveryReceiptRequested(n.getBooleanValue()); });
        deserializerMap.put("isDraft", (n) -> { this.setIsDraft(n.getBooleanValue()); });
        deserializerMap.put("isRead", (n) -> { this.setIsRead(n.getBooleanValue()); });
        deserializerMap.put("isReadReceiptRequested", (n) -> { this.setIsReadReceiptRequested(n.getBooleanValue()); });
        deserializerMap.put("multiValueExtendedProperties", (n) -> { this.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("parentFolderId", (n) -> { this.setParentFolderId(n.getStringValue()); });
        deserializerMap.put("receivedDateTime", (n) -> { this.setReceivedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("replyTo", (n) -> { this.setReplyTo(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("sender", (n) -> { this.setSender(n.getObjectValue(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("sentDateTime", (n) -> { this.setSentDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("toRecipients", (n) -> { this.setToRecipients(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("uniqueBody", (n) -> { this.setUniqueBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("webLink", (n) -> { this.setWebLink(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the flag property value. The flag value that indicates the status, start date, due date, or completion date for the message.
     * @return a followupFlag
     */
    @javax.annotation.Nullable
    public FollowupFlag getFlag() {
        return this.flag;
    }
    /**
     * Gets the from property value. The owner of the mailbox from which the message is sent. In most cases, this value is the same as the sender property, except for sharing or delegation scenarios. The value must correspond to the actual mailbox used. Find out more about setting the from and sender properties of a message.
     * @return a recipient
     */
    @javax.annotation.Nullable
    public Recipient getFrom() {
        return this.from;
    }
    /**
     * Gets the hasAttachments property value. Indicates whether the message has attachments. This property doesn't include inline attachments, so if a message contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body property to look for a src attribute, such as <IMG src='cid:image001.jpg@01D26CD8.6C05F070'>.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasAttachments() {
        return this.hasAttachments;
    }
    /**
     * Gets the importance property value. The importance property
     * @return a importance
     */
    @javax.annotation.Nullable
    public Importance getImportance() {
        return this.importance;
    }
    /**
     * Gets the inferenceClassification property value. The inferenceClassification property
     * @return a inferenceClassificationType
     */
    @javax.annotation.Nullable
    public InferenceClassificationType getInferenceClassification() {
        return this.inferenceClassification;
    }
    /**
     * Gets the internetMessageHeaders property value. The internetMessageHeaders property
     * @return a internetMessageHeader
     */
    @javax.annotation.Nullable
    public java.util.List<InternetMessageHeader> getInternetMessageHeaders() {
        return this.internetMessageHeaders;
    }
    /**
     * Gets the internetMessageId property value. The internetMessageId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternetMessageId() {
        return this.internetMessageId;
    }
    /**
     * Gets the isDeliveryReceiptRequested property value. The isDeliveryReceiptRequested property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDeliveryReceiptRequested() {
        return this.isDeliveryReceiptRequested;
    }
    /**
     * Gets the isDraft property value. The isDraft property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDraft() {
        return this.isDraft;
    }
    /**
     * Gets the isRead property value. The isRead property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRead() {
        return this.isRead;
    }
    /**
     * Gets the isReadReceiptRequested property value. The isReadReceiptRequested property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReadReceiptRequested() {
        return this.isReadReceiptRequested;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the message. Nullable.
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.multiValueExtendedProperties;
    }
    /**
     * Gets the parentFolderId property value. The parentFolderId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentFolderId() {
        return this.parentFolderId;
    }
    /**
     * Gets the receivedDateTime property value. The receivedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this.receivedDateTime;
    }
    /**
     * Gets the replyTo property value. The replyTo property
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getReplyTo() {
        return this.replyTo;
    }
    /**
     * Gets the sender property value. The sender property
     * @return a recipient
     */
    @javax.annotation.Nullable
    public Recipient getSender() {
        return this.sender;
    }
    /**
     * Gets the sentDateTime property value. The sentDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSentDateTime() {
        return this.sentDateTime;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the message. Nullable.
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.singleValueExtendedProperties;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Gets the toRecipients property value. The toRecipients property
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getToRecipients() {
        return this.toRecipients;
    }
    /**
     * Gets the uniqueBody property value. The uniqueBody property
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getUniqueBody() {
        return this.uniqueBody;
    }
    /**
     * Gets the webLink property value. The webLink property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebLink() {
        return this.webLink;
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
        writer.writeCollectionOfObjectValues("bccRecipients", this.getBccRecipients());
        writer.writeObjectValue("body", this.getBody());
        writer.writeStringValue("bodyPreview", this.getBodyPreview());
        writer.writeCollectionOfObjectValues("ccRecipients", this.getCcRecipients());
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeByteArrayValue("conversationIndex", this.getConversationIndex());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeObjectValue("flag", this.getFlag());
        writer.writeObjectValue("from", this.getFrom());
        writer.writeBooleanValue("hasAttachments", this.getHasAttachments());
        writer.writeEnumValue("importance", this.getImportance());
        writer.writeEnumValue("inferenceClassification", this.getInferenceClassification());
        writer.writeCollectionOfObjectValues("internetMessageHeaders", this.getInternetMessageHeaders());
        writer.writeStringValue("internetMessageId", this.getInternetMessageId());
        writer.writeBooleanValue("isDeliveryReceiptRequested", this.getIsDeliveryReceiptRequested());
        writer.writeBooleanValue("isDraft", this.getIsDraft());
        writer.writeBooleanValue("isRead", this.getIsRead());
        writer.writeBooleanValue("isReadReceiptRequested", this.getIsReadReceiptRequested());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeStringValue("parentFolderId", this.getParentFolderId());
        writer.writeOffsetDateTimeValue("receivedDateTime", this.getReceivedDateTime());
        writer.writeCollectionOfObjectValues("replyTo", this.getReplyTo());
        writer.writeObjectValue("sender", this.getSender());
        writer.writeOffsetDateTimeValue("sentDateTime", this.getSentDateTime());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeCollectionOfObjectValues("toRecipients", this.getToRecipients());
        writer.writeObjectValue("uniqueBody", this.getUniqueBody());
        writer.writeStringValue("webLink", this.getWebLink());
    }
    /**
     * Sets the attachments property value. The fileAttachment and itemAttachment attachments for the message.
     * @param value Value to set for the attachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttachments(@javax.annotation.Nullable final java.util.List<Attachment> value) {
        this.attachments = value;
    }
    /**
     * Sets the bccRecipients property value. The Bcc: recipients for the message.
     * @param value Value to set for the bccRecipients property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBccRecipients(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this.bccRecipients = value;
    }
    /**
     * Sets the body property value. The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body.
     * @param value Value to set for the body property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBody(@javax.annotation.Nullable final ItemBody value) {
        this.body = value;
    }
    /**
     * Sets the bodyPreview property value. The first 255 characters of the message body. It is in text format.
     * @param value Value to set for the bodyPreview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBodyPreview(@javax.annotation.Nullable final String value) {
        this.bodyPreview = value;
    }
    /**
     * Sets the ccRecipients property value. The Cc: recipients for the message.
     * @param value Value to set for the ccRecipients property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCcRecipients(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this.ccRecipients = value;
    }
    /**
     * Sets the conversationId property value. The ID of the conversation the email belongs to.
     * @param value Value to set for the conversationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConversationId(@javax.annotation.Nullable final String value) {
        this.conversationId = value;
    }
    /**
     * Sets the conversationIndex property value. Indicates the position of the message within the conversation.
     * @param value Value to set for the conversationIndex property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConversationIndex(@javax.annotation.Nullable final byte[] value) {
        this.conversationIndex = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the message. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this.extensions = value;
    }
    /**
     * Sets the flag property value. The flag value that indicates the status, start date, due date, or completion date for the message.
     * @param value Value to set for the flag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFlag(@javax.annotation.Nullable final FollowupFlag value) {
        this.flag = value;
    }
    /**
     * Sets the from property value. The owner of the mailbox from which the message is sent. In most cases, this value is the same as the sender property, except for sharing or delegation scenarios. The value must correspond to the actual mailbox used. Find out more about setting the from and sender properties of a message.
     * @param value Value to set for the from property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFrom(@javax.annotation.Nullable final Recipient value) {
        this.from = value;
    }
    /**
     * Sets the hasAttachments property value. Indicates whether the message has attachments. This property doesn't include inline attachments, so if a message contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body property to look for a src attribute, such as <IMG src='cid:image001.jpg@01D26CD8.6C05F070'>.
     * @param value Value to set for the hasAttachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasAttachments(@javax.annotation.Nullable final Boolean value) {
        this.hasAttachments = value;
    }
    /**
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportance(@javax.annotation.Nullable final Importance value) {
        this.importance = value;
    }
    /**
     * Sets the inferenceClassification property value. The inferenceClassification property
     * @param value Value to set for the inferenceClassification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInferenceClassification(@javax.annotation.Nullable final InferenceClassificationType value) {
        this.inferenceClassification = value;
    }
    /**
     * Sets the internetMessageHeaders property value. The internetMessageHeaders property
     * @param value Value to set for the internetMessageHeaders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternetMessageHeaders(@javax.annotation.Nullable final java.util.List<InternetMessageHeader> value) {
        this.internetMessageHeaders = value;
    }
    /**
     * Sets the internetMessageId property value. The internetMessageId property
     * @param value Value to set for the internetMessageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternetMessageId(@javax.annotation.Nullable final String value) {
        this.internetMessageId = value;
    }
    /**
     * Sets the isDeliveryReceiptRequested property value. The isDeliveryReceiptRequested property
     * @param value Value to set for the isDeliveryReceiptRequested property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDeliveryReceiptRequested(@javax.annotation.Nullable final Boolean value) {
        this.isDeliveryReceiptRequested = value;
    }
    /**
     * Sets the isDraft property value. The isDraft property
     * @param value Value to set for the isDraft property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDraft(@javax.annotation.Nullable final Boolean value) {
        this.isDraft = value;
    }
    /**
     * Sets the isRead property value. The isRead property
     * @param value Value to set for the isRead property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRead(@javax.annotation.Nullable final Boolean value) {
        this.isRead = value;
    }
    /**
     * Sets the isReadReceiptRequested property value. The isReadReceiptRequested property
     * @param value Value to set for the isReadReceiptRequested property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsReadReceiptRequested(@javax.annotation.Nullable final Boolean value) {
        this.isReadReceiptRequested = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the message. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiValueExtendedProperties(@javax.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.multiValueExtendedProperties = value;
    }
    /**
     * Sets the parentFolderId property value. The parentFolderId property
     * @param value Value to set for the parentFolderId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentFolderId(@javax.annotation.Nullable final String value) {
        this.parentFolderId = value;
    }
    /**
     * Sets the receivedDateTime property value. The receivedDateTime property
     * @param value Value to set for the receivedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReceivedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.receivedDateTime = value;
    }
    /**
     * Sets the replyTo property value. The replyTo property
     * @param value Value to set for the replyTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplyTo(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this.replyTo = value;
    }
    /**
     * Sets the sender property value. The sender property
     * @param value Value to set for the sender property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSender(@javax.annotation.Nullable final Recipient value) {
        this.sender = value;
    }
    /**
     * Sets the sentDateTime property value. The sentDateTime property
     * @param value Value to set for the sentDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSentDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.sentDateTime = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the message. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleValueExtendedProperties(@javax.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.singleValueExtendedProperties = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this.subject = value;
    }
    /**
     * Sets the toRecipients property value. The toRecipients property
     * @param value Value to set for the toRecipients property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setToRecipients(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this.toRecipients = value;
    }
    /**
     * Sets the uniqueBody property value. The uniqueBody property
     * @param value Value to set for the uniqueBody property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUniqueBody(@javax.annotation.Nullable final ItemBody value) {
        this.uniqueBody = value;
    }
    /**
     * Sets the webLink property value. The webLink property
     * @param value Value to set for the webLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebLink(@javax.annotation.Nullable final String value) {
        this.webLink = value;
    }
}
