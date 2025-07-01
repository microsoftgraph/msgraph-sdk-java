package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CallEventType implements ValuedEnum {
    CallStarted("callStarted"),
    CallEnded("callEnded"),
    UnknownFutureValue("unknownFutureValue"),
    RosterUpdated("rosterUpdated");
    public final String value;
    CallEventType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CallEventType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "callStarted": return CallStarted;
            case "callEnded": return CallEnded;
            case "unknownFutureValue": return UnknownFutureValue;
            case "rosterUpdated": return RosterUpdated;
            default: return null;
        }
    }
}
