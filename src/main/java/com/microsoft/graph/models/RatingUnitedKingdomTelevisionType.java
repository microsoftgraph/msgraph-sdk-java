package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * TV content rating labels in United Kingdom
 */
public enum RatingUnitedKingdomTelevisionType implements ValuedEnum {
    /** Default value, allow all TV shows content */
    AllAllowed("allAllowed"),
    /** Do not allow any TV shows content */
    AllBlocked("allBlocked"),
    /** Allowing TV contents with a warning message */
    Caution("caution");
    public final String value;
    RatingUnitedKingdomTelevisionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RatingUnitedKingdomTelevisionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "caution": return Caution;
            default: return null;
        }
    }
}
