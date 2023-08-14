package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConditionalAccessExternalTenantsMembershipKind implements ValuedEnum {
    All("all"),
    Enumerated("enumerated"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConditionalAccessExternalTenantsMembershipKind(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConditionalAccessExternalTenantsMembershipKind forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "enumerated": return Enumerated;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
