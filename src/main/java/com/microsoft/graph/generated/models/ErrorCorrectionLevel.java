package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ErrorCorrectionLevel implements ValuedEnum {
    L("l"),
    M("m"),
    Q("q"),
    H("h"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ErrorCorrectionLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ErrorCorrectionLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "l": return L;
            case "m": return M;
            case "q": return Q;
            case "h": return H;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
