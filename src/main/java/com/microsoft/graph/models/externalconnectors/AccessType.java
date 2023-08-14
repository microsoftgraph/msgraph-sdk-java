package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AccessType implements ValuedEnum {
    Grant("grant"),
    Deny("deny"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "grant": return Grant;
            case "deny": return Deny;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
