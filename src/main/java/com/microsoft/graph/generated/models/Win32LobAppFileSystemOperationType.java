package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible operations for rules used to make determinations about an application based on files or folders. Unless noted, can be used with either detection or requirement rules.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Win32LobAppFileSystemOperationType implements ValuedEnum {
    /** Default. Indicates that the rule does not have the operation type configured. */
    NotConfigured("notConfigured"),
    /** Indicates that the rule evaluates whether the specified file or folder exists. */
    Exists("exists"),
    /** Indicates that the rule compares the modified date of the specified file against a provided comparison value by DateTime comparison. */
    ModifiedDate("modifiedDate"),
    /** Indicates that the rule compares the created date of the specified file against a provided comparison value by DateTime comparison. */
    CreatedDate("createdDate"),
    /** Indicates that the rule compares the detected version of the specified file against a provided comparison value via version semantics (both operand values will be parsed as versions and directly compared). If the value read at the given registry value is not discovered to be in version-compatible format, a string comparison will be used instead. */
    Version("version"),
    /** Indicates that the rule compares the size of the file in MiB (rounded down) against a provided comparison value by integer comparison. */
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
