package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ChatMessageActions implements ValuedEnum {
    ReactionAdded("reactionAdded"),
    ReactionRemoved("reactionRemoved"),
    ActionUndefined("actionUndefined"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ChatMessageActions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ChatMessageActions forValue(@javax.annotation.Nonnull final String searchValue) {
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
