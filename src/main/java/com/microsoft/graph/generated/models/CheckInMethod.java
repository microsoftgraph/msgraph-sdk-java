package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CheckInMethod implements ValuedEnum {
    Unspecified("unspecified"),
    Manual("manual"),
    Inferred("inferred"),
    Verified("verified"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CheckInMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CheckInMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unspecified": return Unspecified;
            case "manual": return Manual;
            case "inferred": return Inferred;
            case "verified": return Verified;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
