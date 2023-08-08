package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CountryLookupMethodType implements ValuedEnum {
    ClientIpAddress("clientIpAddress"),
    AuthenticatorAppGps("authenticatorAppGps"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CountryLookupMethodType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CountryLookupMethodType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "clientIpAddress": return ClientIpAddress;
            case "authenticatorAppGps": return AuthenticatorAppGps;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
