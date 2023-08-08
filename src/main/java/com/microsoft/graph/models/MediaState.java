package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum MediaState implements ValuedEnum {
    Active("active"),
    Inactive("inactive"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MediaState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MediaState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "inactive": return Inactive;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
