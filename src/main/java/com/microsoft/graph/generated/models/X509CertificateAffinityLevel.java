package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum X509CertificateAffinityLevel implements ValuedEnum {
    Low("low"),
    High("high"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    X509CertificateAffinityLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static X509CertificateAffinityLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "low": return Low;
            case "high": return High;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
