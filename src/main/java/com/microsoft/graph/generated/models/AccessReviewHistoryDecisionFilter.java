package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessReviewHistoryDecisionFilter implements ValuedEnum {
    Approve("approve"),
    Deny("deny"),
    NotReviewed("notReviewed"),
    DontKnow("dontKnow"),
    NotNotified("notNotified"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessReviewHistoryDecisionFilter(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessReviewHistoryDecisionFilter forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "approve": return Approve;
            case "deny": return Deny;
            case "notReviewed": return NotReviewed;
            case "dontKnow": return DontKnow;
            case "notNotified": return NotNotified;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
