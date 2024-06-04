package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsDeviceUsageType implements ValuedEnum {
    /** Default. Indicates that a device is a single-user device. */
    SingleUser("singleUser"),
    /** Indicates that a device is a multi-user device. */
    Shared("shared"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsDeviceUsageType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsDeviceUsageType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "singleUser": return SingleUser;
            case "shared": return Shared;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
