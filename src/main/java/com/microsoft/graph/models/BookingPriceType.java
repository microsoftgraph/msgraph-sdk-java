package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the solutionsRoot singleton.  */
public enum BookingPriceType implements ValuedEnum {
    Undefined("undefined"),
    FixedPrice("fixedPrice"),
    StartingAt("startingAt"),
    Hourly("hourly"),
    Free("free"),
    PriceVaries("priceVaries"),
    CallUs("callUs"),
    NotSet("notSet"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BookingPriceType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BookingPriceType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "undefined": return Undefined;
            case "fixedPrice": return FixedPrice;
            case "startingAt": return StartingAt;
            case "hourly": return Hourly;
            case "free": return Free;
            case "priceVaries": return PriceVaries;
            case "callUs": return CallUs;
            case "notSet": return NotSet;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
