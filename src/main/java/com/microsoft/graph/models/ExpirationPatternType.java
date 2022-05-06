package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the identityGovernance singleton.  */
public enum ExpirationPatternType implements ValuedEnum {
    NotSpecified("notSpecified"),
    NoExpiration("noExpiration"),
    AfterDateTime("afterDateTime"),
    AfterDuration("afterDuration");
    public final String value;
    ExpirationPatternType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ExpirationPatternType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSpecified": return NotSpecified;
            case "noExpiration": return NoExpiration;
            case "afterDateTime": return AfterDateTime;
            case "afterDuration": return AfterDuration;
            default: return null;
        }
    }
}
