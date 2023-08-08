package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DayOfWeek implements ValuedEnum {
    Sunday("sunday"),
    Monday("monday"),
    Tuesday("tuesday"),
    Wednesday("wednesday"),
    Thursday("thursday"),
    Friday("friday"),
    Saturday("saturday");
    public final String value;
    DayOfWeek(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DayOfWeek forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sunday": return Sunday;
            case "monday": return Monday;
            case "tuesday": return Tuesday;
            case "wednesday": return Wednesday;
            case "thursday": return Thursday;
            case "friday": return Friday;
            case "saturday": return Saturday;
            default: return null;
        }
    }
}
