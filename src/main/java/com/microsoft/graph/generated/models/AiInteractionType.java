package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AiInteractionType implements ValuedEnum {
    UserPrompt("userPrompt"),
    AiResponse("aiResponse"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AiInteractionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AiInteractionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userPrompt": return UserPrompt;
            case "aiResponse": return AiResponse;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
