package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PrintEvent implements ValuedEnum {
    JobStarted("jobStarted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrintEvent(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrintEvent forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "jobStarted": return JobStarted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
