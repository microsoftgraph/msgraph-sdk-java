package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum Importance implements ValuedEnum {
    Low("low"),
    Normal("normal"),
    High("high");
    public final String value;
    Importance(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Importance forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "low": return Low;
            case "normal": return Normal;
            case "high": return High;
            default: return null;
        }
    }
}
