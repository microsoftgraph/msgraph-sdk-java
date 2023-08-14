package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum FailureStage implements ValuedEnum {
    Unknown("unknown"),
    CallSetup("callSetup"),
    Midcall("midcall"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FailureStage(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FailureStage forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "callSetup": return CallSetup;
            case "midcall": return Midcall;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
