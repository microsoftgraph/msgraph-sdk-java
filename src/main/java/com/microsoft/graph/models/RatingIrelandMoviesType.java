package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Movies rating labels in Ireland
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RatingIrelandMoviesType implements ValuedEnum {
    /** Default value, allow all movies content */
    AllAllowed("allAllowed"),
    /** Do not allow any movies content */
    AllBlocked("allBlocked"),
    /** Suitable for children of school going age */
    General("general"),
    /** The PG classification advises parental guidance */
    ParentalGuidance("parentalGuidance"),
    /** The 12A classification is suitable for viewers of 12 or older */
    AgesAbove12("agesAbove12"),
    /** The 15A classification is suitable for viewers of 15 or older */
    AgesAbove15("agesAbove15"),
    /** The 16 classification is suitable for viewers of 16 or older */
    AgesAbove16("agesAbove16"),
    /** The 18 classification, suitable only for adults */
    Adults("adults");
    public final String value;
    RatingIrelandMoviesType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RatingIrelandMoviesType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "general": return General;
            case "parentalGuidance": return ParentalGuidance;
            case "agesAbove12": return AgesAbove12;
            case "agesAbove15": return AgesAbove15;
            case "agesAbove16": return AgesAbove16;
            case "adults": return Adults;
            default: return null;
        }
    }
}
