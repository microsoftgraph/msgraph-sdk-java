package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ResponseFeedbackType implements ValuedEnum {
    None("none"),
    NotDetected("notDetected"),
    VeryUnpleasant("veryUnpleasant"),
    Unpleasant("unpleasant"),
    Neutral("neutral"),
    Pleasant("pleasant"),
    VeryPleasant("veryPleasant"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ResponseFeedbackType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ResponseFeedbackType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "notDetected": return NotDetected;
            case "veryUnpleasant": return VeryUnpleasant;
            case "unpleasant": return Unpleasant;
            case "neutral": return Neutral;
            case "pleasant": return Pleasant;
            case "veryPleasant": return VeryPleasant;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
