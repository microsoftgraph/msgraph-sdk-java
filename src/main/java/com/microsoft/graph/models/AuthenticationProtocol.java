package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AuthenticationProtocol implements ValuedEnum {
    WsFed("wsFed"),
    Saml("saml"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationProtocol(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationProtocol forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "wsFed": return WsFed;
            case "saml": return Saml;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
