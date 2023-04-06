package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum UserExperienceAnalyticsHealthState implements ValuedEnum {
    Unknown("unknown"),
    InsufficientData("insufficientData"),
    NeedsAttention("needsAttention"),
    MeetingGoals("meetingGoals"),
    /** Evolvable enum member */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserExperienceAnalyticsHealthState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserExperienceAnalyticsHealthState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "insufficientData": return InsufficientData;
            case "needsAttention": return NeedsAttention;
            case "meetingGoals": return MeetingGoals;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
