package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Owner type of device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedDeviceOwnerType implements ValuedEnum {
    /** Unknown device owner type. */
    Unknown("unknown"),
    /** Corporate device owner type. */
    Company("company"),
    /** Personal device owner type. */
    Personal("personal"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ManagedDeviceOwnerType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedDeviceOwnerType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "company": return Company;
            case "personal": return Personal;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
