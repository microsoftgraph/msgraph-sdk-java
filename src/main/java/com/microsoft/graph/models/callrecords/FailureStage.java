package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the cloudCommunications singleton. */
public enum FailureStage implements ValuedEnum {
    Unknown("unknown"),
    CallSetup("callSetup"),
    Midcall("midcall"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FailureStage(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static FailureStage forValue(@javax.annotation.Nonnull final String searchValue) {
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
