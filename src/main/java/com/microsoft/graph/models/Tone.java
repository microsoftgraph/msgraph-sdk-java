package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum Tone implements ValuedEnum {
    Tone0("tone0"),
    Tone1("tone1"),
    Tone2("tone2"),
    Tone3("tone3"),
    Tone4("tone4"),
    Tone5("tone5"),
    Tone6("tone6"),
    Tone7("tone7"),
    Tone8("tone8"),
    Tone9("tone9"),
    Star("star"),
    Pound("pound"),
    A("a"),
    B("b"),
    C("c"),
    D("d"),
    Flash("flash");
    public final String value;
    Tone(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Tone forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tone0": return Tone0;
            case "tone1": return Tone1;
            case "tone2": return Tone2;
            case "tone3": return Tone3;
            case "tone4": return Tone4;
            case "tone5": return Tone5;
            case "tone6": return Tone6;
            case "tone7": return Tone7;
            case "tone8": return Tone8;
            case "tone9": return Tone9;
            case "star": return Star;
            case "pound": return Pound;
            case "a": return A;
            case "b": return B;
            case "c": return C;
            case "d": return D;
            case "flash": return Flash;
            default: return null;
        }
    }
}
