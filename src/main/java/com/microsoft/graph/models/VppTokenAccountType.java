package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton. */
public enum VppTokenAccountType implements ValuedEnum {
    /** Apple Volume Purchase Program token associated with an business program. */
    Business("business"),
    /** Apple Volume Purchase Program token associated with an education program. */
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
