package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OperationStatus implements ValuedEnum {
    NotStarted("NotStarted"),
    Running("Running"),
    Completed("Completed"),
    Failed("Failed");
    public final String value;
    OperationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OperationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
