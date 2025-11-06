package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProtectionRuleStatus implements ValuedEnum {
    Draft("draft"),
    Active("active"),
    Completed("completed"),
    CompletedWithErrors("completedWithErrors"),
    UnknownFutureValue("unknownFutureValue"),
    UpdateRequested("updateRequested"),
    DeleteRequested("deleteRequested");
    public final String value;
    ProtectionRuleStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProtectionRuleStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "draft": return Draft;
            case "active": return Active;
            case "completed": return Completed;
            case "completedWithErrors": return CompletedWithErrors;
            case "unknownFutureValue": return UnknownFutureValue;
            case "updateRequested": return UpdateRequested;
            case "deleteRequested": return DeleteRequested;
            default: return null;
        }
    }
}
