package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ResponseType implements ValuedEnum {
    None("none"),
    Organizer("organizer"),
    TentativelyAccepted("tentativelyAccepted"),
    Accepted("accepted"),
    Declined("declined"),
    NotResponded("notResponded");
    public final String value;
    ResponseType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ResponseType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "organizer": return Organizer;
            case "tentativelyAccepted": return TentativelyAccepted;
            case "accepted": return Accepted;
            case "declined": return Declined;
            case "notResponded": return NotResponded;
            default: return null;
        }
    }
}
