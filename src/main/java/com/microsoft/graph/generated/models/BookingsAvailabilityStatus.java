package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BookingsAvailabilityStatus implements ValuedEnum {
    Available("available"),
    Busy("busy"),
    SlotsAvailable("slotsAvailable"),
    OutOfOffice("outOfOffice"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BookingsAvailabilityStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BookingsAvailabilityStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "available": return Available;
            case "busy": return Busy;
            case "slotsAvailable": return SlotsAvailable;
            case "outOfOffice": return OutOfOffice;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
