package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SensorHealthStatus implements ValuedEnum {
    Healthy("healthy"),
    NotHealthyLow("notHealthyLow"),
    NotHealthyMedium("notHealthyMedium"),
    NotHealthyHigh("notHealthyHigh"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SensorHealthStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SensorHealthStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "healthy": return Healthy;
            case "notHealthyLow": return NotHealthyLow;
            case "notHealthyMedium": return NotHealthyMedium;
            case "notHealthyHigh": return NotHealthyHigh;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
