package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum GiphyRatingType implements ValuedEnum {
    Strict("strict"),
    Moderate("moderate"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    GiphyRatingType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GiphyRatingType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "strict": return Strict;
            case "moderate": return Moderate;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
