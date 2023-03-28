package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CalendarSharingAction implements ValuedEnum {
    Accept("accept"),
    AcceptAndViewCalendar("acceptAndViewCalendar"),
    ViewCalendar("viewCalendar"),
    AddThisCalendar("addThisCalendar");
    public final String value;
    CalendarSharingAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CalendarSharingAction forValue(@javax.annotation.Nonnull final String searchValue) {
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
