package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum IncidentStatus implements ValuedEnum {
    Active("active"),
    Resolved("resolved"),
    InProgress("inProgress"),
    Redirected("redirected"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IncidentStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IncidentStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "resolved": return Resolved;
            case "inProgress": return InProgress;
            case "redirected": return Redirected;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
