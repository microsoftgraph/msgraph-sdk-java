package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WorkforceIntegrationSupportedEntities implements ValuedEnum {
    None("none"),
    Shift("shift"),
    SwapRequest("swapRequest"),
    UserShiftPreferences("userShiftPreferences"),
    OpenShift("openShift"),
    OpenShiftRequest("openShiftRequest"),
    OfferShiftRequest("offerShiftRequest"),
    UnknownFutureValue("unknownFutureValue"),
    TimeCard("timeCard"),
    TimeOffReason("timeOffReason"),
    TimeOff("timeOff"),
    TimeOffRequest("timeOffRequest");
    public final String value;
    WorkforceIntegrationSupportedEntities(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WorkforceIntegrationSupportedEntities forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "shift": return Shift;
            case "swapRequest": return SwapRequest;
            case "userShiftPreferences": return UserShiftPreferences;
            case "openShift": return OpenShift;
            case "openShiftRequest": return OpenShiftRequest;
            case "offerShiftRequest": return OfferShiftRequest;
            case "unknownFutureValue": return UnknownFutureValue;
            case "timeCard": return TimeCard;
            case "timeOffReason": return TimeOffReason;
            case "timeOff": return TimeOff;
            case "timeOffRequest": return TimeOffRequest;
            default: return null;
        }
    }
}
