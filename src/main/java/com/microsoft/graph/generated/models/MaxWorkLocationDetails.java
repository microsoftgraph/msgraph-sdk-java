package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MaxWorkLocationDetails implements ValuedEnum {
    Unknown("unknown"),
    None("none"),
    Approximate("approximate"),
    Specific("specific"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MaxWorkLocationDetails(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MaxWorkLocationDetails forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "none": return None;
            case "approximate": return Approximate;
            case "specific": return Specific;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
