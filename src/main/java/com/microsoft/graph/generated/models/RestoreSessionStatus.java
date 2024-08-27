package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RestoreSessionStatus implements ValuedEnum {
    Draft("draft"),
    Activating("activating"),
    Active("active"),
    CompletedWithError("completedWithError"),
    Completed("completed"),
    UnknownFutureValue("unknownFutureValue"),
    Failed("failed");
    public final String value;
    RestoreSessionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RestoreSessionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "draft": return Draft;
            case "activating": return Activating;
            case "active": return Active;
            case "completedWithError": return CompletedWithError;
            case "completed": return Completed;
            case "unknownFutureValue": return UnknownFutureValue;
            case "failed": return Failed;
            default: return null;
        }
    }
}
