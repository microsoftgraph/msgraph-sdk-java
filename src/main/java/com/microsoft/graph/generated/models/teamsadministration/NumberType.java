package com.microsoft.graph.models.teamsadministration;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NumberType implements ValuedEnum {
    InternalError("internalError"),
    DirectRouting("directRouting"),
    CallingPlan("callingPlan"),
    OperatorConnect("operatorConnect"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NumberType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NumberType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "internalError": return InternalError;
            case "directRouting": return DirectRouting;
            case "callingPlan": return CallingPlan;
            case "operatorConnect": return OperatorConnect;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
