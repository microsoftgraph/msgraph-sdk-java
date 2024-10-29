package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PurgeType implements ValuedEnum {
    Recoverable("recoverable"),
    UnknownFutureValue("unknownFutureValue"),
    PermanentlyDelete("permanentlyDelete");
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
            case "unknownFutureValue": return UnknownFutureValue;
            case "permanentlyDelete": return PermanentlyDelete;
            default: return null;
        }
    }
}
