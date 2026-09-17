package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The lifecycle status of a package governance request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CopilotPackageRequestStatus implements ValuedEnum {
    /** The request is awaiting a decision. */
    Pending("pending"),
    /** The request was approved. */
    Approved("approved"),
    /** The request was rejected. */
    Rejected("rejected"),
    /** An evolvable sentinel for future request statuses. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CopilotPackageRequestStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CopilotPackageRequestStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "approved": return Approved;
            case "rejected": return Rejected;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
