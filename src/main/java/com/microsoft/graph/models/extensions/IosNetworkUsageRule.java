// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AppListItem;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Network Usage Rule.
 */
public class IosNetworkUsageRule implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Cellular Data Blocked.
     * If set to true, corresponding managed apps will not be allowed to use cellular data at any time.
     */
    @SerializedName(value = "cellularDataBlocked", alternate = {"CellularDataBlocked"})
    @Expose
    public Boolean cellularDataBlocked;

    /**
     * The Cellular Data Block When Roaming.
     * If set to true, corresponding managed apps will not be allowed to use cellular data when roaming.
     */
    @SerializedName(value = "cellularDataBlockWhenRoaming", alternate = {"CellularDataBlockWhenRoaming"})
    @Expose
    public Boolean cellularDataBlockWhenRoaming;

    /**
     * The Managed Apps.
     * Information about the managed apps that this rule is going to apply to. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "managedApps", alternate = {"ManagedApps"})
    @Expose
    public java.util.List<AppListItem> managedApps;


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