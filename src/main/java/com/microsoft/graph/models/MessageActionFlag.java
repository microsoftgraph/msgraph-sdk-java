package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MessageActionFlag forValue(@javax.annotation.Nonnull final String searchValue) {
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
