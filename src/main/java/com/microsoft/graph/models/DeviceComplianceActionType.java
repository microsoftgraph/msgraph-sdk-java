package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Scheduled Action Type Enum
 */
public enum DeviceComplianceActionType implements ValuedEnum {
    /** No Action */
    NoAction("noAction"),
    /** Send Notification */
    Notification("notification"),
    /** Block the device in AAD */
    Block("block"),
    /** Retire the device */
    Retire("retire"),
    /** Wipe the device */
    Wipe("wipe"),
    /** Remove Resource Access Profiles from the device */
    RemoveResourceAccessProfiles("removeResourceAccessProfiles"),
    /** Send push notification to device */
    PushNotification("pushNotification");
    public final String value;
    DeviceComplianceActionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceComplianceActionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noAction": return NoAction;
            case "notification": return Notification;
            case "block": return Block;
            case "retire": return Retire;
            case "wipe": return Wipe;
            case "removeResourceAccessProfiles": return RemoveResourceAccessProfiles;
            case "pushNotification": return PushNotification;
            default: return null;
        }
    }
}
