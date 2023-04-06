package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConnectionOperationStatus implements ValuedEnum {
    Unspecified("unspecified"),
    Inprogress("inprogress"),
    Completed("completed"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectionOperationStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConnectionOperationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unspecified": return Unspecified;
            case "inprogress": return Inprogress;
            case "completed": return Completed;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
