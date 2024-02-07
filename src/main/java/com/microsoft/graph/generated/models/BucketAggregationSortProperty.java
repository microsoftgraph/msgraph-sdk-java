package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BucketAggregationSortProperty implements ValuedEnum {
    Count("count"),
    KeyAsString("keyAsString"),
    KeyAsNumber("keyAsNumber"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BucketAggregationSortProperty(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BucketAggregationSortProperty forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
