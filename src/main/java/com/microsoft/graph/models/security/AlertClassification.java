package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AlertClassification forValue(@javax.annotation.Nonnull final String searchValue) {
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
