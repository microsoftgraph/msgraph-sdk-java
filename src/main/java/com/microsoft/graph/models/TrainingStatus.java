package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TrainingStatus implements ValuedEnum {
    Unknown("unknown"),
    Assigned("assigned"),
    InProgress("inProgress"),
    Completed("completed"),
    Overdue("overdue"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TrainingStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TrainingStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "assigned": return Assigned;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "overdue": return Overdue;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
