package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Movies rating labels in France
 */
public enum RatingFranceMoviesType implements ValuedEnum {
    /** Default value, allow all movies content */
    AllAllowed("allAllowed"),
    /** Do not allow any movies content */
    AllBlocked("allBlocked"),
    /** The 10 classification prohibits the screening of the film to minors under 10 */
    AgesAbove10("agesAbove10"),
    /** The 12 classification prohibits the screening of the film to minors under 12 */
    AgesAbove12("agesAbove12"),
    /** The 16 classification prohibits the screening of the film to minors under 16 */
    AgesAbove16("agesAbove16"),
    /** The 18 classification prohibits the screening to minors under 18 */
    AgesAbove18("agesAbove18");
    public final String value;
    RatingFranceMoviesType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RatingFranceMoviesType forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
