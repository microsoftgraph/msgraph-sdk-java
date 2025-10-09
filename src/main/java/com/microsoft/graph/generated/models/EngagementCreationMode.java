package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates that the resource is in migration state and is currently being used for migration purposes.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EngagementCreationMode implements ValuedEnum {
    /** Unspecified creation mode. */
    None("none"),
    /** Creation is a migration. */
    Migration("migration"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EngagementCreationMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EngagementCreationMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "migration": return Migration;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
