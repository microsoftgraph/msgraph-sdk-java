package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SharePointMigrationJobErrorLevel implements ValuedEnum {
    Important("important"),
    Warning("warning"),
    Error("error"),
    FatalError("fatalError"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SharePointMigrationJobErrorLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SharePointMigrationJobErrorLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "important": return Important;
            case "warning": return Warning;
            case "error": return Error;
            case "fatalError": return FatalError;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
