package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible operations for rules used to make determinations about an application based on registry keys or values. Unless noted, the values can be used with either detection or requirement rules.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Win32LobAppRegistryRuleOperationType implements ValuedEnum {
    /** Default. Indicates that the rule does not have the operation type configured. */
    NotConfigured("notConfigured"),
    /** Indicates that the rule evaluates whether the specified registry key or value exists. */
    Exists("exists"),
    /** Indicates that the rule evaluates whether the specified registry key or value does not exist. It is the functional inverse of an equivalent rule that uses operation type `exists`. */
    DoesNotExist("doesNotExist"),
    /** Indicates that the rule compares the value read at the given registry value against a provided comparison value by string comparison. */
    String("string"),
    /** Indicates that the rule compares the value read at the given registry value against a provided comparison value by integer comparison. */
    Integer("integer"),
    /** Indicates that the rule compares the value read at the given registry value against a provided comparison value via version semantics (both operand values will be parsed as versions and directly compared). If the value read at the given registry value is not discovered to be in version-compatible format, a string comparison will be used instead. */
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
