package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum ManagedAppAvailability implements ValuedEnum {
    /** A globally available app to all tenants. */
    Global("global"),
    /** A line of business apps private to an organization. */
    LineOfBusiness("lineOfBusiness");
    public final String value;
    ManagedAppAvailability(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedAppAvailability forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "global": return Global;
            case "lineOfBusiness": return LineOfBusiness;
            default: return null;
        }
    }
}
