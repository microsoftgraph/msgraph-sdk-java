package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Type of managed browser */
public enum ManagedBrowserType implements ValuedEnum {
    /** Not configured */
    NotConfigured("notConfigured"),
    /** Microsoft Edge */
    MicrosoftEdge("microsoftEdge");
    public final String value;
    ManagedBrowserType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedBrowserType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "microsoftEdge": return MicrosoftEdge;
            default: return null;
        }
    }
}
