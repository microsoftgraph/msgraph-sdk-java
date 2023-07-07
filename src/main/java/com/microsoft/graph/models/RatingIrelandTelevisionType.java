package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * TV content rating labels in Ireland
 */
public enum RatingIrelandTelevisionType implements ValuedEnum {
    /** Default value, allow all TV shows content */
    AllAllowed("allAllowed"),
    /** Do not allow any TV shows content */
    AllBlocked("allBlocked"),
    /** The GA classification is suitable for all audiences */
    General("general"),
    /** The CH classification is suitable for children */
    Children("children"),
    /** The YA classification is suitable for teenage audience */
    YoungAdults("youngAdults"),
    /** The PS classification invites parents and guardians to consider restriction childrens access */
    ParentalSupervision("parentalSupervision"),
    /** The MA classification is suitable for adults */
    Mature("mature");
    public final String value;
    RatingIrelandTelevisionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RatingIrelandTelevisionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "general": return General;
            case "children": return Children;
            case "youngAdults": return YoungAdults;
            case "parentalSupervision": return ParentalSupervision;
            case "mature": return Mature;
            default: return null;
        }
    }
}
