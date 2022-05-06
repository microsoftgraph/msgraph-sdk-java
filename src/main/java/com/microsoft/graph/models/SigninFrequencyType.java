package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the identityContainer singleton.  */
public enum SigninFrequencyType implements ValuedEnum {
    Days("days"),
    Hours("hours");
    public final String value;
    SigninFrequencyType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SigninFrequencyType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "days": return Days;
            case "hours": return Hours;
            default: return null;
        }
    }
}
