package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of chat entities. */
public enum ChatMessagePolicyViolationDlpActionTypes implements ValuedEnum {
    None("none"),
    NotifySender("notifySender"),
    BlockAccess("blockAccess"),
    BlockAccessExternal("blockAccessExternal");
    public final String value;
    ChatMessagePolicyViolationDlpActionTypes(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ChatMessagePolicyViolationDlpActionTypes forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "notifySender": return NotifySender;
            case "blockAccess": return BlockAccess;
            case "blockAccessExternal": return BlockAccessExternal;
            default: return null;
        }
    }
}
