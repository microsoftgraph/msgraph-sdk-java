package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for the install intent chosen by the admin.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InstallIntent implements ValuedEnum {
    /** Available install intent. */
    Available("available"),
    /** Required install intent. */
    Required("required"),
    /** Uninstall install intent. */
    Uninstall("uninstall"),
    /** Available without enrollment install intent. */
    AvailableWithoutEnrollment("availableWithoutEnrollment");
    public final String value;
    InstallIntent(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InstallIntent forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "available": return Available;
            case "required": return Required;
            case "uninstall": return Uninstall;
            case "availableWithoutEnrollment": return AvailableWithoutEnrollment;
            default: return null;
        }
    }
}
