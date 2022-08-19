package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of chat entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ChatMessageType forValue(@javax.annotation.Nonnull final String searchValue) {
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
