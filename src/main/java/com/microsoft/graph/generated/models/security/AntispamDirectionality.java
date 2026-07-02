package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AntispamDirectionality implements ValuedEnum {
    Unknown("unknown"),
    Inbound("inbound"),
    Outbound("outbound"),
    IntraOrg("intraOrg"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AntispamDirectionality(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AntispamDirectionality forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "inbound": return Inbound;
            case "outbound": return Outbound;
            case "intraOrg": return IntraOrg;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
