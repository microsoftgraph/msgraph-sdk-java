package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for system scan type.
 */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DefenderScanType forValue(@javax.annotation.Nonnull final String searchValue) {
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
