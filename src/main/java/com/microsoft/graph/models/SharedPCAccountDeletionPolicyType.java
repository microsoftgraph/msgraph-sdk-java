package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SharedPCAccountDeletionPolicyType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "immediate": return Immediate;
            case "diskSpaceThreshold": return DiskSpaceThreshold;
            case "diskSpaceThresholdOrInactiveThreshold": return DiskSpaceThresholdOrInactiveThreshold;
            default: return null;
        }
    }
}
