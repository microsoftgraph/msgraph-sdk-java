package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values of required passwords.
 */
public enum RequiredPasswordType implements ValuedEnum {
    /** Device default value, no intent. */
    DeviceDefault("deviceDefault"),
    /** Alphanumeric password required. */
    Alphanumeric("alphanumeric"),
    /** Numeric password required. */
    Numeric("numeric");
    public final String value;
    RequiredPasswordType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RequiredPasswordType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "alphanumeric": return Alphanumeric;
            case "numeric": return Numeric;
            default: return null;
        }
    }
}
