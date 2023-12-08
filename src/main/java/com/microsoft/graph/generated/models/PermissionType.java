package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PermissionType implements ValuedEnum {
    Application("application"),
    Delegated("delegated"),
    DelegatedUserConsentable("delegatedUserConsentable");
    public final String value;
    PermissionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PermissionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "application": return Application;
            case "delegated": return Delegated;
            case "delegatedUserConsentable": return DelegatedUserConsentable;
            default: return null;
        }
    }
}
