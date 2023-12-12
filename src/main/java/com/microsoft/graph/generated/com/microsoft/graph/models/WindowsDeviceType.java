package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Contains properties for Windows device type. Multiple values can be selected. Default value is `none`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsDeviceType implements ValuedEnum {
    /** No device types supported. Default value. */
    None("none"),
    /** Indicates support for Desktop Windows device type. */
    Desktop("desktop"),
    /** Indicates support for Mobile Windows device type. */
    Mobile("mobile"),
    /** Indicates support for Holographic Windows device type. */
    Holographic("holographic"),
    /** Indicates support for Team Windows device type. */
    Team("team"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsDeviceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsDeviceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "desktop": return Desktop;
            case "mobile": return Mobile;
            case "holographic": return Holographic;
            case "team": return Team;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
