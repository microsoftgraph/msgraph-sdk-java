package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SignInFrequencyAuthenticationType implements ValuedEnum {
    PrimaryAndSecondaryAuthentication("primaryAndSecondaryAuthentication"),
    SecondaryAuthentication("secondaryAuthentication"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SignInFrequencyAuthenticationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SignInFrequencyAuthenticationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "primaryAndSecondaryAuthentication": return PrimaryAndSecondaryAuthentication;
            case "secondaryAuthentication": return SecondaryAuthentication;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
