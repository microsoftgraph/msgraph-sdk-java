// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.RequiredPasswordType;
import com.microsoft.graph.models.DeviceCompliancePolicy;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81Compliance Policy.
 */
public class WindowsPhone81CompliancePolicy extends DeviceCompliancePolicy implements IJsonBackedObject {


    /**
     * The Os Maximum Version.
     * Maximum Windows Phone version.
     */
    @SerializedName(value = "osMaximumVersion", alternate = {"OsMaximumVersion"})
    @Expose
	@Nullable
    public String osMaximumVersion;

    /**
     * The Os Minimum Version.
     * Minimum Windows Phone version.
     */
    @SerializedName(value = "osMinimumVersion", alternate = {"OsMinimumVersion"})
    @Expose
	@Nullable
    public String osMinimumVersion;

    /**
     * The Password Block Simple.
     * Whether or not to block syncing the calendar.
     */
    @SerializedName(value = "passwordBlockSimple", alternate = {"PasswordBlockSimple"})
    @Expose
	@Nullable
    public Boolean passwordBlockSimple;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires.
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
	@Nullable
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Character Set Count.
     * The number of character sets required in the password.
     */
    @SerializedName(value = "passwordMinimumCharacterSetCount", alternate = {"PasswordMinimumCharacterSetCount"})
    @Expose
	@Nullable
    public Integer passwordMinimumCharacterSetCount;

    /**
     * The Password Minimum Length.
     * Minimum length of passwords.
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
	@Nullable
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Lock.
     * Minutes of inactivity before a password is required.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeLock", alternate = {"PasswordMinutesOfInactivityBeforeLock"})
    @Expose
	@Nullable
    public Integer passwordMinutesOfInactivityBeforeLock;

    /**
     * The Password Previous Password Block Count.
     * Number of previous passwords to block. Valid values 0 to 24
     */
    @SerializedName(value = "passwordPreviousPasswordBlockCount", alternate = {"PasswordPreviousPasswordBlockCount"})
    @Expose
	@Nullable
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required.
     * Whether or not to require a password.
     */
    @SerializedName(value = "passwordRequired", alternate = {"PasswordRequired"})
    @Expose
	@Nullable
    public Boolean passwordRequired;

    /**
     * The Password Required Type.
     * The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
     */
    @SerializedName(value = "passwordRequiredType", alternate = {"PasswordRequiredType"})
    @Expose
	@Nullable
    public RequiredPasswordType passwordRequiredType;

    /**
     * The Storage Require Encryption.
     * Require encryption on windows phone devices.
     */
    @SerializedName(value = "storageRequireEncryption", alternate = {"StorageRequireEncryption"})
    @Expose
	@Nullable
    public Boolean storageRequireEncryption;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
