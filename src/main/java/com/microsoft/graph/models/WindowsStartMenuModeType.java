package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of display modes for the start menu.
 */
public enum WindowsStartMenuModeType implements ValuedEnum {
    /** User defined. Default value. */
    UserDefined("userDefined"),
    /** Full screen. */
    FullScreen("fullScreen"),
    /** Non-full screen. */
    NonFullScreen("nonFullScreen");
    public final String value;
    WindowsStartMenuModeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsStartMenuModeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "fullScreen": return FullScreen;
            case "nonFullScreen": return NonFullScreen;
            default: return null;
        }
    }
}
