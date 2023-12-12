package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Character set which is to be used for a user's app PIN
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedAppPinCharacterSet implements ValuedEnum {
    /** Numeric characters */
    Numeric("numeric"),
    /** Alphanumeric and symbolic characters */
    AlphanumericAndSymbol("alphanumericAndSymbol");
    public final String value;
    ManagedAppPinCharacterSet(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedAppPinCharacterSet forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "numeric": return Numeric;
            case "alphanumericAndSymbol": return AlphanumericAndSymbol;
            default: return null;
        }
    }
}
