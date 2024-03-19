package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TitleAreaTextAlignmentType implements ValuedEnum {
    Left("left"),
    Center("center"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TitleAreaTextAlignmentType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TitleAreaTextAlignmentType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "left": return Left;
            case "center": return Center;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
