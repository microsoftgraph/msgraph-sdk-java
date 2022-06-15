package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum StateManagementSetting implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Blocked. */
    Blocked("blocked"),
    /** Allowed. */
    Allowed("allowed");
    public final String value;
    StateManagementSetting(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static StateManagementSetting forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "blocked": return Blocked;
            case "allowed": return Allowed;
            default: return null;
        }
    }
}
