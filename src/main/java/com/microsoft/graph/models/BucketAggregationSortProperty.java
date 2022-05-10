package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the query method. */
public enum BucketAggregationSortProperty implements ValuedEnum {
    Count("count"),
    KeyAsString("keyAsString"),
    KeyAsNumber("keyAsNumber"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BucketAggregationSortProperty(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BucketAggregationSortProperty forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "count": return Count;
            case "keyAsString": return KeyAsString;
            case "keyAsNumber": return KeyAsNumber;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
