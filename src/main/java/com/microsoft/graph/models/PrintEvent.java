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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrintEvent forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "jobStarted": return JobStarted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
