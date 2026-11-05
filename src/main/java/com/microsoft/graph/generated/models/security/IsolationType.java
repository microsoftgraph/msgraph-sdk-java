package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IsolationType implements ValuedEnum {
    Full("full"),
    Selective("selective"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IsolationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IsolationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "full": return Full;
            case "selective": return Selective;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
