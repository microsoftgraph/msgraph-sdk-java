package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CaseOperationStatus implements ValuedEnum {
    NotStarted("notStarted"),
    SubmissionFailed("submissionFailed"),
    Running("running"),
    Succeeded("succeeded"),
    PartiallySucceeded("partiallySucceeded"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CaseOperationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CaseOperationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notStarted": return NotStarted;
            case "submissionFailed": return SubmissionFailed;
            case "running": return Running;
            case "succeeded": return Succeeded;
            case "partiallySucceeded": return PartiallySucceeded;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
