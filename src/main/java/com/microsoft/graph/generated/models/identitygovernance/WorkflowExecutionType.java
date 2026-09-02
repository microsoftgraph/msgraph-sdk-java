package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WorkflowExecutionType implements ValuedEnum {
    Scheduled("scheduled"),
    OnDemand("onDemand"),
    UnknownFutureValue("unknownFutureValue"),
    ActivatedWithScope("activatedWithScope"),
    Preview("preview"),
    ExtensibilityOnDemand("extensibilityOnDemand");
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
            case "activatedWithScope": return ActivatedWithScope;
            case "preview": return Preview;
            case "extensibilityOnDemand": return ExtensibilityOnDemand;
            default: return null;
        }
    }
}
