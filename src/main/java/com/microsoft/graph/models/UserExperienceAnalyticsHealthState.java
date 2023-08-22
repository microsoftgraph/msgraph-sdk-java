package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserExperienceAnalyticsHealthState implements ValuedEnum {
    /** Indicates that the health state is unknown. */
    Unknown("unknown"),
    /** Indicates that the health state is insufficient data. */
    InsufficientData("insufficientData"),
    /** Indicates that the health state needs attention. */
    NeedsAttention("needsAttention"),
    /** Indicates that the health state is meeting goals. */
    MeetingGoals("meetingGoals"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserExperienceAnalyticsHealthState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserExperienceAnalyticsHealthState forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
