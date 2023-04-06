package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PrintOrientation implements ValuedEnum {
    Portrait("portrait"),
    Landscape("landscape"),
    ReverseLandscape("reverseLandscape"),
    ReversePortrait("reversePortrait"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrintOrientation(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrintOrientation forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "portrait": return Portrait;
            case "landscape": return Landscape;
            case "reverseLandscape": return ReverseLandscape;
            case "reversePortrait": return ReversePortrait;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
