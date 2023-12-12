package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for site security level.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SiteSecurityLevel implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Low. */
    Low("low"),
    /** Medium-low. */
    MediumLow("mediumLow"),
    /** Medium. */
    Medium("medium"),
    /** Medium-high. */
    MediumHigh("mediumHigh"),
    /** High. */
    High("high");
    public final String value;
    SiteSecurityLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SiteSecurityLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "low": return Low;
            case "mediumLow": return MediumLow;
            case "medium": return Medium;
            case "mediumHigh": return MediumHigh;
            case "high": return High;
            default: return null;
        }
    }
}
