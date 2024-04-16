package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Level implements ValuedEnum {
    Beginner("beginner"),
    Intermediate("intermediate"),
    Advanced("advanced"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Level(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Level forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "beginner": return Beginner;
            case "intermediate": return Intermediate;
            case "advanced": return Advanced;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
