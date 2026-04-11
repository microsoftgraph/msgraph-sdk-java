package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PasskeyType implements ValuedEnum {
    DeviceBound("deviceBound"),
    Synced("synced"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PasskeyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PasskeyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceBound": return DeviceBound;
            case "synced": return Synced;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
