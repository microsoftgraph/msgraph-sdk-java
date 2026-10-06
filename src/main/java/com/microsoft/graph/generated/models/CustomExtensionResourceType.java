package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CustomExtensionResourceType implements ValuedEnum {
    EntraRoles("entraRoles"),
    AzureResources("azureResources"),
    EntraGroups("entraGroups"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CustomExtensionResourceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CustomExtensionResourceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "entraRoles": return EntraRoles;
            case "azureResources": return AzureResources;
            case "entraGroups": return EntraGroups;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
