package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Contains value for notification status.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Win32LobAppNotification implements ValuedEnum {
    /** Show all notifications. */
    ShowAll("showAll"),
    /** Only show restart notification and suppress other notifications. */
    ShowReboot("showReboot"),
    /** Hide all notifications. */
    HideAll("hideAll");
    public final String value;
    Win32LobAppNotification(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Win32LobAppNotification forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "showAll": return ShowAll;
            case "showReboot": return ShowReboot;
            case "hideAll": return HideAll;
            default: return null;
        }
    }
}
