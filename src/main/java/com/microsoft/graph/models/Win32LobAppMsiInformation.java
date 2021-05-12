// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Win32LobAppMsiPackageType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App Msi Information.
 */
public class Win32LobAppMsiInformation implements IJsonBackedObject {

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
     * The Package Type.
     * The MSI package type. Possible values are: perMachine, perUser, dualPurpose.
     */
    @SerializedName(value = "packageType", alternate = {"PackageType"})
    @Expose
	@Nullable
    public Win32LobAppMsiPackageType packageType;

    /**
     * The Product Code.
     * The MSI product code.
     */
    @SerializedName(value = "productCode", alternate = {"ProductCode"})
    @Expose
	@Nullable
    public String productCode;

    /**
     * The Product Name.
     * The MSI product name.
     */
    @SerializedName(value = "productName", alternate = {"ProductName"})
    @Expose
	@Nullable
    public String productName;

    /**
     * The Product Version.
     * The MSI product version.
     */
    @SerializedName(value = "productVersion", alternate = {"ProductVersion"})
    @Expose
	@Nullable
    public String productVersion;

    /**
     * The Publisher.
     * The MSI publisher.
     */
    @SerializedName(value = "publisher", alternate = {"Publisher"})
    @Expose
	@Nullable
    public String publisher;

    /**
     * The Requires Reboot.
     * Whether the MSI app requires the machine to reboot to complete installation.
     */
    @SerializedName(value = "requiresReboot", alternate = {"RequiresReboot"})
    @Expose
	@Nullable
    public Boolean requiresReboot;

    /**
     * The Upgrade Code.
     * The MSI upgrade code.
     */
    @SerializedName(value = "upgradeCode", alternate = {"UpgradeCode"})
    @Expose
	@Nullable
    public String upgradeCode;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}