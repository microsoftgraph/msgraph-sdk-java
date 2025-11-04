package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WebApplicationFirewallVerificationStatus implements ValuedEnum {
    Success("success"),
    Warning("warning"),
    Failure("failure"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WebApplicationFirewallVerificationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WebApplicationFirewallVerificationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "warning": return Warning;
            case "failure": return Failure;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
