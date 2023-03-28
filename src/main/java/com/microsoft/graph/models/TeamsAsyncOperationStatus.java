package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TeamsAsyncOperationStatus implements ValuedEnum {
    Invalid("invalid"),
    NotStarted("notStarted"),
    InProgress("inProgress"),
    Succeeded("succeeded"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamsAsyncOperationStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamsAsyncOperationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "invalid": return Invalid;
            case "notStarted": return NotStarted;
            case "inProgress": return InProgress;
            case "succeeded": return Succeeded;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
