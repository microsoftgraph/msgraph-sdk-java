package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum RatingCanadaTelevisionType implements ValuedEnum {
    /** Default value, allow all TV shows content */
    AllAllowed("allAllowed"),
    /** Do not allow any TV shows content */
    AllBlocked("allBlocked"),
    /** The C classification is suitable for children ages of 2 to 7 years */
    Children("children"),
    /** The C8 classification is suitable for children ages 8+ */
    ChildrenAbove8("childrenAbove8"),
    /** The G classification is suitable for general audience */
    General("general"),
    /** PG, Parental Guidance */
    ParentalGuidance("parentalGuidance"),
    /** The 14+ classification is intended for viewers ages 14 and older */
    AgesAbove14("agesAbove14"),
    /** The 18+ classification is intended for viewers ages 18 and older */
    AgesAbove18("agesAbove18");
    public final String value;
    RatingCanadaTelevisionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RatingCanadaTelevisionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "children": return Children;
            case "childrenAbove8": return ChildrenAbove8;
            case "general": return General;
            case "parentalGuidance": return ParentalGuidance;
            case "agesAbove14": return AgesAbove14;
            case "agesAbove18": return AgesAbove18;
            default: return null;
        }
    }
}
