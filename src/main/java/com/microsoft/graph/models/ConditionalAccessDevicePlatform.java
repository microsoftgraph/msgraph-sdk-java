package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConditionalAccessDevicePlatform implements ValuedEnum {
    Android("android"),
    IOS("iOS"),
    Windows("windows"),
    WindowsPhone("windowsPhone"),
    MacOS("macOS"),
    All("all"),
    UnknownFutureValue("unknownFutureValue"),
    Linux("linux");
    public final String value;
    ConditionalAccessDevicePlatform(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConditionalAccessDevicePlatform forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "android": return Android;
            case "iOS": return IOS;
            case "windows": return Windows;
            case "windowsPhone": return WindowsPhone;
            case "macOS": return MacOS;
            case "all": return All;
            case "unknownFutureValue": return UnknownFutureValue;
            case "linux": return Linux;
            default: return null;
        }
    }
}
