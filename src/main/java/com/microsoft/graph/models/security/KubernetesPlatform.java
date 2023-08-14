package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum KubernetesPlatform implements ValuedEnum {
    Unknown("unknown"),
    Aks("aks"),
    Eks("eks"),
    Gke("gke"),
    Arc("arc"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    KubernetesPlatform(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static KubernetesPlatform forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "aks": return Aks;
            case "eks": return Eks;
            case "gke": return Gke;
            case "arc": return Arc;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
