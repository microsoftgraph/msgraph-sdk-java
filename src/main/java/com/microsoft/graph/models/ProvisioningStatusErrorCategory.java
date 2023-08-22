package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProvisioningStatusErrorCategory implements ValuedEnum {
    Failure("failure"),
    NonServiceFailure("nonServiceFailure"),
    Success("success"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProvisioningStatusErrorCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProvisioningStatusErrorCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "failure": return Failure;
            case "nonServiceFailure": return NonServiceFailure;
            case "success": return Success;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
