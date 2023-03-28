package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PrintMultipageLayout implements ValuedEnum {
    ClockwiseFromTopLeft("clockwiseFromTopLeft"),
    CounterclockwiseFromTopLeft("counterclockwiseFromTopLeft"),
    CounterclockwiseFromTopRight("counterclockwiseFromTopRight"),
    ClockwiseFromTopRight("clockwiseFromTopRight"),
    CounterclockwiseFromBottomLeft("counterclockwiseFromBottomLeft"),
    ClockwiseFromBottomLeft("clockwiseFromBottomLeft"),
    CounterclockwiseFromBottomRight("counterclockwiseFromBottomRight"),
    ClockwiseFromBottomRight("clockwiseFromBottomRight"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrintMultipageLayout(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrintMultipageLayout forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "clockwiseFromTopLeft": return ClockwiseFromTopLeft;
            case "counterclockwiseFromTopLeft": return CounterclockwiseFromTopLeft;
            case "counterclockwiseFromTopRight": return CounterclockwiseFromTopRight;
            case "clockwiseFromTopRight": return ClockwiseFromTopRight;
            case "counterclockwiseFromBottomLeft": return CounterclockwiseFromBottomLeft;
            case "clockwiseFromBottomLeft": return ClockwiseFromBottomLeft;
            case "counterclockwiseFromBottomRight": return CounterclockwiseFromBottomRight;
            case "clockwiseFromBottomRight": return ClockwiseFromBottomRight;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
