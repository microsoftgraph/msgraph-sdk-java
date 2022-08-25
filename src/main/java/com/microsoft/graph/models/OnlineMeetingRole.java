package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum OnlineMeetingRole implements ValuedEnum {
    Attendee("attendee"),
    Presenter("presenter"),
    UnknownFutureValue("unknownFutureValue"),
    Producer("producer");
    public final String value;
    OnlineMeetingRole(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OnlineMeetingRole forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "attendee": return Attendee;
            case "presenter": return Presenter;
            case "unknownFutureValue": return UnknownFutureValue;
            case "producer": return Producer;
            default: return null;
        }
    }
}
