package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ChatMessageImportance implements ValuedEnum {
    Normal("normal"),
    High("high"),
    Urgent("urgent"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ChatMessageImportance(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChatMessageImportance forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "normal": return Normal;
            case "high": return High;
            case "urgent": return Urgent;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
