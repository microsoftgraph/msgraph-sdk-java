package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticationMethodSignInState implements ValuedEnum {
    NotSupported("notSupported"),
    NotAllowedByPolicy("notAllowedByPolicy"),
    NotEnabled("notEnabled"),
    PhoneNumberNotUnique("phoneNumberNotUnique"),
    Ready("ready"),
    NotConfigured("notConfigured"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationMethodSignInState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationMethodSignInState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSupported": return NotSupported;
            case "notAllowedByPolicy": return NotAllowedByPolicy;
            case "notEnabled": return NotEnabled;
            case "phoneNumberNotUnique": return PhoneNumberNotUnique;
            case "ready": return Ready;
            case "notConfigured": return NotConfigured;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
