package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ContainerPortProtocol implements ValuedEnum {
    Udp("udp"),
    Tcp("tcp"),
    Sctp("sctp"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ContainerPortProtocol(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ContainerPortProtocol forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "udp": return Udp;
            case "tcp": return Tcp;
            case "sctp": return Sctp;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
