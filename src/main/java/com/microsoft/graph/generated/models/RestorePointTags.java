package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RestorePointTags implements ValuedEnum {
    None("none"),
    FastRestore("fastRestore"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RestorePointTags(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RestorePointTags forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "fastRestore": return FastRestore;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
