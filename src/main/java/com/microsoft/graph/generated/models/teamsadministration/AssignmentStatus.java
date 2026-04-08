package com.microsoft.graph.models.teamsadministration;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssignmentStatus implements ValuedEnum {
    Unassigned("unassigned"),
    InternalError("internalError"),
    UserAssigned("userAssigned"),
    ConferenceAssigned("conferenceAssigned"),
    VoiceApplicationAssigned("voiceApplicationAssigned"),
    ThirdPartyAppAssigned("thirdPartyAppAssigned"),
    PolicyAssigned("policyAssigned"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AssignmentStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssignmentStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unassigned": return Unassigned;
            case "internalError": return InternalError;
            case "userAssigned": return UserAssigned;
            case "conferenceAssigned": return ConferenceAssigned;
            case "voiceApplicationAssigned": return VoiceApplicationAssigned;
            case "thirdPartyAppAssigned": return ThirdPartyAppAssigned;
            case "policyAssigned": return PolicyAssigned;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
