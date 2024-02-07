package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Allows IT admind to set a predefined default search engine for MDM-Controlled devices
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsSpotlightEnablementSettings implements ValuedEnum {
    /** Spotlight on lock screen is not configured */
    NotConfigured("notConfigured"),
    /** Disable Windows Spotlight on lock screen */
    Disabled("disabled"),
    /** Enable Windows Spotlight on lock screen */
    Enabled("enabled");
    public final String value;
    WindowsSpotlightEnablementSettings(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsSpotlightEnablementSettings forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "disabled": return Disabled;
            case "enabled": return Enabled;
            default: return null;
        }
    }
}
