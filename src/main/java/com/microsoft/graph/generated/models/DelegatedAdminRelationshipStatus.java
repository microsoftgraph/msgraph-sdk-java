package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DelegatedAdminRelationshipStatus implements ValuedEnum {
    Activating("activating"),
    Active("active"),
    ApprovalPending("approvalPending"),
    Approved("approved"),
    Created("created"),
    Expired("expired"),
    Expiring("expiring"),
    Terminated("terminated"),
    Terminating("terminating"),
    TerminationRequested("terminationRequested"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DelegatedAdminRelationshipStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DelegatedAdminRelationshipStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "activating": return Activating;
            case "active": return Active;
            case "approvalPending": return ApprovalPending;
            case "approved": return Approved;
            case "created": return Created;
            case "expired": return Expired;
            case "expiring": return Expiring;
            case "terminated": return Terminated;
            case "terminating": return Terminating;
            case "terminationRequested": return TerminationRequested;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
