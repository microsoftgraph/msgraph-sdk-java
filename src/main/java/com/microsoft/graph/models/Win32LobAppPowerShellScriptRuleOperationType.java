package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Contains all supported Powershell Script output detection type.
 */
public enum Win32LobAppPowerShellScriptRuleOperationType implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Output data type is string. */
    String("string"),
    /** Output data type is date time. */
    DateTime("dateTime"),
    /** Output data type is integer. */
    Integer("integer"),
    /** Output data type is float. */
    Float("float"),
    /** Output data type is version. */
    Version("version"),
    /** Output data type is boolean. */
    Boolean("boolean");
    public final String value;
    Win32LobAppPowerShellScriptRuleOperationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Win32LobAppPowerShellScriptRuleOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "string": return String;
            case "dateTime": return DateTime;
            case "integer": return Integer;
            case "float": return Float;
            case "version": return Version;
            case "boolean": return Boolean;
            default: return null;
        }
    }
}
