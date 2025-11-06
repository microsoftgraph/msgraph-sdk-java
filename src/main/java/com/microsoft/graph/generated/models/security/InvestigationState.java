package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InvestigationState implements ValuedEnum {
    Unknown("unknown"),
    Terminated("terminated"),
    SuccessfullyRemediated("successfullyRemediated"),
    Benign("benign"),
    Failed("failed"),
    PartiallyRemediated("partiallyRemediated"),
    Running("running"),
    PendingApproval("pendingApproval"),
    PendingResource("pendingResource"),
    Queued("queued"),
    InnerFailure("innerFailure"),
    PreexistingAlert("preexistingAlert"),
    UnsupportedOs("unsupportedOs"),
    UnsupportedAlertType("unsupportedAlertType"),
    SuppressedAlert("suppressedAlert"),
    PartiallyInvestigated("partiallyInvestigated"),
    TerminatedByUser("terminatedByUser"),
    TerminatedBySystem("terminatedBySystem"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    InvestigationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InvestigationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "terminated": return Terminated;
            case "successfullyRemediated": return SuccessfullyRemediated;
            case "benign": return Benign;
            case "failed": return Failed;
            case "partiallyRemediated": return PartiallyRemediated;
            case "running": return Running;
            case "pendingApproval": return PendingApproval;
            case "pendingResource": return PendingResource;
            case "queued": return Queued;
            case "innerFailure": return InnerFailure;
            case "preexistingAlert": return PreexistingAlert;
            case "unsupportedOs": return UnsupportedOs;
            case "unsupportedAlertType": return UnsupportedAlertType;
            case "suppressedAlert": return SuppressedAlert;
            case "partiallyInvestigated": return PartiallyInvestigated;
            case "terminatedByUser": return TerminatedByUser;
            case "terminatedBySystem": return TerminatedBySystem;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
