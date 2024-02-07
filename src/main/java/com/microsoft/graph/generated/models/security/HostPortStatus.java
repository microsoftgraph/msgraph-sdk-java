package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HostPortStatus implements ValuedEnum {
    Open("open"),
    Filtered("filtered"),
    Closed("closed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HostPortStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HostPortStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "open": return Open;
            case "filtered": return Filtered;
            case "closed": return Closed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
