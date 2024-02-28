package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsSettingType implements ValuedEnum {
    Roaming("roaming"),
    Backup("backup"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsSettingType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsSettingType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "roaming": return Roaming;
            case "backup": return Backup;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
