package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ValueType implements ValuedEnum {
    Enum("enum"),
    String("string"),
    Int("int"),
    Bool("bool"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ValueType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ValueType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enum": return Enum;
            case "string": return String;
            case "int": return Int;
            case "bool": return Bool;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
