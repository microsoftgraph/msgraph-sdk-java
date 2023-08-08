package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum MeetingRequestType implements ValuedEnum {
    None("none"),
    NewMeetingRequest("newMeetingRequest"),
    FullUpdate("fullUpdate"),
    InformationalUpdate("informationalUpdate"),
    SilentUpdate("silentUpdate"),
    Outdated("outdated"),
    PrincipalWantsCopy("principalWantsCopy");
    public final String value;
    MeetingRequestType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MeetingRequestType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "newMeetingRequest": return NewMeetingRequest;
            case "fullUpdate": return FullUpdate;
            case "informationalUpdate": return InformationalUpdate;
            case "silentUpdate": return SilentUpdate;
            case "outdated": return Outdated;
            case "principalWantsCopy": return PrincipalWantsCopy;
            default: return null;
        }
    }
}
