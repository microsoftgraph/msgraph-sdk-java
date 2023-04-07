package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Possible values for welcome screen meeting information. */
public enum WelcomeScreenMeetingInformation implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Show organizer and time only. */
    ShowOrganizerAndTimeOnly("showOrganizerAndTimeOnly"),
    /** Show organizer, time and subject (subject is hidden for private meetings). */
    ShowOrganizerAndTimeAndSubject("showOrganizerAndTimeAndSubject");
    public final String value;
    WelcomeScreenMeetingInformation(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WelcomeScreenMeetingInformation forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "showOrganizerAndTimeOnly": return ShowOrganizerAndTimeOnly;
            case "showOrganizerAndTimeAndSubject": return ShowOrganizerAndTimeAndSubject;
            default: return null;
        }
    }
}
