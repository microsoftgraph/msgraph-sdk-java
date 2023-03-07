package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DetectionStatus implements ValuedEnum {
    Detected("detected"),
    Blocked("blocked"),
    Prevented("prevented"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DetectionStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DetectionStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "detected": return Detected;
            case "blocked": return Blocked;
            case "prevented": return Prevented;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
