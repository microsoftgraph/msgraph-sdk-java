package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum ManagedAppPinCharacterSet implements ValuedEnum {
    /** Numeric characters */
    Numeric("numeric"),
    /** Alphanumeric and symbolic characters */
    AlphanumericAndSymbol("alphanumericAndSymbol");
    public final String value;
    ManagedAppPinCharacterSet(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedAppPinCharacterSet forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "numeric": return Numeric;
            case "alphanumericAndSymbol": return AlphanumericAndSymbol;
            default: return null;
        }
    }
}
