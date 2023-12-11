package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PurgeType implements ValuedEnum {
    Recoverable("recoverable"),
    PermanentlyDeleted("permanentlyDeleted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PurgeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PurgeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "recoverable": return Recoverable;
            case "permanentlyDeleted": return PermanentlyDeleted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
