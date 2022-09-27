package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum BookingStaffRole implements ValuedEnum {
    Guest("guest"),
    Administrator("administrator"),
    Viewer("viewer"),
    ExternalGuest("externalGuest"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BookingStaffRole(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BookingStaffRole forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "guest": return Guest;
            case "administrator": return Administrator;
            case "viewer": return Viewer;
            case "externalGuest": return ExternalGuest;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
