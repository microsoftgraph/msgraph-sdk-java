package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Configures how the requested export job is localized
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementExportJobLocalizationType implements ValuedEnum {
    /** Configures the export job to expose localized values as an additional column */
    LocalizedValuesAsAdditionalColumn("localizedValuesAsAdditionalColumn"),
    /** Configures the export job to replace enumerable values with their localized values */
    ReplaceLocalizableValues("replaceLocalizableValues");
    public final String value;
    DeviceManagementExportJobLocalizationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementExportJobLocalizationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "localizedValuesAsAdditionalColumn": return LocalizedValuesAsAdditionalColumn;
            case "replaceLocalizableValues": return ReplaceLocalizableValues;
            default: return null;
        }
    }
}
