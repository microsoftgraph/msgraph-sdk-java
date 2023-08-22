package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticationStrengthPolicyType implements ValuedEnum {
    BuiltIn("builtIn"),
    Custom("custom"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationStrengthPolicyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationStrengthPolicyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "builtIn": return BuiltIn;
            case "custom": return Custom;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
