package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum WindowsUserAccountControlSettings implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Always notify. */
    AlwaysNotify("alwaysNotify"),
    /** Notify on app changes. */
    NotifyOnAppChanges("notifyOnAppChanges"),
    /** Notify on app changes without dimming desktop. */
    NotifyOnAppChangesWithoutDimming("notifyOnAppChangesWithoutDimming"),
    /** Never notify. */
    NeverNotify("neverNotify");
    public final String value;
    WindowsUserAccountControlSettings(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsUserAccountControlSettings forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "alwaysNotify": return AlwaysNotify;
            case "notifyOnAppChanges": return NotifyOnAppChanges;
            case "notifyOnAppChangesWithoutDimming": return NotifyOnAppChangesWithoutDimming;
            case "neverNotify": return NeverNotify;
            default: return null;
        }
    }
}
