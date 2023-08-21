package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DelegatedAdminAccessAssignmentStatus implements ValuedEnum {
    Pending("pending"),
    Active("active"),
    Deleting("deleting"),
    Deleted("deleted"),
    Error("error"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DelegatedAdminAccessAssignmentStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DelegatedAdminAccessAssignmentStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "active": return Active;
            case "deleting": return Deleting;
            case "deleted": return Deleted;
            case "error": return Error;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
