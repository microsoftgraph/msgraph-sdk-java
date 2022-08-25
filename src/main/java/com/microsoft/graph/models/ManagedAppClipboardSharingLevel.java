package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum ManagedAppClipboardSharingLevel implements ValuedEnum {
    /** Sharing is allowed between all apps, managed or not */
    AllApps("allApps"),
    /** Sharing is allowed between all managed apps with paste in enabled */
    ManagedAppsWithPasteIn("managedAppsWithPasteIn"),
    /** Sharing is allowed between all managed apps */
    ManagedApps("managedApps"),
    /** Sharing between apps is disabled */
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
