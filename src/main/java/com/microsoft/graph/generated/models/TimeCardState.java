package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TimeCardState implements ValuedEnum {
    ClockedIn("clockedIn"),
    OnBreak("onBreak"),
    ClockedOut("clockedOut"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TimeCardState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TimeCardState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "clockedIn": return ClockedIn;
            case "onBreak": return OnBreak;
            case "clockedOut": return ClockedOut;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
