package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for install state.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InstallState implements ValuedEnum {
    /** Not Applicable. */
    NotApplicable("notApplicable"),
    /** Installed. */
    Installed("installed"),
    /** Failed. */
    Failed("failed"),
    /** Not Installed. */
    NotInstalled("notInstalled"),
    /** Uninstall Failed. */
    UninstallFailed("uninstallFailed"),
    /** Unknown. */
    Unknown("unknown");
    public final String value;
    InstallState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InstallState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notApplicable": return NotApplicable;
            case "installed": return Installed;
            case "failed": return Failed;
            case "notInstalled": return NotInstalled;
            case "uninstallFailed": return UninstallFailed;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
