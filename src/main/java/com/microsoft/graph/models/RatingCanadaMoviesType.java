package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Movies rating labels in Canada */
public enum RatingCanadaMoviesType implements ValuedEnum {
    /** Default value, allow all movies content */
    AllAllowed("allAllowed"),
    /** Do not allow any movies content */
    AllBlocked("allBlocked"),
    /** The G classification is suitable for all ages */
    General("general"),
    /** The PG classification advises parental guidance */
    ParentalGuidance("parentalGuidance"),
    /** The 14A classification is suitable for viewers above 14 or older */
    AgesAbove14("agesAbove14"),
    /** The 18A classification is suitable for viewers above 18 or older */
    AgesAbove18("agesAbove18"),
    /** The R classification is restricted to 18 years and older */
    Restricted("restricted");
    public final String value;
    RatingCanadaMoviesType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RatingCanadaMoviesType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "general": return General;
            case "parentalGuidance": return ParentalGuidance;
            case "agesAbove14": return AgesAbove14;
            case "agesAbove18": return AgesAbove18;
            case "restricted": return Restricted;
            default: return null;
        }
    }
}
