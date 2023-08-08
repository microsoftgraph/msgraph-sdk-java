package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum HostReputationClassification implements ValuedEnum {
    Unknown("unknown"),
    Neutral("neutral"),
    Suspicious("suspicious"),
    Malicious("malicious"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HostReputationClassification(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HostReputationClassification forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "neutral": return Neutral;
            case "suspicious": return Suspicious;
            case "malicious": return Malicious;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
