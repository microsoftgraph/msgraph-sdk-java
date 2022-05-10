package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum MobileThreatPartnerTenantState implements ValuedEnum {
    /** Partner is unavailable. */
    Unavailable("unavailable"),
    /** Partner is available. */
    Available("available"),
    /** Partner is enabled. */
    Enabled("enabled"),
    /** Partner is unresponsive. */
    Unresponsive("unresponsive");
    public final String value;
    MobileThreatPartnerTenantState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MobileThreatPartnerTenantState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unavailable": return Unavailable;
            case "available": return Available;
            case "enabled": return Enabled;
            case "unresponsive": return Unresponsive;
            default: return null;
        }
    }
}
