package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum VppTokenAccountType implements ValuedEnum {
    Business("business"),
    Education("education");
    public final String value;
    VppTokenAccountType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VppTokenAccountType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "business": return Business;
            case "education": return Education;
            default: return null;
        }
    }
}
