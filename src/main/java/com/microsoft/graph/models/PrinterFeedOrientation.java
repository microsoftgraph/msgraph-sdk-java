package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
public enum PrinterFeedOrientation implements ValuedEnum {
    LongEdgeFirst("longEdgeFirst"),
    ShortEdgeFirst("shortEdgeFirst"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrinterFeedOrientation(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrinterFeedOrientation forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "longEdgeFirst": return LongEdgeFirst;
            case "shortEdgeFirst": return ShortEdgeFirst;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
