package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ResourceAccessType implements ValuedEnum {
    None("none"),
    Read("read"),
    Write("write"),
    Create("create"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ResourceAccessType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ResourceAccessType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "read": return Read;
            case "write": return Write;
            case "create": return Create;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
