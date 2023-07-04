package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CustomTaskExtensionOperationStatus implements ValuedEnum {
    Completed("completed"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CustomTaskExtensionOperationStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CustomTaskExtensionOperationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "completed": return Completed;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
