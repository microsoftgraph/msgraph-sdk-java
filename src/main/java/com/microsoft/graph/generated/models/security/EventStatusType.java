package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EventStatusType implements ValuedEnum {
    Pending("pending"),
    Error("error"),
    Success("success"),
    NotAvaliable("notAvaliable"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EventStatusType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EventStatusType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "error": return Error;
            case "success": return Success;
            case "notAvaliable": return NotAvaliable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
