package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ClaimBindingSource implements ValuedEnum {
    Directory("directory"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ClaimBindingSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ClaimBindingSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "directory": return Directory;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
