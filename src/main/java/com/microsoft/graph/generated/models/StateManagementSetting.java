package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * State Management Setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StateManagementSetting implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Blocked. */
    Blocked("blocked"),
    /** Allowed. */
    Allowed("allowed");
    public final String value;
    StateManagementSetting(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StateManagementSetting forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "blocked": return Blocked;
            case "allowed": return Allowed;
            default: return null;
        }
    }
}
