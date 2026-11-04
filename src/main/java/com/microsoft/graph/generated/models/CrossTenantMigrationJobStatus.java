package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CrossTenantMigrationJobStatus implements ValuedEnum {
    Submitted("submitted"),
    Approved("approved"),
    Processing("processing"),
    CuttingOver("cuttingOver"),
    InProgress("inProgress"),
    Completed("completed"),
    CompletedWithErrors("completedWithErrors"),
    Failed("failed"),
    Cancelled("cancelled"),
    PendingCancel("pendingCancel"),
    AdminActionRequired("adminActionRequired"),
    ValidateSubmitted("validateSubmitted"),
    ValidateProcessing("validateProcessing"),
    ValidateInProgress("validateInProgress"),
    ValidatePassed("validatePassed"),
    ValidateFailed("validateFailed"),
    PendingDelete("pendingDelete"),
    Deleted("deleted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CrossTenantMigrationJobStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CrossTenantMigrationJobStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "submitted": return Submitted;
            case "approved": return Approved;
            case "processing": return Processing;
            case "cuttingOver": return CuttingOver;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "completedWithErrors": return CompletedWithErrors;
            case "failed": return Failed;
            case "cancelled": return Cancelled;
            case "pendingCancel": return PendingCancel;
            case "adminActionRequired": return AdminActionRequired;
            case "validateSubmitted": return ValidateSubmitted;
            case "validateProcessing": return ValidateProcessing;
            case "validateInProgress": return ValidateInProgress;
            case "validatePassed": return ValidatePassed;
            case "validateFailed": return ValidateFailed;
            case "pendingDelete": return PendingDelete;
            case "deleted": return Deleted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
