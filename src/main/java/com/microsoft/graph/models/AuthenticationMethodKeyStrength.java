package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AuthenticationMethodKeyStrength implements ValuedEnum {
    Normal("normal"),
    Weak("weak"),
    Unknown("unknown");
    public final String value;
    AuthenticationMethodKeyStrength(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationMethodKeyStrength forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "normal": return Normal;
            case "weak": return Weak;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
