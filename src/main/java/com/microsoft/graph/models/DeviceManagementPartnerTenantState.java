package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementPartnerTenantState implements ValuedEnum {
    Unknown("unknown"),
    Unavailable("unavailable"),
    Enabled("enabled"),
    Terminated("terminated"),
    Rejected("rejected"),
    Unresponsive("unresponsive");
    public final String value;
    DeviceManagementPartnerTenantState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementPartnerTenantState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "unavailable": return Unavailable;
            case "enabled": return Enabled;
            case "terminated": return Terminated;
            case "rejected": return Rejected;
            case "unresponsive": return Unresponsive;
            default: return null;
        }
    }
}
