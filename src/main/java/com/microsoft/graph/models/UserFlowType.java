package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum UserFlowType implements ValuedEnum {
    SignUp("signUp"),
    SignIn("signIn"),
    SignUpOrSignIn("signUpOrSignIn"),
    PasswordReset("passwordReset"),
    ProfileUpdate("profileUpdate"),
    ResourceOwner("resourceOwner"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserFlowType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserFlowType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "signUp": return SignUp;
            case "signIn": return SignIn;
            case "signUpOrSignIn": return SignUpOrSignIn;
            case "passwordReset": return PasswordReset;
            case "profileUpdate": return ProfileUpdate;
            case "resourceOwner": return ResourceOwner;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
