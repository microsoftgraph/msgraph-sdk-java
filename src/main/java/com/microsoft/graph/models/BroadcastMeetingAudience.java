package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum BroadcastMeetingAudience implements ValuedEnum {
    RoleIsAttendee("roleIsAttendee"),
    Organization("organization"),
    Everyone("everyone"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BroadcastMeetingAudience(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BroadcastMeetingAudience forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "roleIsAttendee": return RoleIsAttendee;
            case "organization": return Organization;
            case "everyone": return Everyone;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
