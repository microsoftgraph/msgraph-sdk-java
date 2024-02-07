package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceHealthStatus implements ValuedEnum {
    ServiceOperational("serviceOperational"),
    Investigating("investigating"),
    RestoringService("restoringService"),
    VerifyingService("verifyingService"),
    ServiceRestored("serviceRestored"),
    PostIncidentReviewPublished("postIncidentReviewPublished"),
    ServiceDegradation("serviceDegradation"),
    ServiceInterruption("serviceInterruption"),
    ExtendedRecovery("extendedRecovery"),
    FalsePositive("falsePositive"),
    InvestigationSuspended("investigationSuspended"),
    Resolved("resolved"),
    MitigatedExternal("mitigatedExternal"),
    Mitigated("mitigated"),
    ResolvedExternal("resolvedExternal"),
    Confirmed("confirmed"),
    Reported("reported"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceHealthStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceHealthStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "serviceOperational": return ServiceOperational;
            case "investigating": return Investigating;
            case "restoringService": return RestoringService;
            case "verifyingService": return VerifyingService;
            case "serviceRestored": return ServiceRestored;
            case "postIncidentReviewPublished": return PostIncidentReviewPublished;
            case "serviceDegradation": return ServiceDegradation;
            case "serviceInterruption": return ServiceInterruption;
            case "extendedRecovery": return ExtendedRecovery;
            case "falsePositive": return FalsePositive;
            case "investigationSuspended": return InvestigationSuspended;
            case "resolved": return Resolved;
            case "mitigatedExternal": return MitigatedExternal;
            case "mitigated": return Mitigated;
            case "resolvedExternal": return ResolvedExternal;
            case "confirmed": return Confirmed;
            case "reported": return Reported;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
