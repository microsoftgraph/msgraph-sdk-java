// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WindowsDeviceAccount;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Update Windows Device Account Action Parameter.
 */
public class UpdateWindowsDeviceAccountActionParameter implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Calendar Sync Enabled.
     * Not yet documented
     */
    @SerializedName(value = "calendarSyncEnabled", alternate = {"CalendarSyncEnabled"})
    @Expose
    public Boolean calendarSyncEnabled;

    /**
     * The Device Account.
     * Not yet documented
     */
    @SerializedName(value = "deviceAccount", alternate = {"DeviceAccount"})
    @Expose
    public WindowsDeviceAccount deviceAccount;

    /**
     * The Device Account Email.
     * Not yet documented
     */
    @SerializedName(value = "deviceAccountEmail", alternate = {"DeviceAccountEmail"})
    @Expose
    public String deviceAccountEmail;

    /**
     * The Exchange Server.
     * Not yet documented
     */
    @SerializedName(value = "exchangeServer", alternate = {"ExchangeServer"})
    @Expose
    public String exchangeServer;

    /**
     * The Password Rotation Enabled.
     * Not yet documented
     */
    @SerializedName(value = "passwordRotationEnabled", alternate = {"PasswordRotationEnabled"})
    @Expose
    public Boolean passwordRotationEnabled;

    /**
     * The Session Initiation Protocal Address.
     * Not yet documented
     */
    @SerializedName(value = "sessionInitiationProtocalAddress", alternate = {"SessionInitiationProtocalAddress"})
    @Expose
    public String sessionInitiationProtocalAddress;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}