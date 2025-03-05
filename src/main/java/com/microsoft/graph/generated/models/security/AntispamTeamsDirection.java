package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AntispamTeamsDirection implements ValuedEnum {
    Unknown("unknown"),
    Inbound("inbound"),
    Outbound("outbound"),
    Intraorg("intraorg"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AntispamTeamsDirection(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AntispamTeamsDirection forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "inbound": return Inbound;
            case "outbound": return Outbound;
            case "intraorg": return Intraorg;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
