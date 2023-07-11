package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AuthenticationMethodFeature implements ValuedEnum {
    SsprRegistered("ssprRegistered"),
    SsprEnabled("ssprEnabled"),
    SsprCapable("ssprCapable"),
    PasswordlessCapable("passwordlessCapable"),
    MfaCapable("mfaCapable"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationMethodFeature(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AuthenticationMethodFeature forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ssprRegistered": return SsprRegistered;
            case "ssprEnabled": return SsprEnabled;
            case "ssprCapable": return SsprCapable;
            case "passwordlessCapable": return PasswordlessCapable;
            case "mfaCapable": return MfaCapable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
