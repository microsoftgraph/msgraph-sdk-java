package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServicePrincipalType implements ValuedEnum {
    Unknown("unknown"),
    Application("application"),
    ManagedIdentity("managedIdentity"),
    Legacy("legacy"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServicePrincipalType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServicePrincipalType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "application": return Application;
            case "managedIdentity": return ManagedIdentity;
            case "legacy": return Legacy;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
