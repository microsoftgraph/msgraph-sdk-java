package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SynchronizationScheduleState implements ValuedEnum {
    Active("Active"),
    Disabled("Disabled"),
    Paused("Paused");
    public final String value;
    SynchronizationScheduleState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SynchronizationScheduleState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Active": return Active;
            case "Disabled": return Disabled;
            case "Paused": return Paused;
            default: return null;
        }
    }
}
