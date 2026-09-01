package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConnectorType implements ValuedEnum {
    SapIag("sapIag"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectorType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConnectorType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sapIag": return SapIag;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
