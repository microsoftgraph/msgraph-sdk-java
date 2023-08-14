package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TeamsAppPublishingState implements ValuedEnum {
    Submitted("submitted"),
    Rejected("rejected"),
    Published("published"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamsAppPublishingState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamsAppPublishingState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "submitted": return Submitted;
            case "rejected": return Rejected;
            case "published": return Published;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
