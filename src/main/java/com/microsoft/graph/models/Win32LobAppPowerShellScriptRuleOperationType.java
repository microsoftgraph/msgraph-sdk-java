package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Contains all supported Powershell Script output detection type. */
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
    FloatEscaped("floatEscaped"),
    /** Output data type is version. */
    Version("version"),
    /** Output data type is boolean. */
    BooleanEscaped("booleanEscaped");
    public final String value;
    Win32LobAppPowerShellScriptRuleOperationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Win32LobAppPowerShellScriptRuleOperationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "string": return String;
            case "dateTime": return DateTime;
            case "integer": return Integer;
            case "float": return FloatEscaped;
            case "version": return Version;
            case "boolean": return BooleanEscaped;
            default: return null;
        }
    }
}
