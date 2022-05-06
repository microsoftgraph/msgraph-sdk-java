package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum VppTokenState implements ValuedEnum {
    Unknown("unknown"),
    Valid("valid"),
    Expired("expired"),
    Invalid("invalid"),
    AssignedToExternalMDM("assignedToExternalMDM");
    public final String value;
    VppTokenState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VppTokenState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "valid": return Valid;
            case "expired": return Expired;
            case "invalid": return Invalid;
            case "assignedToExternalMDM": return AssignedToExternalMDM;
            default: return null;
        }
    }
}
