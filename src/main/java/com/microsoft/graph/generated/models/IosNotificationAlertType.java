package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Notification Settings Alert Type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IosNotificationAlertType implements ValuedEnum {
    /** Device default value, no intent. */
    DeviceDefault("deviceDefault"),
    /** Banner. */
    Banner("banner"),
    /** Modal. */
    Modal("modal"),
    /** None. */
    None("none");
    public final String value;
    IosNotificationAlertType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IosNotificationAlertType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "banner": return Banner;
            case "modal": return Modal;
            case "none": return None;
            default: return null;
        }
    }
}
