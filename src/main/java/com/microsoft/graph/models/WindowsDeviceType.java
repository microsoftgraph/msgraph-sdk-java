package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Contains properties for Windows device type.
 */
public enum WindowsDeviceType implements ValuedEnum {
    /** No flags set. */
    None("none"),
    /** Whether or not the Desktop Windows device type is supported. */
    Desktop("desktop"),
    /** Whether or not the Mobile Windows device type is supported. */
    Mobile("mobile"),
    /** Whether or not the Holographic Windows device type is supported. */
    Holographic("holographic"),
    /** Whether or not the Team Windows device type is supported. */
    Team("team");
    public final String value;
    WindowsDeviceType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsDeviceType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "desktop": return Desktop;
            case "mobile": return Mobile;
            case "holographic": return Holographic;
            case "team": return Team;
            default: return null;
        }
    }
}
