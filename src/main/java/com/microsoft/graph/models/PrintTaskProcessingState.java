package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PrintTaskProcessingState implements ValuedEnum {
    Pending("pending"),
    Processing("processing"),
    Completed("completed"),
    Aborted("aborted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrintTaskProcessingState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrintTaskProcessingState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "processing": return Processing;
            case "completed": return Completed;
            case "aborted": return Aborted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
