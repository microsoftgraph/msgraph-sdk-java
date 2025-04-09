package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ItemsToInclude implements ValuedEnum {
    SearchHits("searchHits"),
    PartiallyIndexed("partiallyIndexed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ItemsToInclude(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ItemsToInclude forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "searchHits": return SearchHits;
            case "partiallyIndexed": return PartiallyIndexed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
