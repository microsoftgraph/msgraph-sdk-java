package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FileStorageContainerBillingStatus implements ValuedEnum {
    Invalid("invalid"),
    Valid("valid"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FileStorageContainerBillingStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FileStorageContainerBillingStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "invalid": return Invalid;
            case "valid": return Valid;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
