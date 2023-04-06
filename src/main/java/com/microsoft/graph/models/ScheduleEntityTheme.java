package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ScheduleEntityTheme forValue(@javax.annotation.Nonnull final String searchValue) {
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
