package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SimulationAutomationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
