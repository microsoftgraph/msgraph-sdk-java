package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of managed browser
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedBrowserType implements ValuedEnum {
    /** Not configured */
    NotConfigured("notConfigured"),
    /** Microsoft Edge */
    MicrosoftEdge("microsoftEdge");
    public final String value;
    ManagedBrowserType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedBrowserType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "microsoftEdge": return MicrosoftEdge;
            default: return null;
        }
    }
}
