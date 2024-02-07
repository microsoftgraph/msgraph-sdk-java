package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConditionalAccessStatus implements ValuedEnum {
    Success("success"),
    Failure("failure"),
    NotApplied("notApplied"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConditionalAccessStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConditionalAccessStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "failure": return Failure;
            case "notApplied": return NotApplied;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
