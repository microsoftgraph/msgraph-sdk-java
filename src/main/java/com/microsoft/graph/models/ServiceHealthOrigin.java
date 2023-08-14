package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ServiceHealthOrigin implements ValuedEnum {
    Microsoft("microsoft"),
    ThirdParty("thirdParty"),
    Customer("customer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceHealthOrigin(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceHealthOrigin forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoft": return Microsoft;
            case "thirdParty": return ThirdParty;
            case "customer": return Customer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
