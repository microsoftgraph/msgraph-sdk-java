package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BookingsServiceAvailabilityType implements ValuedEnum {
    BookWhenStaffAreFree("bookWhenStaffAreFree"),
    NotBookable("notBookable"),
    CustomWeeklyHours("customWeeklyHours"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BookingsServiceAvailabilityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BookingsServiceAvailabilityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "bookWhenStaffAreFree": return BookWhenStaffAreFree;
            case "notBookable": return NotBookable;
            case "customWeeklyHours": return CustomWeeklyHours;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
