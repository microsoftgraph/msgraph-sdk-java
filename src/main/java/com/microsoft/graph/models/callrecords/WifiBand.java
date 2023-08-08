package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum WifiBand implements ValuedEnum {
    Unknown("unknown"),
    Frequency24GHz("frequency24GHz"),
    Frequency50GHz("frequency50GHz"),
    Frequency60GHz("frequency60GHz"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WifiBand(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WifiBand forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "frequency24GHz": return Frequency24GHz;
            case "frequency50GHz": return Frequency50GHz;
            case "frequency60GHz": return Frequency60GHz;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
