package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton. */
public enum Win32LobAppDeliveryOptimizationPriority implements ValuedEnum {
    /** Not configured or background normal delivery optimization priority. */
    NotConfigured("notConfigured"),
    /** Foreground delivery optimization priority. */
    Foreground("foreground");
    public final String value;
    Win32LobAppDeliveryOptimizationPriority(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Win32LobAppDeliveryOptimizationPriority forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "foreground": return Foreground;
            default: return null;
        }
    }
}
