package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AppKeyCredentialRestrictionType implements ValuedEnum {
    AsymmetricKeyLifetime("asymmetricKeyLifetime"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppKeyCredentialRestrictionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AppKeyCredentialRestrictionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "asymmetricKeyLifetime": return AsymmetricKeyLifetime;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
