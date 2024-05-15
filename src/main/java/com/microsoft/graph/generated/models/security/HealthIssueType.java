package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HealthIssueType implements ValuedEnum {
    Sensor("sensor"),
    Global("global"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HealthIssueType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HealthIssueType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sensor": return Sensor;
            case "global": return Global;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
