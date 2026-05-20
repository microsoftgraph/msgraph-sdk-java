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
    UnknownFutureValue("unknownFutureValue"),
    DarkRed("darkRed"),
    Cranberry("cranberry"),
    DarkOrange("darkOrange"),
    Bronze("bronze"),
    Peach("peach"),
    Gold("gold"),
    Lime("lime"),
    Forest("forest"),
    LightGreen("lightGreen"),
    Jade("jade"),
    LightTeal("lightTeal"),
    DarkTeal("darkTeal"),
    Steel("steel"),
    SkyBlue("skyBlue"),
    BlueGray("blueGray"),
    Lavender("lavender"),
    Lilac("lilac"),
    Plum("plum"),
    Magenta("magenta"),
    DarkBrown("darkBrown"),
    Beige("beige"),
    Charcoal("charcoal"),
    Silver("silver");
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
            case "darkRed": return DarkRed;
            case "cranberry": return Cranberry;
            case "darkOrange": return DarkOrange;
            case "bronze": return Bronze;
            case "peach": return Peach;
            case "gold": return Gold;
            case "lime": return Lime;
            case "forest": return Forest;
            case "lightGreen": return LightGreen;
            case "jade": return Jade;
            case "lightTeal": return LightTeal;
            case "darkTeal": return DarkTeal;
            case "steel": return Steel;
            case "skyBlue": return SkyBlue;
            case "blueGray": return BlueGray;
            case "lavender": return Lavender;
            case "lilac": return Lilac;
            case "plum": return Plum;
            case "magenta": return Magenta;
            case "darkBrown": return DarkBrown;
            case "beige": return Beige;
            case "charcoal": return Charcoal;
            case "silver": return Silver;
            default: return null;
        }
    }
}
