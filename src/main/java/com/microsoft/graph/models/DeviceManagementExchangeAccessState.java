package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementExchangeAccessState implements ValuedEnum {
    None("none"),
    Unknown("unknown"),
    Allowed("allowed"),
    Blocked("blocked"),
    Quarantined("quarantined");
    public final String value;
    DeviceManagementExchangeAccessState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementExchangeAccessState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "unknown": return Unknown;
            case "allowed": return Allowed;
            case "blocked": return Blocked;
            case "quarantined": return Quarantined;
            default: return null;
        }
    }
}
