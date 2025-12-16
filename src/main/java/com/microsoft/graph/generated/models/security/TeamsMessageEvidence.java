package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsMessageEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link TeamsMessageEvidence} and sets the default values.
     */
    public TeamsMessageEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.teamsMessageEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamsMessageEvidence}
     */
    @jakarta.annotation.Nonnull
    public static TeamsMessageEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsMessageEvidence();
    }
    /**
     * Gets the campaignId property value. The identifier of the campaign that this Teams message is part of.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignId() {
        return this.backingStore.get("campaignId");
    }
    /**
     * Gets the channelId property value. The channel ID associated with this Teams message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChannelId() {
        return this.backingStore.get("channelId");
    }
    /**
     * Gets the deliveryAction property value. The delivery action of this Teams message. The possible values are: unknown, deliveredAsSpam, delivered, blocked, replaced, unknownFutureValue.
     * @return a {@link TeamsMessageDeliveryAction}
     */
    @jakarta.annotation.Nullable
    public TeamsMessageDeliveryAction getDeliveryAction() {
        return this.backingStore.get("deliveryAction");
    }
    /**
     * Gets the deliveryLocation property value. The delivery location of this Teams message. The possible values are: unknown, teams, quarantine, failed, unknownFutureValue.
     * @return a {@link TeamsDeliveryLocation}
     */
    @jakarta.annotation.Nullable
    public TeamsDeliveryLocation getDeliveryLocation() {
        return this.backingStore.get("deliveryLocation");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("channelId", (n) -> { this.setChannelId(n.getStringValue()); });
        deserializerMap.put("deliveryAction", (n) -> { this.setDeliveryAction(n.getEnumValue(TeamsMessageDeliveryAction::forValue)); });
        deserializerMap.put("deliveryLocation", (n) -> { this.setDeliveryLocation(n.getEnumValue(TeamsDeliveryLocation::forValue)); });
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfObjectValues(FileEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("isExternal", (n) -> { this.setIsExternal(n.getBooleanValue()); });
        deserializerMap.put("isOwned", (n) -> { this.setIsOwned(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("messageDirection", (n) -> { this.setMessageDirection(n.getEnumValue(AntispamTeamsDirection::forValue)); });
        deserializerMap.put("messageId", (n) -> { this.setMessageId(n.getStringValue()); });
        deserializerMap.put("owningTenantId", (n) -> { this.setOwningTenantId(n.getUUIDValue()); });
        deserializerMap.put("parentMessageId", (n) -> { this.setParentMessageId(n.getStringValue()); });
        deserializerMap.put("receivedDateTime", (n) -> { this.setReceivedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recipients", (n) -> { this.setRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("senderFromAddress", (n) -> { this.setSenderFromAddress(n.getStringValue()); });
        deserializerMap.put("senderIP", (n) -> { this.setSenderIP(n.getStringValue()); });
        deserializerMap.put("sourceAppName", (n) -> { this.setSourceAppName(n.getStringValue()); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("suspiciousRecipients", (n) -> { this.setSuspiciousRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("threadId", (n) -> { this.setThreadId(n.getStringValue()); });
        deserializerMap.put("threadType", (n) -> { this.setThreadType(n.getStringValue()); });
        deserializerMap.put("urls", (n) -> { this.setUrls(n.getCollectionOfObjectValues(UrlEvidence::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the files property value. The list of file entities that are attached to this Teams message.
     * @return a {@link java.util.List<FileEvidence>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileEvidence> getFiles() {
        return this.backingStore.get("files");
    }
    /**
     * Gets the groupId property value. The identifier of the team or group that this message is part of.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.backingStore.get("groupId");
    }
    /**
     * Gets the isExternal property value. Indicates whether the message is owned by the organization that reported the security detection alert.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExternal() {
        return this.backingStore.get("isExternal");
    }
    /**
     * Gets the isOwned property value. Indicates whether the message is owned by your organization.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOwned() {
        return this.backingStore.get("isOwned");
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time when the message was last edited. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the messageDirection property value. The direction of the Teams message. The possible values are: unknown, inbound, outbound, intraorg, unknownFutureValue.
     * @return a {@link AntispamTeamsDirection}
     */
    @jakarta.annotation.Nullable
    public AntispamTeamsDirection getMessageDirection() {
        return this.backingStore.get("messageDirection");
    }
    /**
     * Gets the messageId property value. Message identifier unique within the thread.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageId() {
        return this.backingStore.get("messageId");
    }
    /**
     * Gets the owningTenantId property value. Tenant ID (GUID) of the owner of the message.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getOwningTenantId() {
        return this.backingStore.get("owningTenantId");
    }
    /**
     * Gets the parentMessageId property value. Identifier of the message to which the current message is a reply; otherwise, it&apos;s the same as the messageId.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentMessageId() {
        return this.backingStore.get("parentMessageId");
    }
    /**
     * Gets the receivedDateTime property value. The received date of this message. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this.backingStore.get("receivedDateTime");
    }
    /**
     * Gets the recipients property value. The recipients of this Teams message.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRecipients() {
        return this.backingStore.get("recipients");
    }
    /**
     * Gets the senderFromAddress property value. The SMTP format address of the sender.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSenderFromAddress() {
        return this.backingStore.get("senderFromAddress");
    }
    /**
     * Gets the senderIP property value. The IP address of the sender.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSenderIP() {
        return this.backingStore.get("senderIP");
    }
    /**
     * Gets the sourceAppName property value. Source of the message; for example, desktop and mobile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceAppName() {
        return this.backingStore.get("sourceAppName");
    }
    /**
     * Gets the sourceId property value. The source ID of this Teams message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.backingStore.get("sourceId");
    }
    /**
     * Gets the subject property value. The subject of this Teams message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the suspiciousRecipients property value. The list of recipients who were detected as suspicious.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSuspiciousRecipients() {
        return this.backingStore.get("suspiciousRecipients");
    }
    /**
     * Gets the threadId property value. Identifier of the channel or chat that this message is part of.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThreadId() {
        return this.backingStore.get("threadId");
    }
    /**
     * Gets the threadType property value. The Teams message type. Supported values are: Chat, Topic, Space, and Meeting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThreadType() {
        return this.backingStore.get("threadType");
    }
    /**
     * Gets the urls property value. The URLs contained in this Teams message.
     * @return a {@link java.util.List<UrlEvidence>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UrlEvidence> getUrls() {
        return this.backingStore.get("urls");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("campaignId", this.getCampaignId());
        writer.writeStringValue("channelId", this.getChannelId());
        writer.writeEnumValue("deliveryAction", this.getDeliveryAction());
        writer.writeEnumValue("deliveryLocation", this.getDeliveryLocation());
        writer.writeCollectionOfObjectValues("files", this.getFiles());
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeBooleanValue("isExternal", this.getIsExternal());
        writer.writeBooleanValue("isOwned", this.getIsOwned());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("messageDirection", this.getMessageDirection());
        writer.writeStringValue("messageId", this.getMessageId());
        writer.writeUUIDValue("owningTenantId", this.getOwningTenantId());
        writer.writeStringValue("parentMessageId", this.getParentMessageId());
        writer.writeOffsetDateTimeValue("receivedDateTime", this.getReceivedDateTime());
        writer.writeCollectionOfPrimitiveValues("recipients", this.getRecipients());
        writer.writeStringValue("senderFromAddress", this.getSenderFromAddress());
        writer.writeStringValue("senderIP", this.getSenderIP());
        writer.writeStringValue("sourceAppName", this.getSourceAppName());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeCollectionOfPrimitiveValues("suspiciousRecipients", this.getSuspiciousRecipients());
        writer.writeStringValue("threadId", this.getThreadId());
        writer.writeStringValue("threadType", this.getThreadType());
        writer.writeCollectionOfObjectValues("urls", this.getUrls());
    }
    /**
     * Sets the campaignId property value. The identifier of the campaign that this Teams message is part of.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("campaignId", value);
    }
    /**
     * Sets the channelId property value. The channel ID associated with this Teams message.
     * @param value Value to set for the channelId property.
     */
    public void setChannelId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("channelId", value);
    }
    /**
     * Sets the deliveryAction property value. The delivery action of this Teams message. The possible values are: unknown, deliveredAsSpam, delivered, blocked, replaced, unknownFutureValue.
     * @param value Value to set for the deliveryAction property.
     */
    public void setDeliveryAction(@jakarta.annotation.Nullable final TeamsMessageDeliveryAction value) {
        this.backingStore.set("deliveryAction", value);
    }
    /**
     * Sets the deliveryLocation property value. The delivery location of this Teams message. The possible values are: unknown, teams, quarantine, failed, unknownFutureValue.
     * @param value Value to set for the deliveryLocation property.
     */
    public void setDeliveryLocation(@jakarta.annotation.Nullable final TeamsDeliveryLocation value) {
        this.backingStore.set("deliveryLocation", value);
    }
    /**
     * Sets the files property value. The list of file entities that are attached to this Teams message.
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<FileEvidence> value) {
        this.backingStore.set("files", value);
    }
    /**
     * Sets the groupId property value. The identifier of the team or group that this message is part of.
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupId", value);
    }
    /**
     * Sets the isExternal property value. Indicates whether the message is owned by the organization that reported the security detection alert.
     * @param value Value to set for the isExternal property.
     */
    public void setIsExternal(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isExternal", value);
    }
    /**
     * Sets the isOwned property value. Indicates whether the message is owned by your organization.
     * @param value Value to set for the isOwned property.
     */
    public void setIsOwned(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOwned", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time when the message was last edited. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the messageDirection property value. The direction of the Teams message. The possible values are: unknown, inbound, outbound, intraorg, unknownFutureValue.
     * @param value Value to set for the messageDirection property.
     */
    public void setMessageDirection(@jakarta.annotation.Nullable final AntispamTeamsDirection value) {
        this.backingStore.set("messageDirection", value);
    }
    /**
     * Sets the messageId property value. Message identifier unique within the thread.
     * @param value Value to set for the messageId property.
     */
    public void setMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messageId", value);
    }
    /**
     * Sets the owningTenantId property value. Tenant ID (GUID) of the owner of the message.
     * @param value Value to set for the owningTenantId property.
     */
    public void setOwningTenantId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("owningTenantId", value);
    }
    /**
     * Sets the parentMessageId property value. Identifier of the message to which the current message is a reply; otherwise, it&apos;s the same as the messageId.
     * @param value Value to set for the parentMessageId property.
     */
    public void setParentMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentMessageId", value);
    }
    /**
     * Sets the receivedDateTime property value. The received date of this message. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the receivedDateTime property.
     */
    public void setReceivedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("receivedDateTime", value);
    }
    /**
     * Sets the recipients property value. The recipients of this Teams message.
     * @param value Value to set for the recipients property.
     */
    public void setRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("recipients", value);
    }
    /**
     * Sets the senderFromAddress property value. The SMTP format address of the sender.
     * @param value Value to set for the senderFromAddress property.
     */
    public void setSenderFromAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("senderFromAddress", value);
    }
    /**
     * Sets the senderIP property value. The IP address of the sender.
     * @param value Value to set for the senderIP property.
     */
    public void setSenderIP(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("senderIP", value);
    }
    /**
     * Sets the sourceAppName property value. Source of the message; for example, desktop and mobile.
     * @param value Value to set for the sourceAppName property.
     */
    public void setSourceAppName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceAppName", value);
    }
    /**
     * Sets the sourceId property value. The source ID of this Teams message.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceId", value);
    }
    /**
     * Sets the subject property value. The subject of this Teams message.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the suspiciousRecipients property value. The list of recipients who were detected as suspicious.
     * @param value Value to set for the suspiciousRecipients property.
     */
    public void setSuspiciousRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("suspiciousRecipients", value);
    }
    /**
     * Sets the threadId property value. Identifier of the channel or chat that this message is part of.
     * @param value Value to set for the threadId property.
     */
    public void setThreadId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("threadId", value);
    }
    /**
     * Sets the threadType property value. The Teams message type. Supported values are: Chat, Topic, Space, and Meeting.
     * @param value Value to set for the threadType property.
     */
    public void setThreadType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("threadType", value);
    }
    /**
     * Sets the urls property value. The URLs contained in this Teams message.
     * @param value Value to set for the urls property.
     */
    public void setUrls(@jakarta.annotation.Nullable final java.util.List<UrlEvidence> value) {
        this.backingStore.set("urls", value);
    }
}
