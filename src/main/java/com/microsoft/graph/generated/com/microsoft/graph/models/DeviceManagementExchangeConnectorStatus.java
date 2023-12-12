package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The current status of the Exchange Connector.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementExchangeConnectorStatus implements ValuedEnum {
    /** No Connector exists. */
    None("none"),
    /** Pending Connection to the Exchange Environment. */
    ConnectionPending("connectionPending"),
    /** Connected to the Exchange Environment */
    Connected("connected"),
    /** Disconnected from the Exchange Environment */
    Disconnected("disconnected"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementExchangeConnectorStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementExchangeConnectorStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "connectionPending": return ConnectionPending;
            case "connected": return Connected;
            case "disconnected": return Disconnected;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
