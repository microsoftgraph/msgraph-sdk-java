package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the getRecentNotebooks method.  */
public enum OnenoteSourceService implements ValuedEnum {
    Unknown("Unknown"),
    OneDrive("OneDrive"),
    OneDriveForBusiness("OneDriveForBusiness"),
    OnPremOneDriveForBusiness("OnPremOneDriveForBusiness");
    public final String value;
    OnenoteSourceService(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OnenoteSourceService forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Unknown": return Unknown;
            case "OneDrive": return OneDrive;
            case "OneDriveForBusiness": return OneDriveForBusiness;
            case "OnPremOneDriveForBusiness": return OnPremOneDriveForBusiness;
            default: return null;
        }
    }
}
