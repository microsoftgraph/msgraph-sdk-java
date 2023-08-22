package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Contains all supported registry data detection type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Win32LobAppRegistryRuleOperationType implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** The specified registry key or value exists. */
    Exists("exists"),
    /** The specified registry key or value does not exist. */
    DoesNotExist("doesNotExist"),
    /** String value type. */
    String("string"),
    /** Integer value type. */
    Integer("integer"),
    /** Version value type. */
    Version("version");
    public final String value;
    Win32LobAppRegistryRuleOperationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Win32LobAppRegistryRuleOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "exists": return Exists;
            case "doesNotExist": return DoesNotExist;
            case "string": return String;
            case "integer": return Integer;
            case "version": return Version;
            default: return null;
        }
    }
}
