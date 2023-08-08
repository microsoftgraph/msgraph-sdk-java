package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * TV content rating labels in France
 */
public enum RatingFranceTelevisionType implements ValuedEnum {
    /** Default value, allow all TV shows content */
    AllAllowed("allAllowed"),
    /** Do not allow any TV shows content */
    AllBlocked("allBlocked"),
    /** The -10 classification is not recommended for children under 10 */
    AgesAbove10("agesAbove10"),
    /** The -12 classification is not recommended for children under 12 */
    AgesAbove12("agesAbove12"),
    /** The -16 classification is not recommended for children under 16 */
    AgesAbove16("agesAbove16"),
    /** The -18 classification is not recommended for persons under 18 */
    AgesAbove18("agesAbove18");
    public final String value;
    RatingFranceTelevisionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RatingFranceTelevisionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "agesAbove10": return AgesAbove10;
            case "agesAbove12": return AgesAbove12;
            case "agesAbove16": return AgesAbove16;
            case "agesAbove18": return AgesAbove18;
            default: return null;
        }
    }
}
