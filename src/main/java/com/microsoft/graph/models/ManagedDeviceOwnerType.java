package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ManagedDeviceOwnerType implements ValuedEnum {
    Unknown("unknown"),
    Company("company"),
    Personal("personal");
    public final String value;
    ManagedDeviceOwnerType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedDeviceOwnerType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "company": return Company;
            case "personal": return Personal;
            default: return null;
        }
    }
}
