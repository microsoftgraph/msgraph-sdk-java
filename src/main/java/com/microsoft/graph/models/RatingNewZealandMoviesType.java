package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Movies rating labels in New Zealand
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RatingNewZealandMoviesType implements ValuedEnum {
    /** Default value, allow all movies content */
    AllAllowed("allAllowed"),
    /** Do not allow any movies content */
    AllBlocked("allBlocked"),
    /** Suitable for general audience */
    General("general"),
    /** The PG classification recommends parental guidance */
    ParentalGuidance("parentalGuidance"),
    /** The M classification is suitable for mature audience */
    Mature("mature"),
    /** The R13 classification is restricted to persons 13 years and over */
    AgesAbove13("agesAbove13"),
    /** The R15 classification is restricted to persons 15 years and over */
    AgesAbove15("agesAbove15"),
    /** The R16 classification is restricted to persons 16 years and over */
    AgesAbove16("agesAbove16"),
    /** The R18 classification is restricted to persons 18 years and over */
    AgesAbove18("agesAbove18"),
    /** The R classification is restricted to a certain audience */
    Restricted("restricted"),
    /** The RP16 classification requires viewers under 16 accompanied by a parent or an adult */
    AgesAbove16Restricted("agesAbove16Restricted");
    public final String value;
    RatingNewZealandMoviesType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RatingNewZealandMoviesType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "general": return General;
            case "parentalGuidance": return ParentalGuidance;
            case "mature": return Mature;
            case "agesAbove13": return AgesAbove13;
            case "agesAbove15": return AgesAbove15;
            case "agesAbove16": return AgesAbove16;
            case "agesAbove18": return AgesAbove18;
            case "restricted": return Restricted;
            case "agesAbove16Restricted": return AgesAbove16Restricted;
            default: return null;
        }
    }
}
