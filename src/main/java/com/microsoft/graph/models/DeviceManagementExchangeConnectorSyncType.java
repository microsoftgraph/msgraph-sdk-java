package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of Exchange Connector sync requested.
 */
public enum DeviceManagementExchangeConnectorSyncType implements ValuedEnum {
    /** Discover all the device in Exchange. */
    FullSync("fullSync"),
    /** Discover only the device in Exchange which have updated during the delta sync window. */
    DeltaSync("deltaSync");
    public final String value;
    DeviceManagementExchangeConnectorSyncType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementExchangeConnectorSyncType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "fullSync": return FullSync;
            case "deltaSync": return DeltaSync;
            default: return null;
        }
    }
}
