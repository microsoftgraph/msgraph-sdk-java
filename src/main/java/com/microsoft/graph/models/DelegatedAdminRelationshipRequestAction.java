package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DelegatedAdminRelationshipRequestAction implements ValuedEnum {
    LockForApproval("lockForApproval"),
    Approve("approve"),
    Terminate("terminate"),
    UnknownFutureValue("unknownFutureValue");
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
            default: return null;
        }
    }
}
