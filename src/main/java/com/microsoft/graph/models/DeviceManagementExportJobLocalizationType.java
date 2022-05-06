package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementExportJobLocalizationType implements ValuedEnum {
    LocalizedValuesAsAdditionalColumn("localizedValuesAsAdditionalColumn"),
    ReplaceLocalizableValues("replaceLocalizableValues");
    public final String value;
    DeviceManagementExportJobLocalizationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementExportJobLocalizationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "localizedValuesAsAdditionalColumn": return LocalizedValuesAsAdditionalColumn;
            case "replaceLocalizableValues": return ReplaceLocalizableValues;
            default: return null;
        }
    }
}
