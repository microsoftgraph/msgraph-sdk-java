package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum BookingReminderRecipients implements ValuedEnum {
    AllAttendees("allAttendees"),
    Staff("staff"),
    Customer("customer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BookingReminderRecipients(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BookingReminderRecipients forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAttendees": return AllAttendees;
            case "staff": return Staff;
            case "customer": return Customer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
