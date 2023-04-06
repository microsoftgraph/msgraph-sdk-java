package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /** Possible values of the compliance app list. */
    private AppListType compliantAppListType;
    /** List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements. */
    private java.util.List<AppListItem> compliantAppsList;
    /** An email address lacking a suffix that matches any of these strings will be considered out-of-domain. */
    private java.util.List<String> emailInDomainSuffixes;
    /** Block simple passwords. */
    private Boolean passwordBlockSimple;
    /** Number of days before the password expires. */
    private Integer passwordExpirationDays;
    /** Number of character sets a password must contain. Valid values 0 to 4 */
    private Integer passwordMinimumCharacterSetCount;
    /** Minimum length of passwords. */
    private Integer passwordMinimumLength;
    /** Minutes of inactivity required before a password is required. */
    private Integer passwordMinutesOfInactivityBeforeLock;
    /** Minutes of inactivity required before the screen times out. */
    private Integer passwordMinutesOfInactivityBeforeScreenTimeout;
    /** Number of previous passwords to block. */
    private Integer passwordPreviousPasswordBlockCount;
    /** Whether or not to require a password. */
    private Boolean passwordRequired;
    /** Possible values of required passwords. */
    private RequiredPasswordType passwordRequiredType;
    /**
     * Instantiates a new MacOSGeneralDeviceConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSGeneralDeviceConfiguration
     */
    @javax.annotation.Nonnull
    public static MacOSGeneralDeviceConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSGeneralDeviceConfiguration();
    }
    /**
     * Gets the compliantAppListType property value. Possible values of the compliance app list.
     * @return a appListType
     */
    @javax.annotation.Nullable
    public AppListType getCompliantAppListType() {
        return this.compliantAppListType;
    }
    /**
     * Gets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getCompliantAppsList() {
        return this.compliantAppsList;
    }
    /**
     * Gets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEmailInDomainSuffixes() {
        return this.emailInDomainSuffixes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("compliantAppListType", (n) -> { this.setCompliantAppListType(n.getEnumValue(AppListType.class)); });
        deserializerMap.put("compliantAppsList", (n) -> { this.setCompliantAppsList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("emailInDomainSuffixes", (n) -> { this.setEmailInDomainSuffixes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("passwordBlockSimple", (n) -> { this.setPasswordBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumCharacterSetCount", (n) -> { this.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeLock", (n) -> { this.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { this.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the passwordBlockSimple property value. Block simple passwords.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this.passwordBlockSimple;
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. Number of character sets a password must contain. Valid values 0 to 4
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this.passwordMinimumCharacterSetCount;
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum length of passwords.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity required before a password is required.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeLock() {
        return this.passwordMinutesOfInactivityBeforeLock;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity required before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Whether or not to require a password.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.passwordRequired;
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a requiredPasswordType
     */
    @javax.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this.passwordRequiredType;
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
        writer.writeEnumValue("compliantAppListType", this.getCompliantAppListType());
        writer.writeCollectionOfObjectValues("compliantAppsList", this.getCompliantAppsList());
        writer.writeCollectionOfPrimitiveValues("emailInDomainSuffixes", this.getEmailInDomainSuffixes());
        writer.writeBooleanValue("passwordBlockSimple", this.getPasswordBlockSimple());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumCharacterSetCount", this.getPasswordMinimumCharacterSetCount());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeLock", this.getPasswordMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeScreenTimeout", this.getPasswordMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
    }
    /**
     * Sets the compliantAppListType property value. Possible values of the compliance app list.
     * @param value Value to set for the compliantAppListType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliantAppListType(@javax.annotation.Nullable final AppListType value) {
        this.compliantAppListType = value;
    }
    /**
     * Sets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the compliantAppsList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliantAppsList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this.compliantAppsList = value;
    }
    /**
     * Sets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @param value Value to set for the emailInDomainSuffixes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailInDomainSuffixes(@javax.annotation.Nullable final java.util.List<String> value) {
        this.emailInDomainSuffixes = value;
    }
    /**
     * Sets the passwordBlockSimple property value. Block simple passwords.
     * @param value Value to set for the passwordBlockSimple property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockSimple(@javax.annotation.Nullable final Boolean value) {
        this.passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires.
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this.passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. Number of character sets a password must contain. Valid values 0 to 4
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumCharacterSetCount(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum length of passwords.
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity required before a password is required.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeLock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesOfInactivityBeforeLock(@javax.annotation.Nullable final Integer value) {
        this.passwordMinutesOfInactivityBeforeLock = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity required before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this.passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block.
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this.passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Whether or not to require a password.
     * @param value Value to set for the passwordRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequired(@javax.annotation.Nullable final Boolean value) {
        this.passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequiredType(@javax.annotation.Nullable final RequiredPasswordType value) {
        this.passwordRequiredType = value;
    }
}
