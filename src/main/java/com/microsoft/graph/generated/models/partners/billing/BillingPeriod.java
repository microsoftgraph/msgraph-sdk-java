package com.microsoft.graph.models.partners.billing;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BillingPeriod implements ValuedEnum {
    Current("current"),
    Last("last"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BillingPeriod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BillingPeriod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "current": return Current;
            case "last": return Last;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
