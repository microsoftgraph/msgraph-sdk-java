package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GoogleCloudLocationType implements ValuedEnum {
    Unknown("unknown"),
    Regional("regional"),
    Zonal("zonal"),
    Global("global"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    GoogleCloudLocationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GoogleCloudLocationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "regional": return Regional;
            case "zonal": return Zonal;
            case "global": return Global;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
