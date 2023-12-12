package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamworkCallEventType implements ValuedEnum {
    Call("call"),
    Meeting("meeting"),
    ScreenShare("screenShare"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkCallEventType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamworkCallEventType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "call": return Call;
            case "meeting": return Meeting;
            case "screenShare": return ScreenShare;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
