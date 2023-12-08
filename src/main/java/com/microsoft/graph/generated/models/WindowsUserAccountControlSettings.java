package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for Windows user account control settings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsUserAccountControlSettings implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Always notify. */
    AlwaysNotify("alwaysNotify"),
    /** Notify on app changes. */
    NotifyOnAppChanges("notifyOnAppChanges"),
    /** Notify on app changes without dimming desktop. */
    NotifyOnAppChangesWithoutDimming("notifyOnAppChangesWithoutDimming"),
    /** Never notify. */
    NeverNotify("neverNotify");
    public final String value;
    WindowsUserAccountControlSettings(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsUserAccountControlSettings forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "alwaysNotify": return AlwaysNotify;
            case "notifyOnAppChanges": return NotifyOnAppChanges;
            case "notifyOnAppChangesWithoutDimming": return NotifyOnAppChangesWithoutDimming;
            case "neverNotify": return NeverNotify;
            default: return null;
        }
    }
}
