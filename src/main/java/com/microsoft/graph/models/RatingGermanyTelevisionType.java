package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * TV content rating labels in Germany
 */
public enum RatingGermanyTelevisionType implements ValuedEnum {
    /** Default value, allow all TV shows content */
    AllAllowed("allAllowed"),
    /** Do not allow any TV shows content */
    AllBlocked("allBlocked"),
    /** Ab 0 Jahren, no age restrictions */
    General("general"),
    /** Ab 6 Jahren, ages 6 and older */
    AgesAbove6("agesAbove6"),
    /** Ab 12 Jahren, ages 12 and older */
    AgesAbove12("agesAbove12"),
    /** Ab 16 Jahren, ages 16 and older */
    AgesAbove16("agesAbove16"),
    /** Ab 18 Jahren, adults only */
    Adults("adults");
    public final String value;
    RatingGermanyTelevisionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RatingGermanyTelevisionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "general": return General;
            case "agesAbove6": return AgesAbove6;
            case "agesAbove12": return AgesAbove12;
            case "agesAbove16": return AgesAbove16;
            case "adults": return Adults;
            default: return null;
        }
    }
}
