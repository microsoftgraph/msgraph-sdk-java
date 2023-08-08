package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Contains value for delivery optimization priority.
 */
public enum Win32LobAppDeliveryOptimizationPriority implements ValuedEnum {
    /** Not configured or background normal delivery optimization priority. */
    NotConfigured("notConfigured"),
    /** Foreground delivery optimization priority. */
    Foreground("foreground");
    public final String value;
    Win32LobAppDeliveryOptimizationPriority(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Win32LobAppDeliveryOptimizationPriority forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "foreground": return Foreground;
            default: return null;
        }
    }
}
