package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ScopeOperatorType implements ValuedEnum {
    Binary("Binary"),
    Unary("Unary");
    public final String value;
    ScopeOperatorType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ScopeOperatorType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Binary": return Binary;
            case "Unary": return Unary;
            default: return null;
        }
    }
}
