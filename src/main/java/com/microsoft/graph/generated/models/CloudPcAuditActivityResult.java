package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcAuditActivityResult implements ValuedEnum {
    Success("success"),
    ClientError("clientError"),
    Failure("failure"),
    Timeout("timeout"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcAuditActivityResult(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcAuditActivityResult forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "clientError": return ClientError;
            case "failure": return Failure;
            case "timeout": return Timeout;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
