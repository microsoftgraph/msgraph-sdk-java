package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessPackageSuggestionRelatedPeopleInsightLevel implements ValuedEnum {
    Disabled("disabled"),
    Count("count"),
    CountAndNames("countAndNames"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageSuggestionRelatedPeopleInsightLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessPackageSuggestionRelatedPeopleInsightLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "count": return Count;
            case "countAndNames": return CountAndNames;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
