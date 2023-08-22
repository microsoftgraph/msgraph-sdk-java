package com.microsoft.graph.models.termstore;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RelationType implements ValuedEnum {
    Pin("pin"),
    Reuse("reuse"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RelationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RelationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pin": return Pin;
            case "reuse": return Reuse;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
