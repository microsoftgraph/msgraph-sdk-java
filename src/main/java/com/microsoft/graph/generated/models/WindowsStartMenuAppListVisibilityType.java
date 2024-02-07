package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of start menu app list visibility.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsStartMenuAppListVisibilityType implements ValuedEnum {
    /** User defined. Default value. */
    UserDefined("userDefined"),
    /** Collapse the app list on the start menu. */
    Collapse("collapse"),
    /** Removes the app list entirely from the start menu. */
    Remove("remove"),
    /** Disables the corresponding toggle (Collapse or Remove) in the Settings app. */
    DisableSettingsApp("disableSettingsApp");
    public final String value;
    WindowsStartMenuAppListVisibilityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsStartMenuAppListVisibilityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "collapse": return Collapse;
            case "remove": return Remove;
            case "disableSettingsApp": return DisableSettingsApp;
            default: return null;
        }
    }
}
