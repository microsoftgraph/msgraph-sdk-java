package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CallDirection implements ValuedEnum {
    Incoming("incoming"),
    Outgoing("outgoing");
    public final String value;
    CallDirection(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CallDirection forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "incoming": return Incoming;
            case "outgoing": return Outgoing;
            default: return null;
        }
    }
}
