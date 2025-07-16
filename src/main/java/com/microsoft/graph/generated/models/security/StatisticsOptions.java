package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StatisticsOptions implements ValuedEnum {
    IncludeRefiners("includeRefiners"),
    IncludeQueryStats("includeQueryStats"),
    IncludeUnindexedStats("includeUnindexedStats"),
    AdvancedIndexing("advancedIndexing"),
    LocationsWithoutHits("locationsWithoutHits"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    StatisticsOptions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StatisticsOptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "includeRefiners": return IncludeRefiners;
            case "includeQueryStats": return IncludeQueryStats;
            case "includeUnindexedStats": return IncludeUnindexedStats;
            case "advancedIndexing": return AdvancedIndexing;
            case "locationsWithoutHits": return LocationsWithoutHits;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
