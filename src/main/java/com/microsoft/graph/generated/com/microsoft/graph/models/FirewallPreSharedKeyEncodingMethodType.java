package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for firewallPreSharedKeyEncodingMethod
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FirewallPreSharedKeyEncodingMethodType implements ValuedEnum {
    /** No value configured by Intune, do not override the user-configured device default value */
    DeviceDefault("deviceDefault"),
    /** Preshared key is not encoded. Instead, it is kept in its wide-character format */
    None("none"),
    /** Encode the preshared key using UTF-8 */
    UtF8("utF8");
    public final String value;
    FirewallPreSharedKeyEncodingMethodType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FirewallPreSharedKeyEncodingMethodType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "none": return None;
            case "utF8": return UtF8;
            default: return null;
        }
    }
}
