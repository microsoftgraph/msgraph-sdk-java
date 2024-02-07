package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PrinterFeedOrientation implements ValuedEnum {
    LongEdgeFirst("longEdgeFirst"),
    ShortEdgeFirst("shortEdgeFirst"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrinterFeedOrientation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrinterFeedOrientation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "longEdgeFirst": return LongEdgeFirst;
            case "shortEdgeFirst": return ShortEdgeFirst;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
