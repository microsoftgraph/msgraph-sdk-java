package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Sensitivity implements ValuedEnum {
    Normal("normal"),
    Personal("personal"),
    Private("private"),
    Confidential("confidential");
    public final String value;
    Sensitivity(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Sensitivity forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "normal": return Normal;
            case "personal": return Personal;
            case "private": return Private;
            case "confidential": return Confidential;
            default: return null;
        }
    }
}
