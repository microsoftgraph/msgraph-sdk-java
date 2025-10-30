package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Message extends OutlookItem implements Parsable {
    /**
     * Instantiates a new {@link Message} and sets the default values.
     */
    public Message() {
        super();
        this.setOdataType("#microsoft.graph.message");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Message}
     */
    @jakarta.annotation.Nonnull
    public static Message createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a {@link java.util.List<Attachment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Attachment> getAttachments() {
        return this.backingStore.get("attachments");
    }
    /**
     * Gets the bccRecipients property value. The Bcc: recipients for the message.
     * @return a {@link java.util.List<Recipient>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getBccRecipients() {
        return this.backingStore.get("bccRecipients");
    }
    /**
     * Gets the body property value. The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body.
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getBody() {
        return this.backingStore.get("body");
    }
    /**
     * Gets the bodyPreview property value. The first 255 characters of the message body. It is in text format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBodyPreview() {
        return this.backingStore.get("bodyPreview");
    }
    /**
     * Gets the ccRecipients property value. The Cc: recipients for the message.
     * @return a {@link java.util.List<Recipient>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getCcRecipients() {
        return this.backingStore.get("ccRecipients");
    }
    /**
     * Gets the conversationId property value. The ID of the conversation the email belongs to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationId() {
        return this.backingStore.get("conversationId");
    }
    /**
     * Gets the conversationIndex property value. Indicates the position of the message within the conversation.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getConversationIndex() {
        return this.backingStore.get("conversationIndex");
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the message. Nullable.
     * @return a {@link java.util.List<Extension>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
        deserializerMap.put("importance", (n) -> { this.setImportance(n.getEnumValue(Importance::forValue)); });
        deserializerMap.put("inferenceClassification", (n) -> { this.setInferenceClassification(n.getEnumValue(InferenceClassificationType::forValue)); });
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
     * Gets the flag property value. Indicates the status, start date, due date, or completion date for the message.
     * @return a {@link FollowupFlag}
     */
    @jakarta.annotation.Nullable
    public FollowupFlag getFlag() {
        return this.backingStore.get("flag");
    }
    /**
     * Gets the from property value. The owner of the mailbox from which the message is sent. In most cases, this value is the same as the sender property, except for sharing or delegation scenarios. The value must correspond to the actual mailbox used. Find out more about setting the from and sender properties of a message.
     * @return a {@link Recipient}
     */
    @jakarta.annotation.Nullable
    public Recipient getFrom() {
        return this.backingStore.get("from");
    }
    /**
     * Gets the hasAttachments property value. Indicates whether the message has attachments. This property doesn&apos;t include inline attachments, so if a message contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body property to look for a src attribute, such as &lt;IMG src=&apos;cid:image001.jpg@01D26CD8.6C05F070&apos;&gt;.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasAttachments() {
        return this.backingStore.get("hasAttachments");
    }
    /**
     * Gets the importance property value. The importance of the message. The possible values are: low, normal, and high.
     * @return a {@link Importance}
     */
    @jakarta.annotation.Nullable
    public Importance getImportance() {
        return this.backingStore.get("importance");
    }
    /**
     * Gets the inferenceClassification property value. The classification of the message for the user, based on inferred relevance or importance, or on an explicit override. The possible values are: focused or other.
     * @return a {@link InferenceClassificationType}
     */
    @jakarta.annotation.Nullable
    public InferenceClassificationType getInferenceClassification() {
        return this.backingStore.get("inferenceClassification");
    }
    /**
     * Gets the internetMessageHeaders property value. A collection of message headers defined by RFC5322. The set includes message headers indicating the network path taken by a message from the sender to the recipient. It can also contain custom message headers that hold app data for the message.  Returned only on applying a $select query option. Read-only.
     * @return a {@link java.util.List<InternetMessageHeader>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InternetMessageHeader> getInternetMessageHeaders() {
        return this.backingStore.get("internetMessageHeaders");
    }
    /**
     * Gets the internetMessageId property value. The message ID in the format specified by RFC2822.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInternetMessageId() {
        return this.backingStore.get("internetMessageId");
    }
    /**
     * Gets the isDeliveryReceiptRequested property value. Indicates whether a read receipt is requested for the message.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeliveryReceiptRequested() {
        return this.backingStore.get("isDeliveryReceiptRequested");
    }
    /**
     * Gets the isDraft property value. Indicates whether the message is a draft. A message is a draft if it hasn&apos;t been sent yet.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDraft() {
        return this.backingStore.get("isDraft");
    }
    /**
     * Gets the isRead property value. Indicates whether the message has been read.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRead() {
        return this.backingStore.get("isRead");
    }
    /**
     * Gets the isReadReceiptRequested property value. Indicates whether a read receipt is requested for the message.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReadReceiptRequested() {
        return this.backingStore.get("isReadReceiptRequested");
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the message. Nullable.
     * @return a {@link java.util.List<MultiValueLegacyExtendedProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.backingStore.get("multiValueExtendedProperties");
    }
    /**
     * Gets the parentFolderId property value. The unique identifier for the message&apos;s parent mailFolder.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentFolderId() {
        return this.backingStore.get("parentFolderId");
    }
    /**
     * Gets the receivedDateTime property value. The date and time the message was received.  The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this.backingStore.get("receivedDateTime");
    }
    /**
     * Gets the replyTo property value. The email addresses to use when replying.
     * @return a {@link java.util.List<Recipient>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getReplyTo() {
        return this.backingStore.get("replyTo");
    }
    /**
     * Gets the sender property value. The account that is used to generate the message. In most cases, this value is the same as the from property. You can set this property to a different value when sending a message from a shared mailbox, for a shared calendar, or as a delegate. In any case, the value must correspond to the actual mailbox used. Find out more about setting the from and sender properties of a message.
     * @return a {@link Recipient}
     */
    @jakarta.annotation.Nullable
    public Recipient getSender() {
        return this.backingStore.get("sender");
    }
    /**
     * Gets the sentDateTime property value. The date and time the message was sent.  The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSentDateTime() {
        return this.backingStore.get("sentDateTime");
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the message. Nullable.
     * @return a {@link java.util.List<SingleValueLegacyExtendedProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.backingStore.get("singleValueExtendedProperties");
    }
    /**
     * Gets the subject property value. The subject of the message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the toRecipients property value. The To: recipients for the message.
     * @return a {@link java.util.List<Recipient>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getToRecipients() {
        return this.backingStore.get("toRecipients");
    }
    /**
     * Gets the uniqueBody property value. The part of the body of the message that is unique to the current message. uniqueBody is not returned by default but can be retrieved for a given message by use of the ?$select=uniqueBody query. It can be in HTML or text format.
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getUniqueBody() {
        return this.backingStore.get("uniqueBody");
    }
    /**
     * Gets the webLink property value. The URL to open the message in Outlook on the web.You can append an ispopout argument to the end of the URL to change how the message is displayed. If ispopout is not present or if it is set to 1, then the message is shown in a popout window. If ispopout is set to 0, the browser shows the message in the Outlook on the web review pane.The message opens in the browser if you are signed in to your mailbox via Outlook on the web. You are prompted to sign in if you are not already signed in with the browser.This URL cannot be accessed from within an iFrame.NOTE: When using this URL to access a message from a mailbox with delegate permissions, both the signed-in user and the target mailbox must be in the same database region. For example, an error is returned when a user with a mailbox in the EUR (Europe) region attempts to access messages from a mailbox in the NAM (North America) region.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebLink() {
        return this.backingStore.get("webLink");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAttachments(@jakarta.annotation.Nullable final java.util.List<Attachment> value) {
        this.backingStore.set("attachments", value);
    }
    /**
     * Sets the bccRecipients property value. The Bcc: recipients for the message.
     * @param value Value to set for the bccRecipients property.
     */
    public void setBccRecipients(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.backingStore.set("bccRecipients", value);
    }
    /**
     * Sets the body property value. The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body.
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("body", value);
    }
    /**
     * Sets the bodyPreview property value. The first 255 characters of the message body. It is in text format.
     * @param value Value to set for the bodyPreview property.
     */
    public void setBodyPreview(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bodyPreview", value);
    }
    /**
     * Sets the ccRecipients property value. The Cc: recipients for the message.
     * @param value Value to set for the ccRecipients property.
     */
    public void setCcRecipients(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.backingStore.set("ccRecipients", value);
    }
    /**
     * Sets the conversationId property value. The ID of the conversation the email belongs to.
     * @param value Value to set for the conversationId property.
     */
    public void setConversationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("conversationId", value);
    }
    /**
     * Sets the conversationIndex property value. Indicates the position of the message within the conversation.
     * @param value Value to set for the conversationIndex property.
     */
    public void setConversationIndex(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("conversationIndex", value);
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the message. Nullable.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<Extension> value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the flag property value. Indicates the status, start date, due date, or completion date for the message.
     * @param value Value to set for the flag property.
     */
    public void setFlag(@jakarta.annotation.Nullable final FollowupFlag value) {
        this.backingStore.set("flag", value);
    }
    /**
     * Sets the from property value. The owner of the mailbox from which the message is sent. In most cases, this value is the same as the sender property, except for sharing or delegation scenarios. The value must correspond to the actual mailbox used. Find out more about setting the from and sender properties of a message.
     * @param value Value to set for the from property.
     */
    public void setFrom(@jakarta.annotation.Nullable final Recipient value) {
        this.backingStore.set("from", value);
    }
    /**
     * Sets the hasAttachments property value. Indicates whether the message has attachments. This property doesn&apos;t include inline attachments, so if a message contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body property to look for a src attribute, such as &lt;IMG src=&apos;cid:image001.jpg@01D26CD8.6C05F070&apos;&gt;.
     * @param value Value to set for the hasAttachments property.
     */
    public void setHasAttachments(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasAttachments", value);
    }
    /**
     * Sets the importance property value. The importance of the message. The possible values are: low, normal, and high.
     * @param value Value to set for the importance property.
     */
    public void setImportance(@jakarta.annotation.Nullable final Importance value) {
        this.backingStore.set("importance", value);
    }
    /**
     * Sets the inferenceClassification property value. The classification of the message for the user, based on inferred relevance or importance, or on an explicit override. The possible values are: focused or other.
     * @param value Value to set for the inferenceClassification property.
     */
    public void setInferenceClassification(@jakarta.annotation.Nullable final InferenceClassificationType value) {
        this.backingStore.set("inferenceClassification", value);
    }
    /**
     * Sets the internetMessageHeaders property value. A collection of message headers defined by RFC5322. The set includes message headers indicating the network path taken by a message from the sender to the recipient. It can also contain custom message headers that hold app data for the message.  Returned only on applying a $select query option. Read-only.
     * @param value Value to set for the internetMessageHeaders property.
     */
    public void setInternetMessageHeaders(@jakarta.annotation.Nullable final java.util.List<InternetMessageHeader> value) {
        this.backingStore.set("internetMessageHeaders", value);
    }
    /**
     * Sets the internetMessageId property value. The message ID in the format specified by RFC2822.
     * @param value Value to set for the internetMessageId property.
     */
    public void setInternetMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("internetMessageId", value);
    }
    /**
     * Sets the isDeliveryReceiptRequested property value. Indicates whether a read receipt is requested for the message.
     * @param value Value to set for the isDeliveryReceiptRequested property.
     */
    public void setIsDeliveryReceiptRequested(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDeliveryReceiptRequested", value);
    }
    /**
     * Sets the isDraft property value. Indicates whether the message is a draft. A message is a draft if it hasn&apos;t been sent yet.
     * @param value Value to set for the isDraft property.
     */
    public void setIsDraft(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDraft", value);
    }
    /**
     * Sets the isRead property value. Indicates whether the message has been read.
     * @param value Value to set for the isRead property.
     */
    public void setIsRead(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRead", value);
    }
    /**
     * Sets the isReadReceiptRequested property value. Indicates whether a read receipt is requested for the message.
     * @param value Value to set for the isReadReceiptRequested property.
     */
    public void setIsReadReceiptRequested(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isReadReceiptRequested", value);
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the message. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     */
    public void setMultiValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.backingStore.set("multiValueExtendedProperties", value);
    }
    /**
     * Sets the parentFolderId property value. The unique identifier for the message&apos;s parent mailFolder.
     * @param value Value to set for the parentFolderId property.
     */
    public void setParentFolderId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentFolderId", value);
    }
    /**
     * Sets the receivedDateTime property value. The date and time the message was received.  The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the receivedDateTime property.
     */
    public void setReceivedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("receivedDateTime", value);
    }
    /**
     * Sets the replyTo property value. The email addresses to use when replying.
     * @param value Value to set for the replyTo property.
     */
    public void setReplyTo(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.backingStore.set("replyTo", value);
    }
    /**
     * Sets the sender property value. The account that is used to generate the message. In most cases, this value is the same as the from property. You can set this property to a different value when sending a message from a shared mailbox, for a shared calendar, or as a delegate. In any case, the value must correspond to the actual mailbox used. Find out more about setting the from and sender properties of a message.
     * @param value Value to set for the sender property.
     */
    public void setSender(@jakarta.annotation.Nullable final Recipient value) {
        this.backingStore.set("sender", value);
    }
    /**
     * Sets the sentDateTime property value. The date and time the message was sent.  The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the sentDateTime property.
     */
    public void setSentDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("sentDateTime", value);
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the message. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     */
    public void setSingleValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.backingStore.set("singleValueExtendedProperties", value);
    }
    /**
     * Sets the subject property value. The subject of the message.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the toRecipients property value. The To: recipients for the message.
     * @param value Value to set for the toRecipients property.
     */
    public void setToRecipients(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.backingStore.set("toRecipients", value);
    }
    /**
     * Sets the uniqueBody property value. The part of the body of the message that is unique to the current message. uniqueBody is not returned by default but can be retrieved for a given message by use of the ?$select=uniqueBody query. It can be in HTML or text format.
     * @param value Value to set for the uniqueBody property.
     */
    public void setUniqueBody(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("uniqueBody", value);
    }
    /**
     * Sets the webLink property value. The URL to open the message in Outlook on the web.You can append an ispopout argument to the end of the URL to change how the message is displayed. If ispopout is not present or if it is set to 1, then the message is shown in a popout window. If ispopout is set to 0, the browser shows the message in the Outlook on the web review pane.The message opens in the browser if you are signed in to your mailbox via Outlook on the web. You are prompted to sign in if you are not already signed in with the browser.This URL cannot be accessed from within an iFrame.NOTE: When using this URL to access a message from a mailbox with delegate permissions, both the signed-in user and the target mailbox must be in the same database region. For example, an error is returned when a user with a mailbox in the EUR (Europe) region attempts to access messages from a mailbox in the NAM (North America) region.
     * @param value Value to set for the webLink property.
     */
    public void setWebLink(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webLink", value);
    }
}
