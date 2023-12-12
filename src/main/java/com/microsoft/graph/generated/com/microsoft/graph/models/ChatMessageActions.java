package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChatMessageActions implements ValuedEnum {
    ReactionAdded("reactionAdded"),
    ReactionRemoved("reactionRemoved"),
    ActionUndefined("actionUndefined"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ChatMessageActions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChatMessageActions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "reactionAdded": return ReactionAdded;
            case "reactionRemoved": return ReactionRemoved;
            case "actionUndefined": return ActionUndefined;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
