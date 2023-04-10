package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum InitiatorType implements ValuedEnum {
    User("user"),
    Application("application"),
    System("system"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    InitiatorType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static InitiatorType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "application": return Application;
            case "system": return System;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
