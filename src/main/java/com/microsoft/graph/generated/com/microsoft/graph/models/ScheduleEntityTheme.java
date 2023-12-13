package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ScheduleEntityTheme implements ValuedEnum {
    White("white"),
    Blue("blue"),
    Green("green"),
    Purple("purple"),
    Pink("pink"),
    Yellow("yellow"),
    Gray("gray"),
    DarkBlue("darkBlue"),
    DarkGreen("darkGreen"),
    DarkPurple("darkPurple"),
    DarkPink("darkPink"),
    DarkYellow("darkYellow"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ScheduleEntityTheme(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ScheduleEntityTheme forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "white": return White;
            case "blue": return Blue;
            case "green": return Green;
            case "purple": return Purple;
            case "pink": return Pink;
            case "yellow": return Yellow;
            case "gray": return Gray;
            case "darkBlue": return DarkBlue;
            case "darkGreen": return DarkGreen;
            case "darkPurple": return DarkPurple;
            case "darkPink": return DarkPink;
            case "darkYellow": return DarkYellow;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
