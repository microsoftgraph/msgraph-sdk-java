package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SslVersion implements ValuedEnum {
    None("none"),
    Ssl3_0("ssl3_0"),
    Tls1_0("tls1_0"),
    Tls1_1("tls1_1"),
    Tls1_2("tls1_2"),
    Tls1_3("tls1_3"),
    NotSupported("notSupported"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SslVersion(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SslVersion forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "ssl3_0": return Ssl3_0;
            case "tls1_0": return Tls1_0;
            case "tls1_1": return Tls1_1;
            case "tls1_2": return Tls1_2;
            case "tls1_3": return Tls1_3;
            case "notSupported": return NotSupported;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
