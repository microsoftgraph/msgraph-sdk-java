package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DelegatedAdminRelationshipRequestAction implements ValuedEnum {
    LockForApproval("lockForApproval"),
    Approve("approve"),
    Terminate("terminate"),
    UnknownFutureValue("unknownFutureValue"),
    Reject("reject");
    public final String value;
    DelegatedAdminRelationshipRequestAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DelegatedAdminRelationshipRequestAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "lockForApproval": return LockForApproval;
            case "approve": return Approve;
            case "terminate": return Terminate;
            case "unknownFutureValue": return UnknownFutureValue;
            case "reject": return Reject;
            default: return null;
        }
    }
}
