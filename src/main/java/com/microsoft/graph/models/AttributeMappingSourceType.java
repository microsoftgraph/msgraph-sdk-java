package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AttributeMappingSourceType implements ValuedEnum {
    Attribute("Attribute"),
    Constant("Constant"),
    Function("Function");
    public final String value;
    AttributeMappingSourceType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AttributeMappingSourceType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Attribute": return Attribute;
            case "Constant": return Constant;
            case "Function": return Function;
            default: return null;
        }
    }
}
