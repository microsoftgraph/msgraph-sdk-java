package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the level to which the device's clipboard may be shared between apps
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedAppClipboardSharingLevel implements ValuedEnum {
    /** Sharing is allowed between all apps, managed or not */
    AllApps("allApps"),
    /** Sharing is allowed between all managed apps with paste in enabled */
    ManagedAppsWithPasteIn("managedAppsWithPasteIn"),
    /** Sharing is allowed between all managed apps */
    ManagedApps("managedApps"),
    /** Sharing between apps is disabled */
    Blocked("blocked");
    public final String value;
    ManagedAppClipboardSharingLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedAppClipboardSharingLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allApps": return AllApps;
            case "managedAppsWithPasteIn": return ManagedAppsWithPasteIn;
            case "managedApps": return ManagedApps;
            case "blocked": return Blocked;
            default: return null;
        }
    }
}
