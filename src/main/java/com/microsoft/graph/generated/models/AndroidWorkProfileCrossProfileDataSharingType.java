package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android Work Profile cross profile data sharing type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidWorkProfileCrossProfileDataSharingType implements ValuedEnum {
    /** Device default value, no intent. */
    DeviceDefault("deviceDefault"),
    /** Prevent any sharing. */
    PreventAny("preventAny"),
    /** Allow data sharing request from personal profile to work profile. */
    AllowPersonalToWork("allowPersonalToWork"),
    /** No restrictions on sharing. */
    NoRestrictions("noRestrictions");
    public final String value;
    AndroidWorkProfileCrossProfileDataSharingType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidWorkProfileCrossProfileDataSharingType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "preventAny": return PreventAny;
            case "allowPersonalToWork": return AllowPersonalToWork;
            case "noRestrictions": return NoRestrictions;
            default: return null;
        }
    }
}
