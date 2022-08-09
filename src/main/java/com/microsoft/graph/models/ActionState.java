package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum ActionState implements ValuedEnum {
    /** Not a valid action state */
    None("none"),
    /** Action is pending */
    Pending("pending"),
    /** Action has been cancelled. */
    Canceled("canceled"),
    /** Action is active. */
    Active("active"),
    /** Action completed without errors. */
    Done("done"),
    /** Action failed */
    Failed("failed"),
    /** Action is not supported. */
    NotSupported("notSupported");
    public final String value;
    ActionState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ActionState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "pending": return Pending;
            case "canceled": return Canceled;
            case "active": return Active;
            case "done": return Done;
            case "failed": return Failed;
            case "notSupported": return NotSupported;
            default: return null;
        }
    }
}
