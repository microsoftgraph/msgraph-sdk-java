package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RestrictionAction implements ValuedEnum {
    Warn("warn"),
    Audit("audit"),
    Block("block");
    public final String value;
    RestrictionAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RestrictionAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "warn": return Warn;
            case "audit": return Audit;
            case "block": return Block;
            default: return null;
        }
    }
}
