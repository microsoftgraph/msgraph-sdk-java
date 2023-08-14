package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum FilterMode implements ValuedEnum {
    Include("include"),
    Exclude("exclude");
    public final String value;
    FilterMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FilterMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "include": return Include;
            case "exclude": return Exclude;
            default: return null;
        }
    }
}
