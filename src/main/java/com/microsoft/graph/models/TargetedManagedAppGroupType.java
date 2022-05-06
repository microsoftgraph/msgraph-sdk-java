package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the targetApps method.  */
public enum TargetedManagedAppGroupType implements ValuedEnum {
    SelectedPublicApps("selectedPublicApps"),
    AllCoreMicrosoftApps("allCoreMicrosoftApps"),
    AllMicrosoftApps("allMicrosoftApps"),
    AllApps("allApps");
    public final String value;
    TargetedManagedAppGroupType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TargetedManagedAppGroupType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "selectedPublicApps": return SelectedPublicApps;
            case "allCoreMicrosoftApps": return AllCoreMicrosoftApps;
            case "allMicrosoftApps": return AllMicrosoftApps;
            case "allApps": return AllApps;
            default: return null;
        }
    }
}
