package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IntelligenceProfileKind implements ValuedEnum {
    Actor("actor"),
    Tool("tool"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IntelligenceProfileKind(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IntelligenceProfileKind forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "actor": return Actor;
            case "tool": return Tool;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
