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
     * Instantiates a new Message and sets the default values.
     */
    public Message() {
        super();
        this.setOdataType("#microsoft.graph.message");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Message
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
     * @return a java.util.List<Attachment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Attachment> getAttachments() {
        return this.BackingStore.get("attachments");
    }
    /**
     * Gets the bccRecipients property value. The Bcc: recipients for the message.
     * @return a java.util.List<Recipient>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getBccRecipients() {
        return this.BackingStore.get("bccRecipients");
    }
    /**
     * Gets the body property value. The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body.
     * @return a ItemBody
     */
    @jakarta.annotation.Nullable
    public ItemBody getBody() {
        return this.BackingStore.get("body");
    }
    /**
     * Gets the bodyPreview property value. The first 255 characters of the message body. It is in text format.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBodyPreview() {
        return this.BackingStore.get("bodyPreview");
    }
    /**
     * Gets the ccRecipients property value. The Cc: recipients for the message.
     * @return a java.util.List<Recipient>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getCcRecipients() {
        return this.BackingStore.get("ccRecipients");
    }
    /**
     * Gets the conversationId property value. The ID of the conversation the email belongs to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConversationId() {
        return this.BackingStore.get("conversationId");
    }
    /**
     * Gets the conversationIndex property value. Indicates the position of the message within the conversation.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getConversationIndex() {
        return this.BackingStore.get("conversationIndex");
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the message. Nullable.
     * @return a java.util.List<Extension>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.BackingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a FollowupFlag
     */
    @jakarta.annotation.Nullable
    public FollowupFlag getFlag() {
        return this.BackingStore.get("flag");
    }
    /**
     * Gets the from property value. The owner of the mailbox from which the message is sent. In most cases, this value is the same as the sender property, except for sharing or delegation scenarios. The value must correspond to the actual mailbox used. Find out more about setting the from and sender properties of a message.
     * @return a Recipient
     */
    @jakarta.annotation.Nullable
    public Recipient getFrom() {
        return this.BackingStore.get("from");
    }
    /**
     * Gets the hasAttachments property value. Indicates whether the message has attachments. This property doesn't include inline attachments, so if a message contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body property to look for a src attribute, such as <IMG src='cid:image001.jpg@01D26CD8.6C05F070'>.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasAttachments() {
        return this.BackingStore.get("hasAttachments");
    }
    /**
     * Gets the importance property value. The importance property
     * @return a Importance
     */
    @jakarta.annotation.Nullable
    public Importance getImportance() {
        return this.BackingStore.get("importance");
    }
    /**
     * Gets the inferenceClassification property value. The inferenceClassification property
     * @return a InferenceClassificationType
     */
    @jakarta.annotation.Nullable
    public InferenceClassificationType getInferenceClassification() {
        return this.BackingStore.get("inferenceClassification");
    }
    /**
     * Gets the internetMessageHeaders property value. The internetMessageHeaders property
     * @return a java.util.List<InternetMessageHeader>
     */
    @jakarta.annotation.Nullable
    public java.util.List<InternetMessageHeader> getInternetMessageHeaders() {
        return this.BackingStore.get("internetMessageHeaders");
    }
    /**
     * Gets the internetMessageId property value. The internetMessageId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInternetMessageId() {
        return this.BackingStore.get("internetMessageId");
    }
    /**
     * Gets the isDeliveryReceiptRequested property value. The isDeliveryReceiptRequested property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeliveryReceiptRequested() {
        return this.BackingStore.get("isDeliveryReceiptRequested");
    }
    /**
     * Gets the isDraft property value. The isDraft property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDraft() {
        return this.BackingStore.get("isDraft");
    }
    /**
     * Gets the isRead property value. The isRead property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRead() {
        return this.BackingStore.get("isRead");
    }
    /**
     * Gets the isReadReceiptRequested property value. The isReadReceiptRequested property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReadReceiptRequested() {
        return this.BackingStore.get("isReadReceiptRequested");
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the message. Nullable.
     * @return a java.util.List<MultiValueLegacyExtendedProperty>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.BackingStore.get("multiValueExtendedProperties");
    }
    /**
     * Gets the parentFolderId property value. The parentFolderId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getParentFolderId() {
        return this.BackingStore.get("parentFolderId");
    }
    /**
     * Gets the receivedDateTime property value. The receivedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this.BackingStore.get("receivedDateTime");
    }
    /**
     * Gets the replyTo property value. The replyTo property
     * @return a java.util.List<Recipient>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getReplyTo() {
        return this.BackingStore.get("replyTo");
    }
    /**
     * Gets the sender property value. The sender property
     * @return a Recipient
     */
    @jakarta.annotation.Nullable
    public Recipient getSender() {
        return this.BackingStore.get("sender");
    }
    /**
     * Gets the sentDateTime property value. The sentDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSentDateTime() {
        return this.BackingStore.get("sentDateTime");
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the message. Nullable.
     * @return a java.util.List<SingleValueLegacyExtendedProperty>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.BackingStore.get("singleValueExtendedProperties");
    }
    /**
     * Gets the subject property value. The subject property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.BackingStore.get("subject");
    }
    /**
     * Gets the toRecipients property value. The toRecipients property
     * @return a java.util.List<Recipient>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getToRecipients() {
        return this.BackingStore.get("toRecipients");
    }
    /**
     * Gets the uniqueBody property value. The uniqueBody property
     * @return a ItemBody
     */
    @jakarta.annotation.Nullable
    public ItemBody getUniqueBody() {
        return this.BackingStore.get("uniqueBody");
    }
    /**
     * Gets the webLink property value. The webLink property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebLink() {
        return this.BackingStore.get("webLink");
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
        this.BackingStore.set("attachments", value);
    }
    /**
     * Sets the bccRecipients property value. The Bcc: recipients for the message.
     * @param value Value to set for the bccRecipients property.
     */
    public void setBccRecipients(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.BackingStore.set("bccRecipients", value);
    }
    /**
     * Sets the body property value. The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body.
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final ItemBody value) {
        this.BackingStore.set("body", value);
    }
    /**
     * Sets the bodyPreview property value. The first 255 characters of the message body. It is in text format.
     * @param value Value to set for the bodyPreview property.
     */
    public void setBodyPreview(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("bodyPreview", value);
    }
    /**
     * Sets the ccRecipients property value. The Cc: recipients for the message.
     * @param value Value to set for the ccRecipients property.
     */
    public void setCcRecipients(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.BackingStore.set("ccRecipients", value);
    }
    /**
     * Sets the conversationId property value. The ID of the conversation the email belongs to.
     * @param value Value to set for the conversationId property.
     */
    public void setConversationId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("conversationId", value);
    }
    /**
     * Sets the conversationIndex property value. Indicates the position of the message within the conversation.
     * @param value Value to set for the conversationIndex property.
     */
    public void setConversationIndex(@jakarta.annotation.Nullable final byte[] value) {
        this.BackingStore.set("conversationIndex", value);
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the message. Nullable.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<Extension> value) {
        this.BackingStore.set("extensions", value);
    }
    /**
     * Sets the flag property value. The flag value that indicates the status, start date, due date, or completion date for the message.
     * @param value Value to set for the flag property.
     */
    public void setFlag(@jakarta.annotation.Nullable final FollowupFlag value) {
        this.BackingStore.set("flag", value);
    }
    /**
     * Sets the from property value. The owner of the mailbox from which the message is sent. In most cases, this value is the same as the sender property, except for sharing or delegation scenarios. The value must correspond to the actual mailbox used. Find out more about setting the from and sender properties of a message.
     * @param value Value to set for the from property.
     */
    public void setFrom(@jakarta.annotation.Nullable final Recipient value) {
        this.BackingStore.set("from", value);
    }
    /**
     * Sets the hasAttachments property value. Indicates whether the message has attachments. This property doesn't include inline attachments, so if a message contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body property to look for a src attribute, such as <IMG src='cid:image001.jpg@01D26CD8.6C05F070'>.
     * @param value Value to set for the hasAttachments property.
     */
    public void setHasAttachments(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("hasAttachments", value);
    }
    /**
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     */
    public void setImportance(@jakarta.annotation.Nullable final Importance value) {
        this.BackingStore.set("importance", value);
    }
    /**
     * Sets the inferenceClassification property value. The inferenceClassification property
     * @param value Value to set for the inferenceClassification property.
     */
    public void setInferenceClassification(@jakarta.annotation.Nullable final InferenceClassificationType value) {
        this.BackingStore.set("inferenceClassification", value);
    }
    /**
     * Sets the internetMessageHeaders property value. The internetMessageHeaders property
     * @param value Value to set for the internetMessageHeaders property.
     */
    public void setInternetMessageHeaders(@jakarta.annotation.Nullable final java.util.List<InternetMessageHeader> value) {
        this.BackingStore.set("internetMessageHeaders", value);
    }
    /**
     * Sets the internetMessageId property value. The internetMessageId property
     * @param value Value to set for the internetMessageId property.
     */
    public void setInternetMessageId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("internetMessageId", value);
    }
    /**
     * Sets the isDeliveryReceiptRequested property value. The isDeliveryReceiptRequested property
     * @param value Value to set for the isDeliveryReceiptRequested property.
     */
    public void setIsDeliveryReceiptRequested(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isDeliveryReceiptRequested", value);
    }
    /**
     * Sets the isDraft property value. The isDraft property
     * @param value Value to set for the isDraft property.
     */
    public void setIsDraft(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isDraft", value);
    }
    /**
     * Sets the isRead property value. The isRead property
     * @param value Value to set for the isRead property.
     */
    public void setIsRead(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isRead", value);
    }
    /**
     * Sets the isReadReceiptRequested property value. The isReadReceiptRequested property
     * @param value Value to set for the isReadReceiptRequested property.
     */
    public void setIsReadReceiptRequested(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isReadReceiptRequested", value);
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the message. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     */
    public void setMultiValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.BackingStore.set("multiValueExtendedProperties", value);
    }
    /**
     * Sets the parentFolderId property value. The parentFolderId property
     * @param value Value to set for the parentFolderId property.
     */
    public void setParentFolderId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("parentFolderId", value);
    }
    /**
     * Sets the receivedDateTime property value. The receivedDateTime property
     * @param value Value to set for the receivedDateTime property.
     */
    public void setReceivedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("receivedDateTime", value);
    }
    /**
     * Sets the replyTo property value. The replyTo property
     * @param value Value to set for the replyTo property.
     */
    public void setReplyTo(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.BackingStore.set("replyTo", value);
    }
    /**
     * Sets the sender property value. The sender property
     * @param value Value to set for the sender property.
     */
    public void setSender(@jakarta.annotation.Nullable final Recipient value) {
        this.BackingStore.set("sender", value);
    }
    /**
     * Sets the sentDateTime property value. The sentDateTime property
     * @param value Value to set for the sentDateTime property.
     */
    public void setSentDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("sentDateTime", value);
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the message. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     */
    public void setSingleValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.BackingStore.set("singleValueExtendedProperties", value);
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("subject", value);
    }
    /**
     * Sets the toRecipients property value. The toRecipients property
     * @param value Value to set for the toRecipients property.
     */
    public void setToRecipients(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.BackingStore.set("toRecipients", value);
    }
    /**
     * Sets the uniqueBody property value. The uniqueBody property
     * @param value Value to set for the uniqueBody property.
     */
    public void setUniqueBody(@jakarta.annotation.Nullable final ItemBody value) {
        this.BackingStore.set("uniqueBody", value);
    }
    /**
     * Sets the webLink property value. The webLink property
     * @param value Value to set for the webLink property.
     */
    public void setWebLink(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("webLink", value);
    }
}
