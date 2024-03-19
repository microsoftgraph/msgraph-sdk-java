package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcProvisioningType implements ValuedEnum {
    Dedicated("dedicated"),
    Shared("shared"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcProvisioningType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcProvisioningType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dedicated": return Dedicated;
            case "shared": return Shared;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
