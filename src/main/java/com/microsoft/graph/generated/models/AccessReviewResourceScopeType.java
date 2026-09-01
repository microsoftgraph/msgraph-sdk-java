package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessReviewResourceScopeType implements ValuedEnum {
    Group("group"),
    Catalog("catalog"),
    ServicePrincipal("servicePrincipal"),
    DirectoryRole("directoryRole"),
    AccessPackageAssignmentPolicy("accessPackageAssignmentPolicy"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessReviewResourceScopeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessReviewResourceScopeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "group": return Group;
            case "catalog": return Catalog;
            case "servicePrincipal": return ServicePrincipal;
            case "directoryRole": return DirectoryRole;
            case "accessPackageAssignmentPolicy": return AccessPackageAssignmentPolicy;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
