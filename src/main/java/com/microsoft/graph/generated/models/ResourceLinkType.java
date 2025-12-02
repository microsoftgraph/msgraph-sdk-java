package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ResourceLinkType implements ValuedEnum {
    Url("url"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ResourceLinkType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ResourceLinkType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "url": return Url;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
