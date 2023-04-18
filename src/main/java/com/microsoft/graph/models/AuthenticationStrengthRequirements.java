package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AuthenticationStrengthRequirements implements ValuedEnum {
    None("none"),
    Mfa("mfa"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationStrengthRequirements(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AuthenticationStrengthRequirements forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "mfa": return Mfa;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
