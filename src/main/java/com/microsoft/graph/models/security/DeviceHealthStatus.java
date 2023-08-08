package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DeviceHealthStatus implements ValuedEnum {
    Active("active"),
    Inactive("inactive"),
    ImpairedCommunication("impairedCommunication"),
    NoSensorData("noSensorData"),
    NoSensorDataImpairedCommunication("noSensorDataImpairedCommunication"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceHealthStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceHealthStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "inactive": return Inactive;
            case "impairedCommunication": return ImpairedCommunication;
            case "noSensorData": return NoSensorData;
            case "noSensorDataImpairedCommunication": return NoSensorDataImpairedCommunication;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
