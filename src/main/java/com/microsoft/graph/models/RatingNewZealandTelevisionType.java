package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * TV content rating labels in New Zealand
 */
public enum RatingNewZealandTelevisionType implements ValuedEnum {
    /** Default value, allow all TV shows content */
    AllAllowed("allAllowed"),
    /** Do not allow any TV shows content */
    AllBlocked("allBlocked"),
    /** The G classification excludes materials likely to harm children under 14 */
    General("general"),
    /** The PGR classification encourages parents and guardians to supervise younger viewers */
    ParentalGuidance("parentalGuidance"),
    /** The AO classification is not suitable for children */
    Adults("adults");
    public final String value;
    RatingNewZealandTelevisionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RatingNewZealandTelevisionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "general": return General;
            case "parentalGuidance": return ParentalGuidance;
            case "adults": return Adults;
            default: return null;
        }
    }
}
