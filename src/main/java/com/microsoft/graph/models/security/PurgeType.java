package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the purgeData method. */
public enum PurgeType implements ValuedEnum {
    Recoverable("recoverable"),
    PermanentlyDeleted("permanentlyDeleted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PurgeType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PurgeType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "recoverable": return Recoverable;
            case "permanentlyDeleted": return PermanentlyDeleted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
