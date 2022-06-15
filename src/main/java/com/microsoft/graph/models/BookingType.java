package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of place entities. */
public enum BookingType implements ValuedEnum {
    Unknown("unknown"),
    Standard("standard"),
    Reserved("reserved");
    public final String value;
    BookingType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BookingType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "standard": return Standard;
            case "reserved": return Reserved;
            default: return null;
        }
    }
}
