package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MailTips implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Mail tips for automatic reply if it has been set up by the recipient. */
    private AutomaticRepliesMailTips _automaticReplies;
    /** A custom mail tip that can be set on the recipient's mailbox. */
    private String _customMailTip;
    /** Whether the recipient's mailbox is restricted, for example, accepting messages from only a predefined list of senders, rejecting messages from a predefined list of senders, or accepting messages from only authenticated senders. */
    private Boolean _deliveryRestricted;
    /** The email address of the recipient to get mailtips for. */
    private EmailAddress _emailAddress;
    /** Errors that occur during the getMailTips action. */
    private MailTipsError _error;
    /** The number of external members if the recipient is a distribution list. */
    private Integer _externalMemberCount;
    /** Whether sending messages to the recipient requires approval. For example, if the recipient is a large distribution list and a moderator has been set up to approve messages sent to that distribution list, or if sending messages to a recipient requires approval of the recipient's manager. */
    private Boolean _isModerated;
    /** The mailbox full status of the recipient. */
    private Boolean _mailboxFull;
    /** The maximum message size that has been configured for the recipient's organization or mailbox. */
    private Integer _maxMessageSize;
    /** The OdataType property */
    private String _odataType;
    /** The scope of the recipient. Possible values are: none, internal, external, externalPartner, externalNonParther. For example, an administrator can set another organization to be its 'partner'. The scope is useful if an administrator wants certain mailtips to be accessible to certain scopes. It's also useful to senders to inform them that their message may leave the organization, helping them make the correct decisions about wording, tone and content. */
    private RecipientScopeType _recipientScope;
    /** Recipients suggested based on previous contexts where they appear in the same message. */
    private java.util.List<Recipient> _recipientSuggestions;
    /** The number of members if the recipient is a distribution list. */
    private Integer _totalMemberCount;
    /**
     * Instantiates a new mailTips and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MailTips() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.mailTips");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mailTips
     */
    @javax.annotation.Nonnull
    public static MailTips createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailTips();
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
     * Gets the automaticReplies property value. Mail tips for automatic reply if it has been set up by the recipient.
     * @return a automaticRepliesMailTips
     */
    @javax.annotation.Nullable
    public AutomaticRepliesMailTips getAutomaticReplies() {
        return this._automaticReplies;
    }
    /**
     * Gets the customMailTip property value. A custom mail tip that can be set on the recipient's mailbox.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomMailTip() {
        return this._customMailTip;
    }
    /**
     * Gets the deliveryRestricted property value. Whether the recipient's mailbox is restricted, for example, accepting messages from only a predefined list of senders, rejecting messages from a predefined list of senders, or accepting messages from only authenticated senders.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeliveryRestricted() {
        return this._deliveryRestricted;
    }
    /**
     * Gets the emailAddress property value. The email address of the recipient to get mailtips for.
     * @return a emailAddress
     */
    @javax.annotation.Nullable
    public EmailAddress getEmailAddress() {
        return this._emailAddress;
    }
    /**
     * Gets the error property value. Errors that occur during the getMailTips action.
     * @return a mailTipsError
     */
    @javax.annotation.Nullable
    public MailTipsError getError() {
        return this._error;
    }
    /**
     * Gets the externalMemberCount property value. The number of external members if the recipient is a distribution list.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getExternalMemberCount() {
        return this._externalMemberCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MailTips currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(13);
        deserializerMap.put("automaticReplies", (n) -> { currentObject.setAutomaticReplies(n.getObjectValue(AutomaticRepliesMailTips::createFromDiscriminatorValue)); });
        deserializerMap.put("customMailTip", (n) -> { currentObject.setCustomMailTip(n.getStringValue()); });
        deserializerMap.put("deliveryRestricted", (n) -> { currentObject.setDeliveryRestricted(n.getBooleanValue()); });
        deserializerMap.put("emailAddress", (n) -> { currentObject.setEmailAddress(n.getObjectValue(EmailAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("error", (n) -> { currentObject.setError(n.getObjectValue(MailTipsError::createFromDiscriminatorValue)); });
        deserializerMap.put("externalMemberCount", (n) -> { currentObject.setExternalMemberCount(n.getIntegerValue()); });
        deserializerMap.put("isModerated", (n) -> { currentObject.setIsModerated(n.getBooleanValue()); });
        deserializerMap.put("mailboxFull", (n) -> { currentObject.setMailboxFull(n.getBooleanValue()); });
        deserializerMap.put("maxMessageSize", (n) -> { currentObject.setMaxMessageSize(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("recipientScope", (n) -> { currentObject.setRecipientScope(n.getEnumValue(RecipientScopeType.class)); });
        deserializerMap.put("recipientSuggestions", (n) -> { currentObject.setRecipientSuggestions(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("totalMemberCount", (n) -> { currentObject.setTotalMemberCount(n.getIntegerValue()); });
        return deserializerMap
    }
    /**
     * Gets the isModerated property value. Whether sending messages to the recipient requires approval. For example, if the recipient is a large distribution list and a moderator has been set up to approve messages sent to that distribution list, or if sending messages to a recipient requires approval of the recipient's manager.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsModerated() {
        return this._isModerated;
    }
    /**
     * Gets the mailboxFull property value. The mailbox full status of the recipient.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMailboxFull() {
        return this._mailboxFull;
    }
    /**
     * Gets the maxMessageSize property value. The maximum message size that has been configured for the recipient's organization or mailbox.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxMessageSize() {
        return this._maxMessageSize;
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
     * Gets the recipientScope property value. The scope of the recipient. Possible values are: none, internal, external, externalPartner, externalNonParther. For example, an administrator can set another organization to be its 'partner'. The scope is useful if an administrator wants certain mailtips to be accessible to certain scopes. It's also useful to senders to inform them that their message may leave the organization, helping them make the correct decisions about wording, tone and content.
     * @return a recipientScopeType
     */
    @javax.annotation.Nullable
    public RecipientScopeType getRecipientScope() {
        return this._recipientScope;
    }
    /**
     * Gets the recipientSuggestions property value. Recipients suggested based on previous contexts where they appear in the same message.
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getRecipientSuggestions() {
        return this._recipientSuggestions;
    }
    /**
     * Gets the totalMemberCount property value. The number of members if the recipient is a distribution list.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalMemberCount() {
        return this._totalMemberCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("automaticReplies", this.getAutomaticReplies());
        writer.writeStringValue("customMailTip", this.getCustomMailTip());
        writer.writeBooleanValue("deliveryRestricted", this.getDeliveryRestricted());
        writer.writeObjectValue("emailAddress", this.getEmailAddress());
        writer.writeObjectValue("error", this.getError());
        writer.writeIntegerValue("externalMemberCount", this.getExternalMemberCount());
        writer.writeBooleanValue("isModerated", this.getIsModerated());
        writer.writeBooleanValue("mailboxFull", this.getMailboxFull());
        writer.writeIntegerValue("maxMessageSize", this.getMaxMessageSize());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("recipientScope", this.getRecipientScope());
        writer.writeCollectionOfObjectValues("recipientSuggestions", this.getRecipientSuggestions());
        writer.writeIntegerValue("totalMemberCount", this.getTotalMemberCount());
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
     * Sets the automaticReplies property value. Mail tips for automatic reply if it has been set up by the recipient.
     * @param value Value to set for the automaticReplies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutomaticReplies(@javax.annotation.Nullable final AutomaticRepliesMailTips value) {
        this._automaticReplies = value;
    }
    /**
     * Sets the customMailTip property value. A custom mail tip that can be set on the recipient's mailbox.
     * @param value Value to set for the customMailTip property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomMailTip(@javax.annotation.Nullable final String value) {
        this._customMailTip = value;
    }
    /**
     * Sets the deliveryRestricted property value. Whether the recipient's mailbox is restricted, for example, accepting messages from only a predefined list of senders, rejecting messages from a predefined list of senders, or accepting messages from only authenticated senders.
     * @param value Value to set for the deliveryRestricted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeliveryRestricted(@javax.annotation.Nullable final Boolean value) {
        this._deliveryRestricted = value;
    }
    /**
     * Sets the emailAddress property value. The email address of the recipient to get mailtips for.
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailAddress(@javax.annotation.Nullable final EmailAddress value) {
        this._emailAddress = value;
    }
    /**
     * Sets the error property value. Errors that occur during the getMailTips action.
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final MailTipsError value) {
        this._error = value;
    }
    /**
     * Sets the externalMemberCount property value. The number of external members if the recipient is a distribution list.
     * @param value Value to set for the externalMemberCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalMemberCount(@javax.annotation.Nullable final Integer value) {
        this._externalMemberCount = value;
    }
    /**
     * Sets the isModerated property value. Whether sending messages to the recipient requires approval. For example, if the recipient is a large distribution list and a moderator has been set up to approve messages sent to that distribution list, or if sending messages to a recipient requires approval of the recipient's manager.
     * @param value Value to set for the isModerated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsModerated(@javax.annotation.Nullable final Boolean value) {
        this._isModerated = value;
    }
    /**
     * Sets the mailboxFull property value. The mailbox full status of the recipient.
     * @param value Value to set for the mailboxFull property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMailboxFull(@javax.annotation.Nullable final Boolean value) {
        this._mailboxFull = value;
    }
    /**
     * Sets the maxMessageSize property value. The maximum message size that has been configured for the recipient's organization or mailbox.
     * @param value Value to set for the maxMessageSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxMessageSize(@javax.annotation.Nullable final Integer value) {
        this._maxMessageSize = value;
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
     * Sets the recipientScope property value. The scope of the recipient. Possible values are: none, internal, external, externalPartner, externalNonParther. For example, an administrator can set another organization to be its 'partner'. The scope is useful if an administrator wants certain mailtips to be accessible to certain scopes. It's also useful to senders to inform them that their message may leave the organization, helping them make the correct decisions about wording, tone and content.
     * @param value Value to set for the recipientScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipientScope(@javax.annotation.Nullable final RecipientScopeType value) {
        this._recipientScope = value;
    }
    /**
     * Sets the recipientSuggestions property value. Recipients suggested based on previous contexts where they appear in the same message.
     * @param value Value to set for the recipientSuggestions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipientSuggestions(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this._recipientSuggestions = value;
    }
    /**
     * Sets the totalMemberCount property value. The number of members if the recipient is a distribution list.
     * @param value Value to set for the totalMemberCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalMemberCount(@javax.annotation.Nullable final Integer value) {
        this._totalMemberCount = value;
    }
}
