package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageRulePredicates implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new MessageRulePredicates and sets the default values.
     */
    public MessageRulePredicates() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessageRulePredicates
     */
    @jakarta.annotation.Nonnull
    public static MessageRulePredicates createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageRulePredicates();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the bodyContains property value. Represents the strings that should appear in the body of an incoming message in order for the condition or exception to apply.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBodyContains() {
        return this.backingStore.get("bodyContains");
    }
    /**
     * Gets the bodyOrSubjectContains property value. Represents the strings that should appear in the body or subject of an incoming message in order for the condition or exception to apply.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBodyOrSubjectContains() {
        return this.backingStore.get("bodyOrSubjectContains");
    }
    /**
     * Gets the categories property value. Represents the categories that an incoming message should be labeled with in order for the condition or exception to apply.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this.backingStore.get("categories");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(31);
        deserializerMap.put("bodyContains", (n) -> { this.setBodyContains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("bodyOrSubjectContains", (n) -> { this.setBodyOrSubjectContains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("fromAddresses", (n) -> { this.setFromAddresses(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("hasAttachments", (n) -> { this.setHasAttachments(n.getBooleanValue()); });
        deserializerMap.put("headerContains", (n) -> { this.setHeaderContains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("importance", (n) -> { this.setImportance(n.getEnumValue(Importance::forValue)); });
        deserializerMap.put("isApprovalRequest", (n) -> { this.setIsApprovalRequest(n.getBooleanValue()); });
        deserializerMap.put("isAutomaticForward", (n) -> { this.setIsAutomaticForward(n.getBooleanValue()); });
        deserializerMap.put("isAutomaticReply", (n) -> { this.setIsAutomaticReply(n.getBooleanValue()); });
        deserializerMap.put("isEncrypted", (n) -> { this.setIsEncrypted(n.getBooleanValue()); });
        deserializerMap.put("isMeetingRequest", (n) -> { this.setIsMeetingRequest(n.getBooleanValue()); });
        deserializerMap.put("isMeetingResponse", (n) -> { this.setIsMeetingResponse(n.getBooleanValue()); });
        deserializerMap.put("isNonDeliveryReport", (n) -> { this.setIsNonDeliveryReport(n.getBooleanValue()); });
        deserializerMap.put("isPermissionControlled", (n) -> { this.setIsPermissionControlled(n.getBooleanValue()); });
        deserializerMap.put("isReadReceipt", (n) -> { this.setIsReadReceipt(n.getBooleanValue()); });
        deserializerMap.put("isSigned", (n) -> { this.setIsSigned(n.getBooleanValue()); });
        deserializerMap.put("isVoicemail", (n) -> { this.setIsVoicemail(n.getBooleanValue()); });
        deserializerMap.put("messageActionFlag", (n) -> { this.setMessageActionFlag(n.getEnumValue(MessageActionFlag::forValue)); });
        deserializerMap.put("notSentToMe", (n) -> { this.setNotSentToMe(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recipientContains", (n) -> { this.setRecipientContains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("senderContains", (n) -> { this.setSenderContains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sensitivity", (n) -> { this.setSensitivity(n.getEnumValue(Sensitivity::forValue)); });
        deserializerMap.put("sentCcMe", (n) -> { this.setSentCcMe(n.getBooleanValue()); });
        deserializerMap.put("sentOnlyToMe", (n) -> { this.setSentOnlyToMe(n.getBooleanValue()); });
        deserializerMap.put("sentToAddresses", (n) -> { this.setSentToAddresses(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("sentToMe", (n) -> { this.setSentToMe(n.getBooleanValue()); });
        deserializerMap.put("sentToOrCcMe", (n) -> { this.setSentToOrCcMe(n.getBooleanValue()); });
        deserializerMap.put("subjectContains", (n) -> { this.setSubjectContains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("withinSizeRange", (n) -> { this.setWithinSizeRange(n.getObjectValue(SizeRange::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fromAddresses property value. Represents the specific sender email addresses of an incoming message in order for the condition or exception to apply.
     * @return a java.util.List<Recipient>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getFromAddresses() {
        return this.backingStore.get("fromAddresses");
    }
    /**
     * Gets the hasAttachments property value. Indicates whether an incoming message must have attachments in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasAttachments() {
        return this.backingStore.get("hasAttachments");
    }
    /**
     * Gets the headerContains property value. Represents the strings that appear in the headers of an incoming message in order for the condition or exception to apply.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getHeaderContains() {
        return this.backingStore.get("headerContains");
    }
    /**
     * Gets the importance property value. The importance that is stamped on an incoming message in order for the condition or exception to apply: low, normal, high.
     * @return a Importance
     */
    @jakarta.annotation.Nullable
    public Importance getImportance() {
        return this.backingStore.get("importance");
    }
    /**
     * Gets the isApprovalRequest property value. Indicates whether an incoming message must be an approval request in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApprovalRequest() {
        return this.backingStore.get("isApprovalRequest");
    }
    /**
     * Gets the isAutomaticForward property value. Indicates whether an incoming message must be automatically forwarded in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAutomaticForward() {
        return this.backingStore.get("isAutomaticForward");
    }
    /**
     * Gets the isAutomaticReply property value. Indicates whether an incoming message must be an auto reply in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAutomaticReply() {
        return this.backingStore.get("isAutomaticReply");
    }
    /**
     * Gets the isEncrypted property value. Indicates whether an incoming message must be encrypted in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEncrypted() {
        return this.backingStore.get("isEncrypted");
    }
    /**
     * Gets the isMeetingRequest property value. Indicates whether an incoming message must be a meeting request in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMeetingRequest() {
        return this.backingStore.get("isMeetingRequest");
    }
    /**
     * Gets the isMeetingResponse property value. Indicates whether an incoming message must be a meeting response in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMeetingResponse() {
        return this.backingStore.get("isMeetingResponse");
    }
    /**
     * Gets the isNonDeliveryReport property value. Indicates whether an incoming message must be a non-delivery report in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsNonDeliveryReport() {
        return this.backingStore.get("isNonDeliveryReport");
    }
    /**
     * Gets the isPermissionControlled property value. Indicates whether an incoming message must be permission controlled (RMS-protected) in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPermissionControlled() {
        return this.backingStore.get("isPermissionControlled");
    }
    /**
     * Gets the isReadReceipt property value. Indicates whether an incoming message must be a read receipt in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReadReceipt() {
        return this.backingStore.get("isReadReceipt");
    }
    /**
     * Gets the isSigned property value. Indicates whether an incoming message must be S/MIME-signed in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSigned() {
        return this.backingStore.get("isSigned");
    }
    /**
     * Gets the isVoicemail property value. Indicates whether an incoming message must be a voice mail in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsVoicemail() {
        return this.backingStore.get("isVoicemail");
    }
    /**
     * Gets the messageActionFlag property value. Represents the flag-for-action value that appears on an incoming message in order for the condition or exception to apply. The possible values are: any, call, doNotForward, followUp, fyi, forward, noResponseNecessary, read, reply, replyToAll, review.
     * @return a MessageActionFlag
     */
    @jakarta.annotation.Nullable
    public MessageActionFlag getMessageActionFlag() {
        return this.backingStore.get("messageActionFlag");
    }
    /**
     * Gets the notSentToMe property value. Indicates whether the owner of the mailbox must not be a recipient of an incoming message in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNotSentToMe() {
        return this.backingStore.get("notSentToMe");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the recipientContains property value. Represents the strings that appear in either the toRecipients or ccRecipients properties of an incoming message in order for the condition or exception to apply.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRecipientContains() {
        return this.backingStore.get("recipientContains");
    }
    /**
     * Gets the senderContains property value. Represents the strings that appear in the from property of an incoming message in order for the condition or exception to apply.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSenderContains() {
        return this.backingStore.get("senderContains");
    }
    /**
     * Gets the sensitivity property value. Represents the sensitivity level that must be stamped on an incoming message in order for the condition or exception to apply. The possible values are: normal, personal, private, confidential.
     * @return a Sensitivity
     */
    @jakarta.annotation.Nullable
    public Sensitivity getSensitivity() {
        return this.backingStore.get("sensitivity");
    }
    /**
     * Gets the sentCcMe property value. Indicates whether the owner of the mailbox must be in the ccRecipients property of an incoming message in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSentCcMe() {
        return this.backingStore.get("sentCcMe");
    }
    /**
     * Gets the sentOnlyToMe property value. Indicates whether the owner of the mailbox must be the only recipient in an incoming message in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSentOnlyToMe() {
        return this.backingStore.get("sentOnlyToMe");
    }
    /**
     * Gets the sentToAddresses property value. Represents the email addresses that an incoming message must have been sent to in order for the condition or exception to apply.
     * @return a java.util.List<Recipient>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getSentToAddresses() {
        return this.backingStore.get("sentToAddresses");
    }
    /**
     * Gets the sentToMe property value. Indicates whether the owner of the mailbox must be in the toRecipients property of an incoming message in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSentToMe() {
        return this.backingStore.get("sentToMe");
    }
    /**
     * Gets the sentToOrCcMe property value. Indicates whether the owner of the mailbox must be in either a toRecipients or ccRecipients property of an incoming message in order for the condition or exception to apply.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSentToOrCcMe() {
        return this.backingStore.get("sentToOrCcMe");
    }
    /**
     * Gets the subjectContains property value. Represents the strings that appear in the subject of an incoming message in order for the condition or exception to apply.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSubjectContains() {
        return this.backingStore.get("subjectContains");
    }
    /**
     * Gets the withinSizeRange property value. Represents the minimum and maximum sizes (in kilobytes) that an incoming message must fall in between in order for the condition or exception to apply.
     * @return a SizeRange
     */
    @jakarta.annotation.Nullable
    public SizeRange getWithinSizeRange() {
        return this.backingStore.get("withinSizeRange");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("bodyContains", this.getBodyContains());
        writer.writeCollectionOfPrimitiveValues("bodyOrSubjectContains", this.getBodyOrSubjectContains());
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeCollectionOfObjectValues("fromAddresses", this.getFromAddresses());
        writer.writeBooleanValue("hasAttachments", this.getHasAttachments());
        writer.writeCollectionOfPrimitiveValues("headerContains", this.getHeaderContains());
        writer.writeEnumValue("importance", this.getImportance());
        writer.writeBooleanValue("isApprovalRequest", this.getIsApprovalRequest());
        writer.writeBooleanValue("isAutomaticForward", this.getIsAutomaticForward());
        writer.writeBooleanValue("isAutomaticReply", this.getIsAutomaticReply());
        writer.writeBooleanValue("isEncrypted", this.getIsEncrypted());
        writer.writeBooleanValue("isMeetingRequest", this.getIsMeetingRequest());
        writer.writeBooleanValue("isMeetingResponse", this.getIsMeetingResponse());
        writer.writeBooleanValue("isNonDeliveryReport", this.getIsNonDeliveryReport());
        writer.writeBooleanValue("isPermissionControlled", this.getIsPermissionControlled());
        writer.writeBooleanValue("isReadReceipt", this.getIsReadReceipt());
        writer.writeBooleanValue("isSigned", this.getIsSigned());
        writer.writeBooleanValue("isVoicemail", this.getIsVoicemail());
        writer.writeEnumValue("messageActionFlag", this.getMessageActionFlag());
        writer.writeBooleanValue("notSentToMe", this.getNotSentToMe());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("recipientContains", this.getRecipientContains());
        writer.writeCollectionOfPrimitiveValues("senderContains", this.getSenderContains());
        writer.writeEnumValue("sensitivity", this.getSensitivity());
        writer.writeBooleanValue("sentCcMe", this.getSentCcMe());
        writer.writeBooleanValue("sentOnlyToMe", this.getSentOnlyToMe());
        writer.writeCollectionOfObjectValues("sentToAddresses", this.getSentToAddresses());
        writer.writeBooleanValue("sentToMe", this.getSentToMe());
        writer.writeBooleanValue("sentToOrCcMe", this.getSentToOrCcMe());
        writer.writeCollectionOfPrimitiveValues("subjectContains", this.getSubjectContains());
        writer.writeObjectValue("withinSizeRange", this.getWithinSizeRange());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the bodyContains property value. Represents the strings that should appear in the body of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the bodyContains property.
     */
    public void setBodyContains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("bodyContains", value);
    }
    /**
     * Sets the bodyOrSubjectContains property value. Represents the strings that should appear in the body or subject of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the bodyOrSubjectContains property.
     */
    public void setBodyOrSubjectContains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("bodyOrSubjectContains", value);
    }
    /**
     * Sets the categories property value. Represents the categories that an incoming message should be labeled with in order for the condition or exception to apply.
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("categories", value);
    }
    /**
     * Sets the fromAddresses property value. Represents the specific sender email addresses of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the fromAddresses property.
     */
    public void setFromAddresses(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.backingStore.set("fromAddresses", value);
    }
    /**
     * Sets the hasAttachments property value. Indicates whether an incoming message must have attachments in order for the condition or exception to apply.
     * @param value Value to set for the hasAttachments property.
     */
    public void setHasAttachments(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasAttachments", value);
    }
    /**
     * Sets the headerContains property value. Represents the strings that appear in the headers of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the headerContains property.
     */
    public void setHeaderContains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("headerContains", value);
    }
    /**
     * Sets the importance property value. The importance that is stamped on an incoming message in order for the condition or exception to apply: low, normal, high.
     * @param value Value to set for the importance property.
     */
    public void setImportance(@jakarta.annotation.Nullable final Importance value) {
        this.backingStore.set("importance", value);
    }
    /**
     * Sets the isApprovalRequest property value. Indicates whether an incoming message must be an approval request in order for the condition or exception to apply.
     * @param value Value to set for the isApprovalRequest property.
     */
    public void setIsApprovalRequest(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isApprovalRequest", value);
    }
    /**
     * Sets the isAutomaticForward property value. Indicates whether an incoming message must be automatically forwarded in order for the condition or exception to apply.
     * @param value Value to set for the isAutomaticForward property.
     */
    public void setIsAutomaticForward(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAutomaticForward", value);
    }
    /**
     * Sets the isAutomaticReply property value. Indicates whether an incoming message must be an auto reply in order for the condition or exception to apply.
     * @param value Value to set for the isAutomaticReply property.
     */
    public void setIsAutomaticReply(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAutomaticReply", value);
    }
    /**
     * Sets the isEncrypted property value. Indicates whether an incoming message must be encrypted in order for the condition or exception to apply.
     * @param value Value to set for the isEncrypted property.
     */
    public void setIsEncrypted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEncrypted", value);
    }
    /**
     * Sets the isMeetingRequest property value. Indicates whether an incoming message must be a meeting request in order for the condition or exception to apply.
     * @param value Value to set for the isMeetingRequest property.
     */
    public void setIsMeetingRequest(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMeetingRequest", value);
    }
    /**
     * Sets the isMeetingResponse property value. Indicates whether an incoming message must be a meeting response in order for the condition or exception to apply.
     * @param value Value to set for the isMeetingResponse property.
     */
    public void setIsMeetingResponse(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMeetingResponse", value);
    }
    /**
     * Sets the isNonDeliveryReport property value. Indicates whether an incoming message must be a non-delivery report in order for the condition or exception to apply.
     * @param value Value to set for the isNonDeliveryReport property.
     */
    public void setIsNonDeliveryReport(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isNonDeliveryReport", value);
    }
    /**
     * Sets the isPermissionControlled property value. Indicates whether an incoming message must be permission controlled (RMS-protected) in order for the condition or exception to apply.
     * @param value Value to set for the isPermissionControlled property.
     */
    public void setIsPermissionControlled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPermissionControlled", value);
    }
    /**
     * Sets the isReadReceipt property value. Indicates whether an incoming message must be a read receipt in order for the condition or exception to apply.
     * @param value Value to set for the isReadReceipt property.
     */
    public void setIsReadReceipt(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isReadReceipt", value);
    }
    /**
     * Sets the isSigned property value. Indicates whether an incoming message must be S/MIME-signed in order for the condition or exception to apply.
     * @param value Value to set for the isSigned property.
     */
    public void setIsSigned(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSigned", value);
    }
    /**
     * Sets the isVoicemail property value. Indicates whether an incoming message must be a voice mail in order for the condition or exception to apply.
     * @param value Value to set for the isVoicemail property.
     */
    public void setIsVoicemail(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isVoicemail", value);
    }
    /**
     * Sets the messageActionFlag property value. Represents the flag-for-action value that appears on an incoming message in order for the condition or exception to apply. The possible values are: any, call, doNotForward, followUp, fyi, forward, noResponseNecessary, read, reply, replyToAll, review.
     * @param value Value to set for the messageActionFlag property.
     */
    public void setMessageActionFlag(@jakarta.annotation.Nullable final MessageActionFlag value) {
        this.backingStore.set("messageActionFlag", value);
    }
    /**
     * Sets the notSentToMe property value. Indicates whether the owner of the mailbox must not be a recipient of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the notSentToMe property.
     */
    public void setNotSentToMe(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("notSentToMe", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recipientContains property value. Represents the strings that appear in either the toRecipients or ccRecipients properties of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the recipientContains property.
     */
    public void setRecipientContains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("recipientContains", value);
    }
    /**
     * Sets the senderContains property value. Represents the strings that appear in the from property of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the senderContains property.
     */
    public void setSenderContains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("senderContains", value);
    }
    /**
     * Sets the sensitivity property value. Represents the sensitivity level that must be stamped on an incoming message in order for the condition or exception to apply. The possible values are: normal, personal, private, confidential.
     * @param value Value to set for the sensitivity property.
     */
    public void setSensitivity(@jakarta.annotation.Nullable final Sensitivity value) {
        this.backingStore.set("sensitivity", value);
    }
    /**
     * Sets the sentCcMe property value. Indicates whether the owner of the mailbox must be in the ccRecipients property of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the sentCcMe property.
     */
    public void setSentCcMe(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("sentCcMe", value);
    }
    /**
     * Sets the sentOnlyToMe property value. Indicates whether the owner of the mailbox must be the only recipient in an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the sentOnlyToMe property.
     */
    public void setSentOnlyToMe(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("sentOnlyToMe", value);
    }
    /**
     * Sets the sentToAddresses property value. Represents the email addresses that an incoming message must have been sent to in order for the condition or exception to apply.
     * @param value Value to set for the sentToAddresses property.
     */
    public void setSentToAddresses(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.backingStore.set("sentToAddresses", value);
    }
    /**
     * Sets the sentToMe property value. Indicates whether the owner of the mailbox must be in the toRecipients property of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the sentToMe property.
     */
    public void setSentToMe(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("sentToMe", value);
    }
    /**
     * Sets the sentToOrCcMe property value. Indicates whether the owner of the mailbox must be in either a toRecipients or ccRecipients property of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the sentToOrCcMe property.
     */
    public void setSentToOrCcMe(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("sentToOrCcMe", value);
    }
    /**
     * Sets the subjectContains property value. Represents the strings that appear in the subject of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the subjectContains property.
     */
    public void setSubjectContains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("subjectContains", value);
    }
    /**
     * Sets the withinSizeRange property value. Represents the minimum and maximum sizes (in kilobytes) that an incoming message must fall in between in order for the condition or exception to apply.
     * @param value Value to set for the withinSizeRange property.
     */
    public void setWithinSizeRange(@jakarta.annotation.Nullable final SizeRange value) {
        this.backingStore.set("withinSizeRange", value);
    }
}
