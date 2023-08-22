package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppKeyCredentialRestrictionType implements ValuedEnum {
    AsymmetricKeyLifetime("asymmetricKeyLifetime"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppKeyCredentialRestrictionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppKeyCredentialRestrictionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "asymmetricKeyLifetime": return AsymmetricKeyLifetime;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
