package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum ManagedAppDataStorageLocation implements ValuedEnum {
    OneDriveForBusiness("oneDriveForBusiness"),
    SharePoint("sharePoint"),
    Box("box"),
    LocalStorage("localStorage");
    public final String value;
    ManagedAppDataStorageLocation(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedAppDataStorageLocation forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "oneDriveForBusiness": return OneDriveForBusiness;
            case "sharePoint": return SharePoint;
            case "box": return Box;
            case "localStorage": return LocalStorage;
            default: return null;
        }
    }
}
