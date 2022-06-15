package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum RatingAustraliaTelevisionType implements ValuedEnum {
    /** Default value, allow all TV shows content */
    AllAllowed("allAllowed"),
    /** Do not allow any TV shows content */
    AllBlocked("allBlocked"),
    /** The P classification is intended for preschoolers */
    Preschoolers("preschoolers"),
    /** The C classification is intended for children under 14 */
    Children("children"),
    /** The G classification is suitable for all ages */
    General("general"),
    /** The PG classification is recommended for young viewers */
    ParentalGuidance("parentalGuidance"),
    /** The M classification is recommended for viewers over 15 */
    Mature("mature"),
    /** The MA15+ classification is not suitable for viewers under 15 */
    AgesAbove15("agesAbove15"),
    /** The AV15+ classification is not suitable for viewers under 15, adult violence-specific */
    AgesAbove15AdultViolence("agesAbove15AdultViolence");
    public final String value;
    RatingAustraliaTelevisionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RatingAustraliaTelevisionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "preschoolers": return Preschoolers;
            case "children": return Children;
            case "general": return General;
            case "parentalGuidance": return ParentalGuidance;
            case "mature": return Mature;
            case "agesAbove15": return AgesAbove15;
            case "agesAbove15AdultViolence": return AgesAbove15AdultViolence;
            default: return null;
        }
    }
}
