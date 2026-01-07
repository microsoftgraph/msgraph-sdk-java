package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WorkLocationType implements ValuedEnum {
    Unspecified("unspecified"),
    Office("office"),
    Remote("remote"),
    TimeOff("timeOff"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WorkLocationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WorkLocationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unspecified": return Unspecified;
            case "office": return Office;
            case "remote": return Remote;
            case "timeOff": return TimeOff;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
