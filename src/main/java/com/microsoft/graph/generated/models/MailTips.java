package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailTips implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link MailTips} and sets the default values.
     */
    public MailTips() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MailTips}
     */
    @jakarta.annotation.Nonnull
    public static MailTips createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailTips();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the automaticReplies property value. Mail tips for automatic reply if it has been set up by the recipient.
     * @return a {@link AutomaticRepliesMailTips}
     */
    @jakarta.annotation.Nullable
    public AutomaticRepliesMailTips getAutomaticReplies() {
        return this.backingStore.get("automaticReplies");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the customMailTip property value. A custom mail tip that can be set on the recipient's mailbox.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomMailTip() {
        return this.backingStore.get("customMailTip");
    }
    /**
     * Gets the deliveryRestricted property value. Whether the recipient's mailbox is restricted, for example, accepting messages from only a predefined list of senders, rejecting messages from a predefined list of senders, or accepting messages from only authenticated senders.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeliveryRestricted() {
        return this.backingStore.get("deliveryRestricted");
    }
    /**
     * Gets the emailAddress property value. The email address of the recipient to get mailtips for.
     * @return a {@link EmailAddress}
     */
    @jakarta.annotation.Nullable
    public EmailAddress getEmailAddress() {
        return this.backingStore.get("emailAddress");
    }
    /**
     * Gets the error property value. Errors that occur during the getMailTips action.
     * @return a {@link MailTipsError}
     */
    @jakarta.annotation.Nullable
    public MailTipsError getError() {
        return this.backingStore.get("error");
    }
    /**
     * Gets the externalMemberCount property value. The number of external members if the recipient is a distribution list.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExternalMemberCount() {
        return this.backingStore.get("externalMemberCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("automaticReplies", (n) -> { this.setAutomaticReplies(n.getObjectValue(AutomaticRepliesMailTips::createFromDiscriminatorValue)); });
        deserializerMap.put("customMailTip", (n) -> { this.setCustomMailTip(n.getStringValue()); });
        deserializerMap.put("deliveryRestricted", (n) -> { this.setDeliveryRestricted(n.getBooleanValue()); });
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getObjectValue(EmailAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(MailTipsError::createFromDiscriminatorValue)); });
        deserializerMap.put("externalMemberCount", (n) -> { this.setExternalMemberCount(n.getIntegerValue()); });
        deserializerMap.put("isModerated", (n) -> { this.setIsModerated(n.getBooleanValue()); });
        deserializerMap.put("mailboxFull", (n) -> { this.setMailboxFull(n.getBooleanValue()); });
        deserializerMap.put("maxMessageSize", (n) -> { this.setMaxMessageSize(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recipientScope", (n) -> { this.setRecipientScope(n.getEnumSetValue(RecipientScopeType::forValue)); });
        deserializerMap.put("recipientSuggestions", (n) -> { this.setRecipientSuggestions(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("totalMemberCount", (n) -> { this.setTotalMemberCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isModerated property value. Whether sending messages to the recipient requires approval. For example, if the recipient is a large distribution list and a moderator has been set up to approve messages sent to that distribution list, or if sending messages to a recipient requires approval of the recipient's manager.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsModerated() {
        return this.backingStore.get("isModerated");
    }
    /**
     * Gets the mailboxFull property value. The mailbox full status of the recipient.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMailboxFull() {
        return this.backingStore.get("mailboxFull");
    }
    /**
     * Gets the maxMessageSize property value. The maximum message size that has been configured for the recipient's organization or mailbox.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxMessageSize() {
        return this.backingStore.get("maxMessageSize");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the recipientScope property value. The scope of the recipient. Possible values are: none, internal, external, externalPartner, externalNonParther. For example, an administrator can set another organization to be its 'partner'. The scope is useful if an administrator wants certain mailtips to be accessible to certain scopes. It's also useful to senders to inform them that their message may leave the organization, helping them make the correct decisions about wording, tone and content.
     * @return a {@link EnumSet<RecipientScopeType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<RecipientScopeType> getRecipientScope() {
        return this.backingStore.get("recipientScope");
    }
    /**
     * Gets the recipientSuggestions property value. Recipients suggested based on previous contexts where they appear in the same message.
     * @return a {@link java.util.List<Recipient>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getRecipientSuggestions() {
        return this.backingStore.get("recipientSuggestions");
    }
    /**
     * Gets the totalMemberCount property value. The number of members if the recipient is a distribution list.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalMemberCount() {
        return this.backingStore.get("totalMemberCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeEnumSetValue("recipientScope", this.getRecipientScope());
        writer.writeCollectionOfObjectValues("recipientSuggestions", this.getRecipientSuggestions());
        writer.writeIntegerValue("totalMemberCount", this.getTotalMemberCount());
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
     * Sets the automaticReplies property value. Mail tips for automatic reply if it has been set up by the recipient.
     * @param value Value to set for the automaticReplies property.
     */
    public void setAutomaticReplies(@jakarta.annotation.Nullable final AutomaticRepliesMailTips value) {
        this.backingStore.set("automaticReplies", value);
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
     * Sets the customMailTip property value. A custom mail tip that can be set on the recipient's mailbox.
     * @param value Value to set for the customMailTip property.
     */
    public void setCustomMailTip(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customMailTip", value);
    }
    /**
     * Sets the deliveryRestricted property value. Whether the recipient's mailbox is restricted, for example, accepting messages from only a predefined list of senders, rejecting messages from a predefined list of senders, or accepting messages from only authenticated senders.
     * @param value Value to set for the deliveryRestricted property.
     */
    public void setDeliveryRestricted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deliveryRestricted", value);
    }
    /**
     * Sets the emailAddress property value. The email address of the recipient to get mailtips for.
     * @param value Value to set for the emailAddress property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final EmailAddress value) {
        this.backingStore.set("emailAddress", value);
    }
    /**
     * Sets the error property value. Errors that occur during the getMailTips action.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final MailTipsError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the externalMemberCount property value. The number of external members if the recipient is a distribution list.
     * @param value Value to set for the externalMemberCount property.
     */
    public void setExternalMemberCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("externalMemberCount", value);
    }
    /**
     * Sets the isModerated property value. Whether sending messages to the recipient requires approval. For example, if the recipient is a large distribution list and a moderator has been set up to approve messages sent to that distribution list, or if sending messages to a recipient requires approval of the recipient's manager.
     * @param value Value to set for the isModerated property.
     */
    public void setIsModerated(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isModerated", value);
    }
    /**
     * Sets the mailboxFull property value. The mailbox full status of the recipient.
     * @param value Value to set for the mailboxFull property.
     */
    public void setMailboxFull(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("mailboxFull", value);
    }
    /**
     * Sets the maxMessageSize property value. The maximum message size that has been configured for the recipient's organization or mailbox.
     * @param value Value to set for the maxMessageSize property.
     */
    public void setMaxMessageSize(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maxMessageSize", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recipientScope property value. The scope of the recipient. Possible values are: none, internal, external, externalPartner, externalNonParther. For example, an administrator can set another organization to be its 'partner'. The scope is useful if an administrator wants certain mailtips to be accessible to certain scopes. It's also useful to senders to inform them that their message may leave the organization, helping them make the correct decisions about wording, tone and content.
     * @param value Value to set for the recipientScope property.
     */
    public void setRecipientScope(@jakarta.annotation.Nullable final EnumSet<RecipientScopeType> value) {
        this.backingStore.set("recipientScope", value);
    }
    /**
     * Sets the recipientSuggestions property value. Recipients suggested based on previous contexts where they appear in the same message.
     * @param value Value to set for the recipientSuggestions property.
     */
    public void setRecipientSuggestions(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.backingStore.set("recipientSuggestions", value);
    }
    /**
     * Sets the totalMemberCount property value. The number of members if the recipient is a distribution list.
     * @param value Value to set for the totalMemberCount property.
     */
    public void setTotalMemberCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalMemberCount", value);
    }
}
