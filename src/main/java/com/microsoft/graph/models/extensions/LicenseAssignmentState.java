// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the License Assignment State.
 */
public class LicenseAssignmentState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Assigned By Group.
     * The id of the group that assigns this license. If the assignment is a direct-assigned license, this field will be Null. Read-Only.
     */
    @SerializedName(value = "assignedByGroup", alternate = {"AssignedByGroup"})
    @Expose
    public String assignedByGroup;

    /**
     * The Disabled Plans.
     * The service plans that are disabled in this assignment. Read-Only.
     */
    @SerializedName(value = "disabledPlans", alternate = {"DisabledPlans"})
    @Expose
    public java.util.List<java.util.UUID> disabledPlans;

    /**
     * The Error.
     * License assignment failure error. If the license is assigned successfully, this field will be Null. Read-Only. Possible values: CountViolation, MutuallyExclusiveViolation, DependencyViolation, ProhibitedInUsageLocationViolation, UniquenessViolation, and Others. For more information on how to identify and resolve license assignment errors see here.
     */
    @SerializedName(value = "error", alternate = {"Error"})
    @Expose
    public String error;

    /**
     * The Sku Id.
     * The unique identifier for the SKU. Read-Only.
     */
    @SerializedName(value = "skuId", alternate = {"SkuId"})
    @Expose
    public java.util.UUID skuId;

    /**
     * The State.
     * Indicate the current state of this assignment. Read-Only. Possible values: Active, ActiveWithError, Disabled and Error.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
    public String state;


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