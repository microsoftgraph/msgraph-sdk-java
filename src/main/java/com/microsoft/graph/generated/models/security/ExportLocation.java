package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExportLocation implements ValuedEnum {
    ResponsiveLocations("responsiveLocations"),
    NonresponsiveLocations("nonresponsiveLocations"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ExportLocation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExportLocation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "responsiveLocations": return ResponsiveLocations;
            case "nonresponsiveLocations": return NonresponsiveLocations;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
