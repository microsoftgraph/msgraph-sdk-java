package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VerifiedIdUsageConfigurationPurpose implements ValuedEnum {
    Recovery("recovery"),
    Onboarding("onboarding"),
    All("all"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VerifiedIdUsageConfigurationPurpose(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VerifiedIdUsageConfigurationPurpose forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "recovery": return Recovery;
            case "onboarding": return Onboarding;
            case "all": return All;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
