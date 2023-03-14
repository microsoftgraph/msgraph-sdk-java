package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RoutingType implements ValuedEnum {
    Forwarded("forwarded"),
    Lookup("lookup"),
    SelfFork("selfFork"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RoutingType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RoutingType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "forwarded": return Forwarded;
            case "lookup": return Lookup;
            case "selfFork": return SelfFork;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
