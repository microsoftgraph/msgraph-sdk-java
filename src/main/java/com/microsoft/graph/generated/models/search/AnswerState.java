package com.microsoft.graph.models.search;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AnswerState implements ValuedEnum {
    Published("published"),
    Draft("draft"),
    Excluded("excluded"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AnswerState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AnswerState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "published": return Published;
            case "draft": return Draft;
            case "excluded": return Excluded;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
