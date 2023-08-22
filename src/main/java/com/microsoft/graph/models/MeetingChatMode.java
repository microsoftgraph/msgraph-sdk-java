package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MeetingChatMode implements ValuedEnum {
    Enabled("enabled"),
    Disabled("disabled"),
    Limited("limited"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MeetingChatMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MeetingChatMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            case "limited": return Limited;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
