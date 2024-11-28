package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SensorType implements ValuedEnum {
    AdConnectIntegrated("adConnectIntegrated"),
    AdcsIntegrated("adcsIntegrated"),
    AdfsIntegrated("adfsIntegrated"),
    DomainControllerIntegrated("domainControllerIntegrated"),
    DomainControllerStandalone("domainControllerStandalone"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SensorType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SensorType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "adConnectIntegrated": return AdConnectIntegrated;
            case "adcsIntegrated": return AdcsIntegrated;
            case "adfsIntegrated": return AdfsIntegrated;
            case "domainControllerIntegrated": return DomainControllerIntegrated;
            case "domainControllerStandalone": return DomainControllerStandalone;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
