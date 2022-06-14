package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum RatingAppsType implements ValuedEnum {
    /** Default value, allow all apps content */
    AllAllowed("allAllowed"),
    /** Do not allow any apps content */
    AllBlocked("allBlocked"),
    /** 4+, age 4 and above */
    AgesAbove4("agesAbove4"),
    /** 9+, age 9 and above */
    AgesAbove9("agesAbove9"),
    /** 12+, age 12 and above  */
    AgesAbove12("agesAbove12"),
    /** 17+, age 17 and above */
    AgesAbove17("agesAbove17");
    public final String value;
    RatingAppsType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RatingAppsType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "allBlocked": return AllBlocked;
            case "agesAbove4": return AgesAbove4;
            case "agesAbove9": return AgesAbove9;
            case "agesAbove12": return AgesAbove12;
            case "agesAbove17": return AgesAbove17;
            default: return null;
        }
    }
}
