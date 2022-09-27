package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum RoutingMode implements ValuedEnum {
    OneToOne("oneToOne"),
    Multicast("multicast"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RoutingMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RoutingMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "oneToOne": return OneToOne;
            case "multicast": return Multicast;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
