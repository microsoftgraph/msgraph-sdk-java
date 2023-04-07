package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TeamworkCallEventType implements ValuedEnum {
    Call("call"),
    Meeting("meeting"),
    ScreenShare("screenShare"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkCallEventType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamworkCallEventType forValue(@javax.annotation.Nonnull final String searchValue) {
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
