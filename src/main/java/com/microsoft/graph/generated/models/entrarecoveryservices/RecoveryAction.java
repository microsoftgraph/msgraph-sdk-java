package com.microsoft.graph.models.entrarecoveryservices;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RecoveryAction implements ValuedEnum {
    /** Represents a soft delete action during recovery */
    SoftDelete("softDelete"),
    /** Represents an update action during recovery */
    Update("update"),
    /** Represents a restore action during recovery */
    Restore("restore"),
    /** This will help in making this enum evolable and adding more values in the future */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RecoveryAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RecoveryAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "softDelete": return SoftDelete;
            case "update": return Update;
            case "restore": return Restore;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
