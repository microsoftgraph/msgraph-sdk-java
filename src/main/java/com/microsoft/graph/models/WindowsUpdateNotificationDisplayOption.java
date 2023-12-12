package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Windows Update Notification Display Options
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsUpdateNotificationDisplayOption implements ValuedEnum {
    /** Not configured */
    NotConfigured("notConfigured"),
    /** Use the default Windows Update notifications. */
    DefaultNotifications("defaultNotifications"),
    /** Turn off all notifications, excluding restart warnings. */
    RestartWarningsOnly("restartWarningsOnly"),
    /** Turn off all notifications, including restart warnings. */
    DisableAllNotifications("disableAllNotifications"),
    /** Evolvable enum member */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsUpdateNotificationDisplayOption(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsUpdateNotificationDisplayOption forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "defaultNotifications": return DefaultNotifications;
            case "restartWarningsOnly": return RestartWarningsOnly;
            case "disableAllNotifications": return DisableAllNotifications;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
