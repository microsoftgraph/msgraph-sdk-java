package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PrinterProcessingState implements ValuedEnum {
    Unknown("unknown"),
    Idle("idle"),
    Processing("processing"),
    Stopped("stopped"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrinterProcessingState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrinterProcessingState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "idle": return Idle;
            case "processing": return Processing;
            case "stopped": return Stopped;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
