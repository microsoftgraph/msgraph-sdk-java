package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TeamworkConversationIdentityType implements ValuedEnum {
    Team("team"),
    Channel("channel"),
    Chat("chat"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkConversationIdentityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamworkConversationIdentityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "team": return Team;
            case "channel": return Channel;
            case "chat": return Chat;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
