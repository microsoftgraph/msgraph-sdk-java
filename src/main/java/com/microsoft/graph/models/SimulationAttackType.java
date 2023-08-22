package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SimulationAttackType implements ValuedEnum {
    Unknown("unknown"),
    Social("social"),
    Cloud("cloud"),
    Endpoint("endpoint"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SimulationAttackType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SimulationAttackType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "social": return Social;
            case "cloud": return Cloud;
            case "endpoint": return Endpoint;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
