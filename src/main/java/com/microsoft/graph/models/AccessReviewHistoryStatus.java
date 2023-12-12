package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessReviewHistoryStatus implements ValuedEnum {
    Done("done"),
    Inprogress("inprogress"),
    Error("error"),
    Requested("requested"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessReviewHistoryStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessReviewHistoryStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "done": return Done;
            case "inprogress": return Inprogress;
            case "error": return Error;
            case "requested": return Requested;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
