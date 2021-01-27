// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.WorkbookApplication;
import com.microsoft.graph.models.WorkbookComment;
import com.microsoft.graph.models.WorkbookFunctions;
import com.microsoft.graph.models.WorkbookNamedItem;
import com.microsoft.graph.models.WorkbookOperation;
import com.microsoft.graph.models.WorkbookTable;
import com.microsoft.graph.models.WorkbookWorksheet;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.WorkbookCommentCollectionPage;
import com.microsoft.graph.requests.WorkbookNamedItemCollectionPage;
import com.microsoft.graph.requests.WorkbookOperationCollectionPage;
import com.microsoft.graph.requests.WorkbookTableCollectionPage;
import com.microsoft.graph.requests.WorkbookWorksheetCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook.
 */
public class Workbook extends Entity implements IJsonBackedObject {


    /**
     * The Application.
     * 
     */
    @SerializedName(value = "application", alternate = {"Application"})
    @Expose
	@Nullable
    public WorkbookApplication application;

    /**
     * The Comments.
     * 
     */
    @SerializedName(value = "comments", alternate = {"Comments"})
    @Expose
	@Nullable
    public WorkbookCommentCollectionPage comments;

    /**
     * The Functions.
     * 
     */
    @SerializedName(value = "functions", alternate = {"Functions"})
    @Expose
	@Nullable
    public WorkbookFunctions functions;

    /**
     * The Names.
     * Represents a collection of workbook scoped named items (named ranges and constants). Read-only.
     */
    @SerializedName(value = "names", alternate = {"Names"})
    @Expose
	@Nullable
    public WorkbookNamedItemCollectionPage names;

    /**
     * The Operations.
     * The status of workbook operations. Getting an operation collection is not supported, but you can get the status of a long-running operation if the Location header is returned in the response. Read-only.
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
	@Nullable
    public WorkbookOperationCollectionPage operations;

    /**
     * The Tables.
     * Represents a collection of tables associated with the workbook. Read-only.
     */
    @SerializedName(value = "tables", alternate = {"Tables"})
    @Expose
	@Nullable
    public WorkbookTableCollectionPage tables;

    /**
     * The Worksheets.
     * Represents a collection of worksheets associated with the workbook. Read-only.
     */
    @SerializedName(value = "worksheets", alternate = {"Worksheets"})
    @Expose
	@Nullable
    public WorkbookWorksheetCollectionPage worksheets;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("comments")) {
            comments = serializer.deserializeObject(json.get("comments").toString(), WorkbookCommentCollectionPage.class);
        }

        if (json.has("names")) {
            names = serializer.deserializeObject(json.get("names").toString(), WorkbookNamedItemCollectionPage.class);
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations").toString(), WorkbookOperationCollectionPage.class);
        }

        if (json.has("tables")) {
            tables = serializer.deserializeObject(json.get("tables").toString(), WorkbookTableCollectionPage.class);
        }

        if (json.has("worksheets")) {
            worksheets = serializer.deserializeObject(json.get("worksheets").toString(), WorkbookWorksheetCollectionPage.class);
        }
    }
}