package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EngagementAsyncOperationType implements ValuedEnum {
    CreateCommunity("createCommunity"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EngagementAsyncOperationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EngagementAsyncOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "createCommunity": return CreateCommunity;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
