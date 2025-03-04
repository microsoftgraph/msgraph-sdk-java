package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamsMessageDeliveryAction implements ValuedEnum {
    Unknown("unknown"),
    DeliveredAsSpam("deliveredAsSpam"),
    Delivered("delivered"),
    Blocked("blocked"),
    Replaced("replaced"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamsMessageDeliveryAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamsMessageDeliveryAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "deliveredAsSpam": return DeliveredAsSpam;
            case "delivered": return Delivered;
            case "blocked": return Blocked;
            case "replaced": return Replaced;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
