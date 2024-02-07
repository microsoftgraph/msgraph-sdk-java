package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CalendarSharingActionImportance implements ValuedEnum {
    Primary("primary"),
    Secondary("secondary");
    public final String value;
    CalendarSharingActionImportance(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CalendarSharingActionImportance forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "primary": return Primary;
            case "secondary": return Secondary;
            default: return null;
        }
    }
}
