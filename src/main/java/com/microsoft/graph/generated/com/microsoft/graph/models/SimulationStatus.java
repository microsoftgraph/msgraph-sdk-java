package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SimulationStatus implements ValuedEnum {
    Unknown("unknown"),
    Draft("draft"),
    Running("running"),
    Scheduled("scheduled"),
    Succeeded("succeeded"),
    Failed("failed"),
    Cancelled("cancelled"),
    Excluded("excluded"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SimulationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SimulationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "draft": return Draft;
            case "running": return Running;
            case "scheduled": return Scheduled;
            case "succeeded": return Succeeded;
            case "failed": return Failed;
            case "cancelled": return Cancelled;
            case "excluded": return Excluded;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
