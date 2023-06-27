package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for internet site security level.
 */
public enum InternetSiteSecurityLevel implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Medium. */
    Medium("medium"),
    /** Medium-High. */
    MediumHigh("mediumHigh"),
    /** High. */
    High("high");
    public final String value;
    InternetSiteSecurityLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static InternetSiteSecurityLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "medium": return Medium;
            case "mediumHigh": return MediumHigh;
            case "high": return High;
            default: return null;
        }
    }
}
