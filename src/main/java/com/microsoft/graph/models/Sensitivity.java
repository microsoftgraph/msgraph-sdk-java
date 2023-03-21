package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum Sensitivity implements ValuedEnum {
    Normal("normal"),
    Personal("personal"),
    PrivateEscaped("privateEscaped"),
    Confidential("confidential");
    public final String value;
    Sensitivity(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Sensitivity forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "normal": return Normal;
            case "personal": return Personal;
            case "private": return PrivateEscaped;
            case "confidential": return Confidential;
            default: return null;
        }
    }
}
