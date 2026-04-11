package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum X509CertificateIssuerHintsState implements ValuedEnum {
    Disabled("disabled"),
    Enabled("enabled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    X509CertificateIssuerHintsState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static X509CertificateIssuerHintsState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "enabled": return Enabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
