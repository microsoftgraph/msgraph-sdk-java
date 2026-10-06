package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EvaluationOutcome implements ValuedEnum {
    Approved("approved"),
    Denied("denied"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EvaluationOutcome(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EvaluationOutcome forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "approved": return Approved;
            case "denied": return Denied;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
