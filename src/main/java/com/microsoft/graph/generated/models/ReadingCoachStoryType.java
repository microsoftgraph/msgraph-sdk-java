package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReadingCoachStoryType implements ValuedEnum {
    AiGenerated("aiGenerated"),
    ReadWorks("readWorks"),
    UserProvided("userProvided"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ReadingCoachStoryType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReadingCoachStoryType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "aiGenerated": return AiGenerated;
            case "readWorks": return ReadWorks;
            case "userProvided": return UserProvided;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
