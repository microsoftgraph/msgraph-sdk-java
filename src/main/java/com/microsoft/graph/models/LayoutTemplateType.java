package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LayoutTemplateType implements ValuedEnum {
    Default("default"),
    VerticalSplit("verticalSplit"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LayoutTemplateType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LayoutTemplateType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "verticalSplit": return VerticalSplit;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
