package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum TaskStatus implements ValuedEnum {
    NotStarted("notStarted"),
    InProgress("inProgress"),
    Completed("completed"),
    WaitingOnOthers("waitingOnOthers"),
    Deferred("deferred");
    public final String value;
    TaskStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TaskStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notStarted": return NotStarted;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "waitingOnOthers": return WaitingOnOthers;
            case "deferred": return Deferred;
            default: return null;
        }
    }
}
