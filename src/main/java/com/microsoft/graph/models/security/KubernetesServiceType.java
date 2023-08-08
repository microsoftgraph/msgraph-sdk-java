package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum KubernetesServiceType implements ValuedEnum {
    Unknown("unknown"),
    ClusterIP("clusterIP"),
    ExternalName("externalName"),
    NodePort("nodePort"),
    LoadBalancer("loadBalancer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    KubernetesServiceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static KubernetesServiceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "clusterIP": return ClusterIP;
            case "externalName": return ExternalName;
            case "nodePort": return NodePort;
            case "loadBalancer": return LoadBalancer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
