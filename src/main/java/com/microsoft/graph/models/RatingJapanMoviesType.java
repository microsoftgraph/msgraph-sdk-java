package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Movies rating labels in Japan
 */
public enum RatingJapanMoviesType implements ValuedEnum {
    /** Default value, allow all movies content */
    AllAllowed("allAllowed"),
    /** Do not allow any movies content */
    AllBlocked("allBlocked"),
    /** Suitable for all ages */
    General("general"),
    /** The PG-12 classification requests parental guidance for young people under 12 */
    ParentalGuidance("parentalGuidance"),
    /** The R15+ classification is suitable for viewers of 15 or older */
    AgesAbove15("agesAbove15"),
    /** The R18+ classification is suitable for viewers of 18 or older */
    AgesAbove18("agesAbove18");
    public final String value;
    RatingJapanMoviesType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RatingJapanMoviesType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "general": return General;
            case "parentalGuidance": return ParentalGuidance;
            case "agesAbove15": return AgesAbove15;
            case "agesAbove18": return AgesAbove18;
            default: return null;
        }
    }
}
