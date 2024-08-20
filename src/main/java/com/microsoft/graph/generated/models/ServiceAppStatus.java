package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceAppStatus implements ValuedEnum {
    Inactive("inactive"),
    Active("active"),
    PendingActive("pendingActive"),
    PendingInactive("pendingInactive"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceAppStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceAppStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "inactive": return Inactive;
            case "active": return Active;
            case "pendingActive": return PendingActive;
            case "pendingInactive": return PendingInactive;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
