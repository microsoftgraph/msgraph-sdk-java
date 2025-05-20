package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CertificateAuthorityType implements ValuedEnum {
    Root("root"),
    Intermediate("intermediate"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CertificateAuthorityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CertificateAuthorityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "root": return Root;
            case "intermediate": return Intermediate;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
