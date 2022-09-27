package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MailboxSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Folder ID of an archive folder for the user. */
    private String _archiveFolder;
    /** Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user. */
    private AutomaticRepliesSetting _automaticRepliesSetting;
    /** The date format for the user's mailbox. */
    private String _dateFormat;
    /** If the user has a calendar delegate, this specifies whether the delegate, mailbox owner, or both receive meeting messages and meeting responses. Possible values are: sendToDelegateAndInformationToPrincipal, sendToDelegateAndPrincipal, sendToDelegateOnly. */
    private DelegateMeetingMessageDeliveryOptions _delegateMeetingMessageDeliveryOptions;
    /** The locale information for the user, including the preferred language and country/region. */
    private LocaleInfo _language;
    /** The OdataType property */
    private String _odataType;
    /** The time format for the user's mailbox. */
    private String _timeFormat;
    /** The default time zone for the user's mailbox. */
    private String _timeZone;
    /** The userPurpose property */
    private UserPurpose _userPurpose;
    /** The days of the week and hours in a specific time zone that the user works. */
    private WorkingHours _workingHours;
    /**
     * Instantiates a new mailboxSettings and sets the default values.
     * @return a void
     */
    public MailboxSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.mailboxSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mailboxSettings
     */
    @javax.annotation.Nonnull
    public static MailboxSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailboxSettings();
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
     * Gets the archiveFolder property value. Folder ID of an archive folder for the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getArchiveFolder() {
        return this._archiveFolder;
    }
    /**
     * Gets the automaticRepliesSetting property value. Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user.
     * @return a automaticRepliesSetting
     */
    @javax.annotation.Nullable
    public AutomaticRepliesSetting getAutomaticRepliesSetting() {
        return this._automaticRepliesSetting;
    }
    /**
     * Gets the dateFormat property value. The date format for the user's mailbox.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDateFormat() {
        return this._dateFormat;
    }
    /**
     * Gets the delegateMeetingMessageDeliveryOptions property value. If the user has a calendar delegate, this specifies whether the delegate, mailbox owner, or both receive meeting messages and meeting responses. Possible values are: sendToDelegateAndInformationToPrincipal, sendToDelegateAndPrincipal, sendToDelegateOnly.
     * @return a delegateMeetingMessageDeliveryOptions
     */
    @javax.annotation.Nullable
    public DelegateMeetingMessageDeliveryOptions getDelegateMeetingMessageDeliveryOptions() {
        return this._delegateMeetingMessageDeliveryOptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MailboxSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(10) {{
            this.put("archiveFolder", (n) -> { currentObject.setArchiveFolder(n.getStringValue()); });
            this.put("automaticRepliesSetting", (n) -> { currentObject.setAutomaticRepliesSetting(n.getObjectValue(AutomaticRepliesSetting::createFromDiscriminatorValue)); });
            this.put("dateFormat", (n) -> { currentObject.setDateFormat(n.getStringValue()); });
            this.put("delegateMeetingMessageDeliveryOptions", (n) -> { currentObject.setDelegateMeetingMessageDeliveryOptions(n.getEnumValue(DelegateMeetingMessageDeliveryOptions.class)); });
            this.put("language", (n) -> { currentObject.setLanguage(n.getObjectValue(LocaleInfo::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("timeFormat", (n) -> { currentObject.setTimeFormat(n.getStringValue()); });
            this.put("timeZone", (n) -> { currentObject.setTimeZone(n.getStringValue()); });
            this.put("userPurpose", (n) -> { currentObject.setUserPurpose(n.getEnumValue(UserPurpose.class)); });
            this.put("workingHours", (n) -> { currentObject.setWorkingHours(n.getObjectValue(WorkingHours::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the language property value. The locale information for the user, including the preferred language and country/region.
     * @return a localeInfo
     */
    @javax.annotation.Nullable
    public LocaleInfo getLanguage() {
        return this._language;
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
     * Gets the timeFormat property value. The time format for the user's mailbox.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeFormat() {
        return this._timeFormat;
    }
    /**
     * Gets the timeZone property value. The default time zone for the user's mailbox.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeZone() {
        return this._timeZone;
    }
    /**
     * Gets the userPurpose property value. The userPurpose property
     * @return a userPurpose
     */
    @javax.annotation.Nullable
    public UserPurpose getUserPurpose() {
        return this._userPurpose;
    }
    /**
     * Gets the workingHours property value. The days of the week and hours in a specific time zone that the user works.
     * @return a workingHours
     */
    @javax.annotation.Nullable
    public WorkingHours getWorkingHours() {
        return this._workingHours;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the archiveFolder property value. Folder ID of an archive folder for the user.
     * @param value Value to set for the archiveFolder property.
     * @return a void
     */
    public void setArchiveFolder(@javax.annotation.Nullable final String value) {
        this._archiveFolder = value;
    }
    /**
     * Sets the automaticRepliesSetting property value. Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user.
     * @param value Value to set for the automaticRepliesSetting property.
     * @return a void
     */
    public void setAutomaticRepliesSetting(@javax.annotation.Nullable final AutomaticRepliesSetting value) {
        this._automaticRepliesSetting = value;
    }
    /**
     * Sets the dateFormat property value. The date format for the user's mailbox.
     * @param value Value to set for the dateFormat property.
     * @return a void
     */
    public void setDateFormat(@javax.annotation.Nullable final String value) {
        this._dateFormat = value;
    }
    /**
     * Sets the delegateMeetingMessageDeliveryOptions property value. If the user has a calendar delegate, this specifies whether the delegate, mailbox owner, or both receive meeting messages and meeting responses. Possible values are: sendToDelegateAndInformationToPrincipal, sendToDelegateAndPrincipal, sendToDelegateOnly.
     * @param value Value to set for the delegateMeetingMessageDeliveryOptions property.
     * @return a void
     */
    public void setDelegateMeetingMessageDeliveryOptions(@javax.annotation.Nullable final DelegateMeetingMessageDeliveryOptions value) {
        this._delegateMeetingMessageDeliveryOptions = value;
    }
    /**
     * Sets the language property value. The locale information for the user, including the preferred language and country/region.
     * @param value Value to set for the language property.
     * @return a void
     */
    public void setLanguage(@javax.annotation.Nullable final LocaleInfo value) {
        this._language = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the timeFormat property value. The time format for the user's mailbox.
     * @param value Value to set for the timeFormat property.
     * @return a void
     */
    public void setTimeFormat(@javax.annotation.Nullable final String value) {
        this._timeFormat = value;
    }
    /**
     * Sets the timeZone property value. The default time zone for the user's mailbox.
     * @param value Value to set for the timeZone property.
     * @return a void
     */
    public void setTimeZone(@javax.annotation.Nullable final String value) {
        this._timeZone = value;
    }
    /**
     * Sets the userPurpose property value. The userPurpose property
     * @param value Value to set for the userPurpose property.
     * @return a void
     */
    public void setUserPurpose(@javax.annotation.Nullable final UserPurpose value) {
        this._userPurpose = value;
    }
    /**
     * Sets the workingHours property value. The days of the week and hours in a specific time zone that the user works.
     * @param value Value to set for the workingHours property.
     * @return a void
     */
    public void setWorkingHours(@javax.annotation.Nullable final WorkingHours value) {
        this._workingHours = value;
    }
}
