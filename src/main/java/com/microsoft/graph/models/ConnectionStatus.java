package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConnectionStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
