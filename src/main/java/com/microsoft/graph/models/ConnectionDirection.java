package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConnectionDirection implements ValuedEnum {
    Unknown("unknown"),
    Inbound("inbound"),
    Outbound("outbound"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectionDirection(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConnectionDirection forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "inbound": return Inbound;
            case "outbound": return Outbound;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
