package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton. */
public enum InstallState implements ValuedEnum {
    /** Not Applicable. */
    NotApplicable("notApplicable"),
    /** Installed. */
    Installed("installed"),
    /** Failed. */
    Failed("failed"),
    /** Not Installed. */
    NotInstalled("notInstalled"),
    /** Uninstall Failed. */
    UninstallFailed("uninstallFailed"),
    /** Unknown. */
    Unknown("unknown");
    public final String value;
    InstallState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static InstallState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notApplicable": return NotApplicable;
            case "installed": return Installed;
            case "failed": return Failed;
            case "notInstalled": return NotInstalled;
            case "uninstallFailed": return UninstallFailed;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
