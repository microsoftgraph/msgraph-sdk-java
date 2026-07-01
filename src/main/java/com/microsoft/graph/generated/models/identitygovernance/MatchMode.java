package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MatchMode implements ValuedEnum {
    Any("any"),
    All("all"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MatchMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MatchMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "any": return Any;
            case "all": return All;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
