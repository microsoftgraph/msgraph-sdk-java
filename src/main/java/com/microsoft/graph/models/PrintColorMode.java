package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PrintColorMode implements ValuedEnum {
    BlackAndWhite("blackAndWhite"),
    Grayscale("grayscale"),
    Color("color"),
    Auto("auto"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrintColorMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrintColorMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "blackAndWhite": return BlackAndWhite;
            case "grayscale": return Grayscale;
            case "color": return Color;
            case "auto": return Auto;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
