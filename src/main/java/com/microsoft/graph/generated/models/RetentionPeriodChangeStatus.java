package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RetentionPeriodChangeStatus implements ValuedEnum {
    None("none"),
    InProgress("inProgress"),
    Failed("failed"),
    Completed("completed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RetentionPeriodChangeStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RetentionPeriodChangeStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "inProgress": return InProgress;
            case "failed": return Failed;
            case "completed": return Completed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
