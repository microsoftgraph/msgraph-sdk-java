package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IdentityProvider implements ValuedEnum {
    EntraID("entraID"),
    ActiveDirectory("activeDirectory"),
    Okta("okta"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IdentityProvider(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IdentityProvider forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "entraID": return EntraID;
            case "activeDirectory": return ActiveDirectory;
            case "okta": return Okta;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
