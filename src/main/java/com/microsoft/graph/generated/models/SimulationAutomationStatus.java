package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SimulationAutomationStatus implements ValuedEnum {
    Unknown("unknown"),
    Draft("draft"),
    NotRunning("notRunning"),
    Running("running"),
    Completed("completed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SimulationAutomationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SimulationAutomationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "draft": return Draft;
            case "notRunning": return NotRunning;
            case "running": return Running;
            case "completed": return Completed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
