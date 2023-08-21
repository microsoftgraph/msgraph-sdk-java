package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NetworkConnectionType implements ValuedEnum {
    Unknown("unknown"),
    Wired("wired"),
    Wifi("wifi"),
    Mobile("mobile"),
    Tunnel("tunnel"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NetworkConnectionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NetworkConnectionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "wired": return Wired;
            case "wifi": return Wifi;
            case "mobile": return Mobile;
            case "tunnel": return Tunnel;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
