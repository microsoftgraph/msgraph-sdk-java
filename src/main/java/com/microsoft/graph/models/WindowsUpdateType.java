package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Which branch devices will receive their updates from
 */
public enum WindowsUpdateType implements ValuedEnum {
    /** Allow the user to set. */
    UserDefined("userDefined"),
    /** Semi-annual Channel (Targeted). Device gets all applicable feature updates from Semi-annual Channel (Targeted). */
    All("all"),
    /** Semi-annual Channel. Device gets feature updates from Semi-annual Channel. */
    BusinessReadyOnly("businessReadyOnly"),
    /** Windows Insider build - Fast */
    WindowsInsiderBuildFast("windowsInsiderBuildFast"),
    /** Windows Insider build - Slow */
    WindowsInsiderBuildSlow("windowsInsiderBuildSlow"),
    /** Release Windows Insider build */
    WindowsInsiderBuildRelease("windowsInsiderBuildRelease");
    public final String value;
    WindowsUpdateType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsUpdateType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "all": return All;
            case "businessReadyOnly": return BusinessReadyOnly;
            case "windowsInsiderBuildFast": return WindowsInsiderBuildFast;
            case "windowsInsiderBuildSlow": return WindowsInsiderBuildSlow;
            case "windowsInsiderBuildRelease": return WindowsInsiderBuildRelease;
            default: return null;
        }
    }
}
