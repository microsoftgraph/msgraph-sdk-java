package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum IdentityUserFlowAttributeDataType implements ValuedEnum {
    String("string"),
    BooleanEscaped("booleanEscaped"),
    Int64("int64"),
    StringCollection("stringCollection"),
    DateTime("dateTime"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IdentityUserFlowAttributeDataType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IdentityUserFlowAttributeDataType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "string": return String;
            case "boolean": return BooleanEscaped;
            case "int64": return Int64;
            case "stringCollection": return StringCollection;
            case "dateTime": return DateTime;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
