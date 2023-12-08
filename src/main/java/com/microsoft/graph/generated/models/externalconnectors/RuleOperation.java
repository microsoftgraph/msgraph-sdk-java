package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RuleOperation implements ValuedEnum {
    Equals("equals"),
    NotEquals("notEquals"),
    Contains("contains"),
    NotContains("notContains"),
    LessThan("lessThan"),
    GreaterThan("greaterThan"),
    StartsWith("startsWith"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RuleOperation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RuleOperation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "equals": return Equals;
            case "notEquals": return NotEquals;
            case "contains": return Contains;
            case "notContains": return NotContains;
            case "lessThan": return LessThan;
            case "greaterThan": return GreaterThan;
            case "startsWith": return StartsWith;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
