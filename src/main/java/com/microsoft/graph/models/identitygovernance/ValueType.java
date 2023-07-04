package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ValueType implements ValuedEnum {
    EnumEscaped("enum"),
    String("string"),
    IntEscaped("int"),
    Bool("bool"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ValueType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ValueType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enum": return EnumEscaped;
            case "string": return String;
            case "int": return IntEscaped;
            case "bool": return Bool;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
