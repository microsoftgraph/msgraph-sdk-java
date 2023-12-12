package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceRiskScore implements ValuedEnum {
    None("none"),
    Informational("informational"),
    Low("low"),
    Medium("medium"),
    High("high"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceRiskScore(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceRiskScore forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "informational": return Informational;
            case "low": return Low;
            case "medium": return Medium;
            case "high": return High;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
