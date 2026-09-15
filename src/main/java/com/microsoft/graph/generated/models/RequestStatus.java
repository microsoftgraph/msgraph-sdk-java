package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RequestStatus implements ValuedEnum {
    /** Represents a governance request that is pending */
    Pending("pending"),
    /** Represents a governance request that was accepted */
    Accepted("accepted"),
    /** Represents a governance request that was rejected */
    Rejected("rejected"),
    /** This will help in making this enum evolable and adding more values in the future- */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RequestStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RequestStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "accepted": return Accepted;
            case "rejected": return Rejected;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
