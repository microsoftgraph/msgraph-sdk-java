package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for system scan type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DefenderScanType implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** System scan disabled. */
    Disabled("disabled"),
    /** Quick system scan. */
    Quick("quick"),
    /** Full system scan. */
    Full("full");
    public final String value;
    DefenderScanType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DefenderScanType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "disabled": return Disabled;
            case "quick": return Quick;
            case "full": return Full;
            default: return null;
        }
    }
}
