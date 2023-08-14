package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum MeetingMessageType implements ValuedEnum {
    None("none"),
    MeetingRequest("meetingRequest"),
    MeetingCancelled("meetingCancelled"),
    MeetingAccepted("meetingAccepted"),
    MeetingTenativelyAccepted("meetingTenativelyAccepted"),
    MeetingDeclined("meetingDeclined");
    public final String value;
    MeetingMessageType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MeetingMessageType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "meetingRequest": return MeetingRequest;
            case "meetingCancelled": return MeetingCancelled;
            case "meetingAccepted": return MeetingAccepted;
            case "meetingTenativelyAccepted": return MeetingTenativelyAccepted;
            case "meetingDeclined": return MeetingDeclined;
            default: return null;
        }
    }
}
