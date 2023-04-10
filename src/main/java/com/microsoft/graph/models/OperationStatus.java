package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum OperationStatus implements ValuedEnum {
    NotStarted("NotStarted"),
    Running("Running"),
    Completed("Completed"),
    Failed("Failed");
    public final String value;
    OperationStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OperationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NotStarted": return NotStarted;
            case "Running": return Running;
            case "Completed": return Completed;
            case "Failed": return Failed;
            default: return null;
        }
    }
}
