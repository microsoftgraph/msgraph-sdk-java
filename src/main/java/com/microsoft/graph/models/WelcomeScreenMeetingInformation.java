package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for welcome screen meeting information.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WelcomeScreenMeetingInformation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "showOrganizerAndTimeOnly": return ShowOrganizerAndTimeOnly;
            case "showOrganizerAndTimeAndSubject": return ShowOrganizerAndTimeAndSubject;
            default: return null;
        }
    }
}
