package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum QuarantineType implements ValuedEnum {
    NotQuarantined("notQuarantined"),
    CountBasedThresholdExceeded("countBasedThresholdExceeded"),
    PercentageBasedThresholdExceeded("percentageBasedThresholdExceeded"),
    MultipleConditionsExceeded("multipleConditionsExceeded"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    QuarantineType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static QuarantineType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notQuarantined": return NotQuarantined;
            case "countBasedThresholdExceeded": return CountBasedThresholdExceeded;
            case "percentageBasedThresholdExceeded": return PercentageBasedThresholdExceeded;
            case "multipleConditionsExceeded": return MultipleConditionsExceeded;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
