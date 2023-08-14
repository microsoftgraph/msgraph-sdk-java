package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DelegatedAdminRelationshipOperationType implements ValuedEnum {
    DelegatedAdminAccessAssignmentUpdate("delegatedAdminAccessAssignmentUpdate"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DelegatedAdminRelationshipOperationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DelegatedAdminRelationshipOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "delegatedAdminAccessAssignmentUpdate": return DelegatedAdminAccessAssignmentUpdate;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
