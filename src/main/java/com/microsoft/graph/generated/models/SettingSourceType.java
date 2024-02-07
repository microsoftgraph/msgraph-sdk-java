package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SettingSourceType implements ValuedEnum {
    DeviceConfiguration("deviceConfiguration"),
    DeviceIntent("deviceIntent");
    public final String value;
    SettingSourceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SettingSourceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceConfiguration": return DeviceConfiguration;
            case "deviceIntent": return DeviceIntent;
            default: return null;
        }
    }
}
