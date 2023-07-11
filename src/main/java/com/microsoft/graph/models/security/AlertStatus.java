package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AlertStatus implements ValuedEnum {
    Unknown("unknown"),
    New("new"),
    InProgress("inProgress"),
    Resolved("resolved"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AlertStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AlertStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "new": return New;
            case "inProgress": return InProgress;
            case "resolved": return Resolved;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
