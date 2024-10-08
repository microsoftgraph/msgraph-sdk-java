package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReferenceNumeric implements ValuedEnum {
    Minus_INF("-INF"),
    INF("INF"),
    NaN("NaN");
    public final String value;
    ReferenceNumeric(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReferenceNumeric forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "-INF": return Minus_INF;
            case "INF": return INF;
            case "NaN": return NaN;
            default: return null;
        }
    }
}
