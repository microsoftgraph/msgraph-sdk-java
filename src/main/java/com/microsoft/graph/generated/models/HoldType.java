package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HoldType implements ValuedEnum {
    None("none"),
    Private("private"),
    Public("public"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HoldType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HoldType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "private": return Private;
            case "public": return Public;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
