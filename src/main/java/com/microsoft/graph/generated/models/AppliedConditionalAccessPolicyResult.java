package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppliedConditionalAccessPolicyResult implements ValuedEnum {
    Success("success"),
    Failure("failure"),
    NotApplied("notApplied"),
    NotEnabled("notEnabled"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue"),
    ReportOnlySuccess("reportOnlySuccess"),
    ReportOnlyFailure("reportOnlyFailure"),
    ReportOnlyNotApplied("reportOnlyNotApplied"),
    ReportOnlyInterrupted("reportOnlyInterrupted");
    public final String value;
    AppliedConditionalAccessPolicyResult(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppliedConditionalAccessPolicyResult forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "failure": return Failure;
            case "notApplied": return NotApplied;
            case "notEnabled": return NotEnabled;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            case "reportOnlySuccess": return ReportOnlySuccess;
            case "reportOnlyFailure": return ReportOnlyFailure;
            case "reportOnlyNotApplied": return ReportOnlyNotApplied;
            case "reportOnlyInterrupted": return ReportOnlyInterrupted;
            default: return null;
        }
    }
}
