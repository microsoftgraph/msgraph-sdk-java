package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AttributeType forValue(@javax.annotation.Nonnull final String searchValue) {
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
