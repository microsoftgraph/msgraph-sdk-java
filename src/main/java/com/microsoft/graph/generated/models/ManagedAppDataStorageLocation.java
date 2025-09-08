package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The storage locations where managed apps can potentially store their data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedAppDataStorageLocation implements ValuedEnum {
    /** Indicates allowed storage location for the managed app to save files is &apos;OneDrive for Business&apos;. */
    OneDriveForBusiness("oneDriveForBusiness"),
    /** Indicates allowed storage location for the managed app to save files is &apos;Sharepoint&apos;. */
    SharePoint("sharePoint"),
    /** Indicates that the allowed storage location for a managed app to save files is to &apos;Box&apos;. Box is a non-Microsoft solution that enables cloud-based file storage capabilities. */
    Box("box"),
    /** Indicates allowed storage location for the managed app to save files is local storage on the device. */
    LocalStorage("localStorage");
    public final String value;
    ManagedAppDataStorageLocation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedAppDataStorageLocation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "oneDriveForBusiness": return OneDriveForBusiness;
            case "sharePoint": return SharePoint;
            case "box": return Box;
            case "localStorage": return LocalStorage;
            default: return null;
        }
    }
}
