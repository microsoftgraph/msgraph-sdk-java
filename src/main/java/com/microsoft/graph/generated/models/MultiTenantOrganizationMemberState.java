package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MultiTenantOrganizationMemberState implements ValuedEnum {
    Pending("pending"),
    Active("active"),
    Removed("removed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MultiTenantOrganizationMemberState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MultiTenantOrganizationMemberState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "active": return Active;
            case "removed": return Removed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
