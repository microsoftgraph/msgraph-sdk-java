package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PropertyType implements ValuedEnum {
    String("string"),
    Int64("int64"),
    DoubleEscaped("double"),
    DateTime("dateTime"),
    BooleanEscaped("boolean"),
    StringCollection("stringCollection"),
    Int64Collection("int64Collection"),
    DoubleCollection("doubleCollection"),
    DateTimeCollection("dateTimeCollection"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PropertyType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PropertyType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "string": return String;
            case "int64": return Int64;
            case "double": return DoubleEscaped;
            case "dateTime": return DateTime;
            case "boolean": return BooleanEscaped;
            case "stringCollection": return StringCollection;
            case "int64Collection": return Int64Collection;
            case "doubleCollection": return DoubleCollection;
            case "dateTimeCollection": return DateTimeCollection;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
