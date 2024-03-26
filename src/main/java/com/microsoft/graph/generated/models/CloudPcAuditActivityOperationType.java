package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcAuditActivityOperationType implements ValuedEnum {
    Create("create"),
    Delete("delete"),
    Patch("patch"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcAuditActivityOperationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcAuditActivityOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "create": return Create;
            case "delete": return Delete;
            case "patch": return Patch;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
