package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for when accounts are deleted on a shared PC.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SharedPCAccountDeletionPolicyType implements ValuedEnum {
    /** Delete immediately. */
    Immediate("immediate"),
    /** Delete at disk space threshold. */
    DiskSpaceThreshold("diskSpaceThreshold"),
    /** Delete at disk space threshold or inactive threshold. */
    DiskSpaceThresholdOrInactiveThreshold("diskSpaceThresholdOrInactiveThreshold");
    public final String value;
    SharedPCAccountDeletionPolicyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SharedPCAccountDeletionPolicyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "immediate": return Immediate;
            case "diskSpaceThreshold": return DiskSpaceThreshold;
            case "diskSpaceThresholdOrInactiveThreshold": return DiskSpaceThresholdOrInactiveThreshold;
            default: return null;
        }
    }
}
