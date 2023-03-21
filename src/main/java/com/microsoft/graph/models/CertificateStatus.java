package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CertificateStatus implements ValuedEnum {
    NotProvisioned("notProvisioned"),
    Provisioned("provisioned");
    public final String value;
    CertificateStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CertificateStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notProvisioned": return NotProvisioned;
            case "provisioned": return Provisioned;
            default: return null;
        }
    }
}
