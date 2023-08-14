package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RiskState implements ValuedEnum {
    None("none"),
    ConfirmedSafe("confirmedSafe"),
    Remediated("remediated"),
    Dismissed("dismissed"),
    AtRisk("atRisk"),
    ConfirmedCompromised("confirmedCompromised"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RiskState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RiskState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "confirmedSafe": return ConfirmedSafe;
            case "remediated": return Remediated;
            case "dismissed": return Dismissed;
            case "atRisk": return AtRisk;
            case "confirmedCompromised": return ConfirmedCompromised;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
