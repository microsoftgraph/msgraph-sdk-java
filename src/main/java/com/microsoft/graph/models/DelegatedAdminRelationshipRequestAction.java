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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DelegatedAdminRelationshipRequestAction forValue(@javax.annotation.Nonnull final String searchValue) {
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
