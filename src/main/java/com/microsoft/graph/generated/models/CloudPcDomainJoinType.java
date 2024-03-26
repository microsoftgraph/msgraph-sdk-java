package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcDomainJoinType implements ValuedEnum {
    AzureADJoin("azureADJoin"),
    HybridAzureADJoin("hybridAzureADJoin"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcDomainJoinType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcDomainJoinType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "azureADJoin": return AzureADJoin;
            case "hybridAzureADJoin": return HybridAzureADJoin;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
