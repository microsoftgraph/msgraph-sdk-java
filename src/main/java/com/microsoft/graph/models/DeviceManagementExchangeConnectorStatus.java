package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum DeviceManagementExchangeConnectorStatus implements ValuedEnum {
    /** No Connector exists. */
    None("none"),
    /** Pending Connection to the Exchange Environment. */
    ConnectionPending("connectionPending"),
    /** Connected to the Exchange Environment */
    Connected("connected"),
    /** Disconnected from the Exchange Environment */
    Disconnected("disconnected");
    public final String value;
    DeviceManagementExchangeConnectorStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementExchangeConnectorStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "connectionPending": return ConnectionPending;
            case "connected": return Connected;
            case "disconnected": return Disconnected;
            default: return null;
        }
    }
}
