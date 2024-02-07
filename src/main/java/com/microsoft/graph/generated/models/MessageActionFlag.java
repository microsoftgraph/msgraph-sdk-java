package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MessageActionFlag implements ValuedEnum {
    Any("any"),
    Call("call"),
    DoNotForward("doNotForward"),
    FollowUp("followUp"),
    Fyi("fyi"),
    Forward("forward"),
    NoResponseNecessary("noResponseNecessary"),
    Read("read"),
    Reply("reply"),
    ReplyToAll("replyToAll"),
    Review("review");
    public final String value;
    MessageActionFlag(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MessageActionFlag forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "any": return Any;
            case "call": return Call;
            case "doNotForward": return DoNotForward;
            case "followUp": return FollowUp;
            case "fyi": return Fyi;
            case "forward": return Forward;
            case "noResponseNecessary": return NoResponseNecessary;
            case "read": return Read;
            case "reply": return Reply;
            case "replyToAll": return ReplyToAll;
            case "review": return Review;
            default: return null;
        }
    }
}
