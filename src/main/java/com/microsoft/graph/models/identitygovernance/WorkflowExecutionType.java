package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum WorkflowExecutionType implements ValuedEnum {
    Scheduled("scheduled"),
    OnDemand("onDemand"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WorkflowExecutionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WorkflowExecutionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "scheduled": return Scheduled;
            case "onDemand": return OnDemand;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
