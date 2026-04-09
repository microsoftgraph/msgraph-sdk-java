package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ResourceAccessStatus implements ValuedEnum {
    None("none"),
    Failure("failure"),
    Success("success"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ResourceAccessStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ResourceAccessStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "failure": return Failure;
            case "success": return Success;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
