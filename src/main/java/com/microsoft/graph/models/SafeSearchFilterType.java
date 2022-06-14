package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum SafeSearchFilterType implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Strict, highest filtering against adult content. */
    Strict("strict"),
    /** Moderate filtering against adult content (valid search results will not be filtered). */
    Moderate("moderate");
    public final String value;
    SafeSearchFilterType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SafeSearchFilterType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "strict": return Strict;
            case "moderate": return Moderate;
            default: return null;
        }
    }
}
