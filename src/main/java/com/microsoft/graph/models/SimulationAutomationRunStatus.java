package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum SimulationAutomationRunStatus implements ValuedEnum {
    Unknown("unknown"),
    Running("running"),
    Succeeded("succeeded"),
    Failed("failed"),
    Skipped("skipped"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SimulationAutomationRunStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SimulationAutomationRunStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "running": return Running;
            case "succeeded": return Succeeded;
            case "failed": return Failed;
            case "skipped": return Skipped;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
