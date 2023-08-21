package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CalendarColor implements ValuedEnum {
    Auto("auto"),
    LightBlue("lightBlue"),
    LightGreen("lightGreen"),
    LightOrange("lightOrange"),
    LightGray("lightGray"),
    LightYellow("lightYellow"),
    LightTeal("lightTeal"),
    LightPink("lightPink"),
    LightBrown("lightBrown"),
    LightRed("lightRed"),
    MaxColor("maxColor");
    public final String value;
    CalendarColor(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CalendarColor forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "auto": return Auto;
            case "lightBlue": return LightBlue;
            case "lightGreen": return LightGreen;
            case "lightOrange": return LightOrange;
            case "lightGray": return LightGray;
            case "lightYellow": return LightYellow;
            case "lightTeal": return LightTeal;
            case "lightPink": return LightPink;
            case "lightBrown": return LightBrown;
            case "lightRed": return LightRed;
            case "maxColor": return MaxColor;
            default: return null;
        }
    }
}
