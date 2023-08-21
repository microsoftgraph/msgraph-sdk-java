package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Movies rating labels in Australia
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RatingAustraliaMoviesType implements ValuedEnum {
    /** Default value, allow all movies content */
    AllAllowed("allAllowed"),
    /** Do not allow any movies content */
    AllBlocked("allBlocked"),
    /** The G classification is suitable for everyone */
    General("general"),
    /** The PG recommends viewers under 15 with guidance from parents or guardians */
    ParentalGuidance("parentalGuidance"),
    /** The M classification is not recommended for viewers under 15 */
    Mature("mature"),
    /** The MA15+ classification is not suitable for viewers under 15 */
    AgesAbove15("agesAbove15"),
    /** The R18+ classification is not suitable for viewers under 18 */
    AgesAbove18("agesAbove18");
    public final String value;
    RatingAustraliaMoviesType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RatingAustraliaMoviesType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "general": return General;
            case "parentalGuidance": return ParentalGuidance;
            case "mature": return Mature;
            case "agesAbove15": return AgesAbove15;
            case "agesAbove18": return AgesAbove18;
            default: return null;
        }
    }
}
