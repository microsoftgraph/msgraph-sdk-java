package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ServiceUpdateSeverity implements ValuedEnum {
    Normal("normal"),
    High("high"),
    Critical("critical"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceUpdateSeverity(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUpdateSeverity forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "normal": return Normal;
            case "high": return High;
            case "critical": return Critical;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
