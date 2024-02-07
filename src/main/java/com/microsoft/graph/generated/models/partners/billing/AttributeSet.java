package com.microsoft.graph.models.partners.billing;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AttributeSet implements ValuedEnum {
    Full("full"),
    Basic("basic"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AttributeSet(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AttributeSet forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "full": return Full;
            case "basic": return Basic;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
