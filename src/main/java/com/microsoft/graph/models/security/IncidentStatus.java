package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IncidentStatus implements ValuedEnum {
    Active("active"),
    Resolved("resolved"),
    InProgress("inProgress"),
    Redirected("redirected"),
    UnknownFutureValue("unknownFutureValue"),
    AwaitingAction("awaitingAction");
    public final String value;
    IncidentStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IncidentStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "resolved": return Resolved;
            case "inProgress": return InProgress;
            case "redirected": return Redirected;
            case "unknownFutureValue": return UnknownFutureValue;
            case "awaitingAction": return AwaitingAction;
            default: return null;
        }
    }
}
