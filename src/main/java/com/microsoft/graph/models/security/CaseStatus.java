package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CaseStatus implements ValuedEnum {
    Unknown("unknown"),
    Active("active"),
    PendingDelete("pendingDelete"),
    Closing("closing"),
    Closed("closed"),
    ClosedWithError("closedWithError"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CaseStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CaseStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "active": return Active;
            case "pendingDelete": return PendingDelete;
            case "closing": return Closing;
            case "closed": return Closed;
            case "closedWithError": return ClosedWithError;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
