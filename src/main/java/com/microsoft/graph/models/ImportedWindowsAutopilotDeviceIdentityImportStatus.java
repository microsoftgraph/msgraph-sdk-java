package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ImportedWindowsAutopilotDeviceIdentityImportStatus implements ValuedEnum {
    Unknown("unknown"),
    Pending("pending"),
    Partial("partial"),
    Complete("complete"),
    Error("error");
    public final String value;
    ImportedWindowsAutopilotDeviceIdentityImportStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ImportedWindowsAutopilotDeviceIdentityImportStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "pending": return Pending;
            case "partial": return Partial;
            case "complete": return Complete;
            case "error": return Error;
            default: return null;
        }
    }
}
