package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum ScheduleChangeState implements ValuedEnum {
    Pending("pending"),
    Approved("approved"),
    Declined("declined"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ScheduleChangeState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ScheduleChangeState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "approved": return Approved;
            case "declined": return Declined;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
