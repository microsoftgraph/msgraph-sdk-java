package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RestoreArtifactsBulkRequestStatus implements ValuedEnum {
    Unknown("unknown"),
    Active("active"),
    Completed("completed"),
    CompletedWithErrors("completedWithErrors"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RestoreArtifactsBulkRequestStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RestoreArtifactsBulkRequestStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "active": return Active;
            case "completed": return Completed;
            case "completedWithErrors": return CompletedWithErrors;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
