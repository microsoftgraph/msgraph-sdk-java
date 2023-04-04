package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CalendarSharingActionImportance implements ValuedEnum {
    Primary("primary"),
    Secondary("secondary");
    public final String value;
    CalendarSharingActionImportance(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CalendarSharingActionImportance forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "primary": return Primary;
            case "secondary": return Secondary;
            default: return null;
        }
    }
}
