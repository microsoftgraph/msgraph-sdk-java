package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExecutionMode implements ValuedEnum {
    EvaluateInline("evaluateInline"),
    EvaluateOffline("evaluateOffline"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ExecutionMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExecutionMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "evaluateInline": return EvaluateInline;
            case "evaluateOffline": return EvaluateOffline;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
