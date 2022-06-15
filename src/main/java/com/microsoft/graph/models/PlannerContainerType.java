package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of application entities. */
public enum PlannerContainerType implements ValuedEnum {
    Group("group"),
    UnknownFutureValue("unknownFutureValue"),
    Roster("roster");
    public final String value;
    PlannerContainerType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PlannerContainerType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "group": return Group;
            case "unknownFutureValue": return UnknownFutureValue;
            case "roster": return Roster;
            default: return null;
        }
    }
}
