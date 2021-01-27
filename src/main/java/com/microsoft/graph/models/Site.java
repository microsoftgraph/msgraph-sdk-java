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
import com.microsoft.graph.models.PublicError;
import com.microsoft.graph.models.Root;
import com.microsoft.graph.models.SharepointIds;
import com.microsoft.graph.models.SiteCollection;
import com.microsoft.graph.models.ItemAnalytics;
import com.microsoft.graph.models.ColumnDefinition;
import com.microsoft.graph.models.ContentType;
import com.microsoft.graph.models.Drive;
import com.microsoft.graph.models.BaseItem;
import com.microsoft.graph.models.List;
import com.microsoft.graph.models.Site;
import com.microsoft.graph.models.Onenote;
import com.microsoft.graph.requests.ColumnDefinitionCollectionPage;
import com.microsoft.graph.requests.ContentTypeCollectionPage;
import com.microsoft.graph.requests.DriveCollectionPage;
import com.microsoft.graph.requests.BaseItemCollectionPage;
import com.microsoft.graph.requests.ListCollectionPage;
import com.microsoft.graph.requests.SiteCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site.
 */
public class Site extends BaseItem implements IJsonBackedObject {


    /**
     * The Display Name.
     * The full title for the site. Read-only.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Error.
     * 
     */
    @SerializedName(value = "error", alternate = {"Error"})
    @Expose
	@Nullable
    public PublicError error;

    /**
     * The Root.
     * If present, indicates that this is the root site in the site collection. Read-only.
     */
    @SerializedName(value = "root", alternate = {"Root"})
    @Expose
	@Nullable
    public Root root;

    /**
     * The Sharepoint Ids.
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    @SerializedName(value = "sharepointIds", alternate = {"SharepointIds"})
    @Expose
	@Nullable
    public SharepointIds sharepointIds;

    /**
     * The Site Collection.
     * Provides details about the site's site collection. Available only on the root site. Read-only.
     */
    @SerializedName(value = "siteCollection", alternate = {"SiteCollection"})
    @Expose
	@Nullable
    public SiteCollection siteCollection;

    /**
     * The Analytics.
     * Analytics about the view activities that took place in this site.
     */
    @SerializedName(value = "analytics", alternate = {"Analytics"})
    @Expose
	@Nullable
    public ItemAnalytics analytics;

    /**
     * The Columns.
     * The collection of column definitions reusable across lists under this site.
     */
    @SerializedName(value = "columns", alternate = {"Columns"})
    @Expose
	@Nullable
    public ColumnDefinitionCollectionPage columns;

    /**
     * The Content Types.
     * The collection of content types defined for this site.
     */
    @SerializedName(value = "contentTypes", alternate = {"ContentTypes"})
    @Expose
	@Nullable
    public ContentTypeCollectionPage contentTypes;

    /**
     * The Drive.
     * The default drive (document library) for this site.
     */
    @SerializedName(value = "drive", alternate = {"Drive"})
    @Expose
	@Nullable
    public Drive drive;

    /**
     * The Drives.
     * The collection of drives (document libraries) under this site.
     */
    @SerializedName(value = "drives", alternate = {"Drives"})
    @Expose
	@Nullable
    public DriveCollectionPage drives;

    /**
     * The Items.
     * Used to address any item contained in this site. This collection cannot be enumerated.
     */
    @SerializedName(value = "items", alternate = {"Items"})
    @Expose
	@Nullable
    public BaseItemCollectionPage items;

    /**
     * The Lists.
     * The collection of lists under this site.
     */
    @SerializedName(value = "lists", alternate = {"Lists"})
    @Expose
	@Nullable
    public ListCollectionPage lists;

    /**
     * The Sites.
     * The collection of the sub-sites under this site.
     */
    @SerializedName(value = "sites", alternate = {"Sites"})
    @Expose
	@Nullable
    public SiteCollectionPage sites;

    /**
     * The Onenote.
     * Calls the OneNote service for notebook related operations.
     */
    @SerializedName(value = "onenote", alternate = {"Onenote"})
    @Expose
	@Nullable
    public Onenote onenote;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("columns")) {
            columns = serializer.deserializeObject(json.get("columns").toString(), ColumnDefinitionCollectionPage.class);
        }

        if (json.has("contentTypes")) {
            contentTypes = serializer.deserializeObject(json.get("contentTypes").toString(), ContentTypeCollectionPage.class);
        }

        if (json.has("drives")) {
            drives = serializer.deserializeObject(json.get("drives").toString(), DriveCollectionPage.class);
        }

        if (json.has("items")) {
            items = serializer.deserializeObject(json.get("items").toString(), BaseItemCollectionPage.class);
        }

        if (json.has("lists")) {
            lists = serializer.deserializeObject(json.get("lists").toString(), ListCollectionPage.class);
        }

        if (json.has("sites")) {
            sites = serializer.deserializeObject(json.get("sites").toString(), SiteCollectionPage.class);
        }
    }
}