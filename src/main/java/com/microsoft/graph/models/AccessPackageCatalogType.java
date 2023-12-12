package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessPackageCatalogType implements ValuedEnum {
    UserManaged("userManaged"),
    ServiceDefault("serviceDefault"),
    ServiceManaged("serviceManaged"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageCatalogType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessPackageCatalogType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userManaged": return UserManaged;
            case "serviceDefault": return ServiceDefault;
            case "serviceManaged": return ServiceManaged;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
