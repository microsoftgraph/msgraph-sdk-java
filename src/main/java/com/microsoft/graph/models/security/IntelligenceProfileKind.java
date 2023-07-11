package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum IntelligenceProfileKind implements ValuedEnum {
    Actor("actor"),
    Tool("tool"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IntelligenceProfileKind(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IntelligenceProfileKind forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "actor": return Actor;
            case "tool": return Tool;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
