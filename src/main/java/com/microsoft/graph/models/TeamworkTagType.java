package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TeamworkTagType implements ValuedEnum {
    Standard("standard"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkTagType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamworkTagType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
