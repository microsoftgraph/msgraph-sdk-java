package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * TV content rating labels in United States
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RatingUnitedStatesTelevisionType implements ValuedEnum {
    /** Default value, allow all TV shows content */
    AllAllowed("allAllowed"),
    /** Do not allow any TV shows content */
    AllBlocked("allBlocked"),
    /** TV-Y, all children */
    ChildrenAll("childrenAll"),
    /** TV-Y7, children age 7 and above */
    ChildrenAbove7("childrenAbove7"),
    /** TV-G, suitable for all ages */
    General("general"),
    /** TV-PG, parental guidance */
    ParentalGuidance("parentalGuidance"),
    /** TV-14, children age 14 and above */
    ChildrenAbove14("childrenAbove14"),
    /** TV-MA, adults only */
    Adults("adults");
    public final String value;
    RatingUnitedStatesTelevisionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RatingUnitedStatesTelevisionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "childrenAll": return ChildrenAll;
            case "childrenAbove7": return ChildrenAbove7;
            case "general": return General;
            case "parentalGuidance": return ParentalGuidance;
            case "childrenAbove14": return ChildrenAbove14;
            case "adults": return Adults;
            default: return null;
        }
    }
}
