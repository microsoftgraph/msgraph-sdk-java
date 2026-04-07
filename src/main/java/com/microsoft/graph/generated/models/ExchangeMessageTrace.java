package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExchangeMessageTrace extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ExchangeMessageTrace} and sets the default values.
     */
    public ExchangeMessageTrace() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExchangeMessageTrace}
     */
    @jakarta.annotation.Nonnull
    public static ExchangeMessageTrace createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExchangeMessageTrace();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fromIP", (n) -> { this.setFromIP(n.getStringValue()); });
        deserializerMap.put("messageId", (n) -> { this.setMessageId(n.getStringValue()); });
        deserializerMap.put("receivedDateTime", (n) -> { this.setReceivedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recipientAddress", (n) -> { this.setRecipientAddress(n.getStringValue()); });
        deserializerMap.put("senderAddress", (n) -> { this.setSenderAddress(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getIntegerValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ExchangeMessageTraceStatus::forValue)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("toIP", (n) -> { this.setToIP(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fromIP property value. The source IP address. For incoming messages, this value is the public IP address of the SMTP email server that sent the message. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFromIP() {
        return this.backingStore.get("fromIP");
    }
    /**
     * Gets the messageId property value. The Message-ID header field of the message. The format of the Message-ID depends on the messaging server that sent the message. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageId() {
        return this.backingStore.get("messageId");
    }
    /**
     * Gets the receivedDateTime property value. The date and time when the message was received by Exchange Online. The timestamp is in UTC format. Supports $filter (ge, le).
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this.backingStore.get("receivedDateTime");
    }
    /**
     * Gets the recipientAddress property value. The SMTP email address of the user that the message was addressed to. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipientAddress() {
        return this.backingStore.get("recipientAddress");
    }
    /**
     * Gets the senderAddress property value. The SMTP email address of the user the message was purportedly from. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSenderAddress() {
        return this.backingStore.get("senderAddress");
    }
    /**
     * Gets the size property value. The size of the message in bytes.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSize() {
        return this.backingStore.get("size");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link ExchangeMessageTraceStatus}
     */
    @jakarta.annotation.Nullable
    public ExchangeMessageTraceStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the subject property value. The subject line of the message. Supports $filter (contains, startsWith, endsWith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the toIP property value. The destination IP address. For outgoing messages, this value is the public IP address in the resolved MX record for the destination domain. For incoming messages to Exchange Online, this value is blank. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToIP() {
        return this.backingStore.get("toIP");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("fromIP", this.getFromIP());
        writer.writeStringValue("messageId", this.getMessageId());
        writer.writeOffsetDateTimeValue("receivedDateTime", this.getReceivedDateTime());
        writer.writeStringValue("recipientAddress", this.getRecipientAddress());
        writer.writeStringValue("senderAddress", this.getSenderAddress());
        writer.writeIntegerValue("size", this.getSize());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeStringValue("toIP", this.getToIP());
    }
    /**
     * Sets the fromIP property value. The source IP address. For incoming messages, this value is the public IP address of the SMTP email server that sent the message. Supports $filter (eq).
     * @param value Value to set for the fromIP property.
     */
    public void setFromIP(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fromIP", value);
    }
    /**
     * Sets the messageId property value. The Message-ID header field of the message. The format of the Message-ID depends on the messaging server that sent the message. Supports $filter (eq).
     * @param value Value to set for the messageId property.
     */
    public void setMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messageId", value);
    }
    /**
     * Sets the receivedDateTime property value. The date and time when the message was received by Exchange Online. The timestamp is in UTC format. Supports $filter (ge, le).
     * @param value Value to set for the receivedDateTime property.
     */
    public void setReceivedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("receivedDateTime", value);
    }
    /**
     * Sets the recipientAddress property value. The SMTP email address of the user that the message was addressed to. Supports $filter (eq).
     * @param value Value to set for the recipientAddress property.
     */
    public void setRecipientAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recipientAddress", value);
    }
    /**
     * Sets the senderAddress property value. The SMTP email address of the user the message was purportedly from. Supports $filter (eq).
     * @param value Value to set for the senderAddress property.
     */
    public void setSenderAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("senderAddress", value);
    }
    /**
     * Sets the size property value. The size of the message in bytes.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("size", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ExchangeMessageTraceStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the subject property value. The subject line of the message. Supports $filter (contains, startsWith, endsWith).
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the toIP property value. The destination IP address. For outgoing messages, this value is the public IP address in the resolved MX record for the destination domain. For incoming messages to Exchange Online, this value is blank. Supports $filter (eq).
     * @param value Value to set for the toIP property.
     */
    public void setToIP(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("toIP", value);
    }
}
