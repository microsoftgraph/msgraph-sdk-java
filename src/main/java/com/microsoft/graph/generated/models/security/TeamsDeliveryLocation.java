package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamsDeliveryLocation implements ValuedEnum {
    Unknown("unknown"),
    Teams("teams"),
    Quarantine("quarantine"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamsDeliveryLocation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamsDeliveryLocation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "teams": return Teams;
            case "quarantine": return Quarantine;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
