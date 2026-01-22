package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceStatus implements ValuedEnum {
    Stopped("stopped"),
    Starting("starting"),
    Running("running"),
    Disabled("disabled"),
    Onboarding("onboarding"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "stopped": return Stopped;
            case "starting": return Starting;
            case "running": return Running;
            case "disabled": return Disabled;
            case "onboarding": return Onboarding;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
