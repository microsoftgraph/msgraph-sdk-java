package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccessReviewHistoryDecisionFilter forValue(@javax.annotation.Nonnull final String searchValue) {
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
