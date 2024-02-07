package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SynchronizationTaskExecutionResult implements ValuedEnum {
    Succeeded("Succeeded"),
    Failed("Failed"),
    EntryLevelErrors("EntryLevelErrors");
    public final String value;
    SynchronizationTaskExecutionResult(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SynchronizationTaskExecutionResult forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Succeeded": return Succeeded;
            case "Failed": return Failed;
            case "EntryLevelErrors": return EntryLevelErrors;
            default: return null;
        }
    }
}
