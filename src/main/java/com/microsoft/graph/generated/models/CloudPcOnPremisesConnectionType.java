package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcOnPremisesConnectionType implements ValuedEnum {
    HybridAzureADJoin("hybridAzureADJoin"),
    AzureADJoin("azureADJoin"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcOnPremisesConnectionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcOnPremisesConnectionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "hybridAzureADJoin": return HybridAzureADJoin;
            case "azureADJoin": return AzureADJoin;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
