package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DataSourceContainerStatus implements ValuedEnum {
    Active("active"),
    Released("released"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DataSourceContainerStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DataSourceContainerStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "released": return Released;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
