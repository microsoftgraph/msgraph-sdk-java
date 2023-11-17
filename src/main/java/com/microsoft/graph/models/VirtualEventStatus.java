package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VirtualEventStatus implements ValuedEnum {
    Draft("draft"),
    Published("published"),
    Canceled("canceled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VirtualEventStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VirtualEventStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "draft": return Draft;
            case "published": return Published;
            case "canceled": return Canceled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
