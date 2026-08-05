package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OnlineMeetingType implements ValuedEnum {
    Adhoc("adhoc"),
    Scheduled("scheduled"),
    Recurring("recurring"),
    Broadcast("broadcast"),
    Meetnow("meetnow"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OnlineMeetingType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OnlineMeetingType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "adhoc": return Adhoc;
            case "scheduled": return Scheduled;
            case "recurring": return Recurring;
            case "broadcast": return Broadcast;
            case "meetnow": return Meetnow;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
