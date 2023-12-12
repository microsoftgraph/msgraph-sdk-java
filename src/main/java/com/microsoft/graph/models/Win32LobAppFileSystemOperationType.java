package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Contains all supported file system detection type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Win32LobAppFileSystemOperationType implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Whether the specified file or folder exists. */
    Exists("exists"),
    /** Last modified date. */
    ModifiedDate("modifiedDate"),
    /** Created date. */
    CreatedDate("createdDate"),
    /** Version value type. */
    Version("version"),
    /** Size detection type. */
    SizeInMB("sizeInMB");
    public final String value;
    Win32LobAppFileSystemOperationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Win32LobAppFileSystemOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "exists": return Exists;
            case "modifiedDate": return ModifiedDate;
            case "createdDate": return CreatedDate;
            case "version": return Version;
            case "sizeInMB": return SizeInMB;
            default: return null;
        }
    }
}
