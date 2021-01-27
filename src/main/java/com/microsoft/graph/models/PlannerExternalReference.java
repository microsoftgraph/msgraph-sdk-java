// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.IdentitySet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner External Reference.
 */
public class PlannerExternalReference implements IJsonBackedObject {

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
     * The Alias.
     * A name alias to describe the reference.
     */
    @SerializedName(value = "alias", alternate = {"Alias"})
    @Expose
	@Nullable
    public String alias;

    /**
     * The Last Modified By.
     * Read-only. User ID by which this is last modified.
     */
    @SerializedName(value = "lastModifiedBy", alternate = {"LastModifiedBy"})
    @Expose
	@Nullable
    public IdentitySet lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * Read-only. Date and time at which this is last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Preview Priority.
     * Used to set the relative priority order in which the reference will be shown as a preview on the task.
     */
    @SerializedName(value = "previewPriority", alternate = {"PreviewPriority"})
    @Expose
	@Nullable
    public String previewPriority;

    /**
     * The Type.
     * Used to describe the type of the reference. Types include: PowerPoint, Word, Excel, Other.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}