package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConnectionState implements ValuedEnum {
    Draft("draft"),
    Ready("ready"),
    Obsolete("obsolete"),
    LimitExceeded("limitExceeded"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectionState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConnectionState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "draft": return Draft;
            case "ready": return Ready;
            case "obsolete": return Obsolete;
            case "limitExceeded": return LimitExceeded;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
