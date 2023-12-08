package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VirtualEventAttendeeRegistrationStatus implements ValuedEnum {
    Registered("registered"),
    Canceled("canceled"),
    Waitlisted("waitlisted"),
    PendingApproval("pendingApproval"),
    RejectedByOrganizer("rejectedByOrganizer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VirtualEventAttendeeRegistrationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VirtualEventAttendeeRegistrationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "registered": return Registered;
            case "canceled": return Canceled;
            case "waitlisted": return Waitlisted;
            case "pendingApproval": return PendingApproval;
            case "rejectedByOrganizer": return RejectedByOrganizer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
