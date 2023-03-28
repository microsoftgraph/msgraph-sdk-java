package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CaseOperationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
