package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppsUpdateChannelType implements ValuedEnum {
    Current("current"),
    MonthlyEnterprise("monthlyEnterprise"),
    SemiAnnual("semiAnnual"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppsUpdateChannelType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppsUpdateChannelType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "current": return Current;
            case "monthlyEnterprise": return MonthlyEnterprise;
            case "semiAnnual": return SemiAnnual;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
