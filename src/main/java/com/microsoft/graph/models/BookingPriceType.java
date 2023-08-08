package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the type of pricing of a booking service.
 */
public enum BookingPriceType implements ValuedEnum {
    /** The price of the service is not defined. */
    Undefined("undefined"),
    /** The price of the service is fixed. */
    FixedPrice("fixedPrice"),
    /** The price of the service starts with a particular value, but can be higher based on the final services performed. */
    StartingAt("startingAt"),
    /** The price of the service depends on the number of hours a staff member works on the service. */
    Hourly("hourly"),
    /** The service is free. */
    Free("free"),
    /** The price of the service varies. */
    PriceVaries("priceVaries"),
    /** The price of the service is not listed. */
    CallUs("callUs"),
    /** The price of the service is not set. */
    NotSet("notSet"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BookingPriceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BookingPriceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "undefined": return Undefined;
            case "fixedPrice": return FixedPrice;
            case "startingAt": return StartingAt;
            case "hourly": return Hourly;
            case "free": return Free;
            case "priceVaries": return PriceVaries;
            case "callUs": return CallUs;
            case "notSet": return NotSet;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
