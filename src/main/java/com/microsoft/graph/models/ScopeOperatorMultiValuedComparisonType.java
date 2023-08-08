package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ScopeOperatorMultiValuedComparisonType implements ValuedEnum {
    All("All"),
    Any("Any");
    public final String value;
    ScopeOperatorMultiValuedComparisonType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ScopeOperatorMultiValuedComparisonType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "All": return All;
            case "Any": return Any;
            default: return null;
        }
    }
}
