package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SectionEmphasisType implements ValuedEnum {
    None("none"),
    Neutral("neutral"),
    Soft("soft"),
    Strong("strong"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SectionEmphasisType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SectionEmphasisType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "neutral": return Neutral;
            case "soft": return Soft;
            case "strong": return Strong;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
