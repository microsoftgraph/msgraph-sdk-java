package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SimulationContentSource implements ValuedEnum {
    Unknown("unknown"),
    Global("global"),
    Tenant("tenant"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SimulationContentSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SimulationContentSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "global": return Global;
            case "tenant": return Tenant;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
