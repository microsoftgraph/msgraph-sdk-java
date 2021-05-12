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
import com.microsoft.graph.models.ImportedWindowsAutopilotDeviceIdentityUploadStatus;
import com.microsoft.graph.models.ImportedWindowsAutopilotDeviceIdentity;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ImportedWindowsAutopilotDeviceIdentityCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Windows Autopilot Device Identity Upload.
 */
public class ImportedWindowsAutopilotDeviceIdentityUpload extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time Utc.
     * DateTime when the entity is created.
     */
    @SerializedName(value = "createdDateTimeUtc", alternate = {"CreatedDateTimeUtc"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTimeUtc;

    /**
     * The Status.
     * Upload status.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public ImportedWindowsAutopilotDeviceIdentityUploadStatus status;

    /**
     * The Device Identities.
     * Collection of all Autopilot devices as a part of this upload.
     */
    @SerializedName(value = "deviceIdentities", alternate = {"DeviceIdentities"})
    @Expose
	@Nullable
    public ImportedWindowsAutopilotDeviceIdentityCollectionPage deviceIdentities;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("deviceIdentities")) {
            deviceIdentities = serializer.deserializeObject(json.get("deviceIdentities"), ImportedWindowsAutopilotDeviceIdentityCollectionPage.class);
        }
    }
}