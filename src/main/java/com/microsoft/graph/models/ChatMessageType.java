package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChatMessageType implements ValuedEnum {
    Message("message"),
    ChatEvent("chatEvent"),
    Typing("typing"),
    UnknownFutureValue("unknownFutureValue"),
    SystemEventMessage("systemEventMessage");
    public final String value;
    ChatMessageType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChatMessageType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "message": return Message;
            case "chatEvent": return ChatEvent;
            case "typing": return Typing;
            case "unknownFutureValue": return UnknownFutureValue;
            case "systemEventMessage": return SystemEventMessage;
            default: return null;
        }
    }
}
