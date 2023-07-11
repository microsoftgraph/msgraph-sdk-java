package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum LayoutTemplateType implements ValuedEnum {
    Default("default"),
    VerticalSplit("verticalSplit"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LayoutTemplateType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LayoutTemplateType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "verticalSplit": return VerticalSplit;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
