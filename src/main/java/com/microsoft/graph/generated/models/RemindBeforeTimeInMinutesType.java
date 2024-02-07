package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RemindBeforeTimeInMinutesType implements ValuedEnum {
    Mins15("mins15"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RemindBeforeTimeInMinutesType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RemindBeforeTimeInMinutesType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mins15": return Mins15;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
