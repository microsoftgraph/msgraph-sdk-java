package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DelegatedAdminAccessAssignmentStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
