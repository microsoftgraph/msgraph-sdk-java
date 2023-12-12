package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HostPortProtocol implements ValuedEnum {
    Tcp("tcp"),
    Udp("udp"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HostPortProtocol(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HostPortProtocol forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tcp": return Tcp;
            case "udp": return Udp;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
