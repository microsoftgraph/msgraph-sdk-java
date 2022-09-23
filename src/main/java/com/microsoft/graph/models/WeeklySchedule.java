package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WeeklySchedule forValue(@javax.annotation.Nonnull final String searchValue) {
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
