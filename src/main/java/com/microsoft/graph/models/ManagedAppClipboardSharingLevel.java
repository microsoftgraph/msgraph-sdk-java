package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum ManagedAppClipboardSharingLevel implements ValuedEnum {
    AllApps("allApps"),
    ManagedAppsWithPasteIn("managedAppsWithPasteIn"),
    ManagedApps("managedApps"),
    Blocked("blocked");
    public final String value;
    ManagedAppClipboardSharingLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedAppClipboardSharingLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allApps": return AllApps;
            case "managedAppsWithPasteIn": return ManagedAppsWithPasteIn;
            case "managedApps": return ManagedApps;
            case "blocked": return Blocked;
            default: return null;
        }
    }
}
