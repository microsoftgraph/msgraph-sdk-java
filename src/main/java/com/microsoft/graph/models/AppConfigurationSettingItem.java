// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MdmAppConfigKeyType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Configuration Setting Item.
 */
public class AppConfigurationSettingItem implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The App Config Key.
     * app configuration key.
     */
    @SerializedName(value = "appConfigKey", alternate = {"AppConfigKey"})
    @Expose
	@Nullable
    public String appConfigKey;

    /**
     * The App Config Key Type.
     * app configuration key type. Possible values are: stringType, integerType, realType, booleanType, tokenType.
     */
    @SerializedName(value = "appConfigKeyType", alternate = {"AppConfigKeyType"})
    @Expose
	@Nullable
    public MdmAppConfigKeyType appConfigKeyType;

    /**
     * The App Config Key Value.
     * app configuration key value.
     */
    @SerializedName(value = "appConfigKeyValue", alternate = {"AppConfigKeyValue"})
    @Expose
	@Nullable
    public String appConfigKeyValue;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}