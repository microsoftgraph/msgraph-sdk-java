package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RiskLevel implements ValuedEnum {
    Low("low"),
    Medium("medium"),
    High("high"),
    Hidden("hidden"),
    None("none"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RiskLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RiskLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "low": return Low;
            case "medium": return Medium;
            case "high": return High;
            case "hidden": return Hidden;
            case "none": return None;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
