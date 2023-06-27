package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum LifecycleWorkflowProcessingStatus implements ValuedEnum {
    Queued("queued"),
    InProgress("inProgress"),
    Completed("completed"),
    CompletedWithErrors("completedWithErrors"),
    Canceled("canceled"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LifecycleWorkflowProcessingStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LifecycleWorkflowProcessingStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "queued": return Queued;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "completedWithErrors": return CompletedWithErrors;
            case "canceled": return Canceled;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
