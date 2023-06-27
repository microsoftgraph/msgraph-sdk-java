package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of Exchange Connector.
 */
public enum DeviceManagementExchangeConnectorType implements ValuedEnum {
    /** Connects to on-premises Exchange Environment. */
    OnPremises("onPremises"),
    /** Connects to O365 multi-tenant Exchange environment */
    Hosted("hosted"),
    /** Intune Service connects directly to O365 multi-tenant Exchange environment */
    ServiceToService("serviceToService"),
    /** Connects to O365 Dedicated Exchange environment. */
    Dedicated("dedicated"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementExchangeConnectorType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementExchangeConnectorType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "onPremises": return OnPremises;
            case "hosted": return Hosted;
            case "serviceToService": return ServiceToService;
            case "dedicated": return Dedicated;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
