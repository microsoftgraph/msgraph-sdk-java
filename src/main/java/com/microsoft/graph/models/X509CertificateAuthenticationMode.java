package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of authenticationMethodConfiguration entities. */
public enum X509CertificateAuthenticationMode implements ValuedEnum {
    X509CertificateSingleFactor("x509CertificateSingleFactor"),
    X509CertificateMultiFactor("x509CertificateMultiFactor"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    X509CertificateAuthenticationMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static X509CertificateAuthenticationMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "x509CertificateSingleFactor": return X509CertificateSingleFactor;
            case "x509CertificateMultiFactor": return X509CertificateMultiFactor;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
