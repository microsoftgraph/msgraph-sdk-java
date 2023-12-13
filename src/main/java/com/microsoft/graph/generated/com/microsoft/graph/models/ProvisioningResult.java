package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProvisioningResult implements ValuedEnum {
    Success("success"),
    Failure("failure"),
    Skipped("skipped"),
    Warning("warning"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProvisioningResult(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProvisioningResult forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "failure": return Failure;
            case "skipped": return Skipped;
            case "warning": return Warning;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
