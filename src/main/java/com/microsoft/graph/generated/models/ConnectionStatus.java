package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConnectionStatus implements ValuedEnum {
    Unknown("unknown"),
    Attempted("attempted"),
    Succeeded("succeeded"),
    Blocked("blocked"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConnectionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "attempted": return Attempted;
            case "succeeded": return Succeeded;
            case "blocked": return Blocked;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
