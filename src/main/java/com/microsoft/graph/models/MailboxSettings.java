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
public class MailboxSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore backingStore;
    /**
     * Instantiates a new MailboxSettings and sets the default values.
     */
    public MailboxSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MailboxSettings
     */
    @jakarta.annotation.Nonnull
    public static MailboxSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailboxSettings();
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
     * Gets the archiveFolder property value. Folder ID of an archive folder for the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getArchiveFolder() {
        return this.backingStore.get("archiveFolder");
    }
    /**
     * Gets the automaticRepliesSetting property value. Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user.
     * @return a AutomaticRepliesSetting
     */
    @jakarta.annotation.Nullable
    public AutomaticRepliesSetting getAutomaticRepliesSetting() {
        return this.backingStore.get("automaticRepliesSetting");
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
     * Gets the dateFormat property value. The date format for the user's mailbox.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDateFormat() {
        return this.backingStore.get("dateFormat");
    }
    /**
     * Gets the delegateMeetingMessageDeliveryOptions property value. If the user has a calendar delegate, this specifies whether the delegate, mailbox owner, or both receive meeting messages and meeting responses. Possible values are: sendToDelegateAndInformationToPrincipal, sendToDelegateAndPrincipal, sendToDelegateOnly.
     * @return a DelegateMeetingMessageDeliveryOptions
     */
    @jakarta.annotation.Nullable
    public DelegateMeetingMessageDeliveryOptions getDelegateMeetingMessageDeliveryOptions() {
        return this.backingStore.get("delegateMeetingMessageDeliveryOptions");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("archiveFolder", (n) -> { this.setArchiveFolder(n.getStringValue()); });
        deserializerMap.put("automaticRepliesSetting", (n) -> { this.setAutomaticRepliesSetting(n.getObjectValue(AutomaticRepliesSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("dateFormat", (n) -> { this.setDateFormat(n.getStringValue()); });
        deserializerMap.put("delegateMeetingMessageDeliveryOptions", (n) -> { this.setDelegateMeetingMessageDeliveryOptions(n.getEnumValue(DelegateMeetingMessageDeliveryOptions.class)); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getObjectValue(LocaleInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("timeFormat", (n) -> { this.setTimeFormat(n.getStringValue()); });
        deserializerMap.put("timeZone", (n) -> { this.setTimeZone(n.getStringValue()); });
        deserializerMap.put("userPurpose", (n) -> { this.setUserPurpose(n.getEnumValue(UserPurpose.class)); });
        deserializerMap.put("workingHours", (n) -> { this.setWorkingHours(n.getObjectValue(WorkingHours::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the language property value. The locale information for the user, including the preferred language and country/region.
     * @return a LocaleInfo
     */
    @jakarta.annotation.Nullable
    public LocaleInfo getLanguage() {
        return this.backingStore.get("language");
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
     * Gets the timeFormat property value. The time format for the user's mailbox.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTimeFormat() {
        return this.backingStore.get("timeFormat");
    }
    /**
     * Gets the timeZone property value. The default time zone for the user's mailbox.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTimeZone() {
        return this.backingStore.get("timeZone");
    }
    /**
     * Gets the userPurpose property value. The purpose of the mailbox. Differentiates a mailbox for a single user from a shared mailbox and equipment mailbox in Exchange Online. Possible values are: user, linked, shared, room, equipment, others, unknownFutureValue. Read-only.
     * @return a UserPurpose
     */
    @jakarta.annotation.Nullable
    public UserPurpose getUserPurpose() {
        return this.backingStore.get("userPurpose");
    }
    /**
     * Gets the workingHours property value. The days of the week and hours in a specific time zone that the user works.
     * @return a WorkingHours
     */
    @jakarta.annotation.Nullable
    public WorkingHours getWorkingHours() {
        return this.backingStore.get("workingHours");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("archiveFolder", this.getArchiveFolder());
        writer.writeObjectValue("automaticRepliesSetting", this.getAutomaticRepliesSetting());
        writer.writeStringValue("dateFormat", this.getDateFormat());
        writer.writeEnumValue("delegateMeetingMessageDeliveryOptions", this.getDelegateMeetingMessageDeliveryOptions());
        writer.writeObjectValue("language", this.getLanguage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("timeFormat", this.getTimeFormat());
        writer.writeStringValue("timeZone", this.getTimeZone());
        writer.writeEnumValue("userPurpose", this.getUserPurpose());
        writer.writeObjectValue("workingHours", this.getWorkingHours());
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
     * Sets the archiveFolder property value. Folder ID of an archive folder for the user.
     * @param value Value to set for the archiveFolder property.
     */
    public void setArchiveFolder(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("archiveFolder", value);
    }
    /**
     * Sets the automaticRepliesSetting property value. Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user.
     * @param value Value to set for the automaticRepliesSetting property.
     */
    public void setAutomaticRepliesSetting(@jakarta.annotation.Nullable final AutomaticRepliesSetting value) {
        this.backingStore.set("automaticRepliesSetting", value);
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
     * Sets the dateFormat property value. The date format for the user's mailbox.
     * @param value Value to set for the dateFormat property.
     */
    public void setDateFormat(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dateFormat", value);
    }
    /**
     * Sets the delegateMeetingMessageDeliveryOptions property value. If the user has a calendar delegate, this specifies whether the delegate, mailbox owner, or both receive meeting messages and meeting responses. Possible values are: sendToDelegateAndInformationToPrincipal, sendToDelegateAndPrincipal, sendToDelegateOnly.
     * @param value Value to set for the delegateMeetingMessageDeliveryOptions property.
     */
    public void setDelegateMeetingMessageDeliveryOptions(@jakarta.annotation.Nullable final DelegateMeetingMessageDeliveryOptions value) {
        this.backingStore.set("delegateMeetingMessageDeliveryOptions", value);
    }
    /**
     * Sets the language property value. The locale information for the user, including the preferred language and country/region.
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final LocaleInfo value) {
        this.backingStore.set("language", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the timeFormat property value. The time format for the user's mailbox.
     * @param value Value to set for the timeFormat property.
     */
    public void setTimeFormat(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("timeFormat", value);
    }
    /**
     * Sets the timeZone property value. The default time zone for the user's mailbox.
     * @param value Value to set for the timeZone property.
     */
    public void setTimeZone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("timeZone", value);
    }
    /**
     * Sets the userPurpose property value. The purpose of the mailbox. Differentiates a mailbox for a single user from a shared mailbox and equipment mailbox in Exchange Online. Possible values are: user, linked, shared, room, equipment, others, unknownFutureValue. Read-only.
     * @param value Value to set for the userPurpose property.
     */
    public void setUserPurpose(@jakarta.annotation.Nullable final UserPurpose value) {
        this.backingStore.set("userPurpose", value);
    }
    /**
     * Sets the workingHours property value. The days of the week and hours in a specific time zone that the user works.
     * @param value Value to set for the workingHours property.
     */
    public void setWorkingHours(@jakarta.annotation.Nullable final WorkingHours value) {
        this.backingStore.set("workingHours", value);
    }
}
