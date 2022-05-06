package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum EnrollmentState implements ValuedEnum {
    Unknown("unknown"),
    Enrolled("enrolled"),
    PendingReset("pendingReset"),
    Failed("failed"),
    NotContacted("notContacted");
    public final String value;
    EnrollmentState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EnrollmentState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "enrolled": return Enrolled;
            case "pendingReset": return PendingReset;
            case "failed": return Failed;
            case "notContacted": return NotContacted;
            default: return null;
        }
    }
}
