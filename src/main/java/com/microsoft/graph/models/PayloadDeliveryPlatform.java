package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PayloadDeliveryPlatform implements ValuedEnum {
    Unknown("unknown"),
    Sms("sms"),
    Email("email"),
    Teams("teams"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PayloadDeliveryPlatform(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PayloadDeliveryPlatform forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "sms": return Sms;
            case "email": return Email;
            case "teams": return Teams;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
