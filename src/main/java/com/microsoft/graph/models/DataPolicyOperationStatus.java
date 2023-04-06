package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DataPolicyOperationStatus implements ValuedEnum {
    NotStarted("notStarted"),
    Running("running"),
    Complete("complete"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DataPolicyOperationStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DataPolicyOperationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notStarted": return NotStarted;
            case "running": return Running;
            case "complete": return Complete;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
