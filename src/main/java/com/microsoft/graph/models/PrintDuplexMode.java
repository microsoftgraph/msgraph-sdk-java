package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PrintDuplexMode implements ValuedEnum {
    FlipOnLongEdge("flipOnLongEdge"),
    FlipOnShortEdge("flipOnShortEdge"),
    OneSided("oneSided"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrintDuplexMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrintDuplexMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "flipOnLongEdge": return FlipOnLongEdge;
            case "flipOnShortEdge": return FlipOnShortEdge;
            case "oneSided": return OneSided;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
