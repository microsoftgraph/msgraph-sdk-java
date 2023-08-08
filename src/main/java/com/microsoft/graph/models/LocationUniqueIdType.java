package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum LocationUniqueIdType implements ValuedEnum {
    Unknown("unknown"),
    LocationStore("locationStore"),
    Directory("directory"),
    Private("private"),
    Bing("bing");
    public final String value;
    LocationUniqueIdType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LocationUniqueIdType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "locationStore": return LocationStore;
            case "directory": return Directory;
            case "private": return Private;
            case "bing": return Bing;
            default: return null;
        }
    }
}
