package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Auto restart required notification dismissal method
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AutoRestartNotificationDismissalMethod implements ValuedEnum {
    /** Not configured */
    NotConfigured("notConfigured"),
    /** Auto dismissal Indicates that the notification is automatically dismissed without user intervention */
    Automatic("automatic"),
    /** User dismissal. Allows the user to dismiss the notification */
    User("user"),
    /** Evolvable enum member */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AutoRestartNotificationDismissalMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AutoRestartNotificationDismissalMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "automatic": return Automatic;
            case "user": return User;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
