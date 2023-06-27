package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Movies rating labels in United Kingdom
 */
public enum RatingUnitedKingdomMoviesType implements ValuedEnum {
    /** Default value, allow all movies content */
    AllAllowed("allAllowed"),
    /** Do not allow any movies content */
    AllBlocked("allBlocked"),
    /** The U classification is suitable for all ages */
    General("general"),
    /** The UC classification is suitable for pre-school children, an old rating label */
    UniversalChildren("universalChildren"),
    /** The PG classification is suitable for mature */
    ParentalGuidance("parentalGuidance"),
    /** 12, video release suitable for 12 years and over */
    AgesAbove12Video("agesAbove12Video"),
    /** 12A, cinema release suitable for 12 years and over */
    AgesAbove12Cinema("agesAbove12Cinema"),
    /** 15, suitable only for 15 years and older */
    AgesAbove15("agesAbove15"),
    /** Suitable only for adults */
    Adults("adults");
    public final String value;
    RatingUnitedKingdomMoviesType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RatingUnitedKingdomMoviesType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "general": return General;
            case "universalChildren": return UniversalChildren;
            case "parentalGuidance": return ParentalGuidance;
            case "agesAbove12Video": return AgesAbove12Video;
            case "agesAbove12Cinema": return AgesAbove12Cinema;
            case "agesAbove15": return AgesAbove15;
            case "adults": return Adults;
            default: return null;
        }
    }
}
