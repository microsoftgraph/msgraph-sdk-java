package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DestinationType implements ValuedEnum {
    New("new"),
    InPlace("inPlace"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DestinationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DestinationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "new": return New;
            case "inPlace": return InPlace;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
