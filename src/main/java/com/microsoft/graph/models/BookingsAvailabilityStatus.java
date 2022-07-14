package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the getStaffAvailability method. */
public enum BookingsAvailabilityStatus implements ValuedEnum {
    Available("available"),
    Busy("busy"),
    SlotsAvailable("slotsAvailable"),
    OutOfOffice("outOfOffice"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BookingsAvailabilityStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BookingsAvailabilityStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "available": return Available;
            case "busy": return Busy;
            case "slotsAvailable": return SlotsAvailable;
            case "outOfOffice": return OutOfOffice;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
