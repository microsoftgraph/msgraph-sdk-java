package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A managed (MAM) application's availability.
 */
public enum ManagedAppAvailability implements ValuedEnum {
    /** A globally available app to all tenants. */
    Global("global"),
    /** A line of business apps private to an organization. */
    LineOfBusiness("lineOfBusiness");
    public final String value;
    ManagedAppAvailability(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedAppAvailability forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "global": return Global;
            case "lineOfBusiness": return LineOfBusiness;
            default: return null;
        }
    }
}
