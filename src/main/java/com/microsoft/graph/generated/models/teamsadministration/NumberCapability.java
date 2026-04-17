package com.microsoft.graph.models.teamsadministration;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NumberCapability implements ValuedEnum {
    ConferenceAssignment("conferenceAssignment"),
    VoiceApplicationAssignment("voiceApplicationAssignment"),
    UserAssignment("userAssignment"),
    TeamsPhoneMobile("teamsPhoneMobile"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NumberCapability(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NumberCapability forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "conferenceAssignment": return ConferenceAssignment;
            case "voiceApplicationAssignment": return VoiceApplicationAssignment;
            case "userAssignment": return UserAssignment;
            case "teamsPhoneMobile": return TeamsPhoneMobile;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
