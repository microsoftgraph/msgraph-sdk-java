package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MessageRulePredicates implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Represents the strings that should appear in the body of an incoming message in order for the condition or exception to apply. */
    private java.util.List<String> _bodyContains;
    /** Represents the strings that should appear in the body or subject of an incoming message in order for the condition or exception to apply. */
    private java.util.List<String> _bodyOrSubjectContains;
    /** Represents the categories that an incoming message should be labeled with in order for the condition or exception to apply. */
    private java.util.List<String> _categories;
    /** Represents the specific sender email addresses of an incoming message in order for the condition or exception to apply. */
    private java.util.List<Recipient> _fromAddresses;
    /** Indicates whether an incoming message must have attachments in order for the condition or exception to apply. */
    private Boolean _hasAttachments;
    /** Represents the strings that appear in the headers of an incoming message in order for the condition or exception to apply. */
    private java.util.List<String> _headerContains;
    /** The importance that is stamped on an incoming message in order for the condition or exception to apply: low, normal, high. */
    private Importance _importance;
    /** Indicates whether an incoming message must be an approval request in order for the condition or exception to apply. */
    private Boolean _isApprovalRequest;
    /** Indicates whether an incoming message must be automatically forwarded in order for the condition or exception to apply. */
    private Boolean _isAutomaticForward;
    /** Indicates whether an incoming message must be an auto reply in order for the condition or exception to apply. */
    private Boolean _isAutomaticReply;
    /** Indicates whether an incoming message must be encrypted in order for the condition or exception to apply. */
    private Boolean _isEncrypted;
    /** Indicates whether an incoming message must be a meeting request in order for the condition or exception to apply. */
    private Boolean _isMeetingRequest;
    /** Indicates whether an incoming message must be a meeting response in order for the condition or exception to apply. */
    private Boolean _isMeetingResponse;
    /** Indicates whether an incoming message must be a non-delivery report in order for the condition or exception to apply. */
    private Boolean _isNonDeliveryReport;
    /** Indicates whether an incoming message must be permission controlled (RMS-protected) in order for the condition or exception to apply. */
    private Boolean _isPermissionControlled;
    /** Indicates whether an incoming message must be a read receipt in order for the condition or exception to apply. */
    private Boolean _isReadReceipt;
    /** Indicates whether an incoming message must be S/MIME-signed in order for the condition or exception to apply. */
    private Boolean _isSigned;
    /** Indicates whether an incoming message must be a voice mail in order for the condition or exception to apply. */
    private Boolean _isVoicemail;
    /** Represents the flag-for-action value that appears on an incoming message in order for the condition or exception to apply. The possible values are: any, call, doNotForward, followUp, fyi, forward, noResponseNecessary, read, reply, replyToAll, review. */
    private MessageActionFlag _messageActionFlag;
    /** Indicates whether the owner of the mailbox must not be a recipient of an incoming message in order for the condition or exception to apply. */
    private Boolean _notSentToMe;
    /** The OdataType property */
    private String _odataType;
    /** Represents the strings that appear in either the toRecipients or ccRecipients properties of an incoming message in order for the condition or exception to apply. */
    private java.util.List<String> _recipientContains;
    /** Represents the strings that appear in the from property of an incoming message in order for the condition or exception to apply. */
    private java.util.List<String> _senderContains;
    /** Represents the sensitivity level that must be stamped on an incoming message in order for the condition or exception to apply. The possible values are: normal, personal, private, confidential. */
    private Sensitivity _sensitivity;
    /** Indicates whether the owner of the mailbox must be in the ccRecipients property of an incoming message in order for the condition or exception to apply. */
    private Boolean _sentCcMe;
    /** Indicates whether the owner of the mailbox must be the only recipient in an incoming message in order for the condition or exception to apply. */
    private Boolean _sentOnlyToMe;
    /** Represents the email addresses that an incoming message must have been sent to in order for the condition or exception to apply. */
    private java.util.List<Recipient> _sentToAddresses;
    /** Indicates whether the owner of the mailbox must be in the toRecipients property of an incoming message in order for the condition or exception to apply. */
    private Boolean _sentToMe;
    /** Indicates whether the owner of the mailbox must be in either a toRecipients or ccRecipients property of an incoming message in order for the condition or exception to apply. */
    private Boolean _sentToOrCcMe;
    /** Represents the strings that appear in the subject of an incoming message in order for the condition or exception to apply. */
    private java.util.List<String> _subjectContains;
    /** Represents the minimum and maximum sizes (in kilobytes) that an incoming message must fall in between in order for the condition or exception to apply. */
    private SizeRange _withinSizeRange;
    /**
     * Instantiates a new messageRulePredicates and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MessageRulePredicates() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.messageRulePredicates");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a messageRulePredicates
     */
    @javax.annotation.Nonnull
    public static MessageRulePredicates createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageRulePredicates();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the bodyContains property value. Represents the strings that should appear in the body of an incoming message in order for the condition or exception to apply.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBodyContains() {
        return this._bodyContains;
    }
    /**
     * Gets the bodyOrSubjectContains property value. Represents the strings that should appear in the body or subject of an incoming message in order for the condition or exception to apply.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBodyOrSubjectContains() {
        return this._bodyOrSubjectContains;
    }
    /**
     * Gets the categories property value. Represents the categories that an incoming message should be labeled with in order for the condition or exception to apply.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this._categories;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MessageRulePredicates currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(31);
        deserializerMap.put("bodyContains", (n) -> { currentObject.setBodyContains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("bodyOrSubjectContains", (n) -> { currentObject.setBodyOrSubjectContains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("categories", (n) -> { currentObject.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("fromAddresses", (n) -> { currentObject.setFromAddresses(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("hasAttachments", (n) -> { currentObject.setHasAttachments(n.getBooleanValue()); });
        deserializerMap.put("headerContains", (n) -> { currentObject.setHeaderContains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("importance", (n) -> { currentObject.setImportance(n.getEnumValue(Importance.class)); });
        deserializerMap.put("isApprovalRequest", (n) -> { currentObject.setIsApprovalRequest(n.getBooleanValue()); });
        deserializerMap.put("isAutomaticForward", (n) -> { currentObject.setIsAutomaticForward(n.getBooleanValue()); });
        deserializerMap.put("isAutomaticReply", (n) -> { currentObject.setIsAutomaticReply(n.getBooleanValue()); });
        deserializerMap.put("isEncrypted", (n) -> { currentObject.setIsEncrypted(n.getBooleanValue()); });
        deserializerMap.put("isMeetingRequest", (n) -> { currentObject.setIsMeetingRequest(n.getBooleanValue()); });
        deserializerMap.put("isMeetingResponse", (n) -> { currentObject.setIsMeetingResponse(n.getBooleanValue()); });
        deserializerMap.put("isNonDeliveryReport", (n) -> { currentObject.setIsNonDeliveryReport(n.getBooleanValue()); });
        deserializerMap.put("isPermissionControlled", (n) -> { currentObject.setIsPermissionControlled(n.getBooleanValue()); });
        deserializerMap.put("isReadReceipt", (n) -> { currentObject.setIsReadReceipt(n.getBooleanValue()); });
        deserializerMap.put("isSigned", (n) -> { currentObject.setIsSigned(n.getBooleanValue()); });
        deserializerMap.put("isVoicemail", (n) -> { currentObject.setIsVoicemail(n.getBooleanValue()); });
        deserializerMap.put("messageActionFlag", (n) -> { currentObject.setMessageActionFlag(n.getEnumValue(MessageActionFlag.class)); });
        deserializerMap.put("notSentToMe", (n) -> { currentObject.setNotSentToMe(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("recipientContains", (n) -> { currentObject.setRecipientContains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("senderContains", (n) -> { currentObject.setSenderContains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sensitivity", (n) -> { currentObject.setSensitivity(n.getEnumValue(Sensitivity.class)); });
        deserializerMap.put("sentCcMe", (n) -> { currentObject.setSentCcMe(n.getBooleanValue()); });
        deserializerMap.put("sentOnlyToMe", (n) -> { currentObject.setSentOnlyToMe(n.getBooleanValue()); });
        deserializerMap.put("sentToAddresses", (n) -> { currentObject.setSentToAddresses(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("sentToMe", (n) -> { currentObject.setSentToMe(n.getBooleanValue()); });
        deserializerMap.put("sentToOrCcMe", (n) -> { currentObject.setSentToOrCcMe(n.getBooleanValue()); });
        deserializerMap.put("subjectContains", (n) -> { currentObject.setSubjectContains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("withinSizeRange", (n) -> { currentObject.setWithinSizeRange(n.getObjectValue(SizeRange::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the fromAddresses property value. Represents the specific sender email addresses of an incoming message in order for the condition or exception to apply.
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getFromAddresses() {
        return this._fromAddresses;
    }
    /**
     * Gets the hasAttachments property value. Indicates whether an incoming message must have attachments in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasAttachments() {
        return this._hasAttachments;
    }
    /**
     * Gets the headerContains property value. Represents the strings that appear in the headers of an incoming message in order for the condition or exception to apply.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getHeaderContains() {
        return this._headerContains;
    }
    /**
     * Gets the importance property value. The importance that is stamped on an incoming message in order for the condition or exception to apply: low, normal, high.
     * @return a importance
     */
    @javax.annotation.Nullable
    public Importance getImportance() {
        return this._importance;
    }
    /**
     * Gets the isApprovalRequest property value. Indicates whether an incoming message must be an approval request in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApprovalRequest() {
        return this._isApprovalRequest;
    }
    /**
     * Gets the isAutomaticForward property value. Indicates whether an incoming message must be automatically forwarded in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAutomaticForward() {
        return this._isAutomaticForward;
    }
    /**
     * Gets the isAutomaticReply property value. Indicates whether an incoming message must be an auto reply in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAutomaticReply() {
        return this._isAutomaticReply;
    }
    /**
     * Gets the isEncrypted property value. Indicates whether an incoming message must be encrypted in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEncrypted() {
        return this._isEncrypted;
    }
    /**
     * Gets the isMeetingRequest property value. Indicates whether an incoming message must be a meeting request in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMeetingRequest() {
        return this._isMeetingRequest;
    }
    /**
     * Gets the isMeetingResponse property value. Indicates whether an incoming message must be a meeting response in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMeetingResponse() {
        return this._isMeetingResponse;
    }
    /**
     * Gets the isNonDeliveryReport property value. Indicates whether an incoming message must be a non-delivery report in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsNonDeliveryReport() {
        return this._isNonDeliveryReport;
    }
    /**
     * Gets the isPermissionControlled property value. Indicates whether an incoming message must be permission controlled (RMS-protected) in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPermissionControlled() {
        return this._isPermissionControlled;
    }
    /**
     * Gets the isReadReceipt property value. Indicates whether an incoming message must be a read receipt in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReadReceipt() {
        return this._isReadReceipt;
    }
    /**
     * Gets the isSigned property value. Indicates whether an incoming message must be S/MIME-signed in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSigned() {
        return this._isSigned;
    }
    /**
     * Gets the isVoicemail property value. Indicates whether an incoming message must be a voice mail in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsVoicemail() {
        return this._isVoicemail;
    }
    /**
     * Gets the messageActionFlag property value. Represents the flag-for-action value that appears on an incoming message in order for the condition or exception to apply. The possible values are: any, call, doNotForward, followUp, fyi, forward, noResponseNecessary, read, reply, replyToAll, review.
     * @return a messageActionFlag
     */
    @javax.annotation.Nullable
    public MessageActionFlag getMessageActionFlag() {
        return this._messageActionFlag;
    }
    /**
     * Gets the notSentToMe property value. Indicates whether the owner of the mailbox must not be a recipient of an incoming message in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNotSentToMe() {
        return this._notSentToMe;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the recipientContains property value. Represents the strings that appear in either the toRecipients or ccRecipients properties of an incoming message in order for the condition or exception to apply.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRecipientContains() {
        return this._recipientContains;
    }
    /**
     * Gets the senderContains property value. Represents the strings that appear in the from property of an incoming message in order for the condition or exception to apply.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSenderContains() {
        return this._senderContains;
    }
    /**
     * Gets the sensitivity property value. Represents the sensitivity level that must be stamped on an incoming message in order for the condition or exception to apply. The possible values are: normal, personal, private, confidential.
     * @return a sensitivity
     */
    @javax.annotation.Nullable
    public Sensitivity getSensitivity() {
        return this._sensitivity;
    }
    /**
     * Gets the sentCcMe property value. Indicates whether the owner of the mailbox must be in the ccRecipients property of an incoming message in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSentCcMe() {
        return this._sentCcMe;
    }
    /**
     * Gets the sentOnlyToMe property value. Indicates whether the owner of the mailbox must be the only recipient in an incoming message in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSentOnlyToMe() {
        return this._sentOnlyToMe;
    }
    /**
     * Gets the sentToAddresses property value. Represents the email addresses that an incoming message must have been sent to in order for the condition or exception to apply.
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getSentToAddresses() {
        return this._sentToAddresses;
    }
    /**
     * Gets the sentToMe property value. Indicates whether the owner of the mailbox must be in the toRecipients property of an incoming message in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSentToMe() {
        return this._sentToMe;
    }
    /**
     * Gets the sentToOrCcMe property value. Indicates whether the owner of the mailbox must be in either a toRecipients or ccRecipients property of an incoming message in order for the condition or exception to apply.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSentToOrCcMe() {
        return this._sentToOrCcMe;
    }
    /**
     * Gets the subjectContains property value. Represents the strings that appear in the subject of an incoming message in order for the condition or exception to apply.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSubjectContains() {
        return this._subjectContains;
    }
    /**
     * Gets the withinSizeRange property value. Represents the minimum and maximum sizes (in kilobytes) that an incoming message must fall in between in order for the condition or exception to apply.
     * @return a sizeRange
     */
    @javax.annotation.Nullable
    public SizeRange getWithinSizeRange() {
        return this._withinSizeRange;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the bodyContains property value. Represents the strings that should appear in the body of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the bodyContains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBodyContains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._bodyContains = value;
    }
    /**
     * Sets the bodyOrSubjectContains property value. Represents the strings that should appear in the body or subject of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the bodyOrSubjectContains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBodyOrSubjectContains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._bodyOrSubjectContains = value;
    }
    /**
     * Sets the categories property value. Represents the categories that an incoming message should be labeled with in order for the condition or exception to apply.
     * @param value Value to set for the categories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategories(@javax.annotation.Nullable final java.util.List<String> value) {
        this._categories = value;
    }
    /**
     * Sets the fromAddresses property value. Represents the specific sender email addresses of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the fromAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFromAddresses(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this._fromAddresses = value;
    }
    /**
     * Sets the hasAttachments property value. Indicates whether an incoming message must have attachments in order for the condition or exception to apply.
     * @param value Value to set for the hasAttachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasAttachments(@javax.annotation.Nullable final Boolean value) {
        this._hasAttachments = value;
    }
    /**
     * Sets the headerContains property value. Represents the strings that appear in the headers of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the headerContains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHeaderContains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._headerContains = value;
    }
    /**
     * Sets the importance property value. The importance that is stamped on an incoming message in order for the condition or exception to apply: low, normal, high.
     * @param value Value to set for the importance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportance(@javax.annotation.Nullable final Importance value) {
        this._importance = value;
    }
    /**
     * Sets the isApprovalRequest property value. Indicates whether an incoming message must be an approval request in order for the condition or exception to apply.
     * @param value Value to set for the isApprovalRequest property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsApprovalRequest(@javax.annotation.Nullable final Boolean value) {
        this._isApprovalRequest = value;
    }
    /**
     * Sets the isAutomaticForward property value. Indicates whether an incoming message must be automatically forwarded in order for the condition or exception to apply.
     * @param value Value to set for the isAutomaticForward property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAutomaticForward(@javax.annotation.Nullable final Boolean value) {
        this._isAutomaticForward = value;
    }
    /**
     * Sets the isAutomaticReply property value. Indicates whether an incoming message must be an auto reply in order for the condition or exception to apply.
     * @param value Value to set for the isAutomaticReply property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAutomaticReply(@javax.annotation.Nullable final Boolean value) {
        this._isAutomaticReply = value;
    }
    /**
     * Sets the isEncrypted property value. Indicates whether an incoming message must be encrypted in order for the condition or exception to apply.
     * @param value Value to set for the isEncrypted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEncrypted(@javax.annotation.Nullable final Boolean value) {
        this._isEncrypted = value;
    }
    /**
     * Sets the isMeetingRequest property value. Indicates whether an incoming message must be a meeting request in order for the condition or exception to apply.
     * @param value Value to set for the isMeetingRequest property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMeetingRequest(@javax.annotation.Nullable final Boolean value) {
        this._isMeetingRequest = value;
    }
    /**
     * Sets the isMeetingResponse property value. Indicates whether an incoming message must be a meeting response in order for the condition or exception to apply.
     * @param value Value to set for the isMeetingResponse property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMeetingResponse(@javax.annotation.Nullable final Boolean value) {
        this._isMeetingResponse = value;
    }
    /**
     * Sets the isNonDeliveryReport property value. Indicates whether an incoming message must be a non-delivery report in order for the condition or exception to apply.
     * @param value Value to set for the isNonDeliveryReport property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsNonDeliveryReport(@javax.annotation.Nullable final Boolean value) {
        this._isNonDeliveryReport = value;
    }
    /**
     * Sets the isPermissionControlled property value. Indicates whether an incoming message must be permission controlled (RMS-protected) in order for the condition or exception to apply.
     * @param value Value to set for the isPermissionControlled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsPermissionControlled(@javax.annotation.Nullable final Boolean value) {
        this._isPermissionControlled = value;
    }
    /**
     * Sets the isReadReceipt property value. Indicates whether an incoming message must be a read receipt in order for the condition or exception to apply.
     * @param value Value to set for the isReadReceipt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsReadReceipt(@javax.annotation.Nullable final Boolean value) {
        this._isReadReceipt = value;
    }
    /**
     * Sets the isSigned property value. Indicates whether an incoming message must be S/MIME-signed in order for the condition or exception to apply.
     * @param value Value to set for the isSigned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSigned(@javax.annotation.Nullable final Boolean value) {
        this._isSigned = value;
    }
    /**
     * Sets the isVoicemail property value. Indicates whether an incoming message must be a voice mail in order for the condition or exception to apply.
     * @param value Value to set for the isVoicemail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsVoicemail(@javax.annotation.Nullable final Boolean value) {
        this._isVoicemail = value;
    }
    /**
     * Sets the messageActionFlag property value. Represents the flag-for-action value that appears on an incoming message in order for the condition or exception to apply. The possible values are: any, call, doNotForward, followUp, fyi, forward, noResponseNecessary, read, reply, replyToAll, review.
     * @param value Value to set for the messageActionFlag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessageActionFlag(@javax.annotation.Nullable final MessageActionFlag value) {
        this._messageActionFlag = value;
    }
    /**
     * Sets the notSentToMe property value. Indicates whether the owner of the mailbox must not be a recipient of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the notSentToMe property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotSentToMe(@javax.annotation.Nullable final Boolean value) {
        this._notSentToMe = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the recipientContains property value. Represents the strings that appear in either the toRecipients or ccRecipients properties of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the recipientContains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipientContains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._recipientContains = value;
    }
    /**
     * Sets the senderContains property value. Represents the strings that appear in the from property of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the senderContains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSenderContains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._senderContains = value;
    }
    /**
     * Sets the sensitivity property value. Represents the sensitivity level that must be stamped on an incoming message in order for the condition or exception to apply. The possible values are: normal, personal, private, confidential.
     * @param value Value to set for the sensitivity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitivity(@javax.annotation.Nullable final Sensitivity value) {
        this._sensitivity = value;
    }
    /**
     * Sets the sentCcMe property value. Indicates whether the owner of the mailbox must be in the ccRecipients property of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the sentCcMe property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSentCcMe(@javax.annotation.Nullable final Boolean value) {
        this._sentCcMe = value;
    }
    /**
     * Sets the sentOnlyToMe property value. Indicates whether the owner of the mailbox must be the only recipient in an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the sentOnlyToMe property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSentOnlyToMe(@javax.annotation.Nullable final Boolean value) {
        this._sentOnlyToMe = value;
    }
    /**
     * Sets the sentToAddresses property value. Represents the email addresses that an incoming message must have been sent to in order for the condition or exception to apply.
     * @param value Value to set for the sentToAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSentToAddresses(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this._sentToAddresses = value;
    }
    /**
     * Sets the sentToMe property value. Indicates whether the owner of the mailbox must be in the toRecipients property of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the sentToMe property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSentToMe(@javax.annotation.Nullable final Boolean value) {
        this._sentToMe = value;
    }
    /**
     * Sets the sentToOrCcMe property value. Indicates whether the owner of the mailbox must be in either a toRecipients or ccRecipients property of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the sentToOrCcMe property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSentToOrCcMe(@javax.annotation.Nullable final Boolean value) {
        this._sentToOrCcMe = value;
    }
    /**
     * Sets the subjectContains property value. Represents the strings that appear in the subject of an incoming message in order for the condition or exception to apply.
     * @param value Value to set for the subjectContains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectContains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._subjectContains = value;
    }
    /**
     * Sets the withinSizeRange property value. Represents the minimum and maximum sizes (in kilobytes) that an incoming message must fall in between in order for the condition or exception to apply.
     * @param value Value to set for the withinSizeRange property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWithinSizeRange(@javax.annotation.Nullable final SizeRange value) {
        this._withinSizeRange = value;
    }
}
