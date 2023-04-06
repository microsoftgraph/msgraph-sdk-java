package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum QueryType implements ValuedEnum {
    Files("files"),
    Messages("messages"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    QueryType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static QueryType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "files": return Files;
            case "messages": return Messages;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
