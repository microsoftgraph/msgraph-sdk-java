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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BroadcastMeetingAudience forValue(@javax.annotation.Nonnull final String searchValue) {
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
