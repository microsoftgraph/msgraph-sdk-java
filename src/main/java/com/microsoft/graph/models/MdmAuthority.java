package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of organization entities. */
public enum MdmAuthority implements ValuedEnum {
    /** Unknown */
    Unknown("unknown"),
    /** Intune */
    Intune("intune"),
    /** SCCM */
    Sccm("sccm"),
    /** Office365 */
    Office365("office365");
    public final String value;
    MdmAuthority(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MdmAuthority forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "intune": return Intune;
            case "sccm": return Sccm;
            case "office365": return Office365;
            default: return null;
        }
    }
}
