package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Action implements ValuedEnum {
    Disable("disable"),
    Enable("enable"),
    ForcePasswordReset("forcePasswordReset"),
    RevokeAllSessions("revokeAllSessions"),
    RequireUserToSignInAgain("requireUserToSignInAgain"),
    MarkUserAsCompromised("markUserAsCompromised"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Action(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Action forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disable": return Disable;
            case "enable": return Enable;
            case "forcePasswordReset": return ForcePasswordReset;
            case "revokeAllSessions": return RevokeAllSessions;
            case "requireUserToSignInAgain": return RequireUserToSignInAgain;
            case "markUserAsCompromised": return MarkUserAsCompromised;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
