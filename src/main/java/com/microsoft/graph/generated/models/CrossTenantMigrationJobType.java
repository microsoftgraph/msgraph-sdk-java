package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CrossTenantMigrationJobType implements ValuedEnum {
    Validate("validate"),
    Migrate("migrate"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CrossTenantMigrationJobType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CrossTenantMigrationJobType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "validate": return Validate;
            case "migrate": return Migrate;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
