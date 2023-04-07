package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum WeekIndex implements ValuedEnum {
    First("first"),
    Second("second"),
    Third("third"),
    Fourth("fourth"),
    Last("last");
    public final String value;
    WeekIndex(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WeekIndex forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "first": return First;
            case "second": return Second;
            case "third": return Third;
            case "fourth": return Fourth;
            case "last": return Last;
            default: return null;
        }
    }
}
