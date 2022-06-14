package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton. */
public enum MicrosoftStoreForBusinessLicenseType implements ValuedEnum {
    Offline("offline"),
    Online("online");
    public final String value;
    MicrosoftStoreForBusinessLicenseType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MicrosoftStoreForBusinessLicenseType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "offline": return Offline;
            case "online": return Online;
            default: return null;
        }
    }
}
