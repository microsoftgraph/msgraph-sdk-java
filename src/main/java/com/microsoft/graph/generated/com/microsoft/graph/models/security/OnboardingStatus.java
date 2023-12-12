package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OnboardingStatus implements ValuedEnum {
    InsufficientInfo("insufficientInfo"),
    Onboarded("onboarded"),
    CanBeOnboarded("canBeOnboarded"),
    Unsupported("unsupported"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OnboardingStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OnboardingStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "insufficientInfo": return InsufficientInfo;
            case "onboarded": return Onboarded;
            case "canBeOnboarded": return CanBeOnboarded;
            case "unsupported": return Unsupported;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
