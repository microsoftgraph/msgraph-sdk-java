package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AlertStatus implements ValuedEnum {
    Unknown("unknown"),
    NewAlert("newAlert"),
    InProgress("inProgress"),
    Resolved("resolved"),
    Dismissed("dismissed"),
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
            case "newAlert": return NewAlert;
            case "inProgress": return InProgress;
            case "resolved": return Resolved;
            case "dismissed": return Dismissed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
