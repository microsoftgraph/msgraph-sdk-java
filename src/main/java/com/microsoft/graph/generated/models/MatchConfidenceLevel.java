package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MatchConfidenceLevel implements ValuedEnum {
    Exact("exact"),
    Relaxed("relaxed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MatchConfidenceLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MatchConfidenceLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "exact": return Exact;
            case "relaxed": return Relaxed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
