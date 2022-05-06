package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the identityContainer singleton.  */
public enum FilterMode implements ValuedEnum {
    Include("include"),
    Exclude("exclude");
    public final String value;
    FilterMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static FilterMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "include": return Include;
            case "exclude": return Exclude;
            default: return null;
        }
    }
}
