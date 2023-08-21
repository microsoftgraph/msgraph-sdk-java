package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DataSourceHoldStatus implements ValuedEnum {
    NotApplied("notApplied"),
    Applied("applied"),
    Applying("applying"),
    Removing("removing"),
    Partial("partial"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DataSourceHoldStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DataSourceHoldStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notApplied": return NotApplied;
            case "applied": return Applied;
            case "applying": return Applying;
            case "removing": return Removing;
            case "partial": return Partial;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
