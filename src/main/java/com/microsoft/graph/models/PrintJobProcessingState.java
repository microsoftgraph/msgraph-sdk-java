package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
public enum PrintJobProcessingState implements ValuedEnum {
    Unknown("unknown"),
    Pending("pending"),
    Processing("processing"),
    Paused("paused"),
    Stopped("stopped"),
    Completed("completed"),
    Canceled("canceled"),
    Aborted("aborted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrintJobProcessingState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrintJobProcessingState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "pending": return Pending;
            case "processing": return Processing;
            case "paused": return Paused;
            case "stopped": return Stopped;
            case "completed": return Completed;
            case "canceled": return Canceled;
            case "aborted": return Aborted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
