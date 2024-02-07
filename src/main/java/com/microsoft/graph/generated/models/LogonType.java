package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LogonType implements ValuedEnum {
    Unknown("unknown"),
    Interactive("interactive"),
    RemoteInteractive("remoteInteractive"),
    Network("network"),
    Batch("batch"),
    Service("service"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LogonType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LogonType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "interactive": return Interactive;
            case "remoteInteractive": return RemoteInteractive;
            case "network": return Network;
            case "batch": return Batch;
            case "service": return Service;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
