package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WorkflowTriggerOperatorEventTiming implements ValuedEnum {
    Before("before"),
    After("after"),
    On("on"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WorkflowTriggerOperatorEventTiming(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WorkflowTriggerOperatorEventTiming forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "before": return Before;
            case "after": return After;
            case "on": return On;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
