package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WorkLocationUpdateScope implements ValuedEnum {
    CurrentSegment("currentSegment"),
    CurrentDay("currentDay"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WorkLocationUpdateScope(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WorkLocationUpdateScope forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "currentSegment": return CurrentSegment;
            case "currentDay": return CurrentDay;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
