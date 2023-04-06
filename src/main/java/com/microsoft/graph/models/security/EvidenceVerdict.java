package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum EvidenceVerdict implements ValuedEnum {
    Unknown("unknown"),
    Suspicious("suspicious"),
    Malicious("malicious"),
    NoThreatsFound("noThreatsFound"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EvidenceVerdict(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EvidenceVerdict forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "suspicious": return Suspicious;
            case "malicious": return Malicious;
            case "noThreatsFound": return NoThreatsFound;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
