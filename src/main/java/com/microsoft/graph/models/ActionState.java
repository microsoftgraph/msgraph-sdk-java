package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ActionState implements ValuedEnum {
    None("none"),
    Pending("pending"),
    Canceled("canceled"),
    Active("active"),
    Done("done"),
    Failed("failed"),
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
