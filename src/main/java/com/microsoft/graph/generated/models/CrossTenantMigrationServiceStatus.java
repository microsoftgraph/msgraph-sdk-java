package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CrossTenantMigrationServiceStatus implements ValuedEnum {
    NotStarted("notStarted"),
    Valid("valid"),
    Invalid("invalid"),
    Error("error"),
    InProgress("inProgress"),
    Completed("completed"),
    Failed("failed"),
    Cancelled("cancelled"),
    PendingCancel("pendingCancel"),
    Syncing("syncing"),
    Synced("synced"),
    Finalizing("finalizing"),
    ForceComplete("forceComplete"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CrossTenantMigrationServiceStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CrossTenantMigrationServiceStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notStarted": return NotStarted;
            case "valid": return Valid;
            case "invalid": return Invalid;
            case "error": return Error;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "failed": return Failed;
            case "cancelled": return Cancelled;
            case "pendingCancel": return PendingCancel;
            case "syncing": return Syncing;
            case "synced": return Synced;
            case "finalizing": return Finalizing;
            case "forceComplete": return ForceComplete;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
