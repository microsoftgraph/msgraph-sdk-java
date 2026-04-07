package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OidcResponseType implements ValuedEnum {
    Code("code"),
    Id_token("id_token"),
    Token("token"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OidcResponseType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OidcResponseType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "code": return Code;
            case "id_token": return Id_token;
            case "token": return Token;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
