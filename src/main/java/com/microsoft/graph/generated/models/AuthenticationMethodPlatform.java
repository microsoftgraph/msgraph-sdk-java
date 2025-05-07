package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticationMethodPlatform implements ValuedEnum {
    Unknown("unknown"),
    Windows("windows"),
    MacOS("macOS"),
    IOS("iOS"),
    Android("android"),
    Linux("linux"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationMethodPlatform(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationMethodPlatform forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "windows": return Windows;
            case "macOS": return MacOS;
            case "iOS": return IOS;
            case "android": return Android;
            case "linux": return Linux;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
