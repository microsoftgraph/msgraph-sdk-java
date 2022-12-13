package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AnalyzedMessageEvidence extends AlertEvidence implements Parsable {
    /** The antiSpamDirection property */
    private String _antiSpamDirection;
    /** The attachmentsCount property */
    private Long _attachmentsCount;
    /** The deliveryAction property */
    private String _deliveryAction;
    /** The deliveryLocation property */
    private String _deliveryLocation;
    /** The internetMessageId property */
    private String _internetMessageId;
    /** The language property */
    private String _language;
    /** The networkMessageId property */
    private String _networkMessageId;
    /** The p1Sender property */
    private EmailSender _p1Sender;
    /** The p2Sender property */
    private EmailSender _p2Sender;
    /** The receivedDateTime property */
    private OffsetDateTime _receivedDateTime;
    /** The recipientEmailAddress property */
    private String _recipientEmailAddress;
    /** The senderIp property */
    private String _senderIp;
    /** The subject property */
    private String _subject;
    /** The threatDetectionMethods property */
    private java.util.List<String> _threatDetectionMethods;
    /** The threats property */
    private java.util.List<String> _threats;
    /** The urlCount property */
    private Long _urlCount;
    /** The urls property */
    private java.util.List<String> _urls;
    /** The urn property */
    private String _urn;
    /**
     * Instantiates a new AnalyzedMessageEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AnalyzedMessageEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AnalyzedMessageEvidence
     */
    @javax.annotation.Nonnull
    public static AnalyzedMessageEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnalyzedMessageEvidence();
    }
    /**
     * Gets the antiSpamDirection property value. The antiSpamDirection property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAntiSpamDirection() {
        return this._antiSpamDirection;
    }
    /**
     * Gets the attachmentsCount property value. The attachmentsCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getAttachmentsCount() {
        return this._attachmentsCount;
    }
    /**
     * Gets the deliveryAction property value. The deliveryAction property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeliveryAction() {
        return this._deliveryAction;
    }
    /**
     * Gets the deliveryLocation property value. The deliveryLocation property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeliveryLocation() {
        return this._deliveryLocation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * Gets the internetMessageId property value. The internetMessageId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternetMessageId() {
        return this._internetMessageId;
    }
    /**
     * Gets the language property value. The language property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguage() {
        return this._language;
    }
    /**
     * Gets the networkMessageId property value. The networkMessageId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkMessageId() {
        return this._networkMessageId;
    }
    /**
     * Gets the p1Sender property value. The p1Sender property
     * @return a emailSender
     */
    @javax.annotation.Nullable
    public EmailSender getP1Sender() {
        return this._p1Sender;
    }
    /**
     * Gets the p2Sender property value. The p2Sender property
     * @return a emailSender
     */
    @javax.annotation.Nullable
    public EmailSender getP2Sender() {
        return this._p2Sender;
    }
    /**
     * Gets the receivedDateTime property value. The receivedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this._receivedDateTime;
    }
    /**
     * Gets the recipientEmailAddress property value. The recipientEmailAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientEmailAddress() {
        return this._recipientEmailAddress;
    }
    /**
     * Gets the senderIp property value. The senderIp property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSenderIp() {
        return this._senderIp;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
    }
    /**
     * Gets the threatDetectionMethods property value. The threatDetectionMethods property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getThreatDetectionMethods() {
        return this._threatDetectionMethods;
    }
    /**
     * Gets the threats property value. The threats property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getThreats() {
        return this._threats;
    }
    /**
     * Gets the urlCount property value. The urlCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUrlCount() {
        return this._urlCount;
    }
    /**
     * Gets the urls property value. The urls property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUrls() {
        return this._urls;
    }
    /**
     * Gets the urn property value. The urn property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrn() {
        return this._urn;
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
     * Sets the antiSpamDirection property value. The antiSpamDirection property
     * @param value Value to set for the antiSpamDirection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAntiSpamDirection(@javax.annotation.Nullable final String value) {
        this._antiSpamDirection = value;
    }
    /**
     * Sets the attachmentsCount property value. The attachmentsCount property
     * @param value Value to set for the attachmentsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttachmentsCount(@javax.annotation.Nullable final Long value) {
        this._attachmentsCount = value;
    }
    /**
     * Sets the deliveryAction property value. The deliveryAction property
     * @param value Value to set for the deliveryAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeliveryAction(@javax.annotation.Nullable final String value) {
        this._deliveryAction = value;
    }
    /**
     * Sets the deliveryLocation property value. The deliveryLocation property
     * @param value Value to set for the deliveryLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeliveryLocation(@javax.annotation.Nullable final String value) {
        this._deliveryLocation = value;
    }
    /**
     * Sets the internetMessageId property value. The internetMessageId property
     * @param value Value to set for the internetMessageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternetMessageId(@javax.annotation.Nullable final String value) {
        this._internetMessageId = value;
    }
    /**
     * Sets the language property value. The language property
     * @param value Value to set for the language property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanguage(@javax.annotation.Nullable final String value) {
        this._language = value;
    }
    /**
     * Sets the networkMessageId property value. The networkMessageId property
     * @param value Value to set for the networkMessageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkMessageId(@javax.annotation.Nullable final String value) {
        this._networkMessageId = value;
    }
    /**
     * Sets the p1Sender property value. The p1Sender property
     * @param value Value to set for the p1Sender property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setP1Sender(@javax.annotation.Nullable final EmailSender value) {
        this._p1Sender = value;
    }
    /**
     * Sets the p2Sender property value. The p2Sender property
     * @param value Value to set for the p2Sender property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setP2Sender(@javax.annotation.Nullable final EmailSender value) {
        this._p2Sender = value;
    }
    /**
     * Sets the receivedDateTime property value. The receivedDateTime property
     * @param value Value to set for the receivedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReceivedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._receivedDateTime = value;
    }
    /**
     * Sets the recipientEmailAddress property value. The recipientEmailAddress property
     * @param value Value to set for the recipientEmailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipientEmailAddress(@javax.annotation.Nullable final String value) {
        this._recipientEmailAddress = value;
    }
    /**
     * Sets the senderIp property value. The senderIp property
     * @param value Value to set for the senderIp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSenderIp(@javax.annotation.Nullable final String value) {
        this._senderIp = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
    /**
     * Sets the threatDetectionMethods property value. The threatDetectionMethods property
     * @param value Value to set for the threatDetectionMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreatDetectionMethods(@javax.annotation.Nullable final java.util.List<String> value) {
        this._threatDetectionMethods = value;
    }
    /**
     * Sets the threats property value. The threats property
     * @param value Value to set for the threats property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreats(@javax.annotation.Nullable final java.util.List<String> value) {
        this._threats = value;
    }
    /**
     * Sets the urlCount property value. The urlCount property
     * @param value Value to set for the urlCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrlCount(@javax.annotation.Nullable final Long value) {
        this._urlCount = value;
    }
    /**
     * Sets the urls property value. The urls property
     * @param value Value to set for the urls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._urls = value;
    }
    /**
     * Sets the urn property value. The urn property
     * @param value Value to set for the urn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrn(@javax.annotation.Nullable final String value) {
        this._urn = value;
    }
}
