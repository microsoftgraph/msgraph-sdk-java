package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
public enum ServiceHealthOrigin implements ValuedEnum {
    Microsoft("microsoft"),
    ThirdParty("thirdParty"),
    Customer("customer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceHealthOrigin(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceHealthOrigin forValue(@javax.annotation.Nonnull final String searchValue) {
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
