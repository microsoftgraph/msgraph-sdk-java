package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppCredentialRestrictionType implements ValuedEnum {
    PasswordAddition("passwordAddition"),
    PasswordLifetime("passwordLifetime"),
    SymmetricKeyAddition("symmetricKeyAddition"),
    SymmetricKeyLifetime("symmetricKeyLifetime"),
    CustomPasswordAddition("customPasswordAddition"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppCredentialRestrictionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppCredentialRestrictionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "passwordAddition": return PasswordAddition;
            case "passwordLifetime": return PasswordLifetime;
            case "symmetricKeyAddition": return SymmetricKeyAddition;
            case "symmetricKeyLifetime": return SymmetricKeyLifetime;
            case "customPasswordAddition": return CustomPasswordAddition;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
