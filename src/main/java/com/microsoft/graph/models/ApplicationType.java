package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible types of Application
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApplicationType implements ValuedEnum {
    /** The windows universal application */
    Universal("universal"),
    /** The windows desktop application */
    Desktop("desktop");
    public final String value;
    ApplicationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApplicationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "universal": return Universal;
            case "desktop": return Desktop;
            default: return null;
        }
    }
}
