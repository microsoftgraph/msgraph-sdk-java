package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CategoryColor implements ValuedEnum {
    None("none"),
    Preset0("preset0"),
    Preset1("preset1"),
    Preset2("preset2"),
    Preset3("preset3"),
    Preset4("preset4"),
    Preset5("preset5"),
    Preset6("preset6"),
    Preset7("preset7"),
    Preset8("preset8"),
    Preset9("preset9"),
    Preset10("preset10"),
    Preset11("preset11"),
    Preset12("preset12"),
    Preset13("preset13"),
    Preset14("preset14"),
    Preset15("preset15"),
    Preset16("preset16"),
    Preset17("preset17"),
    Preset18("preset18"),
    Preset19("preset19"),
    Preset20("preset20"),
    Preset21("preset21"),
    Preset22("preset22"),
    Preset23("preset23"),
    Preset24("preset24");
    public final String value;
    CategoryColor(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CategoryColor forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "preset0": return Preset0;
            case "preset1": return Preset1;
            case "preset2": return Preset2;
            case "preset3": return Preset3;
            case "preset4": return Preset4;
            case "preset5": return Preset5;
            case "preset6": return Preset6;
            case "preset7": return Preset7;
            case "preset8": return Preset8;
            case "preset9": return Preset9;
            case "preset10": return Preset10;
            case "preset11": return Preset11;
            case "preset12": return Preset12;
            case "preset13": return Preset13;
            case "preset14": return Preset14;
            case "preset15": return Preset15;
            case "preset16": return Preset16;
            case "preset17": return Preset17;
            case "preset18": return Preset18;
            case "preset19": return Preset19;
            case "preset20": return Preset20;
            case "preset21": return Preset21;
            case "preset22": return Preset22;
            case "preset23": return Preset23;
            case "preset24": return Preset24;
            default: return null;
        }
    }
}
