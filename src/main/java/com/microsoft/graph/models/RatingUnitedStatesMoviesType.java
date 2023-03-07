package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Movies rating labels in United States */
public enum RatingUnitedStatesMoviesType implements ValuedEnum {
    /** Default value, allow all movies content */
    AllAllowed("allAllowed"),
    /** Do not allow any movies content */
    AllBlocked("allBlocked"),
    /** G, all ages admitted */
    General("general"),
    /** PG, some material may not be suitable for children */
    ParentalGuidance("parentalGuidance"),
    /** PG13, some material may be inappropriate for children under 13 */
    ParentalGuidance13("parentalGuidance13"),
    /** R, viewers under 17 require accompanying parent or adult guardian */
    Restricted("restricted"),
    /** NC17, adults only */
    Adults("adults");
    public final String value;
    RatingUnitedStatesMoviesType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RatingUnitedStatesMoviesType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "general": return General;
            case "parentalGuidance": return ParentalGuidance;
            case "parentalGuidance13": return ParentalGuidance13;
            case "restricted": return Restricted;
            case "adults": return Adults;
            default: return null;
        }
    }
}
