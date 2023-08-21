package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CalendarSharingAction implements ValuedEnum {
    Accept("accept"),
    AcceptAndViewCalendar("acceptAndViewCalendar"),
    ViewCalendar("viewCalendar"),
    AddThisCalendar("addThisCalendar");
    public final String value;
    CalendarSharingAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CalendarSharingAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "accept": return Accept;
            case "acceptAndViewCalendar": return AcceptAndViewCalendar;
            case "viewCalendar": return ViewCalendar;
            case "addThisCalendar": return AddThisCalendar;
            default: return null;
        }
    }
}
