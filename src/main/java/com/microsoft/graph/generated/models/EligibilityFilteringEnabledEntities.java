package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EligibilityFilteringEnabledEntities implements ValuedEnum {
    None("none"),
    SwapRequest("swapRequest"),
    OfferShiftRequest("offerShiftRequest"),
    UnknownFutureValue("unknownFutureValue"),
    TimeOffReason("timeOffReason");
    public final String value;
    EligibilityFilteringEnabledEntities(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EligibilityFilteringEnabledEntities forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "swapRequest": return SwapRequest;
            case "offerShiftRequest": return OfferShiftRequest;
            case "unknownFutureValue": return UnknownFutureValue;
            case "timeOffReason": return TimeOffReason;
            default: return null;
        }
    }
}
