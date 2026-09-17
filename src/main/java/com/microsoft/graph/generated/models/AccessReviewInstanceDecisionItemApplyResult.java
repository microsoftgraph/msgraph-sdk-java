package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessReviewInstanceDecisionItemApplyResult implements ValuedEnum {
    New("new"),
    AppliedSuccessfully("appliedSuccessfully"),
    AppliedWithUnknownFailure("appliedWithUnknownFailure"),
    AppliedSuccessfullyButObjectNotFound("appliedSuccessfullyButObjectNotFound"),
    ApplyNotSupported("applyNotSupported"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessReviewInstanceDecisionItemApplyResult(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessReviewInstanceDecisionItemApplyResult forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "new": return New;
            case "appliedSuccessfully": return AppliedSuccessfully;
            case "appliedWithUnknownFailure": return AppliedWithUnknownFailure;
            case "appliedSuccessfullyButObjectNotFound": return AppliedSuccessfullyButObjectNotFound;
            case "applyNotSupported": return ApplyNotSupported;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
