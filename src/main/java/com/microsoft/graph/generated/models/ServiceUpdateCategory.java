package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceUpdateCategory implements ValuedEnum {
    PreventOrFixIssue("preventOrFixIssue"),
    PlanForChange("planForChange"),
    StayInformed("stayInformed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceUpdateCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceUpdateCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "preventOrFixIssue": return PreventOrFixIssue;
            case "planForChange": return PlanForChange;
            case "stayInformed": return StayInformed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
