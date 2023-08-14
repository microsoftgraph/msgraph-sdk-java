package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AccessPackageSubjectType implements ValuedEnum {
    NotSpecified("notSpecified"),
    User("user"),
    ServicePrincipal("servicePrincipal"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageSubjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessPackageSubjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSpecified": return NotSpecified;
            case "user": return User;
            case "servicePrincipal": return ServicePrincipal;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
