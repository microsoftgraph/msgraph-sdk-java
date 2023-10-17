package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TrainingAvailabilityStatus implements ValuedEnum {
    Unknown("unknown"),
    NotAvailable("notAvailable"),
    Available("available"),
    Archive("archive"),
    Delete("delete"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TrainingAvailabilityStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TrainingAvailabilityStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "notAvailable": return NotAvailable;
            case "available": return Available;
            case "archive": return Archive;
            case "delete": return Delete;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
