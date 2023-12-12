package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for a weekly schedule.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WeeklySchedule implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Everyday. */
    Everyday("everyday"),
    /** Sunday. */
    Sunday("sunday"),
    /** Monday. */
    Monday("monday"),
    /** Tuesday. */
    Tuesday("tuesday"),
    /** Wednesday. */
    Wednesday("wednesday"),
    /** Thursday. */
    Thursday("thursday"),
    /** Friday. */
    Friday("friday"),
    /** Saturday. */
    Saturday("saturday");
    public final String value;
    WeeklySchedule(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WeeklySchedule forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "everyday": return Everyday;
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
