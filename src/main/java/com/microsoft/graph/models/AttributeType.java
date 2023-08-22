package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AttributeType implements ValuedEnum {
    String("String"),
    Integer("Integer"),
    Reference("Reference"),
    Binary("Binary"),
    Boolean("Boolean"),
    DateTime("DateTime");
    public final String value;
    AttributeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AttributeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "String": return String;
            case "Integer": return Integer;
            case "Reference": return Reference;
            case "Binary": return Binary;
            case "Boolean": return Boolean;
            case "DateTime": return DateTime;
            default: return null;
        }
    }
}
