package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProtectionScopeState implements ValuedEnum {
    NotModified("notModified"),
    Modified("modified"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProtectionScopeState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProtectionScopeState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notModified": return NotModified;
            case "modified": return Modified;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
