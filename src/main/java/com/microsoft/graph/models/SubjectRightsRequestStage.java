package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SubjectRightsRequestStage implements ValuedEnum {
    ContentRetrieval("contentRetrieval"),
    ContentReview("contentReview"),
    GenerateReport("generateReport"),
    ContentDeletion("contentDeletion"),
    CaseResolved("caseResolved"),
    ContentEstimate("contentEstimate"),
    UnknownFutureValue("unknownFutureValue"),
    Approval("approval");
    public final String value;
    SubjectRightsRequestStage(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SubjectRightsRequestStage forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "contentRetrieval": return ContentRetrieval;
            case "contentReview": return ContentReview;
            case "generateReport": return GenerateReport;
            case "contentDeletion": return ContentDeletion;
            case "caseResolved": return CaseResolved;
            case "contentEstimate": return ContentEstimate;
            case "unknownFutureValue": return UnknownFutureValue;
            case "approval": return Approval;
            default: return null;
        }
    }
}
