package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Contains value for auto-update superseded apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Win32LobAutoUpdateSupersededAppsState implements ValuedEnum {
    /** Indicates that the auto-update superseded apps state is not configured and the app will not auto-update the superseded apps. */
    NotConfigured("notConfigured"),
    /** Indicates that the auto-update superseded apps state is enabled and the app will auto-update the superseded apps if the superseded apps are installed on the device. */
    Enabled("enabled"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Win32LobAutoUpdateSupersededAppsState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Win32LobAutoUpdateSupersededAppsState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "enabled": return Enabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
