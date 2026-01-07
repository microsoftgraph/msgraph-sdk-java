package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Windows365SwitchCompatibilityFailureReasonType implements ValuedEnum {
    OsVersionNotSupported("osVersionNotSupported"),
    HardwareNotSupported("hardwareNotSupported"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Windows365SwitchCompatibilityFailureReasonType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Windows365SwitchCompatibilityFailureReasonType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "osVersionNotSupported": return OsVersionNotSupported;
            case "hardwareNotSupported": return HardwareNotSupported;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
