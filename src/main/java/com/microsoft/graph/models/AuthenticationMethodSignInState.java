package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AuthenticationMethodSignInState forValue(@javax.annotation.Nonnull final String searchValue) {
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
