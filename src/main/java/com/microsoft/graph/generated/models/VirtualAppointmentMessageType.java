package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VirtualAppointmentMessageType implements ValuedEnum {
    Confirmation("confirmation"),
    Reschedule("reschedule"),
    Cancellation("cancellation"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VirtualAppointmentMessageType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VirtualAppointmentMessageType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "confirmation": return Confirmation;
            case "reschedule": return Reschedule;
            case "cancellation": return Cancellation;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
