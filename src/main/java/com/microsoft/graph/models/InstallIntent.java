package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum InstallIntent implements ValuedEnum {
    Available("available"),
    Required("required"),
    Uninstall("uninstall"),
    AvailableWithoutEnrollment("availableWithoutEnrollment");
    public final String value;
    InstallIntent(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static InstallIntent forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "available": return Available;
            case "required": return Required;
            case "uninstall": return Uninstall;
            case "availableWithoutEnrollment": return AvailableWithoutEnrollment;
            default: return null;
        }
    }
}
