package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DetectionRuleStatus implements ValuedEnum {
    Enabled("enabled"),
    Disabled("disabled"),
    AutoDisabled("autoDisabled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DetectionRuleStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DetectionRuleStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            case "autoDisabled": return AutoDisabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
