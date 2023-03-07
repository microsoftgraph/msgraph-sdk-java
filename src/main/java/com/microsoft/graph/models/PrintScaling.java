package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PrintScaling implements ValuedEnum {
    Auto("auto"),
    ShrinkToFit("shrinkToFit"),
    Fill("fill"),
    Fit("fit"),
    None("none"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrintScaling(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrintScaling forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "auto": return Auto;
            case "shrinkToFit": return ShrinkToFit;
            case "fill": return Fill;
            case "fit": return Fit;
            case "none": return None;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
