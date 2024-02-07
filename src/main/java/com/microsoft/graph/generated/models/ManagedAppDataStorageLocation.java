package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Storage locations where managed apps can potentially store their data
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedAppDataStorageLocation implements ValuedEnum {
    /** OneDrive for business */
    OneDriveForBusiness("oneDriveForBusiness"),
    /** SharePoint */
    SharePoint("sharePoint"),
    /** Box */
    Box("box"),
    /** Local storage on the device */
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
