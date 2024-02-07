package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the package type of an MSI Win32LobApp.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Win32LobAppMsiPackageType implements ValuedEnum {
    /** Indicates a per-machine app package. */
    PerMachine("perMachine"),
    /** Indicates a per-user app package. */
    PerUser("perUser"),
    /** Indicates a dual-purpose app package. */
    DualPurpose("dualPurpose");
    public final String value;
    Win32LobAppMsiPackageType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Win32LobAppMsiPackageType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "perMachine": return PerMachine;
            case "perUser": return PerUser;
            case "dualPurpose": return DualPurpose;
            default: return null;
        }
    }
}
