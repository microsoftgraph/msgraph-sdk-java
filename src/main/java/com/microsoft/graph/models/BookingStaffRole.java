package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BookingStaffRole implements ValuedEnum {
    Guest("guest"),
    Administrator("administrator"),
    Viewer("viewer"),
    ExternalGuest("externalGuest"),
    UnknownFutureValue("unknownFutureValue"),
    Scheduler("scheduler"),
    TeamMember("teamMember");
    public final String value;
    BookingStaffRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BookingStaffRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "guest": return Guest;
            case "administrator": return Administrator;
            case "viewer": return Viewer;
            case "externalGuest": return ExternalGuest;
            case "unknownFutureValue": return UnknownFutureValue;
            case "scheduler": return Scheduler;
            case "teamMember": return TeamMember;
            default: return null;
        }
    }
}
