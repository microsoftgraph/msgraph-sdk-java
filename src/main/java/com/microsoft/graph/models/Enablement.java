package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values of a property
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Enablement implements ValuedEnum {
    /** Device default value, no intent. */
    NotConfigured("notConfigured"),
    /** Enables the setting on the device. */
    Enabled("enabled"),
    /** Disables the setting on the device. */
    Disabled("disabled");
    public final String value;
    Enablement(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Enablement forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            default: return null;
        }
    }
}
