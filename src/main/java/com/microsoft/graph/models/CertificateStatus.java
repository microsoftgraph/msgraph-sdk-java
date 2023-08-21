package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CertificateStatus implements ValuedEnum {
    NotProvisioned("notProvisioned"),
    Provisioned("provisioned");
    public final String value;
    CertificateStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CertificateStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notProvisioned": return NotProvisioned;
            case "provisioned": return Provisioned;
            default: return null;
        }
    }
}
