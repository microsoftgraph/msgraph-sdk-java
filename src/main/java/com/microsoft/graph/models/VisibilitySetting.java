package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Generic visibility state.
 */
public enum VisibilitySetting implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Hide. */
    Hide("hide"),
    /** Show. */
    Show("show");
    public final String value;
    VisibilitySetting(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VisibilitySetting forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "hide": return Hide;
            case "show": return Show;
            default: return null;
        }
    }
}
