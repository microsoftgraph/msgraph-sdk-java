package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EventType implements ValuedEnum {
    SingleInstance("singleInstance"),
    Occurrence("occurrence"),
    Exception("exception"),
    SeriesMaster("seriesMaster");
    public final String value;
    EventType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EventType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "singleInstance": return SingleInstance;
            case "occurrence": return Occurrence;
            case "exception": return Exception;
            case "seriesMaster": return SeriesMaster;
            default: return null;
        }
    }
}
