package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VmCloudProvider implements ValuedEnum {
    Unknown("unknown"),
    Azure("azure"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VmCloudProvider(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VmCloudProvider forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "azure": return Azure;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
