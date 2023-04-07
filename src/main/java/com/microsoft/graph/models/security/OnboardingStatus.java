package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OnboardingStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
