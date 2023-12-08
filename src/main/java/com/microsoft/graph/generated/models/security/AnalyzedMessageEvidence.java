package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AnalyzedMessageEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new AnalyzedMessageEvidence and sets the default values.
     */
    public AnalyzedMessageEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.analyzedMessageEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AnalyzedMessageEvidence
     */
    @jakarta.annotation.Nonnull
    public static AnalyzedMessageEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnalyzedMessageEvidence();
    }
    /**
     * Gets the antiSpamDirection property value. Direction of the email relative to your network. The possible values are: inbound, outbound or intraorg.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAntiSpamDirection() {
        return this.backingStore.get("antiSpamDirection");
    }
    /**
     * Gets the attachmentsCount property value. Number of attachments in the email.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getAttachmentsCount() {
        return this.backingStore.get("attachmentsCount");
    }
    /**
     * Gets the deliveryAction property value. Delivery action of the email. The possible values are: delivered, deliveredAsSpam, junked, blocked, or replaced.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeliveryAction() {
        return this.backingStore.get("deliveryAction");
    }
    /**
     * Gets the deliveryLocation property value. Location where the email was delivered. The possible values are: inbox, external, junkFolder, quarantine, failed, dropped, deletedFolder or forwarded.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeliveryLocation() {
        return this.backingStore.get("deliveryLocation");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("antiSpamDirection", (n) -> { this.setAntiSpamDirection(n.getStringValue()); });
        deserializerMap.put("attachmentsCount", (n) -> { this.setAttachmentsCount(n.getLongValue()); });
        deserializerMap.put("deliveryAction", (n) -> { this.setDeliveryAction(n.getStringValue()); });
        deserializerMap.put("deliveryLocation", (n) -> { this.setDeliveryLocation(n.getStringValue()); });
        deserializerMap.put("internetMessageId", (n) -> { this.setInternetMessageId(n.getStringValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("networkMessageId", (n) -> { this.setNetworkMessageId(n.getStringValue()); });
        deserializerMap.put("p1Sender", (n) -> { this.setP1Sender(n.getObjectValue(EmailSender::createFromDiscriminatorValue)); });
        deserializerMap.put("p2Sender", (n) -> { this.setP2Sender(n.getObjectValue(EmailSender::createFromDiscriminatorValue)); });
        deserializerMap.put("receivedDateTime", (n) -> { this.setReceivedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recipientEmailAddress", (n) -> { this.setRecipientEmailAddress(n.getStringValue()); });
        deserializerMap.put("senderIp", (n) -> { this.setSenderIp(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("threatDetectionMethods", (n) -> { this.setThreatDetectionMethods(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("threats", (n) -> { this.setThreats(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("urlCount", (n) -> { this.setUrlCount(n.getLongValue()); });
        deserializerMap.put("urls", (n) -> { this.setUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("urn", (n) -> { this.setUrn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internetMessageId property value. Public-facing identifier for the email that is set by the sending email system.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInternetMessageId() {
        return this.backingStore.get("internetMessageId");
    }
    /**
     * Gets the language property value. Detected language of the email content.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.backingStore.get("language");
    }
    /**
     * Gets the networkMessageId property value. Unique identifier for the email, generated by Microsoft 365.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkMessageId() {
        return this.backingStore.get("networkMessageId");
    }
    /**
     * Gets the p1Sender property value. The P1 sender.
     * @return a EmailSender
     */
    @jakarta.annotation.Nullable
    public EmailSender getP1Sender() {
        return this.backingStore.get("p1Sender");
    }
    /**
     * Gets the p2Sender property value. The P2 sender.
     * @return a EmailSender
     */
    @jakarta.annotation.Nullable
    public EmailSender getP2Sender() {
        return this.backingStore.get("p2Sender");
    }
    /**
     * Gets the receivedDateTime property value. Date and time when the email was received.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this.backingStore.get("receivedDateTime");
    }
    /**
     * Gets the recipientEmailAddress property value. Email address of the recipient, or email address of the recipient after distribution list expansion.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecipientEmailAddress() {
        return this.backingStore.get("recipientEmailAddress");
    }
    /**
     * Gets the senderIp property value. IP address of the last detected mail server that relayed the message.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSenderIp() {
        return this.backingStore.get("senderIp");
    }
    /**
     * Gets the subject property value. Subject of the email.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the threatDetectionMethods property value. Collection of methods used to detect malware, phishing, or other threats found in the email.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getThreatDetectionMethods() {
        return this.backingStore.get("threatDetectionMethods");
    }
    /**
     * Gets the threats property value. Collection of detection names for malware or other threats found.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getThreats() {
        return this.backingStore.get("threats");
    }
    /**
     * Gets the urlCount property value. Number of embedded URLs in the email.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getUrlCount() {
        return this.backingStore.get("urlCount");
    }
    /**
     * Gets the urls property value. Collection of the URLs contained in this email.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUrls() {
        return this.backingStore.get("urls");
    }
    /**
     * Gets the urn property value. Uniform resource name (URN) of the automated investigation where the cluster was identified.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUrn() {
        return this.backingStore.get("urn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("antiSpamDirection", this.getAntiSpamDirection());
        writer.writeLongValue("attachmentsCount", this.getAttachmentsCount());
        writer.writeStringValue("deliveryAction", this.getDeliveryAction());
        writer.writeStringValue("deliveryLocation", this.getDeliveryLocation());
        writer.writeStringValue("internetMessageId", this.getInternetMessageId());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeStringValue("networkMessageId", this.getNetworkMessageId());
        writer.writeObjectValue("p1Sender", this.getP1Sender());
        writer.writeObjectValue("p2Sender", this.getP2Sender());
        writer.writeOffsetDateTimeValue("receivedDateTime", this.getReceivedDateTime());
        writer.writeStringValue("recipientEmailAddress", this.getRecipientEmailAddress());
        writer.writeStringValue("senderIp", this.getSenderIp());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeCollectionOfPrimitiveValues("threatDetectionMethods", this.getThreatDetectionMethods());
        writer.writeCollectionOfPrimitiveValues("threats", this.getThreats());
        writer.writeLongValue("urlCount", this.getUrlCount());
        writer.writeCollectionOfPrimitiveValues("urls", this.getUrls());
        writer.writeStringValue("urn", this.getUrn());
    }
    /**
     * Sets the antiSpamDirection property value. Direction of the email relative to your network. The possible values are: inbound, outbound or intraorg.
     * @param value Value to set for the antiSpamDirection property.
     */
    public void setAntiSpamDirection(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("antiSpamDirection", value);
    }
    /**
     * Sets the attachmentsCount property value. Number of attachments in the email.
     * @param value Value to set for the attachmentsCount property.
     */
    public void setAttachmentsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("attachmentsCount", value);
    }
    /**
     * Sets the deliveryAction property value. Delivery action of the email. The possible values are: delivered, deliveredAsSpam, junked, blocked, or replaced.
     * @param value Value to set for the deliveryAction property.
     */
    public void setDeliveryAction(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deliveryAction", value);
    }
    /**
     * Sets the deliveryLocation property value. Location where the email was delivered. The possible values are: inbox, external, junkFolder, quarantine, failed, dropped, deletedFolder or forwarded.
     * @param value Value to set for the deliveryLocation property.
     */
    public void setDeliveryLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deliveryLocation", value);
    }
    /**
     * Sets the internetMessageId property value. Public-facing identifier for the email that is set by the sending email system.
     * @param value Value to set for the internetMessageId property.
     */
    public void setInternetMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("internetMessageId", value);
    }
    /**
     * Sets the language property value. Detected language of the email content.
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("language", value);
    }
    /**
     * Sets the networkMessageId property value. Unique identifier for the email, generated by Microsoft 365.
     * @param value Value to set for the networkMessageId property.
     */
    public void setNetworkMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkMessageId", value);
    }
    /**
     * Sets the p1Sender property value. The P1 sender.
     * @param value Value to set for the p1Sender property.
     */
    public void setP1Sender(@jakarta.annotation.Nullable final EmailSender value) {
        this.backingStore.set("p1Sender", value);
    }
    /**
     * Sets the p2Sender property value. The P2 sender.
     * @param value Value to set for the p2Sender property.
     */
    public void setP2Sender(@jakarta.annotation.Nullable final EmailSender value) {
        this.backingStore.set("p2Sender", value);
    }
    /**
     * Sets the receivedDateTime property value. Date and time when the email was received.
     * @param value Value to set for the receivedDateTime property.
     */
    public void setReceivedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("receivedDateTime", value);
    }
    /**
     * Sets the recipientEmailAddress property value. Email address of the recipient, or email address of the recipient after distribution list expansion.
     * @param value Value to set for the recipientEmailAddress property.
     */
    public void setRecipientEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recipientEmailAddress", value);
    }
    /**
     * Sets the senderIp property value. IP address of the last detected mail server that relayed the message.
     * @param value Value to set for the senderIp property.
     */
    public void setSenderIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("senderIp", value);
    }
    /**
     * Sets the subject property value. Subject of the email.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the threatDetectionMethods property value. Collection of methods used to detect malware, phishing, or other threats found in the email.
     * @param value Value to set for the threatDetectionMethods property.
     */
    public void setThreatDetectionMethods(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("threatDetectionMethods", value);
    }
    /**
     * Sets the threats property value. Collection of detection names for malware or other threats found.
     * @param value Value to set for the threats property.
     */
    public void setThreats(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("threats", value);
    }
    /**
     * Sets the urlCount property value. Number of embedded URLs in the email.
     * @param value Value to set for the urlCount property.
     */
    public void setUrlCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("urlCount", value);
    }
    /**
     * Sets the urls property value. Collection of the URLs contained in this email.
     * @param value Value to set for the urls property.
     */
    public void setUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("urls", value);
    }
    /**
     * Sets the urn property value. Uniform resource name (URN) of the automated investigation where the cluster was identified.
     * @param value Value to set for the urn property.
     */
    public void setUrn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("urn", value);
    }
}
