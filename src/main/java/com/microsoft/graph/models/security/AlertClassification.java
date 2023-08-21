package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AlertClassification implements ValuedEnum {
    Unknown("unknown"),
    FalsePositive("falsePositive"),
    TruePositive("truePositive"),
    InformationalExpectedActivity("informationalExpectedActivity"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AlertClassification(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AlertClassification forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "falsePositive": return FalsePositive;
            case "truePositive": return TruePositive;
            case "informationalExpectedActivity": return InformationalExpectedActivity;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
