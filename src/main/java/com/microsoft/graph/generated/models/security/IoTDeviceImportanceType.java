package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IoTDeviceImportanceType implements ValuedEnum {
    Unknown("unknown"),
    Low("low"),
    Normal("normal"),
    High("high"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IoTDeviceImportanceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IoTDeviceImportanceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "low": return Low;
            case "normal": return Normal;
            case "high": return High;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
