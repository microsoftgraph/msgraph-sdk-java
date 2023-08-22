package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EvidenceRole implements ValuedEnum {
    Unknown("unknown"),
    Contextual("contextual"),
    Scanned("scanned"),
    Source("source"),
    Destination("destination"),
    Created("created"),
    Added("added"),
    Compromised("compromised"),
    Edited("edited"),
    Attacked("attacked"),
    Attacker("attacker"),
    CommandAndControl("commandAndControl"),
    Loaded("loaded"),
    Suspicious("suspicious"),
    PolicyViolator("policyViolator"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EvidenceRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EvidenceRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "contextual": return Contextual;
            case "scanned": return Scanned;
            case "source": return Source;
            case "destination": return Destination;
            case "created": return Created;
            case "added": return Added;
            case "compromised": return Compromised;
            case "edited": return Edited;
            case "attacked": return Attacked;
            case "attacker": return Attacker;
            case "commandAndControl": return CommandAndControl;
            case "loaded": return Loaded;
            case "suspicious": return Suspicious;
            case "policyViolator": return PolicyViolator;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
