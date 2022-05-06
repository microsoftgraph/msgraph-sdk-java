package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum ManagedAppDataEncryptionType implements ValuedEnum {
    UseDeviceSettings("useDeviceSettings"),
    AfterDeviceRestart("afterDeviceRestart"),
    WhenDeviceLockedExceptOpenFiles("whenDeviceLockedExceptOpenFiles"),
    WhenDeviceLocked("whenDeviceLocked");
    public final String value;
    ManagedAppDataEncryptionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedAppDataEncryptionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "useDeviceSettings": return UseDeviceSettings;
            case "afterDeviceRestart": return AfterDeviceRestart;
            case "whenDeviceLockedExceptOpenFiles": return WhenDeviceLockedExceptOpenFiles;
            case "whenDeviceLocked": return WhenDeviceLocked;
            default: return null;
        }
    }
}
