package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum OperationResult implements ValuedEnum {
    Success("success"),
    Failure("failure"),
    Timeout("timeout"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OperationResult(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OperationResult forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "failure": return Failure;
            case "timeout": return Timeout;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
