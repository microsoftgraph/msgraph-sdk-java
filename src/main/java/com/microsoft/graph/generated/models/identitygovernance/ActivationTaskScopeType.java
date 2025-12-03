package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActivationTaskScopeType implements ValuedEnum {
    AllTasks("allTasks"),
    FailedTasks("failedTasks"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ActivationTaskScopeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActivationTaskScopeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allTasks": return AllTasks;
            case "failedTasks": return FailedTasks;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
