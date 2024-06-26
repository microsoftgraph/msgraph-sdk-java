package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DefaultRecordBehavior implements ValuedEnum {
    StartLocked("startLocked"),
    StartUnlocked("startUnlocked"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DefaultRecordBehavior(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DefaultRecordBehavior forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "startLocked": return StartLocked;
            case "startUnlocked": return StartUnlocked;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
