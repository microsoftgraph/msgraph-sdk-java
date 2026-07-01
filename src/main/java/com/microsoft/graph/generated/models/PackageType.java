package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PackageType implements ValuedEnum {
    Microsoft("microsoft"),
    External("external"),
    Shared("shared"),
    Custom("custom"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PackageType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PackageType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoft": return Microsoft;
            case "external": return External;
            case "shared": return Shared;
            case "custom": return Custom;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
