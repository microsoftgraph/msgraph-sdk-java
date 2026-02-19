package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExchangeMessageTraceStatus implements ValuedEnum {
    GettingStatus("gettingStatus"),
    Pending("pending"),
    Failed("failed"),
    Delivered("delivered"),
    Expanded("expanded"),
    Quarantined("quarantined"),
    FilteredAsSpam("filteredAsSpam"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ExchangeMessageTraceStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExchangeMessageTraceStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "gettingStatus": return GettingStatus;
            case "pending": return Pending;
            case "failed": return Failed;
            case "delivered": return Delivered;
            case "expanded": return Expanded;
            case "quarantined": return Quarantined;
            case "filteredAsSpam": return FilteredAsSpam;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
