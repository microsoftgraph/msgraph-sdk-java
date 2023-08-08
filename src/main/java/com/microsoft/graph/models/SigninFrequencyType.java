package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SigninFrequencyType implements ValuedEnum {
    Days("days"),
    Hours("hours");
    public final String value;
    SigninFrequencyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SigninFrequencyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "days": return Days;
            case "hours": return Hours;
            default: return null;
        }
    }
}
