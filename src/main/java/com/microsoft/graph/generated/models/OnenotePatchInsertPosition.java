package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OnenotePatchInsertPosition implements ValuedEnum {
    After("After"),
    Before("Before");
    public final String value;
    OnenotePatchInsertPosition(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OnenotePatchInsertPosition forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "After": return After;
            case "Before": return Before;
            default: return null;
        }
    }
}
